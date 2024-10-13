package syafa.java.hackerrank.Algorithms.Implementation;
import java.util.*;

public class CircularArrayRotation
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String[] request = input.nextLine().split(" ");
        int[] integerArray = new int[Integer.parseInt(request[0])];
        int[] queries = new int[Integer.parseInt(request[2])];
        for (int i = 0; i < Integer.parseInt(request[0]); i++)
        {
            integerArray[i] = Integer.parseInt(input.next());
        }
        for (int i = 0; i < Integer.parseInt(request[2]); i++)
        {
            queries[i] = integerArray[Integer.parseInt(input.nextLine())];
        }
        input.close();
        for (int i = 0; i < queries.length; i++)
        {
            System.out.print(queries[i]);
            if (i != queries.length - 1)
            {
                System.out.print("\n");
            }
        }
    }
}