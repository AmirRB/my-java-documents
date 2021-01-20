package step4;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class Main {


    public static void main(String[] args) throws Exception {

        Class jvmObject = Class.forName("step4.Amirsam");
        Constructor constructor = jvmObject.getConstructor(new Class[]{String.class, String.class});
        Object developerObject = constructor.newInstance("Amir", "Roodaki");
        Method method = jvmObject.getMethod("a");
        method.invoke(developerObject);

        Method method2 = jvmObject.getMethod("a", new Class[]{String.class});
        Object result = method2.invoke(developerObject , "Amir");
        System.out.println(result);

        Method method3 = jvmObject.getMethod("a", new Class[]{String.class, String.class});
        method3.invoke(developerObject , "Amir" , "Roodaki");


    }
}
