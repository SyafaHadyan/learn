package syafa.java.hackerrank.Algorithms.Implementation;
import java.util.*;

public class AngryProfessor
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int testCase = Integer.parseInt(input.nextLine());
        ArrayList<String> classStatus = new ArrayList<String>();
        for (int i = 0; i < testCase; i++)
        {
            int studentCount = 0;
            ArrayList<String> studentThreshold = new ArrayList<String>(Arrays.asList(input.nextLine().split(" ")));
            ArrayList<String> studentArrival = new ArrayList<String>(Arrays.asList(input.nextLine().split(" ")));
            for (int j = 0; j < studentArrival.size(); j++)
            {
                if (Integer.parseInt(studentArrival.get(j)) <= 0)
                {
                    studentCount++;
                    continue;
                }
                if (studentCount < Integer.parseInt(studentThreshold.get(1)))
                {
                    classStatus.add("YES");
                }
                if (j == studentArrival.size() - 1)
                {
                    classStatus.add("NO");
                }
            }
            if (i == testCase - 1)
            {
                input.close();
                for (int j = 0; j < classStatus.size(); j++)
                {
                    System.out.print(classStatus.get(j));
                    if (j != classStatus.size() - 1)
                    {
                        System.out.print("\n");
                    }
                }
            }
        }
    }
}