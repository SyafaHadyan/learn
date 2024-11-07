package syafa.java.Praktikum.Bab5;
import java.util.*;

public class N17MethodRekursif
{
    public static void fibonacci(int firstNumber,int secondNumber,int max,int currentCounter)
    {
        currentCounter++;
        int currentNumber = firstNumber + secondNumber;
        if (currentCounter != max)
        {
            System.out.println(currentNumber);
            fibonacci(secondNumber,currentNumber,max,currentCounter);
        }
        /*
        for (int i = 0; i < max - 2; i++)
        {
            currentNumber = firstNumber + secondNumber;
            firstNumber = secondNumber;
            secondNumber = currentNumber;
            System.out.print("\n");
            System.out.print(currentNumber);
        }
        */
    }
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan batas bilangan fibonacci" + " : ");
        fibonacci(1,1,Integer.parseInt(input.nextLine()),1);
        input.close();
    }
}