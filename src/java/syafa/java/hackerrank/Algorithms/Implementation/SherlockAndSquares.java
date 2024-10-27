package syafa.java.hackerrank.Algorithms.Implementation;
import java.util.*;
import java.util.stream.*;

public class SherlockAndSquares
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int testCase = Integer.parseInt(input.nextLine());
        for (int i = 0; i < testCase; i++)
        {
            int[] number = Stream.of(input.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            System.out.printf("%.0f\n",(Math.floor(Math.sqrt(number[1])) - Math.ceil(Math.sqrt(number[0])) + 1));
        }
        input.close();
    }
}