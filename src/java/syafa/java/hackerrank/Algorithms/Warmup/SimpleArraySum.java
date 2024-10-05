package syafa.java.hackerrank.Algorithms.Warmup;
import java.util.*;

public class SimpleArraySum
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        StringBuilder useless = new StringBuilder(input.nextLine());
        useless.delete(0,useless.length());
        ArrayList<String> inputString = new ArrayList<String>(Arrays.asList(input.nextLine().split(" ")));
        input.close();
        int result = 0;
        ArrayList<Integer> inputInteger = new ArrayList<Integer>();
        for (int i = 0; i < inputString.size(); i++)
        {
            result += Integer.parseInt(inputString.get(i));
        }
        System.out.print(result);
    }
}