package syafa.java.hackerrank.Algorithms.Sorting;
import java.util.*;

public class IntroToTutorialChallenges
{
    public static void main(String[] args)
    {
        /*
         * 4 = Number to search
         * 6 = Array size
         * 1 4 5 7 9 12 = Array given through input
         */
        Scanner input = new Scanner(System.in);
        int numberToSearch = Integer.parseInt(input.nextLine());
        int arraySize = Integer.parseInt(input.nextLine());
        ArrayList<String> numbers = new ArrayList<String>(Arrays.asList(input.nextLine().split(" ")));
        input.close();
        for (int i = 0; i < numbers.size(); i++)
        {
            if (Integer.parseInt(numbers.get(i)) == numberToSearch)
            {
                System.out.print(i);
                return;
            }
        }
    }
}