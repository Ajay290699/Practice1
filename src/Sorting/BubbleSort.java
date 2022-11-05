package Sorting;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {5, 6, 9, 7, 15, 23, 41, 25, 1, 13};

        // for printing in ascending order
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        printarray(arr);
    }

    //to print array a method
    public static void printarray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
