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
        int limiter = 0;
        int side = led.length - 2;
        int mid = 1;
        for (int j = 0; j < ledSize; j++)
        {
            led[j] = Stream.of(input.nextLine().split("\s")).mapToInt(Integer::parseInt).toArray();
        }
        input.close();
        for (int i = 0; i < led.length; i += 3)
        {
            for (int j = 0; j < led[0].length; j++)
            {
                System.out.print(led[0][j] + " ");
            }
            for (int j = 1; j < led.length; j++)
            {
                System.out.print(led[j][led.length - 1] + " ");
            }
            for (int j = side; j > 0; j--)
            {
                System.out.print(led[side][j] + " ");
            }
            for (int j = led.length - 1; j > limiter; j--)
            {
                System.out.print(led[j][0] + " ");
            }
            for (int j = side; j < led[0].length - side - limiter; j++)
            {
                System.out.print(led[mid][side]);
            }
            limiter++;
            side--;
            mid++;
        }
    }
}