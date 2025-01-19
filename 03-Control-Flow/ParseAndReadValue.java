import java.util.Scanner;

public class ParseAndReadValue {
    public static void main(String[] args) {
        int currentYear = 2025;
        String usersDateOfBirth = "2000";

        int dateOfBirth = Integer.parseInt(usersDateOfBirth);

        System.out.println("Age = " + (currentYear - dateOfBirth));

        String usersAgeWithPartialYear = "24.5";
        double ageWithPartialYear = Double.parseDouble(usersAgeWithPartialYear);
        System.out.println("The user say he's " + ageWithPartialYear);

        System.out.println(getInputFromConsole(2025));
        System.out.println(getInputFromScanner(2025));
    }

    public static String getInputFromConsole(int currentYear) {
        String name = System.console().readLine("Hi, What's your name? ");
        System.out.println("Hi " + name);
        String dateOfBirth = System.console().readLine("What your were you born? ");
        int age = currentYear - Integer.parseInt(dateOfBirth);

        return "So you are " + age + " years old";
    }

    public static String getInputFromScanner(int currentYear) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What's your name? ");
        String name = scanner.nextLine();

        System.out.println("Hi" + name + "What your were you born? ");
        String dateOfBirth = scanner.nextLine();
        int age = currentYear - Integer.parseInt(dateOfBirth);

        scanner.close();
        return "So you are " + age + " years old";
    }
}
