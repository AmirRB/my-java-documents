package step4;

public class Amirsam {

    public Amirsam() {
        System.out.println("no signiture");
    }

    public Amirsam(String name, String family) {
        System.out.println(name + " " + family);
    }

    public void a() {
        System.out.println("ana a");
    }

    public void a(String a, String b) {
        System.out.println("ana a with " + a + " " + b);
    }

    public String a(String a) {
        return ("ana a with " + a);
    }

}
