package syafa.java.hackerrank.Algorithms.Implementation;
import java.util.*;

public class CutTheSticks
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int arrLength = Integer.parseInt(input.nextLine());
        int[] sticks = new int[arrLength];
        for (int i = 0; i < arrLength; i++)
        {
            sticks[i] = input.nextInt();
        }
        input.close();
    }
}