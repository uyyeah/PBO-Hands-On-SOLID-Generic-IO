interface Vehicle {
    void drive();
    void fly();
    void sail();
}
class Car implements Vehicle {
    public void drive() { System.out.println("Mobil berjalan di jalan raya."); }
    public void fly() { throw new UnsupportedOperationException("Mobil tidak bisa terbang!"); }
    public void sail() { throw new UnsupportedOperationException("Mobil tidak bisa berlayar!"); }
}
public class SmartVehicleSebelum {
    public static void main(String[] args) {
        Vehicle car = new Car();
        car.drive();
        car.fly();
    }
}