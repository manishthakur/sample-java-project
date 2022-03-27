package org.lambdas;

public class HelloWorldGreeting implements Greeting {

    @Override
    public void perform() {
        System.out.printf("Hello World!!");
    }
}
