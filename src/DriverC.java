public class DriverC<T extends Truck> extends Driver {
    public DriverC(String name, Boolean hasLicense, Integer experience) {
        super(name, hasLicense, experience);
    }
    @Override
    String start() {return "Car has  started";}
    @Override
    String stop() {return "Car has stopped";}
    @Override
    String refuel() {return "Car is charging with petrol";}
    public String getCarMessage(Car car) {
        return "Driver " + getName() + " is driving car " + car.getBrand() + " " + car.getModel() + "will participate in race";
    }
}

