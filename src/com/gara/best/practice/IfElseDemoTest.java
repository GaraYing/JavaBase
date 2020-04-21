package com.gara.best.practice;

import com.gara.best.practice.rule.Expression;
import com.gara.best.practice.rule.Operator;
import com.gara.best.practice.rule.RuleEngine;

import javax.xml.transform.Result;

/**
 * @description: IfElse
 * @author: Gara
 * @createTime: 2020/4/21 10:05
 * @Version: 1.0
 **/
public class IfElseDemoTest {

    public static void main(String[] args) {
        IfElseDemoTest demoTest = new IfElseDemoTest();
        // 传统方式，不推荐
        int add = demoTest.calculate(1, 2, "add");
        System.out.println("add: " + add);
        int multiply = demoTest.calculate(1, 2, "multiply");
        System.out.println("multiply: " + multiply);

        int factoryAddResult = demoTest.calculateUsingFactory(1, 3,"add");
        System.out.println("factoryAddResult: " + factoryAddResult);

        int calculateUsingEnum = demoTest.calculateUsingEnum(4, 5, OperationEnum.ADD);
        System.out.println("calculateUsingEnum: " + calculateUsingEnum);

        int correctResult = demoTest.whenNumbersGivenToRuleEngine_thenReturnCorrectResult();
        System.out.println("correctResult"+ correctResult);

    }

    public int calculate(int a, int b, String operator) {
        int result = Integer.MIN_VALUE;

        if ("add".equals(operator)) {
            result = a + b;
        } else if ("multiply".equals(operator)) {
            result = a * b;
        } else if ("divide".equals(operator)) {
            result = a / b;
        } else if ("subtract".equals(operator)) {
            result = a - b;
        }
        return result;
    }

    public int calculateUsingSwitch(int a, int b, String operator) {
        int result = Integer.MIN_VALUE;
        switch (operator) {
            case "add":
                result = a + b;
                break;
            // other cases
            case "multiply":
                result = a * b;
                break;
            case "divide":
                result = a / b;
                break;
            case "subtract":
                result = a - b;
                break;
        }
        return result;
    }

    /**
     * 工厂方法实现
     * @param a
     * @param b
     * @param operator
     * @return
     */
    public int calculateUsingFactory(int a, int b, String operator) {
        Operation targetOperation = OperatorFactory
                .getOperation(operator)
                .orElseThrow(() -> new IllegalArgumentException("Invalid Operator"));
        return targetOperation.calculate(a, b);
    }

    /**
     * 枚举实现
     * @param a
     * @param b
     * @param operator
     * @return
     */
    public int calculateUsingEnum(int a, int b, OperationEnum operator) {
        return operator.calculate(a, b);
    }


    public int whenNumbersGivenToRuleEngine_thenReturnCorrectResult() {
        Expression expression = new Expression(5, 5, Operator.ADD);
        RuleEngine engine = new RuleEngine();
        int result = engine.process(expression);
        return result;
    }
}
