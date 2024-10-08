package syafa.java.Praktikum.Bab3;

public class Praktikum1
{
    public static void main(String[] args)
    {
        // ඞ
        int spaceBeforeY = 1;
        int spaceMiddleY = 7;
        for (int i = 0; i < 2; i++)
        {
            System.out.print(' ');
        }
        for (int i = 0; i < 4; i++)
        {
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
        for (int i = 0; i < 2; i++)
        {
            System.out.print(' ');
        }
        for (int i = 0; i < 3; i++)
        {
            if (i < 3 && i != 0)
            {
                System.out.print(' ');
            }
            System.out.print('S');
            if (i == 2)
            {
                System.out.print("\n");
            }
        }
        for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j < 8; j++)
            {
                System.out.print(' ');
            }
            System.out.print('S');
            System.out.print("\n");
        }
        for (int i = 0; i < 2; i++)
        {
            System.out.print(' ');
        }
        for (int i = 0; i < 4; i++)
        {
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
        for (int i = 0; i < 4; i++)
        {
            if (i == 0)
            {
                System.out.print("\n");
            }
            String firstSpace = String.format("%" + spaceBeforeY + "s","");
            String secondSpace = String.format("%" + spaceMiddleY + "s","");
            System.out.printf("%s%c%s%c",firstSpace,'Y',secondSpace,'Y');
            spaceBeforeY++;
            spaceMiddleY -= 2;
            System.out.print("\n");
        }
        for (int i = 0; i < 5; i++)
        {
            for (int j = 0; j < 5; j++)
            {
                System.out.print(' ');
            }
            System.out.print('Y');
            System.out.print("\n");
        }
    }
}