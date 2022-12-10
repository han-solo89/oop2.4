public class Main {
    public static void main(String[] args) {

        Car chevrolet = new Car("chevrolet",
                "impala",
                319,
                11,
                192,
                1);
        System.out.println(chevrolet);

        DriverB<Car> driverB = new DriverB<>("Dean winchester",true,29);
        System.out.println(driverB.getCarMessage(chevrolet));

        Truck truck = new Truck("star truck",
                "interpress",
                1,
                100,
                4,
                7);

    }
}