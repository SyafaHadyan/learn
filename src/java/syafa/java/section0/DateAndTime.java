package syafa.java.section0;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class DateAndTime
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int month = input.nextInt();
        int day = input.nextInt();
        int year = input.nextInt();
        input.nextLine();
        input.close();
        String formattedDate = year + "-" + String.format("%02d", month) + "-" + String.format("%02d", day) + " 00:00:00";
        System.out.println(dayName(formattedDate, "yyyy-MM-dd HH:mm:ss"));
    }
    public static String dayName(String inputDate, String format){
        Date date = null;
        try
        {
            date = new SimpleDateFormat(format).parse(inputDate);
        } catch (ParseException e)
        {
            e.printStackTrace();
        }
        return new SimpleDateFormat("EEEE", Locale.ENGLISH).format(date);
    }
}