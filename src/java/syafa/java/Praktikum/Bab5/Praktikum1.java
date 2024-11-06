package syafa.java.Praktikum.Bab5;
import java.util.*;

public class Praktikum1
{
    public static String checkPrime(int number)
    {
        if (number <= 1)
        {
            return "Bukan prima";
        }
        for (int i = 2; i < number; i++)
        {
            if (number % i == 0)
            {
                return "Bukan prima";
            }
        }
        return "Prima";
    }
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.printf("%-15s%-2c","Masukkan nomor",':');
        int number = Integer.parseInt(input.nextLine());
        System.out.printf("%d%c%s\n",(number),' ',checkPrime(number));
        input.close();
    }
}