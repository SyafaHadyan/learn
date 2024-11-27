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
        System.err.println("MV " + maxValue);
        if (number.size() == 1)
        {
            System.out.println(0);
            return;
        }
        if (maxValue == 1)
        {
            System.out.println(numberAmount - 1);
            return;
        }
        int maxKeyValue = -1;
        for (int i : number.keySet())
        {
            int tempValue = number.get(i);
            if (tempValue == maxValue && maxKeyValue == -1)
            {
                maxKeyValue = i;
            }
            if (tempValue < maxValue)
            {
                deletionAmount += tempValue;
            }
            if (maxKeyValue != -1 && tempValue == maxValue && i != maxKeyValue)
            {
                deletionAmount += tempValue;
            }
        }
        System.out.println(deletionAmount);
    }
}