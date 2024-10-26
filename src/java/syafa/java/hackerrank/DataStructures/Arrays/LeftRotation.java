package syafa.java.hackerrank.DataStructures.Arrays;
import java.util.*;
import java.util.stream.*;

public class LeftRotation
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int[] arrayRotation = Stream.of(input.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] array = Stream.of(input.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        input.close();
    }
}