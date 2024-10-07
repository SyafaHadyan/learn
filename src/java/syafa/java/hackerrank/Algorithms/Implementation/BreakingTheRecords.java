package syafa.java.hackerrank.Algorithms.Implementation;
import java.util.*;

public class BreakingTheRecords
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        StringBuilder useless = new StringBuilder(input.nextLine());
        useless.delete(0,useless.length());
        ArrayList<String> inputString = new ArrayList<String>(Arrays.asList(input.nextLine().split(" ")));
        input.close();
        int min = 0;
        int max = 0;
        int currentLow = 0;
        int currentHigh = 0;
        for (int i = 0; i < inputString.size(); i++)
        {
            if (i == 0)
            {
                currentLow = currentHigh = Integer.parseInt(inputString.get(i));
            }
            if (Integer.parseInt(inputString.get(i)) < currentLow)
            {
                min++;
                currentLow = Integer.parseInt(inputString.get(i));
                continue;
            }
            else if (Integer.parseInt(inputString.get(i)) > currentHigh)
            {
                max++;
                currentHigh = Integer.parseInt(inputString.get(i));
                continue;
            }
        }
        System.out.print(max + " " + min);
    }
}