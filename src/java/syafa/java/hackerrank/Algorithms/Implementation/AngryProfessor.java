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
            ArrayList<String> studentThreshold = new ArrayList<String>(Arrays.asList(input.nextLine().split(" ")));
            ArrayList<String> studentArrival = new ArrayList<String>(Arrays.asList(input.nextLine().split(" ")));
        }
        input.close();
    }
}