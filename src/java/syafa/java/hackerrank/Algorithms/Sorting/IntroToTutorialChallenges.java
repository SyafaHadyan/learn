package syafa.java.hackerrank.Algorithms.Sorting;
import java.util.*;

public class IntroToTutorialChallenges
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int numberToSearch = Integer.parseInt(input.nextLine());
        StringBuilder arraySize = new StringBuilder(input.nextLine());
        arraySize.delete(0,arraySize.length());
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