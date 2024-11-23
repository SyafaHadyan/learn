package syafa.java.hackerrank.LatihanUAPKelasC;
import java.util.*;

public class LC4DengklekMakanMakan
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int guestAmount = Integer.parseInt(input.nextLine());
        String[] guestList = new String[guestAmount];
        for (int i = 0; i < args.length; i++)
        {
            guestList[i] = input.nextLine();
        }
        input.close();
    }
}