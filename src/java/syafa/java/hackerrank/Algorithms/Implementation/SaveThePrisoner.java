package syafa.java.hackerrank.Algorithms.Implementation;
import java.util.*;
import java.util.stream.*;

public class SaveThePrisoner
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int testCase = Integer.parseInt(input.nextLine());
        int[] result = new int[testCase];
        for (int i = 0; i < testCase; i++)
        {
            int[] data = Stream.of(input.nextLine().split("\s")).mapToInt(Integer::parseInt).toArray();
            result[i] = (data[2] + data[1]) % data[0];
        }
        input.close();
        for (int i = 0; i < result.length; i++)
        {
            System.out.println(result[i]);
        }
    }
}