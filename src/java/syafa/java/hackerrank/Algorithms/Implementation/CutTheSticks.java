package syafa.java.hackerrank.Algorithms.Implementation;
import java.util.*;

public class CutTheSticks
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int arrLength = Integer.parseInt(input.nextLine());
        int stickLeft = 0;
        ArrayList<Integer> sticks = new ArrayList<Integer>();
        for (int i = 0; i < arrLength; i++)
        {
            sticks.add(input.nextInt());
        }
        input.close();
        Collections.sort(sticks);
        for (int i = 0; i < sticks.size(); i++)
        {
            sticks.set(i,sticks.get(i) - sticks.get(0));
            for (int j = 0; j < sticks.size(); j++)
            {
                if (sticks.get(j) <= 0)
                {
                    sticks.remove(j);
                }
            }
        }
    }
}