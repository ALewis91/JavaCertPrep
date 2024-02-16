public class MainChallenge {

    public static void main(String[] args) {

        int score = calculateScore(false, 10000, 5, 100);
        System.out.println("Your score is " + score);
        score = calculateScore(true, 800, 8, 200);
        System.out.println("Your final score is " + score);
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        int finalScore = score;

        if (gameOver) {
            finalScore += (levelCompleted * bonus);
            finalScore += 1000;
        }

        return finalScore;
    }
}
