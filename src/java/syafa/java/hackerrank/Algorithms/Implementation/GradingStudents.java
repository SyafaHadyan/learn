package syafa.java.hackerrank.Algorithms.Implementation;
import java.util.*;

public class GradingStudents
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int amountOfGrades = Integer.parseInt(input.nextLine());
        ArrayList<Integer> grades = new ArrayList<Integer>();
        for (int i = 0; i < amountOfGrades; i++)
        {
            grades.add(Integer.parseInt(input.nextLine()));
        }
        input.close();
        for (int i = 0; i < grades.size(); i++)
        {
            System.out.print(grades.get(i));
            if (i < grades.size())
            {
                System.out.print("\n");
            }
        }
    }
}