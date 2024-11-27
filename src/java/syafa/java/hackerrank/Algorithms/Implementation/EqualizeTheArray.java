package syafa.java.hackerrank.Algorithms.Implementation;
import java.util.*;

public class EqualizeTheArray
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int numberAmount = Integer.parseInt(input.nextLine());
        int deletionAmount = 0;
        HashMap<Integer,Integer> number = new HashMap<>();
        for (int i = 0; i < numberAmount; i++)
        {
            int tempInput = input.nextInt();
            number.putIfAbsent(tempInput,0);
            System.err.println(tempInput + " " + number.get(tempInput));
            number.merge(tempInput,1,Integer::sum);
            System.err.println(number);
        }
        input.close();
        System.err.println(number);
        int maxValue = Collections.max(number.values());
        for (int i : number.keySet())
        {
            if (number.get(i) != maxValue)
            {
                deletionAmount += number.get(i);
            }
        }
        System.out.println(deletionAmount);
    }
}