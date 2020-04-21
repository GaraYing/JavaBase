package com.gara.best.practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

/**
 * @description: 计算工厂方法
 * @author: Gara
 * @createTime: 2020/4/21 10:11
 * @Version: 1.0
 **/
public class OperatorFactory {

    static Map<String, Operation> operationMap = new HashMap<>(4);

    static {
        operationMap.put("add", new AddOperation());
        operationMap.put("multipart", new MultipartOperation());
    }

    public static Optional<Operation> getOperation(String operator) {
        return Optional.ofNullable(operationMap.get(operator));
    }
}
