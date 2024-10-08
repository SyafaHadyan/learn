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
                if (Integer.parseInt(numberString) % (Integer.parseInt(String.valueOf(numberString.charAt(j)))) == 0);
                {
                    divisorCount++;
                }
            }
            divisorCountArrList.add(divisorCount);
            divisorCount = 0;
        }
        input.close();
        System.out.print(divisorCount);
    }
}