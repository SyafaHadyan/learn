package syafa.java.hackerrank.LiveCoding3TIFC;
import java.util.*;

public class SegitigaAjaib
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int staricaseSize = input.nextInt();
        int space = (staricaseSize * 2) - 1;
        input.close();
        int counter = 1;
        boolean reset = false;
        if (staricaseSize == 1)
        {
            System.out.print(1);
            return;
        }
        for (int i = 0; i < staricaseSize; i++)
        {
            for (int j = 1; j < space; j++)
            {
                System.out.print(' ');
            }
            space -= 2;
            for (int j = 0; j <= i * 2; j++)
            {
                if (i == 0)
                {
                    System.out.print('1');
                }
                else
                {
                    System.out.print(counter);
                }
                if (counter > 1 && !reset)
                {
                    counter--;
                }
                else if (counter == 1)
                {
                    reset = true;
                    counter++;
                }
                else
                {
                    counter++;
                }
                if ((j - i * 2 != 0) && (i != 0))
                {
                    System.out.print(' ');
                }
            }
            if (staricaseSize - i != 1)
            {
                System.out.print("\n");
                counter = i + 2;
                reset = false;
            }
        }
    }
}