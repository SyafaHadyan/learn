package syafa.java.hackerrank.Algorithms.Implementation;
import java.util.*;

public class FindDigits
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int valueCheck = Integer.parseInt(input.nextLine());
        String numberString = "";
        int divisorCount = 0;
        ArrayList<Integer> divisorCountArrList = new ArrayList<Integer>();
        for (int i = 0; i < valueCheck; i++)
        {
            numberString = input.nextLine();
            for (int j = 0; j < numberString.length(); j++)
            {
                try
                {
                    if (Integer.parseInt(numberString) % (Integer.parseInt(String.valueOf(numberString.charAt(j)))) == 0);
                    {
                        divisorCount++;
                    }
                }
                catch (ArithmeticException e)
                {
                    e.printStackTrace();
                }
            }
            divisorCountArrList.add(divisorCount);
            divisorCount = 0;
        }
        input.close();
        for (int i = 0; i < divisorCountArrList.size(); i++)
        {
            System.out.print(divisorCountArrList.get(i));
            if (i < divisorCountArrList.size() - 1)
            {
                System.out.print("\n");
            }
        }
    }
}