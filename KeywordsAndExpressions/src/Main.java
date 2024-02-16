public class Main {
    public static void main(String[] args) {
        double kilometers = (100 * 1.609344);

        int hiscore = 50;

        if (hiscore > 25) {
            hiscore = 1000 + hiscore; // add bonus points
        }

        int health = 100;

        if ((health < 25) && (hiscore > 1000)) {
            hiscore = hiscore - 1000;
        }
    }
}
