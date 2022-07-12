package cn.pursuedream.p1.search;

import java.util.Arrays;

public class SearchAlgorithmMain {

    // 二分查找
    public static int binarySearch(int[] array, int key){
        int low = 0;
        int high = array.length - 1;

        while (low <= high){
            int mid = (low  + high) / 2;
            int midValue = array[mid];
            if(midValue < key){
                low = mid;
            }else if(midValue > key){
                high  = mid;
            }else {
                return mid;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        int[] arr = new int[]{-10, -3, 0, 0, 1, 2, 8, 9, 50, 160, 567, 999, 1020};
        System.out.println(Arrays.toString(arr));
        int index = binarySearch(arr, 0);
        if(index >= 0){
            System.out.printf("搜索成功, index【%d】, 值【%d】", index, arr[index]);
        }else {
            System.out.println("搜索失败");
        }
    }

}
