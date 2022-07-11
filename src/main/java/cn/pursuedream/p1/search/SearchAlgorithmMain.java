package cn.pursuedream.p1.search;

import cn.pursuedream.AlgorithmCommonUtil;

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
        System.out.println(Arrays.toString(AlgorithmCommonUtil.ORDERED_ARRAY));
        int index = binarySearch(AlgorithmCommonUtil.ORDERED_ARRAY, 0);
        if(index >= 0){
            System.out.printf("搜索成功, index【%d】, 值【%d】", index, AlgorithmCommonUtil.ORDERED_ARRAY[index]);
        }else {
            System.out.println("搜索失败");
        }
    }

}
