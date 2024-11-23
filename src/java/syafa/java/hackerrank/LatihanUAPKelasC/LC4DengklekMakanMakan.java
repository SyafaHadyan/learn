package syafa.java.hackerrank.LatihanUAPKelasC;
import java.util.*;

public class LC4DengklekMakanMakan
{
    public static boolean isNotAdded(String[] guestAbove,String guestCheck)
    {
        for (int i = 0; i < guestAbove.length; i++)
        {
            if (guestAbove[i].equalsIgnoreCase(guestCheck))
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
        for (int i = 0; i < args.length; i++)
        {
            guestList[i] = input.nextLine();
        }
        input.close();
        int index = 0;
        for (int i = 0; i < guestList.length; i++)
        {
            for (int j = 1 + i; j < guestList.length; j++)
            {
                if (guestList[i].equalsIgnoreCase(guestList[j]) && isNotAdded(guestAbove,guestList[i]))
                {
                    guestAbove[index] = guestList[i];
                    index++;
                }
            }
        }
    }
}