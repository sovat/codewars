package kyu5;

public class WeightSort {
    public static void main(String[] args) {

        Integer[] arr = {56, 65, 74, 100, 99, 68, 86, 180, 90};

        int temp, res = 0;

        for (int i = 0; i < arr.length; i++) {
            temp = arr[i];
            while (temp != 0) {
                res += temp % 10;
                temp /= 10;
            }
            System.out.println(res);
            res = 0;
        }



        /*HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
        List
        map.put(11, );
        map.put(11, 65);
        map.put(11, 74);
        map.put(1, 100);
        map.put(18, 99);
        map.put(14, 68);
        map.put(14, 86);
        map.put(9, 180);
        map.put(9, 90);

        for (Map.Entry entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + " Value: "
                    + entry.getValue());
        }*/

    }
}
