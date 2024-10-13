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
        int counter = 0;
        int iterate = 1;
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
        for (int i = 0; i < iterate; i++)
        {
            for (int j = 0; j < arrayB.length; j++)
            {
                if (!(arrayB[j] % (arrayA[arrayA.length - 1] + arrayA[arrayA.length - 1] * (i)) == 0))
                {
                    System.out.print(counter);
                    return;
                }
            }
            counter++;
            iterate++;
        }
        System.out.print(counter);
    }
}