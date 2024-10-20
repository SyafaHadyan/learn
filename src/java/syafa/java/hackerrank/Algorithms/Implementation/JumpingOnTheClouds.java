package syafa.java.hackerrank.Algorithms.Implementation;
import java.util.*;
import java.util.stream.*;

public class JumpingOnTheClouds
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        StringBuilder useless = new StringBuilder(input.nextLine());
        useless.delete(0,useless.length());
        int[] cloud = Stream.of(input.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        input.close();
        int totalJump = 0;
        for (int i = 0; i < cloud.length; i++)
        {
            try
            {
                if (cloud[i + 2] != 1) 
                {
                    totalJump++;
                    i++;
                }
                else if (cloud[i + 2] == 1)
                {
                    totalJump += 2;
                    i += 2;
                }
                if (cloud.length == i)
                {
                    System.out.print(totalJump);
                    return;
                }
            }
            catch (IndexOutOfBoundsException e)
            {
                if (cloud.length - i != 0)
                {
                    totalJump += (cloud.length - 1) - i;
                }
                System.out.print(totalJump);
                return;
            }
        }
    }
}