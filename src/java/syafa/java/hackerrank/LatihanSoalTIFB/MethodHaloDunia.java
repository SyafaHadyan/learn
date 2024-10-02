package syafa.java.hackerrank.LatihanSoalTIFB;
import java.util.*;

public class MethodHaloDunia
{
    public static void main(String[] args)
    {
        printHaloDunia();
    }
    public static void printHaloDunia()
    {
        Scanner input = new Scanner(System.in);
        int ulang = Integer.parseInt(input.nextLine());
        input.close();
        for (int i = 1; i < ulang; i++)
        {
            System.out.print("Halo Dunia");
        }
    }
}