package cn.pursuedream.p1.sort;

import cn.pursuedream.AlgorithmCommonUtil;

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

        for (int step = arr.length / 2; step > 0; step = step/2){
            for (int i = step; i < arr.length; i++){
                int tmp = arr[i];
                int j = i - step;
                while (j > 0 && tmp < arr[j]){
                    arr[j+step] = arr[j];
                    j -= step;
                }

                arr[j + step] = tmp;
            }
        }


    }

    public static void main(String[] args) {

        int[] unOrderedArray = AlgorithmCommonUtil.UNORDERED_ARRAY.clone();

        System.out.println(Arrays.toString(unOrderedArray));

        // 排序
        // （1）冒泡泡排序
        // bubbleSort(unOrderedArray);

        // (2) 选择排序
        //selectionSort(unOrderedArray);

        // (3) 直接插入排序
        insertionSort(unOrderedArray);

        // (4) 希尔排序
        shellSort(unOrderedArray);

        System.out.println(Arrays.toString(unOrderedArray));
    }

}