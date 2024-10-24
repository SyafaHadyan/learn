package syafa.java.Hology7.Penyisihan;
import java.util.*;
import java.util.stream.*;

@SuppressWarnings("unused")
public class Laper
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int testCase = Integer.parseInt(input.nextLine());
        int[] resultFirst = new int[testCase];
        int[] resultLast = new int[testCase];
        for (int i = 0; i < testCase; i++)
        {
            int shopAmount = input.nextInt();
            int money = input.nextInt();
            int[] shopList = new int[shopAmount];
            for (int j = 0; j < shopAmount; j++)
            {
                shopList[j] = input.nextInt();
            }
            if (shopAmount == 1)
            {
                resultFirst[i] = 1;
                resultLast[i] = 1;
                continue;
            }
            Arrays.sort(shopList);
            int minDiff = Integer.MAX_VALUE;
            int first = 0;
            int last = 1;
            for (int j = 1; j < shopAmount; j++)
            {
                int diff = shopList[j] - shopList[j - 1];
                if (diff < minDiff)
                {
                    minDiff = diff;
                    first = j;
                    last = j + 1;
                }
            }
            resultFirst[i] = first;
            resultLast[i] = last;
        }
        input.close();
        for (int i = 0; i < resultLast.length; i++)
        {
            System.out.println(resultFirst[i] + " " + resultLast[i]);
        }
    }
}