public class TraditionalSwitchChallenge {
    public static void main(String[] args) {
        System.out.println(getNatoTranslation("F"));
    }
    public static String getNatoTranslation(String letter) {
        switch (letter) {
            case "A":
                return "Able";
            case "B":
                return "Baker";
            case "C":
                return "Charlie";
            case "D":
                return "Dog";
            case "E":
                return "Easy";
        }
        return "Not Found";
    }
}