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

        secondTopScore = 81;
        if (topScore > secondTopScore || topScore < 100) {
            System.out.println("Either top score is greater than second top score or top score is less than 100");
        }

        int newValue = 50;
        if (newValue == 50) {
            System.out.println("This is true");
        }

        boolean isCar = false;
        if(isCar = true) {
            System.out.println("This is not supposed to execute");
        }

        String makeOfCar = "volkswagon";
        boolean isDomestic = makeOfCar == "volkswagon" ? false : true;

        if (isDomestic) {
            System.out.println("This car is domestic");
        }

        String s = (isDomestic) ? "This car is domestic" : "This car is not domestic";

        System.out.println(s);

        double doubleOne = 20.00, doubleTwo = 80.00;
        double doubleThree = (doubleOne + doubleTwo) * 100.00;
        double remainder = doubleThree % 40.00;
        boolean hasRemainder = remainder > 0.00 ? true : false;
        System.out.println("hasRemainder: " + hasRemainder);

        if (hasRemainder) {
            System.out.println("has some remainder");
        }
    }
}
