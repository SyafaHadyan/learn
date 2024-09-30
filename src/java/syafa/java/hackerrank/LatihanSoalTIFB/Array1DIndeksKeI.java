package syafa.java.hackerrank.LatihanSoalTIFB;
import java.util.*;

public class Array1DIndeksKeI
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int panjangArray = Integer.parseInt(input.nextLine());
        String sebuahArray[] = new String[panjangArray];
        for (int i = 0; i < panjangArray; i++)
        {
            String masuk = input.nextLine();
            sebuahArray[i] = masuk;
        }
        int cari = Integer.parseInt(input.nextLine());
        input.close();
        System.out.print(sebuahArray[cari]);
    }
}