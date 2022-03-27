package org.lambdas;

public class ClosuresExample {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        doProcess(a, i -> System.out.println(i + b));
        doProcess(a, new Process() {
            @Override
            public void doProcess(int i) {
                System.out.println(i + b);
            }
        });
    }

    public static void doProcess(int i, Process p) {
        p.doProcess(i);
    }
}

interface Process {
    void doProcess(int i);
}
