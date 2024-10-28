package syafa.java.hackerrank.Algorithms.BitManipulation;
import java.util.*;
import java.util.stream.*;

public class LonelyInteger
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int numberAmount = Integer.parseInt(input.nextLine());
        int[] number = Stream.of(input.nextLine().split("\s")).mapToInt(Integer::parseInt).toArray();
        input.close();
    }
}