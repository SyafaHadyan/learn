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
            for (int j = 1; j < 3; j++)
            {    
                if ((grades.get(i) + j) % 5 == 0)
                {
                    grades.set(i,grades.get(i) + j);
                }
            }
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