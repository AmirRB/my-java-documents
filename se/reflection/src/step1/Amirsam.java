package step1;

public class Amirsam {
    static {
        System.out.println("Amirsam static block executed");
    }

    public Amirsam() {
        System.out.println("created new jnstance from Amirsam");
    }

    public void a() {
        System.out.println("ana a");
    }

    private void b() {
        System.out.println("ana b");
    }

    public static void c() {
        System.out.println("ana static c");
    }

}
