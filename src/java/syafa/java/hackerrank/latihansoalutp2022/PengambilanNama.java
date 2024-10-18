package syafa.java.hackerrank.latihansoalutp2022;
import java.util.*;

public class PengambilanNama
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String[] firstName = input.nextLine().split(" ");
        String[] secondName = input.nextLine().split(" ");
        input.close();
        for (int i = 0; i < firstName.length - 1; i++)
        {
            System.out.print(firstName[i + 1]);
            if (firstName.length - i != 2)
            {
                System.out.print(' ');
            }
        }
        System.out.print("\n");
        for (int i = 0; i < secondName.length - 1; i++)
        {
            System.out.print(secondName[i + 1]);
            if (secondName.length - i != 2)
            {
                System.out.print(' ');
            }
        }
    }
}