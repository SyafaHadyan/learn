package syafa.java.hackerrank.Algorithms.Implementation;
import java.util.*;

public class EqualizeTheArray
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int numberAmount = Integer.parseInt(input.nextLine());
        HashMap<Integer,Integer> number = new HashMap<>();
        for (int i = 0; i < numberAmount; i++)
        {
            int tempInput = input.nextInt();
            number.putIfAbsent(tempInput,0);
            number.merge(tempInput,number.get(tempInput) + 1,Integer::sum);
        }
        input.close();
        System.err.println(number);
    }
}