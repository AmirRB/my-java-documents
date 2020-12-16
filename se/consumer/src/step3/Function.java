package step3;

public class Function {

    public static void x(Object o) {
        System.out.println(o);
    }

    public Function() {
        System.out.println("constructor of Fuction execute");
    }

    public Function(String s) {
        System.out.println(s);
    }

    public static String z(String name, String family) {
        String result = name + " " + family;
        System.out.println(result);
        return result;
    }

}
