package syafa.java.hackerrank.LiveCoding3TIFC;
import java.util.*;

public class TotalBilangan
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int numberCheck = input.nextInt();
        input.close();
        int totalNumOdd = 0;
        int totalNumEven = 0;
        String odd = "";
        String even = "";
        for (int i = 0; i <= numberCheck; i++)
        {
            if (i == 1 || i % 2 != 0)
            {
                odd += " " + i;
                totalNumOdd += i;
            }
            if (i == 0 || i % 2 == 0)
            {
                even += " " + i;
                totalNumEven += i;
            }
        }
        System.out.println("angka ganjil dalam range 0-" + numberCheck + " adalah" + odd + " dengan hasil penjumlahannya adalah " + totalNumOdd);
        System.out.println("angka genap dalam range 0-" + numberCheck + " adalah" + even + " dengan hasil penjumlahannya adalah " + totalNumEven);
    }
}