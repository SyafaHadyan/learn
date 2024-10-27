package syafa.java.hackerrank.Algorithms.Implementation;
import java.util.*;

public class SherlockAndSquares
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int minNumber = Integer.parseInt(input.nextLine());
        int maxNumber = Integer.parseInt(input.nextLine());
        input.close();
        int counter = 0;
        for (int i = minNumber; i <= maxNumber; i++)
        {
            if (Math.sqrt(i) == Math.floor(Math.sqrt(i)))
            {
                counter++;
            }
        }
    }
}