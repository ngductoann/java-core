public class App extends Object {
    public static void main(String[] args) throws Exception {
        Student max = new Student("Max", 21);
        System.out.println(max.toString());
    }
}

class Student {

    private String name;
    private int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
