package syafa.java.hackerrank.LatihanSoalTIFB;
import java.util.*;

public class Array1DUrutkanBilangan
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int jumlahBilangan = Integer.parseInt(input.nextLine());
        String masukStringArray[] = input.nextLine().split(" ");
        input.close();
        int masukIntegerArray[] = new int[jumlahBilangan];
        int masuk = 0;
        for (int i = 0; i < jumlahBilangan; i++)
        {
            masuk = Integer.parseInt(masukStringArray[i]);
            masukIntegerArray[i] = masuk;
        }
        Arrays.sort(masukIntegerArray);
        for (int i = 0; i < jumlahBilangan; i++)
        {
            System.out.print(masukIntegerArray[i]);
            if ( i != jumlahBilangan - 1)
            {
                System.out.print(' ');
            }
        }
    }
}