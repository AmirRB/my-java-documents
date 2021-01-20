package step1;

import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws Exception {
        Class jvmObject = Class.forName("step1.Amirsam");

        Object developerObject = jvmObject.newInstance(); // create instance

        // call a() method from Amirsam
        Method aMethod = jvmObject.getDeclaredMethod("a");
        aMethod.invoke(developerObject);

        // b() is private but we can call
        Method bMethod = jvmObject.getDeclaredMethod("b");
        bMethod.setAccessible(true); // make b() public
        bMethod.invoke(developerObject);
        bMethod.setAccessible(false); // make a() private
        try {
            bMethod.invoke(developerObject);
        } catch (Exception e) {
            System.err.println("b method is private");
        }


    }
}
