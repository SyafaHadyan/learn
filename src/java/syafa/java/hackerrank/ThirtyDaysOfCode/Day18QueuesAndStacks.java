package syafa.java.hackerrank.ThirtyDaysOfCode;
import java.util.*;

public class Day18QueuesAndStacks
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String checkString = input.nextLine();
        input.close();
        StringBuilder reverseString = new StringBuilder();
        //ArrayList<Character> reverseString = new ArrayList<Character>();
        for (int i = checkString.length() - 1; i > 0; i++)
        {
            reverseString.append(checkString.charAt(i));
        }
    }
}