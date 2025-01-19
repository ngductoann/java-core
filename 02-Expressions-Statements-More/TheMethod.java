public class TheMethod {
    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int finalScore = score;

        if (gameOver) {
            finalScore += (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("Your final score was " + finalScore);
        }

        calculateScore(gameOver, score, levelCompleted, bonus);

        // code is duplication
        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        finalScore = score;

        if (gameOver) {
            finalScore += (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("Your final score was " + finalScore);
        }

        // change above code with call function
        calculateScore(gameOver, 10000, 8, 200);
    }

    // public static void calculateScore() {
    // boolean gameOver = true;
    // int score = 800;
    // int levelCompleted = 5;
    // int bonus = 100;

    // int finalScore = score;

    // if (gameOver) {
    // finalScore += (levelCompleted * bonus);
    // finalScore += 1000;
    // System.out.println("Your final score was " + finalScore);
    // }
    // }

    public static void calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        int finalScore = score;

        if (gameOver) {
            finalScore += (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("Your final score was " + finalScore);
        }
    }
}
