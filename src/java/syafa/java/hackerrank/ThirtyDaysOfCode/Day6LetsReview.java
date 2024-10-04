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
        ArrayList<String> outputArray = new ArrayList<String>();
        String outputEven = "";
        String outputOdd = "";
        for (int i = 0; i < number; i++)
        {
            inputString.add(input.nextLine());
            for (int j = 0; j < inputString.get(i).length(); j++)
            {
                inputCharacter.add(inputString.get(i).charAt(i));
            }
            for (int j = 0; j < inputCharacter.size(); j++)
            {
                if (j == 0 || j % 2 == 0)
                {
                    outputEven += inputCharacter.get(j);
                }
                else
                {
                    outputOdd += inputCharacter.get(j);
                }
            }
        }
        for (int i = 0; i < inputCharacter.size(); i++)
        {
            System.out.print(inputCharacter.get(i));
            if (i < inputCharacter.size())
            {
                System.out.print(' ');
            }
        }
        System.out.print(outputEven + ' ' + outputOdd);
    }
}