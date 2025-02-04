public class App {
    public static void main(String[] args) throws Exception {
        Car car = new Car("2020 blue ferrari ...");
        runRace(car);

        Car ferrari = new GasPoweredCar("2020 blue ferrari ...", 15.4, 6);
        runRace(ferrari);
    }

    public static void runRace(Car car) {
        car.startEngine();
        car.drive();
    }
}
