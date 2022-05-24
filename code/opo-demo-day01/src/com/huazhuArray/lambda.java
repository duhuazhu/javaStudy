package com.huazhuArray;

public class lambda {
    public static void main(String[] args) {
      /*  swimming swimming = new swimming() {
            @Override
            public void run() {
                System.out.println("游的比较快");
            }
        };*/
       /* swimming swimming = () ->{
            System.out.println("游的比较快");
        };*/
        go(() -> System.out.println("游的比较快"));
    }

    public static void go(swimming s) {
        s.run();
    }
}

@FunctionalInterface
interface swimming {
    void run();
}
