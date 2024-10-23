package syafa.java.hackerrank.Algorithms.Implementation;
import java.util.*;
import java.util.stream.*;

public class SaveThePrisoner
{
    public static void main(String[] args)
    {
        /*
         * TODO: Optimize the code
         */
        Scanner input = new Scanner(System.in);
        int testCase = Integer.parseInt(input.nextLine());
        int[] notify = new int[testCase];
        for (int i = 0; i < testCase; i++)
        {
            int[] temp = Stream.of(input.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int counter = 0;
            for (int j = temp[2]; j <= temp[0]; j++)
            {
                counter++;
                if (j == temp[0] && counter != temp[1])
                {
                    j = 0;
                }
                else if (counter == temp[1])
                {
                    notify[i] = j;
                    break;
                }
            }
        }
        input.close();
        for (int i = 0; i < notify.length; i++)
        {
            System.out.print(notify[i]);
            if (notify.length - i != 1)
            {
                System.out.print("\n");
            }
        }
    }
}