package syafa.java.hackerrank.latsolpemdastif24;
import java.util.*;
import java.util.stream.*;

public class MengurutkanArray
{
    public static void main(String[] args)
    {
        /*
         * 5
         * 1 5 6 2 3
         * 
         * 1 2 3 5 6
         */
        Scanner input = new Scanner(System.in);
        int arraySize = Integer.parseInt(input.nextLine());
        int[] data = Stream.of(input.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        input.close();
        Arrays.sort(data);
    }
}