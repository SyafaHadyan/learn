package syafa.java.hackerrank.Algorithms.Implementation;
import java.util.*;
import java.util.stream.*;

public class TheBombermanGame
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int[] configuration = Stream.of(input.nextLine().split("\s")).mapToInt(Integer::parseInt).toArray();
        char[][] map = new char[configuration[0]][configuration[1]];
        for (int i = 0; i < configuration[0]; i++)
        {
            //
        }
        input.close();
    }
}