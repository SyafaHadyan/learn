package syafa.java.hackerrank.Algorithms.Implementation;
import java.util.*;
import java.util.stream.*;

public class NumberLineJumps
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int[] kangarooJump = Stream.of(input.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        input.close();
        while (kangarooJump[0] != kangarooJump[2] && !(kangarooJump[0] > kangarooJump[2]))
        {
            kangarooJump[0] += kangarooJump[1];
            kangarooJump[2] += kangarooJump[3];
            if (kangarooJump[0] == kangarooJump[2])
            {
                System.out.print("YES");
                System.exit(0);
            }
        }
        System.out.print("NO");
    }
}