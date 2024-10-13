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
            
        }
        input.close();
    }
}