package syafa.java.hackerrank.kualifikasisrifoton2024;
import java.util.*;
import java.util.stream.*;;

public class TesKesigapanPrajurit 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int[] weapon = Stream.of(input.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        input.close();
        int counter = weapon[0] + weapon[2];
        if (weapon[1] + weapon[3] > counter)
        {
            counter = weapon[1] + weapon[3];
        }
        System.out.print(counter);
    }
}