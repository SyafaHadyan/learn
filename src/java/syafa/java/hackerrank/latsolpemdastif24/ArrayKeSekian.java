package syafa.java.hackerrank.latsolpemdastif24;
import java.util.*;
import java.util.stream.*;

public class ArrayKeSekian
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int[] data = Stream.of(input.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        String[] element = input.nextLine().split(" ");
        input.close();
    }
}