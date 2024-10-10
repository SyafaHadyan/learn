package syafa.java.hackerrank.Algorithms.Implementation;
import java.util.*;

public class CountingValleys
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int numberOfSteps = Integer.parseInt(input.nextLine());
        ArrayList<String> step = new ArrayList<>(Arrays.asList(input.nextLine().split("(?!^)")));
        input.close();
    }
}