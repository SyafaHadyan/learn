package syafa.java.hackerrank.LatihanSoalTIFB;
import java.util.*;

public class MethodBuatPeta
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int tinggiPeta = input.nextInt();
        int lebarPeta = input.nextInt();
        String simbol = input.nextLine();
        input.close();
        for (int i = 1; i <= lebarPeta; i++)
        {
            System.out.print(simbol);
            if (i != lebarPeta)
            {
                System.out.print(' ');
            }
            if (i == lebarPeta)
            {
                System.out.print("\n");
            }
        }
    }
}