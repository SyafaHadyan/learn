package syafa.java.hackerrank.Algorithms.Warmup;
import java.util.*;

public class PlusMinus
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int size = Integer.parseInt(input.nextLine());
        ArrayList<String> numberString = new ArrayList<String>(Arrays.asList(input.nextLine().split(" ")));
        for (int i = 0; i < numberString.size(); i++)
        {
            if (Double.parseDouble(numberString.get(i)) == 0)
            {

            }
        }
        input.close();
    }
}