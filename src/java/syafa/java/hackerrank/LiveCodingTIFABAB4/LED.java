package syafa.java.hackerrank.LiveCodingTIFABAB4;
import java.util.*;
import java.util.stream.*;

public class LED
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int ledSize = Integer.parseInt(input.nextLine());
        int[][] led = new int[ledSize][];
        for (int i = 0; i < ledSize; i++)
        {
            led[i] = Stream.of(input.nextLine().split("\s")).mapToInt(Integer::parseInt).toArray();
        }
        input.close();
        for (int i = 0; i < led[0].length; i++)
        {
            System.out.print(led[0][i] + " ");
            for (int j = 0; j < led.length; j++)
            {
                //
            }
        }
    }
}