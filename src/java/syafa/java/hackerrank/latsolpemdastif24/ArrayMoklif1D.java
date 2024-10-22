package syafa.java.hackerrank.latsolpemdastif24;
import java.util.*;

public class ArrayMoklif1D
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int arraySize = Integer.parseInt(input.nextLine());
        if (arraySize <= 0)
        {
            System.out.print("input tidak valid");
            input.close();
            return;
        }
        String[] moklif = input.nextLine().split(" ");
        input.close();
        for (int i = moklif.length - 1; i >= 0; i--)
        {
            System.out.print(moklif[i]);
            if (i != 0)
            {
                System.out.print(' ');
            }
        }
    }
}