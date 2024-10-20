package syafa.java.hackerrank.Algorithms.Implementation;
import java.util.*;
import java.util.stream.*;

public class LibraryFine
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int[] bookReturn = Stream.of(input.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] dueDate = Stream.of(input.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        input.close();
    }
}