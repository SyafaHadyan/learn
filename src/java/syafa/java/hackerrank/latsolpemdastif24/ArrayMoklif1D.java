package syafa.java.hackerrank.latsolpemdastif24;
import java.util.*;
import java.util.stream.*;

public class ArrayMoklif1D
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int arraySize = Integer.parseInt(input.nextLine());
        int[] moklif = Stream.of(input.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        input.close();
        for (int i = moklif.length - 1; i >= 0; i--)
        {
            System.out.print(moklif[i]);
            if (i != 0)
            {
                System.out.print(' ');
            }
        }
    }
}