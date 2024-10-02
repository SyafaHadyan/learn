package syafa.java.hackerrank.LatihanSoalTIFB;
import java.util.*;

public class MethodBuatPeta
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int tinggiPeta = input.nextInt();
        int lebarPeta = Integer.parseInt(input.nextLine());
        String simbol = input.nextLine();
        input.close();
        for (int i = 1; i <= tinggiPeta; i++)
        {
            for (int j = 1; j <= lebarPeta; j++)
            {
                System.out.print(simbol);
                if (j != lebarPeta)
                {
                    System.out.print(' ');
                }
            }
            if (i != tinggiPeta)
            {
                System.out.print("\n");
            }
        }
    }
}