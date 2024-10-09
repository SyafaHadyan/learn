package syafa.java.hackerrank.Algorithms.Implementation;
import java.util.*;

public class FindDigits
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int valueCheck = Integer.parseInt(input.nextLine());
        //String numberString = "";
        int divisorCount = 0;
        ArrayList<Integer> divisorCountArrList = new ArrayList<Integer>();
        StringBuilder numberString = new StringBuilder();
        for (int i = 0; i < valueCheck; i++)
        {
            numberString.append(input.nextLine());
            for (int j = 0; j < numberString.length(); j++)
            {
                try
                {
                    System.out.println(Integer.parseInt(numberString.toString()) + " % " + Integer.parseInt(String.valueOf(numberString.charAt(j))));
                    if (Integer.parseInt(numberString.toString()) % Integer.parseInt(String.valueOf(numberString.charAt(j))) == 0);
                    {
                        divisorCount++;
                    }
                    System.out.println(divisorCount);
                }
                catch (ArithmeticException e)
                {
                    //
                }
            }
            divisorCountArrList.add(divisorCount);
            divisorCount = 0;
            numberString.delete(0,numberString.length());
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