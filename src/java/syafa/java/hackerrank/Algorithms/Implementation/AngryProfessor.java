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
                }
            }
        }
        input.close();
    }
}