public class MainChallenge {

    public static void main(String[] args) {

        calculateScore(false, 10000, 5, 100);
        calculateScore(true, 800, 8, 200);
    }

    public static void calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        int finalScore = score;

        if (gameOver) {
            finalScore += (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("Your final score is " + finalScore);
        } else {
            System.out.println("Your score is " + finalScore);
        }
    }
}
