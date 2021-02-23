package kuy4;

import org.junit.Test;

import java.util.*;
import java.util.stream.Collectors;

import static org.junit.Assert.*;

public class SudokuValidator {

    private static final byte VALID_LENGTH = 9;
    private static final byte VALID_SUM = 45;

    private static boolean checkRow(int[][] sudoku) {
        return !checkArray(sudoku);
    }

    private static boolean checkColumn(int[][] sudoku) {
        for (int i = 0; i < sudoku.length; i++) {
            if (checkArray(sudoku)) return false;
        }
        return true;
    }

    private static boolean checkArray(int[][] sudoku) {
        Set<Integer> column;
        for (int[] columns : sudoku) {
            column = Arrays.stream(columns).boxed().collect(Collectors.toSet());
            Integer sum = column.stream().reduce(0, Integer::sum);
            if (column.size() != VALID_LENGTH || sum != VALID_SUM) {
                return true;
            }
        }
        return false;
    }

    private static boolean checkSquare(int[][] sudoku) {
        Set<Integer> square = new HashSet<>();
        for (int i = 0; i < sudoku.length; i += 3) {
            for (int j = 0; j < sudoku.length; j += 3) {
                for (int k = i; k < i + 3; k++) {
                    for (int l = j; l < j + 3; l++) {
                        square.add(sudoku[k][l]);
                    }
                }
                Integer sum = square.stream().reduce(0, Integer::sum);
                if (square.size() != VALID_LENGTH || sum != VALID_SUM) {
                    return false;
                } else square.clear();
            }
        }
        return true;
    }

    public static boolean check(int[][] sudoku) {
        return checkColumn(sudoku) && checkRow(sudoku) && checkSquare(sudoku);
    }

    public static void main(String[] args) {
        int[][] sudoku = {
                {5, 3, 4, 6, 7, 8, 9, 1, 2},
                {6, 7, 2, 1, 9, 5, 3, 4, 8},
                {1, 9, 8, 3, 4, 2, 5, 6, 7},
                {8, 5, 9, 7, 6, 1, 4, 2, 3},
                {4, 2, 6, 8, 0, 3, 7, 9, 1},
                {7, 1, 3, 9, 2, 4, 8, 5, 6},
                {9, 6, 1, 5, 3, 7, 2, 8, 4},
                {2, 8, 7, 4, 1, 9, 6, 3, 5},
                {3, 4, 5, 2, 8, 6, 1, 7, 9}
        };
        System.out.println(check(sudoku));
    }

    @Test
    public void exampleTest() {
        int[][] sudoku = {
                {5, 3, 4, 6, 7, 8, 9, 1, 2},
                {6, 7, 2, 1, 9, 5, 3, 4, 8},
                {1, 9, 8, 3, 4, 2, 5, 6, 7},
                {8, 5, 9, 7, 6, 1, 4, 2, 3},
                {4, 2, 6, 8, 5, 3, 7, 9, 1},
                {7, 1, 3, 9, 2, 4, 8, 5, 6},
                {9, 6, 1, 5, 3, 7, 2, 8, 4},
                {2, 8, 7, 4, 1, 9, 6, 3, 5},
                {3, 4, 5, 2, 8, 6, 1, 7, 9}
        };
        assertTrue(SudokuValidator.check(sudoku));

        sudoku[0][0]++;
        sudoku[1][1]++;
        sudoku[0][1]--;
        sudoku[1][0]--;

        assertFalse(SudokuValidator.check(sudoku));

        sudoku[0][0]--;
        sudoku[1][1]--;
        sudoku[0][1]++;
        sudoku[1][0]++;

        sudoku[4][4] = 0;

        assertFalse(SudokuValidator.check(sudoku));
    }

}
