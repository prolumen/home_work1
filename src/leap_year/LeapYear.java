package leap_year;
import java.util.*;

public class LeapYear {
    private LeapYear() {
        Scanner s = new Scanner(System.in);
        String repeat;
        int i , year;

        do {
            i = 0;
            System.out.print("Enter year for check: ");
            year = s.nextInt();
            System.out.println(year);
            if ((year % 4 == 0) && (year % 100 != 0)) {
                System.out.println("The entered year is the leap year");
                }
                else if (((year % 4 != 0) || (year % 100 == 0)) && (year % 400 != 0)){
                    System.out.println("The entered year isn't the leap year");
                }
            System.out.println("Enter \"e\" for exit or \"r\" for repeat");
            repeat = s.next();
            if (repeat.equals("e")) i =1;
        } while (i ==0);
    }

    public static void main(String[] args) {
        LeapYear y = new LeapYear();
    }
}
