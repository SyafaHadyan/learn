package syafa.java.Praktikum.Bab3;

public class Praktikum1
{
    public static void main(String[] args)
    {
        // ඞ
        for (int i = 0; i < 4; i++)
        {
            for (int j = 0; j < 2; j++)
            {
                System.out.print(' ');
            }
            if (i < 4 && i != 0)
            {
                System.out.print(' ');
            }
            System.out.print('S');
            if (i == 3)
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
            for (int j = 0; j < 2; j++)
            {
                System.out.print(' ');
            }
            if (i < 3 && i != 0)
            {
                System.out.print(' ');
            }
            System.out.print('S');
        }
    }
}