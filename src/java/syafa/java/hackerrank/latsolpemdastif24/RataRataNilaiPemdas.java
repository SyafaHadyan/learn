package syafa.java.hackerrank.latsolpemdastif24;
import java.util.*;
import java.util.stream.*;

public class RataRataNilaiPemdas
{
    public static void main(String[] args)
    {
        /*
         * 5
         * 90 87 92 100 88
         * 
         * 92 100
         * 
         * Rata-rata dari ke-5 bilangan tersebut adalah 91,4. Bilangan yang lebih besar dari 91,4 adalah 92 dan 100.
         */
        Scanner input = new Scanner(System.in);
        int arraySize = Integer.parseInt(input.nextLine());
        double[] score = Stream.of(input.nextLine().split(" ")).mapToDouble(Double::parseDouble).toArray();
        input.close();
        Arrays.sort(score);
        for (int i = 0; i < score.length; i++)
        {
            if (score[i] > (DoubleStream.of(score).sum() / score.length))
            {
                System.out.printf("%.0f",score[i]);
                if (score.length - 1 != 1)
                {
                    System.out.print(' ');
                }
            }
        }
    }
}