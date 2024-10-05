package syafa.java.hackerrank.Algorithms.Warmup;
import java.util.*;
import java.math.*;

public class AVeryBigSum
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        StringBuilder useless = new StringBuilder(input.nextLine());
        useless.delete(0,useless.length());
        ArrayList<String> inputString = new ArrayList<String>(Arrays.asList(input.nextLine().split(" ")));
        input.close();
        BigInteger result = BigInteger.ZERO;
        for (int i = 0; i < inputString.size(); i++)
        {
            result.add(result);
        }
    }
}