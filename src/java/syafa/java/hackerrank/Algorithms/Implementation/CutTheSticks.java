package syafa.java.hackerrank.Algorithms.Implementation;
import java.util.*;

public class CutTheSticks
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int arrLength = Integer.parseInt(input.nextLine());
        ArrayList<Integer> sticksLeft = new ArrayList<Integer>();
        ArrayList<Integer> sticks = new ArrayList<Integer>();
        int currentLowestStick = 0;
        for (int i = 0; i < arrLength; i++)
        {
            sticks.add(input.nextInt());
        }
        input.close();
        Collections.sort(sticks);
        for (int i = 0; i < sticks.size(); i++)
        {
            if (i == 0)
            {
                currentLowestStick = sticks.get(0);
            }
            sticks.set(i,sticks.get(i) - sticks.get(0));
            if (sticks.get(i) <= 0)
            {
                sticks.remove(i);
            }
            if (i == sticks.size() - 1)
            {
                for (int j = 0; j < sticks.size(); j++)
                {
                }
            }
            sticksLeft.add(sticks.size());
        }
        for (int i = 0; i < args.length; i++)
        {
            
        }
    }
}