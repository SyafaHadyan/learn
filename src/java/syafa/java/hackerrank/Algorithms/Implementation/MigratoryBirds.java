package syafa.java.hackerrank.Algorithms.Implementation;
import java.util.*;
import java.util.stream.*;

public class MigratoryBirds
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int sightingAmount = Integer.parseInt(input.nextLine());
        int[] sighting = Stream.of(input.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        input.close();
    }
}