package syafa.java.hackerrank.ThirtyDaysOfCode;
import java.util.*;

public class Day12Inheritance
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        ArrayList<String> studentDetail = new ArrayList<String>(Arrays.asList(input.nextLine()));
        ArrayList<Integer> studentGrade = new ArrayList<Integer>();
        int amountOfGrades = Integer.parseInt(input.nextLine());
        for (int i = 0; i < amountOfGrades; i++)
        {
            studentGrade.add(Integer.parseInt(input.nextLine()));
        }
        input.close();
    }
}