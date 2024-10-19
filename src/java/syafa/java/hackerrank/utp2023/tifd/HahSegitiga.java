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
         * 
         * Segitiga siku-siku
         * Segitiga sama sisi
         * Segitiga sama kaki
         * Segitiga sembarang
         */
        Scanner input = new Scanner(System.in);
        double[] triangle = Stream.of(input.nextLine().split(" ")).mapToDouble(Double::parseDouble).toArray();
        input.close();
    }
}