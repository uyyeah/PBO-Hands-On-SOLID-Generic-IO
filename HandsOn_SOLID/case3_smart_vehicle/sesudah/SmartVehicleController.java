public class SmartVehicleController {
    private Drivable vehicle;

    public SmartVehicleController(Drivable vehicle) {
        this.vehicle = vehicle;
    }

    public void operate() {
        vehicle.drive();
    }

    public static void main(String[] args) {
        SmartVehicleController controller = new SmartVehicleController(new Car());
        controller.operate();

        Plane plane = new Plane();
        plane.drive();
        plane.fly();

        Boat boat = new Boat();
        boat.sail();
    }
}