package syafa.java.cses.problemset;
import java.util.Scanner;

public class MissingNumber
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        long numberSum = Long.parseLong(input.nextLine());
        long tempCalculate = ((numberSum - ((numberSum % 2 == 0) ? 1 : 0)) / 2) + 1;
        if (numberSum % 2 == 0)
        {
            numberSum++;
        }
        numberSum *= tempCalculate;
        input.close();
        System.out.println(numberSum);
    }
}