package syafa.java.hackerrank.kualifikasisrifoton2024;
import java.util.*;
import java.util.stream.*;

public class KatakMelompat
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int[] jump = Stream.of(input.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        input.close();
    }
}