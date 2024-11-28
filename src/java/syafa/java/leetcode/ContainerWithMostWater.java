package syafa.java.leetcode;
import java.util.*;
import java.util.stream.*;

public class ContainerWithMostWater
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println(maxArea(Stream.of(input.nextLine().split("\s")).mapToInt(Integer::parseInt).toArray()));
        input.close();
    }
    public static int maxArea(int[] height)
    {
        int maxWater = 0;
        int leftIndex = 0;
        int rightIndex = height.length;
        for (int i = 0; i < height.length; i++)
        {
            for (int j = leftIndex; j < rightIndex; j++)
            {
                System.err.println("CRIDX " + height[j] + " CRLMT " + height[rightIndex - 1]);
                System.err.println("CRIDXMN " + Math.min(height[j],height[rightIndex - 1]));
                System.err.println("CRMTP " + (rightIndex - j - 1));
                int currentWater = Math.min(height[j],height[rightIndex - 1]) * (rightIndex - j - 1);
                System.err.println("CRWT " + currentWater);
                if (currentWater > maxWater)
                {
                    maxWater = currentWater;
                    System.err.println("WTMX " + maxWater);
                }
                System.err.println();
            }
            for (int j = rightIndex - 1; j > leftIndex; j--)
            {
                int currentWater = Math.min(height[j],height[leftIndex]) * (j - leftIndex);
                if (currentWater > maxWater)
                {
                    maxWater = currentWater;
                    System.err.println("WTMX " + maxWater);
                }
                System.err.println();
            }
            leftIndex++;
            rightIndex--;
        }
        return maxWater;
    }
}