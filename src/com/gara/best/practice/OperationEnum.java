package com.gara.best.practice;

public enum OperationEnum {
    ADD{
        @Override
        public int calculate(int a, int b) {
            return a + b;
        }
    },
    MULTIPART{
        @Override
        public int calculate(int a, int b) {
            return a * b;
        }
    };


    public abstract int calculate(int a, int b);
}
