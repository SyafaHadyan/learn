package syafa.java.hackerrank.Algorithms.Implementation;
import java.util.*;
import java.util.stream.*;

public class CircularArrayRotation
{
    static int rotationAmount;
    static int[] tempArray;
    private static void rotateArray(int[] array)
    {
        tempArray = new int[array.length];
        System.err.println(Arrays.toString(array));
        for (int i = 0; i < array.length; i++)
        {
            System.err.println();
            int tempIndexSwap = (rotationAmount + i) % (array.length);
            System.err.println("TIDX " + tempIndexSwap);
            System.err.println("AIDX " + array[i]);
            tempArray[tempIndexSwap] = array[i];
            System.err.println(Arrays.toString(tempArray));
            System.err.println();
        }
        System.err.println(Arrays.toString(tempArray));
    }
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        input.nextInt();
        rotationAmount = input.nextInt();
        int queryCount = input.nextInt(); input.nextLine();
        int[] array = Stream.of(input.nextLine().split("\s")).mapToInt(Integer::parseInt).toArray();
        rotateArray(array);
        for (int i = 0; i < queryCount; i++)
        {
            System.out.println(tempArray[Integer.parseInt(input.nextLine())]);
        }
        input.close();
    }
}