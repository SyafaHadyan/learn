package syafa.java.hackerrank.latsolpemdastif24;
import java.util.*;
import java.util.stream.*;

public class RataRataNilaiPemdas
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int arraySize = Integer.parseInt(input.nextLine());
        double[] score = Stream.of(input.nextLine().split(" ")).mapToDouble(Double::parseDouble).toArray();
        input.close();
        for (int i = 0; i < score.length; i++)
        {
            if (score[i] > (DoubleStream.of(score).sum() / score.length))
            {
                System.out.printf("%.0f",score[i]);
                if (score.length - i != 1)
                {
                    System.out.print(' ');
                }
            }
        }
    }
}