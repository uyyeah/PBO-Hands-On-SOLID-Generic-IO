interface Driveable { void drive(); }
interface Flyable { void fly(); }
interface Sailable { void sail(); }
class Car implements Driveable {
    public void drive() { System.out.println("Mobil berjalan di jalan raya."); }
}
class Airplane implements Flyable {
    public void fly() { System.out.println("Pesawat terbang di udara."); }
}
class Boat implements Sailable {
    public void sail() { System.out.println("Kapal berlayar di laut."); }
}
class AmphibianCar implements Driveable, Sailable {
    public void drive() { System.out.println("Mobil amfibi melaju di darat."); }
    public void sail() { System.out.println("Mobil amfibi melaju di air."); }
}
public class SmartVehicleSesudah {
    public static void main(String[] args) {
        Driveable car = new Car();
        Flyable plane = new Airplane();
        Sailable boat = new Boat();
        AmphibianCar amphibian = new AmphibianCar();
        car.drive(); plane.fly(); boat.sail(); amphibian.drive(); amphibian.sail();
    }
}