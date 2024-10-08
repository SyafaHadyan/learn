package syafa.java.hackerrank.ThirtyDaysOfCode;
import java.util.*;

public class Day18QueuesAndStacks
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String checkString = input.nextLine();
        input.close();
        String reverseString = "";
        //ArrayList<Character> reverseString = new ArrayList<Character>();
        for (int i = checkString.length() - 1; i >= 0; i--)
        {
            reverseString += (checkString.charAt(i));
        }
        if (reverseString.equals(checkString))
        {
            System.out.print("The word, " + checkString + ", is a palindrome.");
            return;
        }
        System.out.print("The word, " + checkString + ", is not a palindrome.");
    }
}