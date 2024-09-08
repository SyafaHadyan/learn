import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        double result;
        boolean repeatcalculation = false;
        do{
            Scanner input = new Scanner(System.in);

            //Ask user
            System.out.print("Enter Radius" + ":" + " ");
            double radius = input.nextDouble();
            input.close();

            //Calculate area of a circle
            result = radius * radius * 22 / 7;

            //Check user input
            if (radius > 0)
            {
                System.out.println("Result" + ":" + " " + result);
                repeatcalculation = true;
            }
            else if (radius <= 0)
            {
                System.out.println("Radius cannnot be less or equal to 0.");
                repeatcalculation = false;
                Scanner repeatinput = new Scanner(System.in);
                System.out.println("Do you want to try again? (Y/N)");
                String confirmrepeat = repeatinput.next();
                repeatinput.close();
                if ( confirmrepeat == "Y" || confirmrepeat == "y")
                {
                    repeatcalculation = true;
                }
                else if (confirmrepeat == "N" || confirmrepeat == "n")
                {
                    repeatcalculation = false;
                }
            }
        }while (true);
    }    
}
