package step3;

public class Main {

    public static void main(String[] args) {

        y2(Function::new);
        y(Function::z);


    }



    public static void y(CustomConsumer<String, String, String> consumer) {
        System.out.println("before");
        String r = consumer.accept("Amir", "Roodaki");
        System.out.println(r);
        System.out.println("after");
    }


    public static void y2(AmirConsumer amir) {
        amir.accept();
    }
}
