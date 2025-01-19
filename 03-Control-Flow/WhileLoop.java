public class WhileLoop {
    public static void main(String[] args) {
        int j = 1;
        while (j <= 5) {
            System.out.println(j);
            j++;
        }

        // or
        j = 1;

        while (true) {
            if (j > 5) {
                break;
            }
            System.out.println(j);
            j++;
        }

        // do while
        int i = 1;
        boolean isReady = false;
        do {
            System.out.println(i);
            i++;
        } while (isReady);
    }
}
