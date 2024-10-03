package syafa.java.hackerrank.DataStructures;
import java.util.*;

public class Java1DArray
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int arrayLength = Integer.parseInt(input.nextLine());
        int arrayOfNumbers[] = new int[arrayLength];
        for (int i = 0; i < arrayOfNumbers.length; i++)
        {
            arrayOfNumbers[i] = input.nextInt();
        }
    }
}