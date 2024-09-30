package syafa.java.hackerrank.LatihanSoalTIFB;
import java.util.*;

public class PerulanganJumlahNBilanganPertama
{
    public static void main(String[] args)
    {
       Scanner input = new Scanner(System.in);
       int perulangan = Integer.parseInt(input.nextLine());
       input.close();
       int hasil = 0;
       for (int i = 1; i <= perulangan; i++)
       {
            hasil += i;
       }
       System.out.print(hasil);
    }
}