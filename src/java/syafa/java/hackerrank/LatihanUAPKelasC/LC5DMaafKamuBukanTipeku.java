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
    public static double decrement(int number)
    {
        return initialNumber - number;
    }
    public static double multiplication (int number)
    {
        return initialNumber * number;
    }
    public static double division (int number)
    {
        return initialNumber / number;
    }
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        initialNumber = Double.parseDouble(input.nextLine());
        increment(Integer.parseInt(input.nextLine()));
        decrement(Integer.parseInt(input.nextLine()));
        multiplication(Integer.parseInt(input.nextLine()));
        division(Integer.parseInt(input.nextLine()));
        System.out.printf("%.2f\n",(initialNumber / 2));
        input.close();
    }
}