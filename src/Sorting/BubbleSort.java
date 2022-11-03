package Sorting;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {5, 6, 9, 7, 15, 23, 41, 25, 1, 13};

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < args.length - i; j++) {
                if (arr[j - 1] > arr[i]) {
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        printarray(arr);
    }

    public static void printarray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
