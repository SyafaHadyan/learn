package syafa.java.hackerrank.LatihanSoalTIFB;
import java.util.*;

public class Array1DReverseInput
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int panjangArray = Integer.parseInt(input.nextLine());
        String balikArray[] = new String[panjangArray];
        for (int i = 0; i < panjangArray; i++)
        {
            String masuk = input.nextLine();
            balikArray[i] = masuk;
        }
        input.close();
        for (int i = panjangArray - 1; i >= 0; i--)
        {
            System.out.print(balikArray[i]);
            if (i != 0)
            {
                System.out.print("\n");
            }
        }
    }
}