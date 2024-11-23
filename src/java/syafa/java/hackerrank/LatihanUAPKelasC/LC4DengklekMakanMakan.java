package syafa.java.hackerrank.LatihanUAPKelasC;
import java.util.*;

public class LC4DengklekMakanMakan
{
    public static boolean isNotAdded(String[] guestAbove,String guestCheck)
    {
        for (int i = 0; i < guestAbove.length; i++)
        {
            if (guestAbove[i] != null && guestAbove[i].equalsIgnoreCase(guestCheck))
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int guestAmount = Integer.parseInt(input.nextLine());
        String[] guestList = new String[guestAmount];
        String[] guestAbove = new String[guestAmount];
        for (int i = 0; i < guestList.length; i++)
        {
            guestList[i] = input.nextLine();
        }
        input.close();
        System.err.println("Guest above:");
        int index = 0;
        for (int i = 0; i < guestList.length; i++)
        {
            for (int j = 1 + i; j < guestList.length; j++)
            {
                if (index != 0 && guestList[i].equalsIgnoreCase(guestList[j]) && isNotAdded(guestAbove,guestList[i]) && index != 0)
                {
                    guestAbove[index] = guestList[i];
                    System.err.println(guestAbove[index]);
                    index++;
                }
                else if (index == 0 && guestList[i].equalsIgnoreCase(guestList[j]))
                {
                    guestAbove[index] = guestList[i];
                    System.err.println(guestAbove[index]);
                    index++;
                }
            }
        }
        for (int i = 0; i < index; i++)
        {
            System.out.print(guestAbove[i] + " ");
        }
        if (index == 0)
        {
            System.out.println("semua tamu cuma datang sekali.");
            return;
        }
        System.out.println("datang lebih dari sekali.");
    }
}