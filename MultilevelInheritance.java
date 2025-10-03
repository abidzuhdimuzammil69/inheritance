// File: MultilevelInheritance.java
class Kendaraan {
    void jalan() {
        System.out.println("Kendaraan berjalan.");
    }
}

class Mobil extends Kendaraan {
    void klakson() {
        System.out.println("Mobil membunyikan klakson.");
    }
}

class MobilSport extends Mobil {
    void turbo() {
        System.out.println("Mobil sport mengaktifkan turbo!");
    }
}

public class MultilevelInheritance {
    public static void main(String[] args) {
        MobilSport ms = new MobilSport();
        ms.jalan();
        ms.klakson();
        ms.turbo();
    }
}
