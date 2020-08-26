package com.gara.design.pattern;

import com.gara.design.pattern.bean.Dog;

/**
 * @Author GARA
 * @Description 具体排序工具类
 * @Date 2020/8/26 22:17
 * @Version V1.0.0
 **/
public class Sorter {

    public static void sort(Comparable[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minPosition = i;
            for (int j = i + 1; j < arr.length; j++) {
                minPosition = arr[j].compareTo(arr[minPosition]) == -1 ? j : minPosition;
//                if (arr[j] < arr[minPosition]) {
//                    swap(arr, i, minPosition);
//                }
            }
            swap(arr, i, minPosition);
        }
    }

    private static void swap(Comparable[] arr, int i, int minPosition) {
        Comparable temp = arr[i];
        arr[i] = arr[minPosition];
        arr[minPosition] = temp;
    }


}
