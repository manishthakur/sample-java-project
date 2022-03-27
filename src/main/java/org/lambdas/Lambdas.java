package org.lambdas;

public class Lambdas {

    // Why Lambda
    //1. Enabled functional programming
    //2. Readable and concise code
    //3. Easier to use API's and libraries
    //4. Enable support for parallel processing

    // TO LEARN
    // 1. Functional interface
    //    Any interface is considered as functional if it has only one abstract method.
    // 2. Method Interface
    // 3. Collections improvements

    public static void main(String[] args) {

        Thread myThread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Printed inside Runnable");
            }
        });
        myThread.start();

        Thread myLambdaThread = new Thread(() -> {
            System.out.println("Printed inside Runnable 2.");
        });
        myLambdaThread.start();

        //Do we need functional programming?
        GreetingFunction greetingFunction = () -> System.out.println("Hello World !!!");

        DoubleNumberFunction doubleNumberFunction = (int a) -> {
            return a * 2;
        };

        AddFunction addFunction = (int a, int b) -> {
            return a + b;
        };

        DivFunction divFunction = (int a, int b) -> {
            if (b == 0) return 0;
            return a / b;
        };

        System.out.println("!! " + divFunction.divide(8, 4));
    }

    @FunctionalInterface
    interface GreetingFunction {
        void perform();
    }

    @FunctionalInterface
    interface DoubleNumberFunction {
        int doubleTheInteger(int a);
    }

    @FunctionalInterface
    interface AddFunction {
        int add(int a, int b);
    }

    @FunctionalInterface
    interface DivFunction {
        int divide(int a, int b);
    }
}
