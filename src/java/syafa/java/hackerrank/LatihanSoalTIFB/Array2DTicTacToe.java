package syafa.java.hackerrank.LatihanSoalTIFB;
import java.util.*;

public class Array2DTicTacToe
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String[] first = input.nextLine().split(" ");
        String[] second = input.nextLine().split(" ");
        String[] third = input.nextLine().split(" ");
        input.close();
        if (first[0].equalsIgnoreCase("X"))
        {
            if (first[1].equalsIgnoreCase("X"))
            {
                if (first[2].equalsIgnoreCase("X"))
                {
                    System.out.print("X Menang");
                    return;
                }
            }
            if (second[0].equalsIgnoreCase("X"))
            {
                //
            }
            if (second[1].equalsIgnoreCase("X"))
            {
                //
            }
        }
    }
}