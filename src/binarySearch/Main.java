package binarySearch;

public class Main {
    public static void main(String[] args) {
        int[] intArray = { -22, -15, 1, 7, 20, 35, 55 };

        System.out.println(iterativeBinarySearch(intArray, -15));
        System.out.println(iterativeBinarySearch(intArray, 35));
        System.out.println(iterativeBinarySearch(intArray, 8888));
        System.out.println(iterativeBinarySearch(intArray, -17));

        System.out.println(recursiveBinarySearch(intArray, -15, 0, intArray.length - 1));
        System.out.println(recursiveBinarySearch(intArray, 35, 0, intArray.length - 1));
        System.out.println(recursiveBinarySearch(intArray, 8888, 0, intArray.length - 1));
        System.out.println(recursiveBinarySearch(intArray, -17, 0, intArray.length - 1));
    }

    public static int iterativeBinarySearch(int[] input, int value) {
        int start = 0;
        int end = input.length;

        while (start < end) {
            int midpoint = (start + end) / 2;
            if (input[midpoint] == value) {
                return midpoint;
            } else if (input[midpoint] < value) {
                start = midpoint + 1;
            } else if (input[midpoint] > value) {
                end = midpoint;
            }
        }

        return -1;
    }

    public static int recursiveBinarySearch(int[] input, int value, int start, int end) {
        int midpoint = (start + end) / 2;

        if (input[midpoint] == value) {
            return midpoint;
        }

        if (start >= end) {
            return -1;
        }

        if (input[midpoint] < value) {
            return recursiveBinarySearch(input, value, midpoint + 1, end);
        } else {
            return recursiveBinarySearch(input, value, start, midpoint);
        }
    }
}
