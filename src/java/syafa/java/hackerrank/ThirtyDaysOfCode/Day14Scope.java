package syafa.java.hackerrank.ThirtyDaysOfCode;
import java.util.*;

public class Day14Scope
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int length = Integer.parseInt(input.nextLine());
        ArrayList<String> elementsString = new ArrayList<String>(Arrays.asList(input.nextLine().split(" ")));
        input.close();
        ArrayList<Integer> elementsInteger = new ArrayList<Integer>();
        for (int i = 0; i < elementsString.size(); i++)
        {
            elementsInteger.add(Integer.parseInt(elementsString.get(i)));
        }
    }
}