package syafa.java.hackerrank.kualifikasisrifoton2024;
import java.util.*;
import java.util.stream.*;

public class KucingDalamKandang
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int cageAmount = Integer.parseInt(input.nextLine());
        int[] cage = Stream.of(input.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        input.close();
    }
}