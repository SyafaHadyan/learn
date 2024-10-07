package syafa.java.hackerrank.OneWeekPreparationKit;
import java.util.*;

public class PlusMinus
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        StringBuilder useless = new StringBuilder(input.nextLine());
        useless.delete(0,useless.length());
        double positiveNumber = 0;
        double negativeNumber = 0;
        double zeroNumber = 0; 
        ArrayList<String> numberString = new ArrayList<String>(Arrays.asList(input.nextLine().split(" ")));
        input.close();
        for (int i = 0; i < numberString.size(); i++)
        {
            if (Double.parseDouble(numberString.get(i)) > 0)
            {
                positiveNumber++;
            }
            else if (Double.parseDouble(numberString.get(i)) < 0)
            {
                negativeNumber++;
            }
            else if (Double.parseDouble(numberString.get(i)) == 0)
            {
                zeroNumber++;
            }
        }
        System.out.printf("%.6f\n",positiveNumber / numberString.size());
        System.out.printf("%.6f\n",negativeNumber / numberString.size());
        System.out.printf("%.6f",zeroNumber / numberString.size());
    }
}