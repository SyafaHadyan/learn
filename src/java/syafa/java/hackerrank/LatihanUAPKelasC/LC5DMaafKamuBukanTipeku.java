package syafa.java.hackerrank.LatihanUAPKelasC;
import java.util.*;

public class LC5DMaafKamuBukanTipeku
{
    static final int OPERATION_AMOUNT = 5;
    static double initialNumber;
    public static double increment(int number)
    {
        return initialNumber + number;
    }
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        initialNumber = Double.parseDouble(input.nextLine());
        input.close();
    }
}