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
        StringBuffer outputEven = new StringBuffer();
        StringBuffer outputOdd = new StringBuffer();
        for (int i = 0; i < number; i++)
        {
            inputString.add(input.nextLine());
            for (int j = 0; j < inputString.get(i).length(); j++)
            {
                inputCharacter.add(inputString.get(i).charAt(j));
            }
            for (int j = 0; j < inputCharacter.size(); j++)
            {
                if (j == 0)
                {
                    outputEven.delete(0,outputEven.length());
                    outputOdd.delete(0,outputOdd.length());
                    System.out.println(outputEven + "\n" + outputOdd);
                }
                if (j == 0 || j % 2 == 0)
                {
                    outputEven.append(inputCharacter.get(j));
                }
                else
                {
                    outputOdd.append(inputCharacter.get(j));
                }
            }
            outputArray.add(outputEven + " " + outputOdd);
        }
        input.close();
        for (int i = 0; i < outputArray.size(); i++)
        {
            System.out.print(outputArray.get(0));
            if (i < outputArray.size())
            {
                System.out.print("\n");
            }
        }
    }
}