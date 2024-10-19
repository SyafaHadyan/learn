package syafa.java.hackerrank.utp2023.tifd;
import java.util.*;
import java.util.stream.*;

public class HahSegitiga
{
    public static void main(String[] args)
    {
        /*
         * x y z
         * 3 4 5
         * Segitiga siku-siku
         * 
         * 3 3 5
         * Segitiga sama kaki
         * 
         * [x]Segitiga siku-siku
         * [x]Segitiga sama sisi
         * [x]Segitiga sama kaki
         * [x]Segitiga sembarang
         */
        Scanner input = new Scanner(System.in);
        double[] triangle = Stream.of(input.nextLine().split(" ")).mapToDouble(Double::parseDouble).toArray();
        input.close();
        if (triangle[0] == triangle[1])
        {
            if (triangle[0] == triangle[2])
            {
                System.out.print("Segitiga sama sisi");
                return;
            }
            else if (triangle[0] < triangle[2])
            {
                System.out.print("Segitiga sama kaki");
                return;
            }
        }
        // 10 5 7
        else if ((Math.floor((triangle[0] - triangle[1]) / 2)) == (triangle[2] - triangle[1]))
        {
            System.out.print("Segitiga sembarang");
            return;
        }
        else if (triangle[0] < triangle[1] && triangle[1] < triangle[2])
        {
            System.out.print("Segitiga siku-siku");
            return;
        }
        else if (triangle[0] == triangle[2])
        {
            System.out.print("Segitiga sama kaki");
            return;
        }
        else if ((triangle[0] - triangle[1]) * 2 == (triangle[2] - triangle[1]))
        {
            System.out.print("Segitiga siku-siku");
            return;
        }
        // 25 24 7
        else if (triangle[0] - triangle[1] == 1)
        {
            System.out.print("Segitiga siku-siku");
            return;
        }
        // 14.5 10 10.5
        else if ((triangle[0] > triangle[1]) && (triangle [2] > triangle[1]))
        {
            System.out.print("Segitiga siku-siku");
            return;
        }
        else
        {
            System.out.print("Segitiga sembarang");
            return;
        }
    }
}