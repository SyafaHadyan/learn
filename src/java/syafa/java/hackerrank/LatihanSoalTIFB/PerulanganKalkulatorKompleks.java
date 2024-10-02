package syafa.java.hackerrank.LatihanSoalTIFB;
import java.util.*;

public class PerulanganKalkulatorKompleks
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int jumlahOperasi = Integer.parseInt(input.nextLine());
        double bilanganPertama[] = new double[jumlahOperasi];
        double bilanganKedua[] = new double[jumlahOperasi];
        String outputArray[] = new String[jumlahOperasi];
        double outputHasil[] = new double[jumlahOperasi];
        double x = 0d;
        double y = 0d;
        double hasil = 0d;
        char operator = ' ';
        for (int i = 0; i < jumlahOperasi; i++)
        {
            String operasi = input.next();
            x = input.nextDouble();
            y = input.nextDouble();
            bilanganPertama[i] = x;
            bilanganKedua[i] = y;
            if (operasi.equalsIgnoreCase("Tambah"))
            {
                operator = '+';
                hasil = x + y;
                outputHasil[i] = hasil;
            }
            else if (operasi.equalsIgnoreCase("Kurang"))
            {
                operator = '-';
                hasil = x - y;
                outputHasil[i] = hasil;
            }
            else if (operasi.equalsIgnoreCase("Kali"))
            {
                operator = '*';
                hasil = x * y;
                outputHasil[i] = hasil;
            }
            else if (operasi.equalsIgnoreCase("Bagi"))
            {
                operator = '/';
                hasil = x / y;
                outputHasil[i] = hasil;
            }
            else if (operasi.equalsIgnoreCase("Mod"))
            {
                operator = '%';
                hasil = x % y;
                outputHasil[i] = hasil;
            }
        }
        input.close();
        for (int i = 0; i < jumlahOperasi; i++)
        {
            //System.out.print(outputArray[i]);
            System.out.printf("%.0f%c%c%c%.0f%c%c%c%.2f",x,' ',operator,' ',y,' ','=',' ',outputHasil[i]);
            //System.out.printf("%.2f",outputHasil[i]);
            if (i != jumlahOperasi - 1)
            {
                System.out.print("\n");
            }
        }
    }
}