import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        double result;
        boolean repeatcalculation = true;

        Scanner input = new Scanner(System.in);
        while(repeatcalculation)
        {
            System.out.print("Enter Radius" + ":" + " ");

            double radius = input.nextDouble();

            if (radius > 0)
            {
                result = radius * radius * 22 / 7;
                System.out.println("Result" + ":" + " " + result + "\n");
                repeatcalculation = true;
            }
            else
            {
                System.out.println("\n" + "Radius cannnot be equal or less than 0");
                System.out.print("Do you want to try again? (Y/N)" + ":" + " ");
                String confirmrepeat = input.next();
                if ( confirmrepeat.equalsIgnoreCase("Y"))
                {
                    repeatcalculation = true;
                }
                else if (confirmrepeat.equalsIgnoreCase("N"))
                {
                    repeatcalculation = false;
                }

                System.out.println();
            }
        }
        input.close();
    }
}