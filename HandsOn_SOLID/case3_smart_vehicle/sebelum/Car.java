public class Car implements Vehicle {
    @Override
    public void drive() {
        System.out.println("Mobil berjalan di jalan raya.");
    }

    @Override
    public void fly() {
        throw new UnsupportedOperationException("Mobil tidak bisa terbang!");
    }

    @Override
    public void sail() {
        throw new UnsupportedOperationException("Mobil tidak bisa berlayar!");
    }
}