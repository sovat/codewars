package kyu5.Pagination;

import java.util.Arrays;

public class Test {

    public static void main(String[] args) {
        PaginationHelper<Integer> helper = new PaginationHelper(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24), 10);
        System.out.println(helper.pageItemCount(3));
        int i=5;
        System.out.println(++i + ++i);
    }
}
