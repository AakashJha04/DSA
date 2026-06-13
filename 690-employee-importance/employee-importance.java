/*
// Definition for Employee.
class Employee {
    public int id;
    public int importance;
    public List<Integer> subordinates;
};
*/

class Solution {
    public int getImportance(List<Employee> employees, int id) {

        Map<Integer, Employee> map = new HashMap<>();

        for (Employee emp : employees) {
            map.put(emp.id, emp);
        }

        int ans = 0;

        Queue<Integer> q = new LinkedList<>();
        q.offer(id);

        while (!q.isEmpty()) {
            int currId = q.poll();
            Employee currEmployee = map.get(currId);
            ans += currEmployee.importance;

            for (int subordinates : currEmployee.subordinates) {
                q.offer(subordinates);
            }
        }

        return ans;

    }
}