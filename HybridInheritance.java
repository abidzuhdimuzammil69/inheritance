// File: HybridInheritance.java
class Manusia {
    void bernapas() {
        System.out.println("Manusia bernapas.");
    }
}

class Pekerja extends Manusia {
    void bekerja() {
        System.out.println("Pekerja sedang bekerja.");
    }
}

interface Pelajar {
    void belajar();
}

class MahasiswaPekerja extends Pekerja implements Pelajar {
    public void belajar() {
        System.out.println("Mahasiswa pekerja sedang belajar di malam hari.");
    }
}

public class HybridInheritance {
    public static void main(String[] args) {
        MahasiswaPekerja mp = new MahasiswaPekerja();
        mp.bernapas();
        mp.bekerja();
        mp.belajar();
    }
}
