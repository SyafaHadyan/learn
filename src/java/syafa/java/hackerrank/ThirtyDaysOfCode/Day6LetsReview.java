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
        ArrayList<Character> outputEven = new ArrayList<Character>();
        ArrayList<Character> outputOdd = new ArrayList<Character>();
        //StringBuffer outputEven = new StringBuffer();
        //StringBuffer outputOdd = new StringBuffer();
        for (int i = 0; i < number; i++)
        {
            inputString.add(input.nextLine());
            for (int j = 0; j < inputString.get(i).length(); j++)
            {
                inputCharacter.add(inputString.get(i).charAt(j));
            }
            outputEven.clear();
            outputOdd.clear();
            for (int j = 0; j < inputCharacter.size(); j++)
            {
                if (j == 0)
                {
                    //outputEven.delete(0,outputEven.length());
                    //outputOdd.delete(0,outputOdd.length());
                    //System.out.println(outputEven + "\n" + outputOdd);
                }
                if (j == 0 || j % 2 == 0)
                {
                    outputEven.add(inputCharacter.get(j));
                }
                else
                {
                    outputOdd.add(inputCharacter.get(j));
                }
            }
            StringBuilder buildEven = new StringBuilder(outputEven.size());
            StringBuilder buildOdd = new StringBuilder(outputOdd.size());
            for(Character even : outputEven)
            {
                buildEven.append(even);
            }
            for (Character odd : outputOdd)
            {
                buildOdd.append(odd);
            }
            buildEven.toString();
            buildOdd.toString();
            outputArray.add(buildEven + " " + buildOdd);
            buildEven.delete(0,buildEven.length());
            buildOdd.delete(0,buildOdd.length());
            System.out.println(buildEven + "\n" + buildOdd);
            outputEven.clear();
            outputOdd.clear();
        }
        input.close();
        for (int i = 0; i < outputArray.size(); i++)
        {
            System.out.print(outputArray.get(i));
            if (i < outputArray.size())
            {
                System.out.print("\n");
            }
        }
    }
}