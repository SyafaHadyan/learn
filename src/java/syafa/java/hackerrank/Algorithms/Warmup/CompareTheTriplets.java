package syafa.java.hackerrank.Algorithms.Warmup;
import java.util.*;

public class CompareTheTriplets
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        ArrayList<String> alice = new ArrayList<String>(Arrays.asList(input.nextLine().split(" ")));
        ArrayList<String> bob = new ArrayList<String>(Arrays.asList(input.nextLine().split(" ")));
        ArrayList<Integer> result = new ArrayList<Integer>();
        input.close();
        for (int i = 0; i < 3; i++)
        {
            if (Integer.parseInt(alice.get(i)) == Integer.parseInt(bob.get(i)))
            {
                continue;
            }
            else if (Integer.parseInt(alice.get(i)) > Integer.parseInt(bob.get(i)))
            {
                result.set(0,result.get(0) + 1);
            }
            else if (Integer.parseInt(alice.get(i)) < Integer.parseInt(bob.get(i)))
            {
                result.set(1,result.get(1) + 1);
            }
        }
        System.out.print(result.get(0) + ' ' + result.get(1));
    }
}