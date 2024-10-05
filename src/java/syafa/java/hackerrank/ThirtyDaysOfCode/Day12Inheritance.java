package syafa.java.hackerrank.ThirtyDaysOfCode;
import java.util.*;

public class Day12Inheritance
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        ArrayList<String> studentDetail = new ArrayList<String>(Arrays.asList(input.nextLine().split(" ")));
        int amountOfGrades = Integer.parseInt(input.nextLine());
        ArrayList<String> studentGrade = new ArrayList<String>(Arrays.asList(input.nextLine().split(" ")));
        input.close();
        int finalGrade = 0;
        char gradeLetter = 'O';
        for (int i = 0; i < amountOfGrades; i++)
        {
            finalGrade += Integer.parseInt(studentGrade.get(i));
        }
        finalGrade /= amountOfGrades;
        if (finalGrade >= 90 && finalGrade <= 100)
        {
            gradeLetter = 'O';
        }
        else if ()
        {
            
        }
        System.out.println("Name" + ':' + ' ' + studentDetail.get(1) + ',' + ' ' + studentDetail.get(0));
        System.out.println("ID" + ':' + ' ' + studentDetail.get(2));
    }
}