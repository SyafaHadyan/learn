package syafa.java.hackerrank.Algorithms.Implementation;
import java.util.*;
import java.util.stream.*;

public class JumpingOnTheClouds
{
    public static void main(String[] args)
    {
        /*
         * 7
         * 0 0 1 0 0 1 0
         * 
         * 4
         * 
         * 6
         * 0 0 0 0 1 0
         * 
         * 3
         * 
         * Avoid 1
         * Try jump 2, if 1, jump 1 then 2
         */
        Scanner input = new Scanner(System.in);
        int[] cloud = Stream.of(input.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        input.close();
        for (int i = 0; i < cloud.length; i++)
        {
            if (cloud[i + 2] != 1) 
            {
                //
            }
        }
    }
}