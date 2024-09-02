import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        //Declare
        double result;

        //User input
        Scanner input = new Scanner(System.in);

        //Output
        System.out.print("Enter Radius" + ":" + " ");
        double radius = input.nextDouble();
        input.close();

        //Output result
        result = radius * radius * 22 / 7;
        System.out.println("Result" + ":" + " " + result);
    }    
}
