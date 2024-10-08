package syafa.java.Praktikum.Bab3;

public class Praktikum1
{
    public static void main(String[] args)
    {
        // ඞ
        for (int i = 0; i < 2; i++)
        {
            System.out.print(" ");
        }
        for (int j = 0; j < 4; j++)
        {
            if (j < 4 && j != 0)
            {
                System.out.print(' ');
            }
            System.out.print('S');
            if (j == 3)
            {
                System.out.print("\n");
            }
        }
        for (int i = 0; i < 3; i++)
        {
            System.out.print('S');
            if (i < 3)
            {
                System.out.print("\n");
            }
        }
        for (int i = 0; i < 3; i++)
        {
            if (i < 3 && i != 1)
            {
                System.out.print(' ');
            }
            System.out.print('S');
        }
    }
}