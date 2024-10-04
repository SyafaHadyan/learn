package syafa.java.hackerrank.ThirtyDaysOfCode;
import java.util.*;

public class Day6LetsReview
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int number = Integer.parseInt(input.nextLine());
        ArrayList<String> inputString = new ArrayList<String>();
        ArrayList<Character> inputCharacter = new ArrayList<Character>();
        for (int i = 0; i < number; i++)
        {
            inputString.add(input.nextLine());
            for (int j = 0; j < Integer.parseInt(inputString.get(i)); j++)
            {
                inputCharacter.add('a');
            }
        }
    }
}