import java.util.*;

public class SimpleCalculator
{
    public static void main(String[] args)
    {
		Scanner input = new Scanner(System.in);
        System.out.printf("%-25s%-3s","Enter first number",":");
        double first = Double.parseDouble(input.nextLine());
        System.out.printf("%-25s%-3s","Enter second number",":");
        double second = Double.parseDouble(input.nextLine());
        double add = first + second;
        double substract;
        double multiply;
        double divide;

        System.out.printf("%-5.0f%-5s%-5.0f%s%.8f",first," + ",second," = ",add);
	}
}