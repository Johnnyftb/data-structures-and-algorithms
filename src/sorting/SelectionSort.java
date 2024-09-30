package sorting;

/**
 * Implementation of the Selection Sort Algorithm
 */
public class SelectionSort {

    /**
     * Method to swap the position of two elements in an array
     *
     * @param array - the array we are swapping the elements in
     * @param i - index of the first element we want to swap
     * @param j - index of the second element we want to swap
     */
    public static void swap(int[] array, int i, int j) {
        if (i == j) {
            return;
        }

        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void main(String[] args) {
        int[] intArray = { 20, 35, -15, 7, 55, 1, -22 };

        for (int lastUnsortedIndex = intArray.length - 1; lastUnsortedIndex > 0;
             lastUnsortedIndex--) {
            int largest = 0;

            for (int i = 1; i <= lastUnsortedIndex; i++) {
                if (intArray[i] > intArray[largest]) {
                    largest = i;
                }
            }

            swap(intArray, largest, lastUnsortedIndex);
        }

        for (int num : intArray) {
            System.out.println(num);
        }
    }
}
