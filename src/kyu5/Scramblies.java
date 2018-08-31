package kyu5;
/**
 *Complete the function scramble(str1, str2) that returns true if a portion of str1 characters can be rearranged to match str2, otherwise returns false.
 */

/**
 * Массив размера 26 - количество букв в алфавите.
 * Символ с - представляется в int формате. Он имеет значение той буквы, которая приходит из массива символов.
 * 'a' - имеет значение 97. Производя операцию array[c - 'a']++, мы получаем индекс буквы в алфавите и увеличиваем значение под эти индексом.
 * Затем проходимся по второй строке и уменьшаем значение под этим индексом.
 * Если в массиве есть не отрицательные или равные нулю значения, то возвращаем ложь
 */

public class Scramblies {

    public static boolean scramble(String str1, String str2) {
        int alphabetLenght = 26;
        int[] array = new int[alphabetLenght];
        for (char c : str2.toCharArray()) {
            array[c - 'a']++;
        }
        for (char c : str1.toCharArray()) {
            array[c - 'a']--;
        }
        for (int value : array) {
            if (value > 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(scramble("aabbcamaomsccdd", "commas"));
    }
}