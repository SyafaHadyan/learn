package syafa.java.hackerrank.Algorithms.Implementation;
import java.util.*;

public class SherlockAndSquares
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int testCase = Integer.parseInt(input.nextLine());
        int minNumber = Integer.parseInt(input.nextLine());
        int maxNumber = Integer.parseInt(input.nextLine());
        input.close();
        ArrayList<Integer> result = new ArrayList<>();
        int counter = 0;
        for (int i = 0; i < args.length; i++)
        {
            for (int j = minNumber; j <= maxNumber; j++)
            {
                if (Math.sqrt(j) == Math.floor(Math.sqrt(j)))
                {
                    counter++;
                }
            }
            System.out.print(counter);
        }
    }
}