/*

daghighe 1:46:00 se jalse 5   -  Mohammad Khalili

 */

package step2;

import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws Exception {

        while (true) {

            try {


                Thread.sleep(1000);
                Class jvmObject = Class.forName("step2.Amir");

                Object developerObject = jvmObject.newInstance(); // create instance

                // call a() method from Amirsam
                Method aMethod = jvmObject.getDeclaredMethod("hello");
                aMethod.invoke(developerObject);
            }catch (Exception e) {
                System.out.println("Hanuz be donya nayamade");
            }
        }

    }
}
