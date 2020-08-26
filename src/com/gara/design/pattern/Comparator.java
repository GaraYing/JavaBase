package com.gara.design.pattern;

/**
 * @Author GARA
 * @Description 自定义排序策略接口
 * @see java.util.Comparator
 * @Date 2020/8/26 22:06
 * @Version V1.0.0
 **/
public interface Comparator<T> {
    /**
     * 参数比较
     * @param o1
     * @param o2
     * @return
     */
    int compare(T o1, T o2);
}
