package syafa.java.hackerrank.Algorithms.Implementation;
import java.util.*;

public class FindDigits
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int valueCheck = Integer.parseInt(input.nextLine());
        int number = 0;
        //ArrayList<Integer> number = new ArrayList<Integer>();
        for (int i = 0; i < valueCheck; i++)
        {
            number = Integer.parseInt(input.nextLine());
        }
        input.close();
    }
}