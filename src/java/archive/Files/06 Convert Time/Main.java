import java.util.*;

public class Main 
{
    public static void main(String[] args)
    {
        boolean repeat = true;

        while (repeat)
        {
            Scanner input = new Scanner(System.in);
            System.out.println("(H) Hour" + "\n" + "(M) Minute" + "\n" + "(S) Second" + "\n" + "(Q) Quit");
            System.out.print("Enter" + ":" + " ");
            String select = input.next();
            if (select.equalsIgnoreCase("H") || select.equalsIgnoreCase("M") || select.equalsIgnoreCase("S"))
            {
                if (select.equalsIgnoreCase("H"))
                {
                    System.out.print("\n" + "Enter value" + ":" + " ");
                    double hour = input.nextDouble();
                    System.out.println("\n" + "Minute" + ":" + " " + hour * 60);
                    System.out.println("Second" + ":" + " " + hour * 360 + "\n");
                    repeat = true;
                }
                else if (select.equalsIgnoreCase("M"))
                {
                    System.out.print("\n" + "Enter value" + ":" + " ");
                    double minute = input.nextDouble();
                    System.out.println("\n" + "Hour" + ":" + " " + minute / 60);
                    System.out.println("Second" + ":" + " " + minute * 60 + "\n");
                    repeat = true;
                }
                else if (select.equalsIgnoreCase("S"))
                {
                    System.out.print("\n" + "Enter value" + ":" + " ");
                    double second = input.nextDouble();
                    System.out.println("\n" + "Hour" + ":" + " " + second / 360);
                    System.out.println("Minute" + ":" + " " + second / 60 + "\n");
                    repeat = true;
                }
            }
            else if (select.equalsIgnoreCase("Q"))
            {
                repeat = false;
                input.close();
            }
            else
            {
                System.out.println("\n" + "Invalid input" + "\n");
                repeat = true;
            }
        }
    }
}