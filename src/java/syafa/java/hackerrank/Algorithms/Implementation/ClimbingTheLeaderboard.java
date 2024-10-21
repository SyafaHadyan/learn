package syafa.java.hackerrank.Algorithms.Implementation;
import java.util.*;
import java.util.stream.*;

public class ClimbingTheLeaderboard
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int[] ranked = Stream.of(input.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] player = Stream.of(input.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        input.close();
    }
}