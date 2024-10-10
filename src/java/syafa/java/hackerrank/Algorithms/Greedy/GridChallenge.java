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
        for (int i = 0; i < testCase; i++)
        {
            arrRow = Integer.parseInt(input.nextLine());
            ArrayList<Character> array = new ArrayList<Character>();
            for (int j = 0; j < arrRow; j++)
            {
                char[] arrChar = input.nextLine().toCharArray();
                Arrays.sort(arrChar);
            }
        }
        input.close();
    }
}