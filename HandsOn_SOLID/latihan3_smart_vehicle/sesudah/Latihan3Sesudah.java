interface Movable {
    void bergerak();
}

interface EngineVehicle {
    void startEngine();
}

interface FuelRefillable {
    void isiBahanBakar();
}

interface BatteryChargeable {
    void isiBaterai();
}

class MobilBensin implements Movable, EngineVehicle, FuelRefillable {
    @Override
    public void bergerak() {
        System.out.println("Mobil bensin melaju di jalan.");
    }

    @Override
    public void startEngine() {
        System.out.println("Menyalakan mesin mobil bensin...");
    }

    @Override
    public void isiBahanBakar() {
        System.out.println("Mengisi bensin...");
    }
}

class MobilListrik implements Movable, BatteryChargeable {
    @Override
    public void bergerak() {
        System.out.println("Mobil listrik melaju senyap.");
    }

    @Override
    public void isiBaterai() {
        System.out.println("Mengisi baterai kendaraan listrik...");
    }
}

class MotorHybrid implements Movable, EngineVehicle, FuelRefillable, BatteryChargeable {
    @Override
    public void bergerak() {
        System.out.println("Motor hybrid melaju.");
    }

    @Override
    public void startEngine() {
        System.out.println("Menyalakan mesin hybrid...");
    }

    @Override
    public void isiBahanBakar() {
        System.out.println("Mengisi bahan bakar hybrid...");
    }

    @Override
    public void isiBaterai() {
        System.out.println("Mengisi baterai hybrid...");
    }
}

class Sepeda implements Movable {
    @Override
    public void bergerak() {
        System.out.println("Sepeda dikayuh.");
    }
}

public class Latihan3Sesudah {
    public static void main(String[] args) {
        MobilBensin bensin = new MobilBensin();
        MobilListrik listrik = new MobilListrik();
        MotorHybrid hybrid = new MotorHybrid();
        Sepeda sepeda = new Sepeda();

        bensin.startEngine();
        bensin.isiBahanBakar();
        bensin.bergerak();

        listrik.isiBaterai();
        listrik.bergerak();

        hybrid.startEngine();
        hybrid.isiBahanBakar();
        hybrid.isiBaterai();
        hybrid.bergerak();

        sepeda.bergerak();
    }
}