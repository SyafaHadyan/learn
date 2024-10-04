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
        String output = "";
        for (int i = 0; i < number; i++)
        {
            inputString.add(input.nextLine());
            for (int j = 0; j < inputString.get(i).length(); j++)
            {
                inputCharacter.add(inputString.get(i).charAt(i));
                for (int k = 0; k < inputCharacter.size(); k++)
                {
                    if (k == 0 || k % 2 == 0)
                    {
                        outputArray.add(String.valueOf(inputCharacter.get(k)));
                    }
                    else if (k % 2 != 0)
                    {
                        outputArray.add(String.valueOf(inputCharacter.get(k)));
                    }
                }
            }
        }
        for (int i = 0; i < outputArray.size(); i++)
        {
            System.out.print(outputArray.get(i));
            if (i < outputArray.size())
            {
                System.out.print(' ');
            }
        }
    }
}