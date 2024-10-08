package syafa.java.Praktikum.Bab3;

public class Praktikum1
{
    public static void main(String[] args)
    {
        // ඞ
        int spaceBeforeY = 0;
        int spaceMiddleY = 7;
        int spaceBeforeA = 7;
        int spaceMiddleA = 1;
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
            if (spaceBeforeY == 0)
            {
                System.out.printf("%-8c%c",'Y','Y');
            }
            else
            {
                String firstSpace = String.format("%" + spaceBeforeY + "s","");
                String secondSpace = String.format("%" + spaceMiddleY + "s","");
                System.out.printf("%s%c%s%c",firstSpace,'Y',secondSpace,'Y');
            }
            System.out.print("\n");
            spaceBeforeY++;
            spaceMiddleY -= 2;
        }
        for (int i = 0; i < 5; i++)
        {
            for (int j = 0; j < 4; j++)
            {
                System.out.print(' ');
            }
            System.out.print('Y');
            System.out.print("\n");
        }
        for (int i = 0; i < 8; i++)
        {
            if (i == 0)
            {
                System.out.print("\n");
            }
            if (i < 7)
            {
                String firstSpace = String.format("%" + spaceBeforeA + "s","");
            }
            if (i == 0)
            {
                System.out.printf("%s%c",firstSpace,'A');
            }
            else
            {
                String secondSpace = String.format("%" + spaceMiddleA + "s","");
                System.out.printf("%s%c%s%c",firstSpace,'A',secondSpace,'A');
                spaceMiddleA += 2;
            }
            System.out.print("\n");
            spaceBeforeA--;
        }
    }
}