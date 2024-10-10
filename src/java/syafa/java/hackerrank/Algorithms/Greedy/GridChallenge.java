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
            ArrayList<String> array = new ArrayList<String>();
            for (int j = 0; j < arrRow; j++)
            {
                char[] arrChar = input.nextLine().toCharArray();
                Arrays.sort(arrChar);
                StringBuilder appendString = new StringBuilder();
                for (int k = 0; k < arrChar.length; k++)
                {
                    appendString.append(arrChar[k]);
                    if (k == arrChar.length - 1)
                    {
                        array.add(String.valueOf(appendString));
                    }
                }
            }
        }
        input.close();
    }
}