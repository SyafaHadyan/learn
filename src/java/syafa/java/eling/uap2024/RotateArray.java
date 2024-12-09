package syafa.java.eling.uap2024;
import java.util.*;
import java.util.stream.*;

public class RotateArray
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int arraySize = Integer.parseInt(input.nextLine());
        int[][] array = new int[arraySize][arraySize];
        for (int i = 0; i < array.length; i++)
        {
            array[i] = Stream.of(input.nextLine().split("\s")).mapToInt(Integer::parseInt).toArray();
            
        }
        input.close();
    }
}