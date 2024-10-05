package syafa.java.hackerrank.Algorithms.Warmup;
import java.util.*;

public class DiagonalDifference
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int size = Integer.parseInt(input.nextLine());
        int in = 0;
        ArrayList<String> inputString = new ArrayList<String>();
        ArrayList<Integer> inputInteger = new ArrayList<Integer>();
        for (int i = 0; i < size; i++)
        {
            String[] inputArray = input.nextLine().split(" ");
            for (int j = 0; j < inputArray.length; j++)
            {
                inputInteger.add(Integer.parseInt(inputArray[j]));
            }
        }
        input.close();
        for (int i = 0; i < inputInteger.size(); i++)
        {
            
        }
    }
}