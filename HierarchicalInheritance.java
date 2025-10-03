// File: HierarchicalInheritance.java
class BangunDatar {
    void info() {
        System.out.println("Ini adalah bangun datar.");
    }
}

class Persegi extends BangunDatar {
    void luas(int sisi) {
        System.out.println("Luas persegi: " + (sisi * sisi));
    }
}

class Lingkaran extends BangunDatar {
    void luas(double r) {
        System.out.println("Luas lingkaran: " + (Math.PI * r * r));
    }
}

public class HierarchicalInheritance {
    public static void main(String[] args) {
        Persegi p = new Persegi();
        p.info();
        p.luas(4);

        Lingkaran l = new Lingkaran();
        l.info();
        l.luas(7);
    }
}
