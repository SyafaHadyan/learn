package syafa.java.Praktikum.Bab3;
import java.util.*;

public class Praktikum0
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.printf("%-17s%-2c","Masukkan nilai n",'=');
        int staircaseSize = Integer.parseInt(input.nextLine());
        int space = staircaseSize - 1;
        input.close();
        for (int i = 0; i < staircaseSize; i++)
        {
            for (int j = space; j > 0; j--)
            {
                System.out.print("  ");
            }
            space--;
            for (int j = 0; j < i + 1; j++)
            {
                System.out.print(" *");
            }
            if (i < staircaseSize)
            {
                System.out.print("\n");
            }
        }
    }
}