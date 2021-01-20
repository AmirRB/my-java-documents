package step3;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class Main {


    public static void main(String[] args) throws Exception {

        Class jvmObject = Class.forName("step3.Amirsam");
        Constructor constructor = jvmObject.getConstructor(new Class[]{String.class, String.class});
        Object developerObject = constructor.newInstance("Amir", "Roodaki");
        Method method = jvmObject.getMethod("a");
        method.invoke(developerObject);


    }
}
