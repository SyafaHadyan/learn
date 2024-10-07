package syafa.java.hackerrank.Algorithms.Implementation;
import java.util.*;

public class TheHurdleRace
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        ArrayList<String> jump = new ArrayList<String>(Arrays.asList(input.nextLine().split(" ")));
        ArrayList<String> hurdle = new ArrayList<String>(Arrays.asList(input.nextLine().split(" ")));
        input.close();
        for (int i = 0; i < hurdle.size(); i++)
        {
            if (Integer.parseInt(jump.get(1)) < Integer.parseInt(hurdle.get(i)))
            {
                
            }
        }
    }
}