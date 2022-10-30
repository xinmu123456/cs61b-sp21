

public class LeapYear {
    

    /**
     * checkLeapYear
     * 
     */
    private static boolean isLeapYear (int year) {
        return (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
    }
    
    private static void checkLeapYear (int year) {
        if (isLeapYear(year)) {
            System.out.printf("%d is a leap year.\n", year); 
        } else { 
            System.out.printf("%d is not a leap year.\n", year);
        }
    }


    public static void main(String[] args) {
        checkLeapYear(Integer.parseInt(args[0]));
    }

}
