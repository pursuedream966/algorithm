package cn.pursuedream.p1.sort;

import java.util.Arrays;

public class SortAlgorithmMain {

    /**
     * 冒泡泡排序
     */
    public static void bubbleSort(int[] arr){

        for (int i = 0; i < arr.length - 1; i++){
            for (int j = 0; j < arr.length - i - 1; j++){
                if(arr[j] > arr[j+1]){
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        }
    }

    /**
     * 选择排序
     * @param arr
     */
    public static void selectionSort(int[] arr){

        for (int i = 0; i < arr.length - 1; i++){
            int miniIndex = i;

            for (int j = i+1; j < arr.length; j++){
                if(arr[miniIndex] > arr[j]){
                    miniIndex = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[miniIndex];
            arr[miniIndex] = temp;
        }

    }

    /**
     * 直接插入排序
     * @param arr
     */
    public static void insertionSort(int[] arr){
        for(int i = 1; i < arr.length; i++){
            int tmp = arr[i];
            int j = i;
            while (j > 0 && tmp < arr[j-1]){
                arr[j] = arr[j-1];
                j--;
            }

            if(i != j){
                arr[j] = tmp;
            }

        }
    }

    /**
     * 希尔排序
     * @param arr
     */
    public static void shellSort(int[] arr){

        for (int step = arr.length / 2; step > 0; step /= 2){
            for (int i = step; i < arr.length; i++){
                int tmp = arr[i];
                int j = i - step;
                while (j >= 0 && tmp < arr[j]){
                    arr[j+step] = arr[j];
                    j -= step;
                }

                arr[j + step] = tmp;
            }
        }
    }

    /**
     * 归并排序
     * @param arr
     */
    public static int[] mergeSort(int[] arr){

        int length = arr.length;
        if(length < 2){
            return arr;
        }

        int mid = length / 2;
        int[] left = Arrays.copyOfRange(arr, 0, mid);
        int[] right = Arrays.copyOfRange(arr, mid, length);

        return merge(mergeSort(left), mergeSort(right));
    }

    /**
     * 归并排序-合并数组
     * @param left
     * @param right
     * @return
     */
    public static int[] merge(int[] left, int[] right){
        int size = left.length + right.length;
        int[] result = new int[size];

        int i = 0;
        int j = 0;
        int index = 0;
        while (i < left.length && j < right.length){
            if(left[i] < right[j]){
                result[index++] = left[i++];
            }else {
                result[index++] = right[j++];
            }
        }

        while (i < left.length){
            result[index++] = left[i++];
        }

        while (j < right.length){
            result[index++] = right[j++];
        }

        return result;
    }


    /**
     * 快速排序
     * @param arr
     * @param low
     * @param high
     */
    public static void quickSort(int[] arr, int low, int high){
        if(low >= high){
            return;
        }
        int left = low;
        int right = high;
        int base = arr[left];

        while (left < right){
            // 从后向前找比基准小的
            while (base < arr[right] && left < right){
                right--;
            }
            if(left < right){
                swap(arr, left++, right);
            }

            // 从前向后找比基准大的
            while (base > arr[left] && left < right){
                left++;
            }
            if(left < right){
                swap(arr, left, right--);
            }
        }

        quickSort(arr, low, left-1);
        quickSort(arr, left+1, high);
    }

    public static void swap(int[] arr, int left, int right){
        int tmp = arr[left];
        arr[left] = arr[right];
        arr[right] = tmp;
    }


    public static void main(String[] args) {

        int[] arr = new int[]{-1, 20, 5, 345, 190,  -30, 666, 10, 20, 30, 9, 190};

        System.out.println(Arrays.toString(arr));

        // 排序
        // （1）冒泡泡排序
        // bubbleSort(arr);

        // (2) 选择排序
        //selectionSort(arr);

        // (3) 直接插入排序
        //insertionSort(arr);

        // (4) 希尔排序
        // shellSort(arr);

        // (5) 归并排序
        //arr = mergeSort(arr);

        // (6) 快速排序
        // quickSort(arr, 0, arr.length-1);

        System.out.println(Arrays.toString(arr));
    }

}