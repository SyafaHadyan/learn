package syafa.java.hackerrank.Algorithms.Implementation;
import java.util.*;

public class CountingValleys
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int numberOfSteps = Integer.parseInt(input.nextLine());
        ArrayList<String> step = new ArrayList<String>(Arrays.asList(input.nextLine().split("(?!^)")));
        input.close();
        int currentPosition = 0;
        boolean isAtValley = false;
        for (int i = 0; i < step.size(); i++)
        {
            if (step.get(i).equalsIgnoreCase("U"))
            {
                currentPosition++;
            }
        }
    }
}