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
        int dose = 0;
        for (int i = 0; i < hurdle.size() - 1; i++)
        {
            System.out.println("Next" + ':' + " " + Integer.parseInt(hurdle.get(i + 1)));
            if ((Integer.parseInt(jump.get(1)) + Integer.parseInt(hurdle.get(i))) < Integer.parseInt(hurdle.get(i + 1)))
            {
                System.out.println("Dose needed" + ':' + ' ' + (Integer.parseInt(hurdle.get(i + 1)) - Integer.parseInt(jump.get(1))));
                if (Integer.parseInt(hurdle.get(i + 1)) - Integer.parseInt(jump.get(1)) > dose)
                {
                    dose = Integer.parseInt(hurdle.get(i + 1)) - Integer.parseInt(jump.get(1));
                }
                System.out.println("Current dose" + ':' + ' ' + dose);
            }

        }
        System.out.print(dose);
    }
}