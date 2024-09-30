package syafa.java.hackerrank.LatihanSoalTIFB;
import java.util.*;

public class PerulanganJumlahNBilanganPertama
{
    public static void main(String[] args)
    {
       Scanner input = new Scanner(System.in);
       double perulangan = Double.parseDouble(input.nextLine());
       input.close();
       Double hasil = 0d;
       for (int i = 1; i <= perulangan; i++)
       {
            hasil += i;
       }
       System.out.printf("%.0f",hasil);
    }
}