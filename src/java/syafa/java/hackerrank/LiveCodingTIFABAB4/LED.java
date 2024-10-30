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
        for (int i = 0; i < ledSize; i++)
        {
            led[i] = Stream.of(input.nextLine().split("\s")).mapToInt(Integer::parseInt).toArray();
        }
        input.close();
        for (int i = 0; i < led[0].length; i++)
        {
            System.out.print(led[0][i] + " ");
        }
        for (int i = 1; i < led.length; i++)
        {
            System.out.print(led[i][led.length - 1] + " ");
        }
        for (int i = side; i > 0; i--)
        {
            System.out.print(led[side][i] + " ");
        }
        for (int i = led.length - 1; i > limiter; i--)
        {
            System.out.print(led[i][0] + " ");
        }
        for (int i = side; i < led[0].length - side - limiter; i++)
        {
            System.out.print(led[mid][side]);
        }
    }
}