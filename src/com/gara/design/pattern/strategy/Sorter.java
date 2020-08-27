package com.gara.design.pattern.strategy;

/**
 * @Author GARA
 * @Description 具体排序工具类-选择排序
 * @Date 2020/8/26 22:17
 * @Version V1.0.0
 **/
public class Sorter<T> {

    public void sort(T[] arr, Comparator<T> comparator) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minPosition = i;
            for (int j = i + 1; j < arr.length; j++) {
                minPosition = comparator.compare(arr[j], arr[minPosition]) == -1 ? j : minPosition;
//                if (arr[j] < arr[minPosition]) {
//                    swap(arr, i, minPosition);
//                }
            }
            swap(arr, i, minPosition);
        }
    }

    private void swap(T[] arr, int i, int minPosition) {
        T temp = arr[i];
        arr[i] = arr[minPosition];
        arr[minPosition] = temp;
    }
}
