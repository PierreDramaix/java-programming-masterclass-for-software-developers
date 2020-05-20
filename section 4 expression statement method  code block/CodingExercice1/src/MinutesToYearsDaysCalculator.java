public class MinutesToYearsDaysCalculator {
    public static void printYearsAndDays(long minutes){

        if(minutes < 0) {
            System.out.println("Invalid Value");
        } else {
            long minutesToDays = minutes / 60 / 24;
            long remainderDays = minutesToDays % 365;
            long daysToYear = minutesToDays / 365;

            System.out.println(minutes + " min = "
                    + daysToYear + " y and "
                    + remainderDays + " d");
        }
    }
}
