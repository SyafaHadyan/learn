package syafa.java.hackerrank.ProjectEulerPlus;
import java.util.*;
import java.math.*;

public class ProjectEuler13LargeSum
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int numberAmount = Integer.parseInt(input.nextLine());
        BigInteger sum = BigInteger.ZERO;
        for (int i = 0; i < numberAmount; i++)
        {
            String temp = input.nextLine();
            sum = sum.add(new BigInteger(temp));
        }
        input.close();
        System.out.print(sum);
        //System.out.print(sum.toString().substring(0,11));
    }
}