import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        double result;

        Scanner input = new Scanner(System.in);
    
        System.out.print("Input Length" + ":" + " ");
        double length = input.nextDouble();
        
        System.out.print("Input Width" + ":" + " ");
        double width = input.nextDouble();

        input.close();

        result = length * width;

        System.out.print("Result" + ":" + " " + result);
    }
}