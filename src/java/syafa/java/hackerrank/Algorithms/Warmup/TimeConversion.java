package syafa.java.hackerrank.Algorithms.Warmup;
import java.util.*;

public class TimeConversion
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        ArrayList<String> inputTimeString = new ArrayList<String>(Arrays.asList(input.nextLine().split(":")));
        input.close();
        ArrayList<Integer> timeInteger = new ArrayList<Integer>();
        int hourConversion = 12;
        if (inputTimeString.get(2) == "AM")
        {
            hourConversion = -12;
        }
        try
        {
            inputTimeString.set(2,inputTimeString.get(2).replace("PM",""));
        }
        catch (Exception e)
        {
            inputTimeString.set(2,inputTimeString.get(2).replace("AM",""));
        }
        try
        {
            inputTimeString.set(2,inputTimeString.get(2).replace("AM",""));
        }
        catch (Exception e)
        {
            inputTimeString.set(2,inputTimeString.get(2).replace("PM",""));
        }
        for (int i = 0; i < inputTimeString.size(); i++)
        {
            timeInteger.add(Integer.parseInt(inputTimeString.get(i)));
        }
        timeInteger.set(0,timeInteger.get(0) + hourConversion);
        for (int i = 0; i < timeInteger.size(); i++)
        {
            System.out.printf("%02d",timeInteger.get(i));
            if (i < timeInteger.size() - 1)
            {
                System.out.print(':');
            }
        }
        System.out.print("/n");
        for (int i = 0; i < inputTimeString.size(); i++)
        {
            System.out.print(inputTimeString.get(i));
            //System.out.print(timeInteger.get(i));
            if (i < timeInteger.size() - 1)
            {
                System.out.print(':');
            }
        }
    }
}