package sorting;

/**
 * Challenge 3: Sort the following values using radix sort: "bcdef", "dbaqc", "abcde", "omadd",
 * "bbbbb"
 *
 * Note: all values are in lowercase, so don't worry about uppercasing/lowercasing the values
 */

public class ChallengeThree {
    public static void main(String[] args) {
        String[] radixArray = { "bcdef", "dbaqc", "abcde", "omadd", "bbbbb" };

        radixSort(radixArray, 26, 5);

        for (int i = 0; i < radixArray.length; i++) {
            System.out.println(radixArray[i]);
        }
    }

    public static void radixSort(String[] input, int radix, int width) {
        for (int i = width - 1; i >= 0; i--) {
            radixSingleSort(input, i, radix);
        }
    }

    public static void radixSingleSort(String[] input, int position, int radix) {

        int numItems = input.length;

        int[] countArray = new int[radix];

        for (String value : input) {
            countArray[getCharPosition(position, value)]++;
        }

        for (int j = 1; j < radix; j++) {
            countArray[j] += countArray[j - 1];
        }

        String[] temp = new String[numItems];

        for (int tempIndex = numItems - 1; tempIndex >= 0; tempIndex--) {
            temp[--countArray[getCharPosition(position, input[tempIndex])]] = input[tempIndex];
        }

        for (int tempIndex = 0; tempIndex < numItems; tempIndex++) {
            input[tempIndex] = temp[tempIndex];
        }
    }

    public static int getCharPosition(int position, String value) {
        return value.charAt(position) - 'a';
    }
}
