// File: MultipleInheritance.java
interface Terbang {
    void terbang();
}

interface Berenang {
    void berenang();
}

class Bebek implements Terbang, Berenang {
    public void terbang() {
        System.out.println("Bebek bisa terbang jarak pendek.");
    }

    public void berenang() {
        System.out.println("Bebek juga pandai berenang.");
    }
}

public class MultipleInheritance {
    public static void main(String[] args) {
        Bebek b = new Bebek();
        b.terbang();
        b.berenang();
    }
}
