class Solution {
    public String reformatDate(String date) {
        String[] arr = new String[3];
        int j = 0;
        int k = 0;

        for (int i = 0; i < date.length(); i++) {
            if (date.charAt(i) == ' ') {
                String day = date.substring(j, i);
                arr[k] = day;
                k++;
                j = i + 1;
            }
        }
        arr[2] = date.substring(j, date.length());

        for (int i = 0; i < 3; i++) {
            System.out.println(arr[i] + " ");
        }

        HashMap<String, String> map = new HashMap<>();
        map.put("Jan", "01");
        map.put("Feb", "02");
        map.put("Mar", "03");
        map.put("Apr", "04");
        map.put("May", "05");
        map.put("Jun", "06");
        map.put("Jul", "07");
        map.put("Aug", "08");
        map.put("Sep", "09");
        map.put("Oct", "10");
        map.put("Nov", "11");
        map.put("Dec", "12");
        String ans = arr[2] + "-";
        ans += map.get(arr[1]) + "-";

        String x = "";
        String temp = arr[0];
        System.out.println("ok" + temp);

        for (char ch : temp.toCharArray()) {
            if (ch >= '0' && ch <= '9') { // you can also use ch >= 48 && ch <= 57
                x += ch;
            }
        }
        if(x.length()==1){
            x = "0"+x;
        }
        ans+=x;

        return ans;
    }
}