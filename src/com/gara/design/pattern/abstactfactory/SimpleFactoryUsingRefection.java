package com.gara.design.pattern.abstactfactory;

import com.gara.design.pattern.abstactfactory.human.Aircraft;
import com.gara.design.pattern.abstactfactory.human.Rice;
import com.gara.design.pattern.abstactfactory.monkey.Banana;
import com.gara.design.pattern.abstactfactory.monkey.Bicycle;

/**
 * @Author GARA
 * @Description SimpleFactoryUsingRefection
 * @Date 2020/9/5 16:30
 * @Version V1.0.0
 **/
public class SimpleFactoryUsingRefection {

    public static final String type = "human";

    public static Food createFood() throws Exception {

        Food food = null;
        return food;
    }

    public static void main(String[] args) {
        String simpleName = Rice.class.getName();
        String bananaName = Banana.class.getName();
        System.out.println(simpleName);
        System.out.println(bananaName);
    }
}
