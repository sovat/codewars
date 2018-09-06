package kuy4;

import java.util.ArrayList;

public class Snail {
    public static int[] snail(int[][] array) {

        if (array[0].length ==0) {
            return new int[0];
        }
        ArrayList<Integer> list = new ArrayList<>();
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
            //заполняем справа налево
            for (j = s; j < f; ++j) {
                list.add(array[i][j]);
                ++t;
            }
            v = j - 1;
            --j;
            //заполняем сверху вниз
            if (t <= n * n) {
                for (i = r; i < f; ++i) {
                    list.add(array[i][j]);
                    ++t;
                }
                l = i - 1;
                --i;
            }
            //заполняем слева направо
            if (t <= n * n) {
                for (j = v - 1; j >= c; --j) {
                    list.add(array[i][j]);
                    ++t;
                }
            }
            if (t <= n * n) {
                //заполняем снизу вверх
                for (i = l - 1; i > d; --i) {
                    list.add(array[i][j + 1]);
                    ++t;
                }
            }
            //уменьшаем параметры матрицы(что бы числа шли внутрь а не заполнялись поверх тех которы уже заполнены)
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
                = {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};

        int[] r = {1, 2, 3, 6, 9, 8, 7, 4, 5};
        snail(array);
    }
}
