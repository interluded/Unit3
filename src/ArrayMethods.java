public class ArrayMethods {
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
            if ((i + 1) % 10 == 0) System.out.println();
        }
        System.out.println();
    }

    public static void printArray(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
            if ((i + 1) % 10 == 0) System.out.println();
        }
        System.out.println();
    }

    public static void swap(int[] arr, int x, int y) {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }

    public static void swap(String[] arr, int x, int y) {
        String temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }

    public static int findMin(int[] arr, int start) {
        int minValue = arr[start];
        int minIndex = start;
        for (int i = start + 1; i < arr.length; i++) {
            if (arr[i] < minValue) {
                minValue = arr[i];
                minIndex = i;
            }
        }
        return minIndex;
    }

    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int x = findMin(arr, i);
            swap(arr, x, i);
        }
    }

    public static void bubbleSort(int[] arr) {
        boolean swapped;
        for (int i = 0; i < arr.length - 1; i++) {
            swapped = false;
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
    }

    public static void mergeSort(int[] arr) {
        doMergeSort(arr, 0, arr.length - 1);
    }

    private static void doMergeSort(int[] arr, int start, int end) {
        if (start < end) {
            int middle = (start + end) / 2;
            doMergeSort(arr, start, middle);
            doMergeSort(arr, middle + 1, end);
            merge(arr, start, middle, end);
        }
    }

    private static void merge(int[] arr, int start, int middle, int end) {
        int[] tempArr = new int[end - start + 1];
        int i = start, j = middle + 1, temp = 0;

        while (i <= middle && j <= end) {
            if (arr[i] < arr[j]) {
                tempArr[temp++] = arr[i++];
            } else {
                tempArr[temp++] = arr[j++];
            }
        }

        while (i <= middle) tempArr[temp++] = arr[i++];
        while (j <= end) tempArr[temp++] = arr[j++];

        for (int k = 0; k < tempArr.length; k++) {
            arr[start + k] = tempArr[k];
        }
    }
    public static void printArray(int[][] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }


    public static void printArray(String[][] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
