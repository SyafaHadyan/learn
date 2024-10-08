package syafa.java.Praktikum.Bab3;

public class Praktikum1
{
    public static void main(String[] args)
    {
        // ඞ
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
            int spaceBefore = 0;
            int spaceMiddle = 7;
            /*
            String space = String.format("%" + whitespace + "s", "");
            System.out.printf("%s%s%s%s%s","##",space,user_input,space,"##");
             */         
            String firstSpace = String.format("%" + spaceBefore + "s","");
            String secondSpace = String.format("%" + spaceMiddle + "s","");
            System.out.printf("%s%c%s%c",firstSpace,'Y',secondSpace,'Y');
            spaceBefore++;
            spaceMiddle--;
        }
    }
}