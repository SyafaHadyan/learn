package syafa.java.Praktikum.Bab5;
import java.util.*;

public class N17MethodRekursif
{
    public static void fibonacci(int max)
    {
        int firstNumber = 1;
        int secondNumber = 1;
        int currentNumber = 1;
        System.out.println(firstNumber);
        System.out.print(secondNumber);
        for (int i = 0; i < max; i++)
        {
            currentNumber = firstNumber + secondNumber;
            firstNumber = secondNumber;
            secondNumber = currentNumber;
            System.out.print("\n");
            System.out.print(currentNumber);
        }
    }
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan batas bilangan fibonacci" + " : ");
        fibonacci(Integer.parseInt(input.nextLine()));
        input.close();
    }
}