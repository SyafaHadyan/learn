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
        inputTimeString.set(2,inputTimeString.get(2).replace("PM",""));
        for (int i = 0; i < inputTimeString.size(); i++)
        {
            timeInteger.add(Integer.parseInt(inputTimeString.get(i)));
        }
    }
}