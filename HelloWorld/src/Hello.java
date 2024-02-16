public class Hello {
    public static void main(String[] args){
        System.out.println("Hello, Aaron");

        boolean isAlien = true;

        if (!isAlien) {
            System.out.println("It is not an alien!");
        } else {
            System.out.println("It is an alien!");
        }

        int topScore = 80;
        if (topScore >= 100) {
            System.out.println("You got the high score!");
        } else {
            System.out.println("You didn't get the high score!");
        }

        int secondTopScore = 60;
        if (topScore > secondTopScore && topScore < 100) {
            System.out.println("Greater than second top score and less than 100");
        }
    }
}
