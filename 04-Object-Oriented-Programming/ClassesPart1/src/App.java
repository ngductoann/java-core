public class App {
    public static void main(String[] args) throws Exception {
        Car car = new Car();
        car.descripbeCar();
        // 0-Doors null null null null
        // 2-Doors Gray Tesla Model X Convertible

        car.setMake("Porsche");
        car.setModel("Carrera");
        car.setDoors(2);
        car.setConvertible(true);
        car.setColor("black");

        System.out.println("make = " + car.getMake());
        System.out.println("model = " + car.getModel());
        // make = Tesla
        // model = Model X

        car.descripbeCar();
        // 2-Doors black Porsche Carrera Convertible

        Account bobsAccount = new Account();

        System.out.println(bobsAccount.getNumber());
        System.out.println(bobsAccount.getBalence());
        // Empty constructor called
        // 56789
        // 2.5

        Account bobsAccount2 = new Account("Bob Bob", "myemail@bob.com", "12121231231");

        System.out.println(bobsAccount2.getNumber());
        System.out.println(bobsAccount2.getBalence());
        // 99999
        // 100.55

        // bobsAccount.setNumber("12345");
        // bobsAccount.setBalence(1000.0);
        // bobsAccount.setCustomerName("Bob Bob");
        // bobsAccount.setCustomerEmail("myemail@bob.com");
        // bobsAccount.setCustomerPhone("12312131231");

        // Account bobsAccount2 = new Account("12345", 1000.0, "Bob Bob2", "myemail2@bob.com",
        // "121231231");
    }
}
