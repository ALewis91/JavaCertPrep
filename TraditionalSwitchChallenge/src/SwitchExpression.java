public class SwitchExpression {
    public static void main(String[] args) {
        System.out.println("Day " + 0 + " is " + getWeekdayName(0));
    }

    public static String getWeekdayName(int day) {
        String dayOfWeek = switch(day) {
            case 0 -> "Sunday";
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            default -> "Invalid day";
        };
        return dayOfWeek;
    }
}
