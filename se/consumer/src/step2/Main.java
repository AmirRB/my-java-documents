package step2;

import java.util.function.Consumer;

public class Main {

    public static void main(String[] args) {

//        Consumer consumer = Function::z;
//        y(consumer);

        y(Function::z);
    }


    public static void y(Consumer consumer) {
        System.out.println("before");
        consumer.accept("Amir");
        System.out.println("after");
    }


}
