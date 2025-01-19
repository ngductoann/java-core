public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println(Dog.genus);

        // Dog rex = new Dog("rex"); // create instance (rex)
        // Dog fluffy = new Dog("fluffy"); // create instance (fluffy)

        // // rex.printName(); // print fluffy
        // rex.printName(); // print rex
        // fluffy.printName(); // print fluffy

        Calculator.printSum(5, 10);
        printHello(); // shorter from of Main.printHello();

        Dog rex = new Dog(); // create instance
        rex.bark(); // call instance method
    }

    public static void printHello() {
        System.out.println("Hello");
    }
}