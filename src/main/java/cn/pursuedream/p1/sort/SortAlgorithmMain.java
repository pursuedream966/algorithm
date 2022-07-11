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




    public static void main(String[] args) {

        int[] unOrderedArray = AlgorithmCommonUtil.UNORDERED_ARRAY.clone();

        System.out.println(Arrays.toString(unOrderedArray));

        // 排序
        // （1）冒泡泡排序
        // bubbleSort(unOrderedArray);
        // (2) 选择排序
        selectionSort(unOrderedArray);

        System.out.println(Arrays.toString(unOrderedArray));


    }

}
