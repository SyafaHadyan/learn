package syafa.java.hackerrank.Algorithms.Implementation;
import java.util.*;
import java.util.stream.*;

public class FairRations
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int dataLength = Integer.parseInt(input.nextLine());
        int[] data = Stream.of(input.nextLine().split("\s")).mapToInt(Integer::parseInt).toArray();
        int distributionCounter = 0;
        for (int i = 0; i < dataLength - 1; i++)
        {
            System.err.println(Arrays.toString(data));
            if (data[i] % 2 != 0)
            {
                distributionCounter++;
                data[i]++;
                if (i != 0 && data[i - 1] % 2 != 0)
                {
                    data[i - 1]++;
                    distributionCounter++;
                    break;
                }
                data[i + 1]++;
                distributionCounter++;
            }
        }
        input.close();
        System.err.println(Arrays.toString(data));
        if (distributionCounter == 0)
        {
            System.out.println("NO");
            System.exit(0);
        }
        System.out.println(distributionCounter);
    }
}