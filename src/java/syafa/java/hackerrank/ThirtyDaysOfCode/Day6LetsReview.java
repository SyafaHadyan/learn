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
                inputCharacter.add(inputString.get(i).charAt(j));
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
            outputArray.add(outputEven + " " + outputOdd);
            outputEven = "";
            outputOdd = "";
        }
        input.close();
        for (int i = 0; i < outputArray.size(); i++)
        {
            System.out.print(outputArray.get(i));
            if (i < outputArray.size())
            {
                System.out.println("\n");
            }
        }
    }
}