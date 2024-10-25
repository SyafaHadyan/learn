package syafa.java.hackerrank.Algorithms.Implementation;
import java.util.*;
import java.util.stream.*;

public class LisaWorkbook
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int[] book = Stream.of(input.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] problem = Stream.of(input.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        input.close();
    }
}