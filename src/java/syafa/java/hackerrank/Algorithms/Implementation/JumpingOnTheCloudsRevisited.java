package syafa.java.hackerrank.Algorithms.Implementation;
import java.util.*;
import java.util.stream.*;

public class JumpingOnTheCloudsRevisited
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int[] cloudJump = Stream.of(input.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] cloud = Stream.of(input.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        input.close();
        int energy = 100;
        for (int i = 0; i < cloud.length; i += cloudJump[1])
        {
            energy--;
            if (i + cloudJump[1] > cloudJump[0])
            {
                i -= cloudJump[0];
            }
            try
            {
                if (cloud[i] == 1)
                {
                    energy -= 2;
                }
            }
            catch (IndexOutOfBoundsException e)
            {
                //
            }
        }
        System.out.print(energy);
    }
}