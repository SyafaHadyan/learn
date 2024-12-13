package syafa.java.hackerrank.Algorithms.Implementation;
import java.util.*;
import java.util.stream.*;

public class CircularArrayRotation
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int elementCount = input.nextInt();
        int rotationAmount = input.nextInt();
        int queryCount = input.nextInt(); input.nextLine();
        int[] array = Stream.of(input.nextLine().split("\s")).mapToInt(Integer::parseInt).toArray();
        for (int i = 0; i < queryCount; i++)
        {
            System.out.println(array[i]);
        }
        input.close();
    }
}