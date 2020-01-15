/* Find days of Semester */
import java.util.*;
public class DaysOfSemester {
    public static void main(String[] args) {
        System.out.println("Enter the First Day Of Semester in format(yyyy,MM,dd)");
        Scanner sc1 = new Scanner(System.in);
        String date1 = sc1.nextLine();
        String y1 = date1.substring(0,4);
        String m1 = date1.substring(5,7);
        String d1 = date1.substring(8);
        GregorianCalendar gre1;
        int year1 = Integer.parseInt(y1);
        int month1 = Integer.parseInt(m1);
        int day1 = Integer.parseInt(d1);
        gre1=new GregorianCalendar(year1,(month1-1),day1);
        System.out.println("Enter the Last Day Of Semester in format(yyyy,MM,dd)");
        Scanner sc2 = new Scanner(System.in);
        String date2 = sc2.nextLine();
        String y2 = date2.substring(0,4);
        String m2 = date2.substring(5,7);
        String d2 = date2.substring(8);
        GregorianCalendar gre2;
        int year2 = Integer.parseInt(y2);
        int month2 = Integer.parseInt(m2);
        int day2 = Integer.parseInt(d2);
        gre2=new GregorianCalendar(year2,(month2-1),day2);
        double endDay = gre2.getTimeInMillis();
        double startDay = gre1.getTimeInMillis();
        double noofday = Math.abs((endDay-startDay)/(1000*60*60*24));
        int result = (int) noofday;
        System.out.print("Number Of Days in Semester is "+ result +"\n");
    }
}
