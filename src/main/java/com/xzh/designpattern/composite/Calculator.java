package com.xzh.designpattern.composite;

public class Calculator {


    public static void main(String[] args) {
        Expression expression = new AddExpression(new NumberExpression(1), new NumberExpression(2));
        System.err.println(expression.getValue());
    }



    interface Expression {
        int getValue();
    }

    static class AddExpression implements Expression {
        private Expression left;
        private Expression right;

        public AddExpression(Expression left, Expression right) {
            this.left = left;
            this.right = right;
        }

        @Override
        public int getValue() {
            return this.left.getValue() + this.right.getValue();
        }
    }

    static class NumberExpression implements Expression {
        int value;

        public NumberExpression(int value) {
            this.value = value;
        }

        @Override
        public int getValue() {
            return this.value;
        }

    }

}
