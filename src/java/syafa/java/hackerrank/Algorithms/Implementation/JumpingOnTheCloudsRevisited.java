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
         */
        Scanner input = new Scanner(System.in);
        int[] cloudJump = Stream.of(input.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] cloud = Stream.of(input.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        input.close();
        int energy = 100;
        for (int i = 0; i < cloud.length; i += cloudJump[1])
        {
            energy--;
            if (cloud[i + cloudJump[1]] == 1)
            {
                energy -= 2;
            }
        }
    }
}