package syafa.java.hackerrank.Algorithms.Implementation;
import java.util.*;

public class BetweenTwoSets
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        ArrayList<String> arrayLength = new ArrayList<>(Arrays.asList(input.nextLine().split(" ")));
        int[] arrayA = new int[Integer.parseInt(arrayLength.get(0))];
        int[] arrayB = new int[Integer.parseInt(arrayLength.get(1))];
        for (int i = 0; i < Integer.parseInt(arrayLength.get(0)); i++) 
        {
            arrayA[i] = Integer.parseInt(input.next());
        }
        for (int i = 0; i < Integer.parseInt(arrayLength.get(1)); i++)
        {
            arrayB[i] = Integer.parseInt(input.next());
        }
        input.close();
        Arrays.sort(arrayA);
        Arrays.sort(arrayB);
    }
}