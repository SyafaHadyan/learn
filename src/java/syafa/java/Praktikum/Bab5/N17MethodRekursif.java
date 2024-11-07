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
            if (currentCounter == 1)
            {
                System.out.println("0\n1\n1");
            }
            else
            {
                System.out.println(currentNumber);
            }
            fibonacci(secondNumber,currentNumber,max,currentCounter);
        }
    }
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan batas bilangan fibonacci" + " : ");
        fibonacci(0,1,Integer.parseInt(input.nextLine()),0);
        input.close();
    }
}