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
        int counter = Integer.MIN_VALUE;
        for (int i = 0; i < weapon.length; i++)
        {
            for (int j = 0 + i; j <= weapon.length - i; j++)
            {
                try
                {
                    if ((weapon[i] + weapon[j + 2]) > counter)
                    {
                        counter = weapon[i] + weapon[j + 2];
                    }
                    if ((weapon[i] + weapon[j + 2] + weapon [j + 4]) > counter)
                    {
                        counter = weapon[i] + weapon[j + 2] + weapon [j + 4];
                    }
                }
                catch (IndexOutOfBoundsException e)
                {
                    //
                }
            }
        }
        System.out.print(counter);
    }
}