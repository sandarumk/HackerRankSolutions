/**
 *
 * https://www.hackerrank.com/challenges/java-date-and-time
 *
 * Created by dinuk on 12/20/2016.
 */

import java.util.*;

public class JavaDateAndTime {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String month = in.next();
        String date = in.next();
        String year = in.next();

        int yearint = Integer.parseInt(year);
        int dateint = Integer.parseInt(date);

        int monthint=0;
        month = month.toLowerCase();
        monthint = Integer.parseInt(month);
        monthint --;

        Calendar rightNow = GregorianCalendar.getInstance();
        rightNow.set(yearint,monthint,dateint);
        int dayInt = rightNow.get(Calendar.DAY_OF_WEEK);
        String day;
        switch(dayInt){
            case 1:
                day = "SUNDAY";
                break;
            case 2:
                day = "MONDAY";
                break;
            case 3:
                day = "TUESDAY";
                break;
            case 4:
                day = "WEDNESDAY";
                break;
            case 5:
                day = "THURSDAY";
                break;
            case 6:
                day = "FRIDAY";
                break;
            case 7:
                day = "SATURDAY";
                break;
            default:
                day = "INCORRECT";

        }

        System.out.println(day);
    }

}
