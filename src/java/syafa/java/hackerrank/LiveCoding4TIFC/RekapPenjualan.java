package syafa.java.hackerrank.LiveCoding4TIFC;
import java.util.Scanner;

public class RekapPenjualan
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int temp = 0;
        for (int i = 0; i < 3; i++)
        {
            temp += input.nextInt();
        }
        input.close();
    }
}