public class NumberOfDaysInMonth {


    public static boolean isLeapYear(int year) {

        int remainderOf400 = year % 400;
        int remainderOf4 = year % 4;
        int remainderOf100 = year % 100;

        if (year < 1 || year > 9_999) {
            return false;
        } else if (remainderOf400 == 0) {
            return true;
        } else if (remainderOf4 == 0 && remainderOf100 != 0) {
            return true;
        } else {
            return false;
        }
    }

    public static int getDaysInMonth(int month, int year) {
        
        int numberOfDays;
        

        if (month < 1 || month > 12) {
            return -1;
        } else if (year < 1 || year > 9_999) {
            return -1;
        }
        if (isLeapYear(year) == true) {
                switch (month) {
                    case 1:
                        return  31;

                    case 2:
                        return  29;

                    case 3:
                        return  31;

                    case 4:
                        return  30;

                    case 5:
                        return  31;

                    case 6:
                        return  30;

                    case 7:
                        return  31;

                    case 8:
                        return  31;

                    case 9:
                        return  30;

                    case 10:
                        return  31;

                    case 11:
                        return  30;

                    case 12:
                        return  31;

                }
            }
                else if (!isLeapYear(year)) {
                    switch (month) {
                        case 1:
                            return 31;

                        case 2:
                            return 28;

                        case 3:
                            return  31;

                        case 4:
                            return  30;

                        case 5:
                            return  31;

                        case 6:
                            return  30;

                        case 7:
                            return  31;

                        case 8:
                            return 31;

                        case 9:
                            return  30;

                        case 10:
                            return  31;

                        case 11:
                            return  30;

                        case 12:
                            return  31;

                    }
                }
                 return -1;
                
    }
}
