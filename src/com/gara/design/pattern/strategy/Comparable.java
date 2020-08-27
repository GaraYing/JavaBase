package com.gara.design.pattern.strategy;

/**
 * @Author GARA
 * @Description 自定义 {@link java.lang.Comparable}
 * @see java.util.Comparator
 * @Date 2020/8/26 22:06
 * @Version V1.0.0
 **/
public interface Comparable<T> {
    /**
     * 参数比较
     * @param o
     * @return
     */
    int compareTo(T o);
}
