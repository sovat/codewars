package kuy4;

import java.util.ArrayList;

public class Snail {
    public static int[] snail(int[][] array) {
        ArrayList<Integer> list = new ArrayList<>();
        if (array.length <= 1){
            return new int[0];
        }
        int n = array.length;
        int j, i;
        int t = 1;
        i = 0;
        int v = 0;
        int s = 0;
        int r = 1;
        int l = 1, c = 0, d = 0;
        int f;
        f = n;
        while (t <= n * n) {
            //заполняем справа на лево
            for (j = s; j < f; ++j) {
                list.add(array[i][j]);
                ++t;
            }
            v = j - 1;
            --j;
            //заполняем с верху вниз
            if (t <= n * n) {
                for (i = r; i < f; ++i) {
                    list.add(array[i][j]);
                    ++t;
                }
                l = i - 1;
                --i;
            }
            //заполняем с лева на право
            if (t <= n * n) {
                for (j = v - 1; j >= c; --j) {
                    list.add(array[i][j]);
                    ++t;
                }
            }
            if (t <= n * n) {
                //заполняем с низу верх
                for (i = l - 1; i > d; --i) {
                    list.add(array[i][j + 1]);
                    ++t;
                }
            }
            //уменшаем параметры матрицы(что бы числа шли внутрь а не заполнялись поверх тех которы уже заполнены)
            --f;

            ++s;
            ++r;
            ++c;
            ++d;
            ++i;
        }
        int[] arr = new int[list.size()];
        for (int k = 0; k < arr.length; k++) {
            arr[k] = list.get(k);
            System.out.print(arr[k]);
        }

        return arr;
    }

    public static void main(String[] args) {
        int[][] array
                = {{0}};
        int[] r = {1, 2, 3, 6, 9, 8, 7, 4, 5};
        snail(array);
    }
}
