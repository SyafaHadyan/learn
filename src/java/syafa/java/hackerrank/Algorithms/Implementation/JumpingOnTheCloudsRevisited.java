package syafa.java.hackerrank.Algorithms.Implementation;
import java.util.*;
import java.util.stream.*;

public class JumpingOnTheCloudsRevisited
{
    public static void main(String[] args)
    {
        /*
         * STDIN             Function
         * -----             --------
         * 8 2               n = 8, k = 2
         * 0 0 1 0 0 1 1 0   c = [0, 0, 1, 0, 0, 1, 1, 0]
         * 
         * 92
         * 
         * clouds = 8
         * jumpLength = 2
         * 
         * 0 -> 2 = 100 - 1 - 2 = 97 (land on thundercloud) (additional 2)
         * 2 -> 4 = 97 - 1 = 96
         * 4 -> 6 = 96 - 1 - 2 = 93 (land on thundercloud) (additional 2)
         * 6 -> IndexOutOfBounds = 93 - 1 = 92
         * 
         * 10 3
         * 1 1 1 0 1 1 0 0 0 0
         * 
         * 80
         * 
         *              | |    10
         * x     x     x     x
         * 1 1 1 0 1 1 0 0 0 0
         */
        Scanner input = new Scanner(System.in);
        int[] cloudJump = Stream.of(input.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] cloud = Stream.of(input.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        input.close();
        int energy = 100;
        for (int i = 0; i < cloud.length; i += cloudJump[1])
        {
            energy--;
            if ((i + cloudJump[i] != cloudJump[0]) && (i > cloudJump[0] - cloudJump[1]) && (i < cloudJump[0]))
            {
                //
            }
            /*
            if (i >= cloudJump[0] && i < cloudJump[0] && ((cloud.length - cloudJump[i]) - 1 != cloudJump[0]))
            {
                i = cloudJump[1];
            }
            */
            try
            {
                if (cloud[i + cloudJump[1]] == 1)
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