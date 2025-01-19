public class TheForLoop {
    public static void main(String[] args) {
        for (int counter = 1; counter <= 5; counter++) {
            System.out.println(counter);
        }

        System.out.println("10,000 at 2% interest = " + calculateInterest(10000, 0.02));
        System.out.println("10,000 at 3% interest = " + calculateInterest(10000, 0.03));

        ///
        for (double rate = 2.0; rate <= 5.0; rate++) {
            double interestAmount = calculateInterest(10000, rate);
            System.out.println("10,000 at " + rate + "% interest = " + interestAmount);
        }

        for (int counter = 1; counter <= 10; counter++) {
            System.out.println(counter);

            if (counter > 5) {
                break;
            }
        }
    }

    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate / 100));
    }
}
