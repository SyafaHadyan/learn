package syafa.java.hackerrank.latsolpemdastif24;
import java.util.Scanner;

public class BilanganPrimaPt3
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int primeStart = Integer.parseInt(input.nextLine());
        System.out.print("Bilangan prima mulai dari 2 hingga ke" + '-' + (primeStart) + ':');
        for (int i = 2; i <= primeStart; i++)
        {
            if (isPrima(i))
            {
                System.out.print(' ');
                System.out.print(i);
            }
        }
        input.close();
    }
  	public static boolean isPrima(int x)
    {
        for (int i = 2; i < x; i++)
        {
            if (x % i == 0)
            {
                return false;
            }
        }
    	return true;
    }
}