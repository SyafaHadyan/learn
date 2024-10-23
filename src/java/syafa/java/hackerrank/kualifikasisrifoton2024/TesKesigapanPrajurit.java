package syafa.java.hackerrank.kualifikasisrifoton2024;
import java.util.*;
import java.util.stream.*;;

public class TesKesigapanPrajurit 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int[] weapon = Stream.of(input.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int counter = Integer.MIN_VALUE;
        input.close();
    }
}