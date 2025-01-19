public class Dog {
    // static String genus = "Canis";

    // void printData() {
    // Dog d = new Dog();
    // // System.out.println(d.genus); // confusing
    // System.out.println(Dog.genus); // Clearer
    // }

    // private static String name;
    private String name;

    public Dog(String name) {
        this.name = name;
    }

    public Dog() {

    }

    public void printName() {
        System.out.println("name = " + name);
    }

    public void bark() {
        System.out.println("woof");
    }
}