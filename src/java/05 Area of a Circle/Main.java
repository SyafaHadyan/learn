import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        double result;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter Radius" + ":" + " ");
        double radius = input.nextDouble();
        input.close();

        result = radius * radius * 22 / 7;
        System.out.print("Result" + ":" + " " + result);
    }
}
