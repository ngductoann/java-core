public class Switch {
    public static void main(String[] args) {
        int switchValue = 1;

        // if (switchValue == 1) {
        // System.out.println("Value was 1");
        // } else if (switchValue == 2) {
        // System.out.println("Value was 2");
        // } else {
        // System.out.println("Was not 1 or 2");
        // }

        // Traditional Switch Statement
        switch (switchValue) {
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Was a 3, a 4, a 5");
                System.out.println("Actually it was a " + switchValue);
                break;
            default:
                System.out.println("Was not 1, 2, 3, 4, or 5");
                break;
        }

        // Enhanced Switch Statement
        switch (switchValue) {
            case 1 -> System.out.println("Value was 1");
            case 2 -> System.out.println("Value was 2");
            case 3, 4, 5 -> {
                System.out.println("Was a 3, a 4, a 5");
                System.out.println("Actually it was a " + switchValue);
            }
            default ->
                System.out.println("Was not 1, 2, 3, 4, or 5");
        }

        String month = "JANUARY";
        System.out.println(month + " is in the " + getQuarter(month) + " quarter");
    }

    public static String getQuarter(String month) {
        return switch (month) {
            case "JANUARY", "FEBRUARY", "MARCH" -> {
                yield "1st";
            }
            case "APRIL", "MAY", "JUNE" -> "2nd";
            case "JUNY", "AUGUST", "SEPTEMBER" -> "3rd";
            case "OCTOBER", "NOVEMBER", "DECEMBER" -> "4th";
            default -> {
                String badResponse = month + " is bad";
                yield badResponse;
            }
        };
    }
}
