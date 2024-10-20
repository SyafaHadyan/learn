package syafa.java.learn.chapter6;
import java.util.*;

public class TestMax
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.printf("%-20s%-2c","Enter first number",':');
        int firstNumber = Integer.parseInt(input.nextLine());
        System.out.printf("%-20s%-2c","Enter second number",':');
        int secondNumber = Integer.parseInt(input.nextLine());
        input.close();
    }
}