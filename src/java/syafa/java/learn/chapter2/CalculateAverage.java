package syafa.java.learn.chapter2;
import java.util.*;

public class CalculateAverage
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.printf("%-25s%-2c","Enter first number",':');
        double firstNumber = Double.parseDouble(input.nextLine());
        System.out.printf("%-25s%-2c","Enter first number",':');
        double secondNumber = Double.parseDouble(input.nextLine());
        System.out.printf("%-25s%-2c","Enter first number",':');
        double thirdNumber = Double.parseDouble(input.nextLine());
        input.close();
        double average = (firstNumber + secondNumber + thirdNumber) / 3;
        System.out.printf("%s%c%.3f%c%.3f%c%.3f%c%s%c%.8f","The average of",' ',firstNumber,' ',secondNumber,' ',thirdNumber,' ',"is",' ',average);
    }
}