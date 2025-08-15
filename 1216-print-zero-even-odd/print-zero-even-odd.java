// // class ZeroEvenOdd {
// //     private int n;
// //     Object lock1, lock2;
// //     private volatile int times;
// //     int evenNumber = 2;
// //     int oddNumber = 1;


// //     public ZeroEvenOdd(int n) {
// //         this.n = n;
// //         lock1 = new Object();
// //         lock2 = new Object();
// //         times = 2*n;
// //     }

// //     // printNumber.accept(x) outputs "x", where x is an integer.
// //     public void zero(IntConsumer printNumber) throws InterruptedException {
// //         while (times >= 0) {
// //             synchronized (lock1) {
// //                 printNumber.accept(0);
// //                 times--;
// //                 lock1.wait();
// //                 synchronized (lock2){
// //                     printNumber.accept(0);
// //                     times--;
// //                     lock2.wait();
// //                 }
// //             }
// //         }
// //     }

// //     public void even(IntConsumer printNumber) throws InterruptedException {
// //         while (times >= 0) {
// //             synchronized (lock2) {
// //                 printNumber.accept(evenNumber);
// //                 evenNumber += 2;
// //                 times--;
// //                 lock2.notify();
// //             }
// //         }
// //     }

// //     public void odd(IntConsumer printNumber) throws InterruptedException {
// //         while (times >= 0) {
// //             synchronized (lock1) {
// //                 printNumber.accept(oddNumber);
// //                 oddNumber += 2;
// //                 times--;
// //                 lock1.notify();
// //             }
// //         }
// //     }
// // }



// class ZeroEvenOdd {
//     private int n;
//     private int state = 0; // 0: zero's turn, 1: odd's turn, 2: even's turn
//     private int current = 1;
//     private final Object lock = new Object();

//     public ZeroEvenOdd(int n) {
//         this.n = n;
//     }

//     public void zero(IntConsumer printNumber) throws InterruptedException {
//         for (int i = 0; i < n; i++) {
//             synchronized (lock) {
//                 while (state != 0) {
//                     lock.wait();
//                 }
//                 printNumber.accept(0);
//                 state = (current % 2 == 0) ? 2 : 1;
//                 lock.notifyAll();
//             }
//         }
//     }

//     public void even(IntConsumer printNumber) throws InterruptedException {
//         for (; current <= n; ) {
//             synchronized (lock) {
//                 while (state != 2) {
//                     lock.wait();
//                 }
//                 printNumber.accept(current++);
//                 state = 0;
//                 lock.notifyAll();
//             }
//         }
//     }

//     public void odd(IntConsumer printNumber) throws InterruptedException {
//         for (; current <= n; ) {
//             synchronized (lock) {
//                 while (state != 1) {
//                     lock.wait();
//                 }
//                 printNumber.accept(current++);
//                 state = 0;
//                 lock.notifyAll();
//             }
//         }
//     }
// }


class ZeroEvenOdd {
    private int n;
    private int state = 0; // 0: zero's turn, 1: odd's turn, 2: even's turn
    private int current = 1;
    private final Object lock = new Object();

    public ZeroEvenOdd(int n) {
        this.n = n;
    }

    public void zero(IntConsumer printNumber) throws InterruptedException {
        for (int i = 0; i < n; i++) {
            synchronized (lock) {
                while (state != 0) {
                    lock.wait();
                }
                printNumber.accept(0);
                state = (current % 2 == 0) ? 2 : 1;
                lock.notifyAll();
            }
        }
    }

    public void even(IntConsumer printNumber) throws InterruptedException {
        while (true) {
            synchronized (lock) {
                while (state != 2 && current <= n) {
                    lock.wait();
                }
                if (current > n) {
                    lock.notifyAll(); // wake others before exit
                    break;
                }
                printNumber.accept(current++);
                state = 0;
                lock.notifyAll();
            }
        }
    }

    public void odd(IntConsumer printNumber) throws InterruptedException {
        while (true) {
            synchronized (lock) {
                while (state != 1 && current <= n) {
                    lock.wait();
                }
                if (current > n) {
                    lock.notifyAll(); // wake others before exit
                    break;
                }
                printNumber.accept(current++);
                state = 0;
                lock.notifyAll();
            }
        }
    }
}
