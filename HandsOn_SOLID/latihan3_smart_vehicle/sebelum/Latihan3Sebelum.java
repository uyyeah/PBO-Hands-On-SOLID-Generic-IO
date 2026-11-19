class VehicleSebelum {
    public void startEngine() {
        System.out.println("Menyalakan mesin kendaraan...");
    }

    public void isiBahanBakar() {
        System.out.println("Mengisi bahan bakar kendaraan...");
    }

    public void isiBaterai() {
        System.out.println("Mengisi baterai kendaraan listrik...");
    }
}

public class Latihan3Sebelum {
    public static void main(String[] args) {
        VehicleSebelum mobilListrik = new VehicleSebelum();
        mobilListrik.startEngine();
        mobilListrik.isiBaterai();

        VehicleSebelum sepeda = new VehicleSebelum();
        sepeda.startEngine();
    }
}