import java.util.*;

public class DecimalToBinary
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int decimalNumber = Integer.parseInt(input.nextLine());
        StringBuilder resultString = new StringBuilder();
        if (decimalNumber == 0 || decimalNumber == 1)
        {
            System.out.print(decimalNumber);
            return;
        }
        while (decimalNumber != 0)
        {
            resultString.append(String.valueOf(decimalNumber % 2));
            decimalNumber /= 2;
        }
        input.close();
        System.out.print(resultString.reverse());
    }
}