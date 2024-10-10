package syafa.java.hackerrank.Algorithms.Greedy;
import java.util.*;
import java.math.*;

public class MarcsCakewalk
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        BigInteger arraySize = input.nextBigInteger();
        arraySize = arraySize.ZERO;
        ArrayList<String> numberString = new ArrayList<String>(Arrays.asList(input.nextLine().split(" ")));
        input.close();
        ArrayList<Integer> numberInteger = new ArrayList<Integer>();
        for (int i = 0; i < numberString.size(); i++)
        {
            numberInteger.add(Integer.parseInt(numberString.get(i)));
        }
        Collections.sort(numberInteger);
        Collections.reverse(numberInteger);
        for (int i = 0; i < numberInteger.size(); i++)
        {
            arraySize += (BigInteger)(Math.pow(2,i)) * numberInteger.get(i);
            if (i == numberInteger.size() - 1)
            {
                System.out.print(arraySize);
                return;
            }
        }
    }
}