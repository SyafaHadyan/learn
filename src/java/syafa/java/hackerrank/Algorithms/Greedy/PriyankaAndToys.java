package syafa.java.hackerrank.Algorithms.Greedy;
import java.util.*;
import java.util.stream.*;

public class PriyankaAndToys
{
    static class packaging
    {
        public static int splitContainer(int[] array)
        {
            int containerAmount = 0;
            Arrays.sort(array);
            for (int i = 0; i < array.length;)
            {
                int currentMinValRange = array[i];
                int counter = i;
                for (int j = array[i]; j <= currentMinValRange + 4; j++)
                {
                    try
                    {
                        if (array[counter] >= currentMinValRange && array[counter] <= currentMinValRange + 4)
                        {
                            i++;
                            counter++;
                        }
                        else
                        {
                            break;
                        }
                    }
                    catch (IndexOutOfBoundsException e)
                    {
                        break;
                    }
                }
                containerAmount++;
            }
            return containerAmount;
        }
    }
    @SuppressWarnings("unused")
    public static void main(String[] args)
    {
        /*
         * 8
         * 1 2 3 21 7 12 14 21
         * 
         * 4
         * 
         * Container 1 (1 2 3)  Range 1     5
         * Container 2 (21 21)  Range 21    25
         * Container 3 (7)      Range 7     11
         * Container 4 (12 14)  Range 12    14
         */
        Scanner input = new Scanner(System.in);
        int arraySize = Integer.parseInt(input.nextLine());
        int[] toy = Stream.of(input.nextLine().split("\s")).mapToInt(Integer::parseInt).toArray();
        System.out.print(packaging.splitContainer(toy));
        input.close();
    }
}