package syafa.java.hackerrank.Algorithms.Greedy;
import java.util.*;

public class GridChallenge
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int testCase = Integer.parseInt(input.nextLine());
        int arrRow = 0;
        ArrayList<String> result = new ArrayList<String>();
        //ArrayList<String> array = TODO: Local declare
        for (int i = 0; i < testCase; i++)
        {
            arrRow = Integer.parseInt(input.nextLine());
            ArrayList<String> array = new ArrayList<String>();
            for (int j = 0; j < arrRow; j++)
            {
                array.add(input.nextLine());
            }
        }
        input.close();
    }
}