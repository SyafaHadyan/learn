package syafa.java.hackerrank.Algorithms.Warmup;
import java.util.*;

public class DiagonalDifference
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int size = Integer.parseInt(input.nextLine());
        int in = 0;
        ArrayList<Integer> inputString = new ArrayList<Integer>();
        for (int i = 0; i < size; i++)
        {
            in = input.nextInt();
            inputString.add(in);
        }
        input.close();
    }
}