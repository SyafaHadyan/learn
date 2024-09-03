import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        
        do{
            //Declare variables
            double result;
            boolean repeat;
            String confirmrepeat;

            //User input
            Scanner input = new Scanner(System.in);

            //Output
            System.out.print("Enter Radius" + ":" + " ");
            double radius = input.nextDouble();
            input.close();

            //Calculate area of a circle
            result = radius * radius * 22 / 7;
            
            if (result > 0);
            {
                System.out.println("Result" + ":" + " " + result);
                repeat = true;
            }
            elif (result <= 0);
            {
                System.out.println("Radius cannnot be less or equal to 0.");
                repeat = false;
                Scanner repeatinput = new Scanner(System.in);
                System.out.println("Do you want to try again? (Y/N)");
                String confirmrepeat = repeatinput.next();
                if ( confirmrepeat == 'Y' || confirmrepeat == 'y')
                {
                    repeat = true;
                }
                else if (confirmrepeat == 'N' || confirmrepeat == 'n')
                {
                    repeat = false;
                }
            }

        } while (repeat == true);


    }    
}
