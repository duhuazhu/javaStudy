package com.huazhuArray;

public class lambda {
    public static void main(String[] args) {
      /*  swimming swimming = new swimming() {
            @Override
            public void run() {
                System.out.println("�εıȽϿ�");
            }
        };*/
       /* swimming swimming = () ->{
            System.out.println("�εıȽϿ�");
        };*/
        go(() -> System.out.println("�εıȽϿ�"));
    }

    public static void go(swimming s) {
        s.run();
    }
}

@FunctionalInterface
interface swimming {
    void run();
}
