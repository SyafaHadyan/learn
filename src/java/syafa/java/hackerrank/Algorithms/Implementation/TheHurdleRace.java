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
        for (int i = 0; i < hurdle.size() - 1; i++)
        {
            if (Integer.parseInt(jump.get(1) + Integer.parseInt(hurdle.get(i))) < Integer.parseInt(hurdle.get(i + 1)))
            {
                System.out.print((Integer.parseInt(hurdle.get(i + 1)) - (Integer.parseInt(jump.get(1)) + Integer.parseInt(hurdle.get(i)))));
                return;
            }
            System.out.println("Next" + ':' + ' ' + Integer.parseInt(hurdle.get(i + 1)));
        }
        System.out.print(0);
    }
}