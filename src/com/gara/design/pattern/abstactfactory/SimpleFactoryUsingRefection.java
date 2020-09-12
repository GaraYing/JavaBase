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

    // type configurable
    public static final String type = "human";

    public static Food createFood() {
        // reflection
        switch (type){
            case "human":
                return new Rice();
            case "monkey":
                return new Banana();
            default:
                return null;
        }
    }

    public static void main(String[] args) {
        String simpleName = Rice.class.getName();
        String bananaName = Banana.class.getName();
        System.out.println(simpleName);
        System.out.println(bananaName);
        Food food = SimpleFactoryUsingRefection.createFood();
        assert food != null;
        food.taste();
    }
}
