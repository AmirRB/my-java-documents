package step1;

import java.util.function.Consumer;

public class Main {

    public static void main(String[] args) {
        Consumer consumer = Function::x;
        System.out.println("before");
        consumer.accept("Amir");
        System.out.println("after");
    }


}
