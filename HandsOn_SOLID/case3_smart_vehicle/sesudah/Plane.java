public class Plane implements Drivable, Flyable {
    @Override
    public void drive() {
        System.out.println("Pesawat taxiing di landasan.");
    }

    @Override
    public void fly() {
        System.out.println("Pesawat sedang terbang.");
    }
}