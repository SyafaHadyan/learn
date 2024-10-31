// dilarang melakukan import package selain yang sudah disediakan
package syafa.java.hackerrank.LiveCoding4TIFC;
import java.util.Scanner;

public class DengklekMakanMakan
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int guestAmount = input.nextInt();
        input.nextLine();
        String[] guestList = new String[guestAmount];
        String[] above = new String[guestAmount];
        boolean nothing = true;
        boolean korupsi = true;
        int counter = 0;
        for (int i = 0; i < guestAmount; i++)
        {
            guestList[i] = input.nextLine();
        }
        input.close();
        for (int i = 0; i < guestList.length; i++)
        {
            for (int j = 1 + i; j < guestList.length; j++)
            {
                if (guestList[i].equalsIgnoreCase(guestList[j]))
                {
                    korupsi = false;
                    for (int k = 0; k < counter; k++)
                    {
                        if (above[k].equalsIgnoreCase(guestList[j]))
                        {
                            korupsi = true;
                            break;
                        }
                    }
                }
                if (!(korupsi))
                {
                    above[counter] = guestList[j];
                    counter++;
                    nothing = false;
                    korupsi = false;
                }
            }
        }
        if (nothing)
        {
            System.out.print("semua tamu cuma datang sekali.");
            return;
        }
        for (int i = 0; i < counter; i++)
        {
            System.out.print(above[i] + " ");
        }
        System.out.print("datang lebih dari sekali.");
    }
}