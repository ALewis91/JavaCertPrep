public class OverloadedMethodChallenge {
    public static void main(String[] args) {
        System.out.println("5 foot and 8 inches is " + convertToCentimeters(5, 8) + " cm");
        System.out.println("68 inches is " + convertToCentimeters(68) + " cm");
    }

    public static double convertToCentimeters(int inches) {
        return inches * 2.54;
    }

    public static double convertToCentimeters(int feet, int inches) {
        return convertToCentimeters((12 * feet) + inches);
    }
}
