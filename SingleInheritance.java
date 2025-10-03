// File: SingleInheritance.java
class Hewan {
    void makan() {
        System.out.println("Hewan sedang makan.");
    }
}

class Kucing extends Hewan {
    void meong() {
        System.out.println("Kucing mengeong.");
    }
}

public class SingleInheritance {
    public static void main(String[] args) {
        Kucing k = new Kucing();
        k.makan();
        k.meong();
    }
}
