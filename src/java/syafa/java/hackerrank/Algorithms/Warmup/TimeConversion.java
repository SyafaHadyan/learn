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
        inputTimeString.set(2,inputTimeString.get(2).replace("PM",""));
        for (int i = 0; i < inputTimeString.size(); i++)
        {
            timeInteger.add(Integer.parseInt(inputTimeString.get(i)));
        }
        for (int i = 0; i < timeInteger.size(); i++)
        {
            System.out.print(timeInteger.get(i));
            if (i < timeInteger.size())
            {
                System.out.print(':');
            }
        }
    }
}