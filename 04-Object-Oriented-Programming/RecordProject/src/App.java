public class App {
    public static void main(String[] args) throws Exception {

        for (int i = 1; i <= 5; i++) {
            Student s =
                    new Student(
                            "S92300" + i,
                            switch (i) {
                                case 1 -> "Mary";
                                case 2 -> "Carol";
                                case 3 -> "Tim";
                                case 4 -> "Harry";
                                case 5 -> "Lisa";
                                default -> "Anonymous";
                            },
                            "07/12/2000",
                            "Java-Core");

            System.out.println(s);
        }

        for (int i = 1; i <= 5; i++) {
            LPAStudent s =
                    new LPAStudent(
                            "S92300" + i,
                            switch (i) {
                                case 1 -> "Mary";
                                case 2 -> "Carol";
                                case 3 -> "Tim";
                                case 4 -> "Harry";
                                case 5 -> "Lisa";
                                default -> "Anonymous";
                            },
                            "07/12/2000",
                            "Java-Core");

            System.out.println(s);
        }

        Student pojoStudent = new Student("S923006", "Ann", "05/11/1985", "Java-Core");
        LPAStudent recordStudent = new LPAStudent("S923007", "Bill", "05/11/1985", "Java-Core");

        System.out.println(pojoStudent.getName() + " is taking " + pojoStudent.getClassList());
        System.out.println(recordStudent.name() + " is taking " + recordStudent.classList());
    }
}
