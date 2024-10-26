package syafa.java.hackerrank.DataStructures.Arrays;
import java.util.*;
import java.util.stream.*;

public class ArraysDS
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        int arraySize = Integer.parseInt(input.nextLine());
        int[] array = Stream.of(input.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        input.close();
    }
}