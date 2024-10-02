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
        double outputHasil[] = new double[jumlahOperasi];
        char operatorArray[] = new char[jumlahOperasi];
        double x = 0d;
        double y = 0d;
        double hasil = 0d;
        for (int i = 0; i < jumlahOperasi; i++)
        {
            String operasi = input.next();
            x = input.nextDouble();
            y = input.nextDouble();
            bilanganPertama[i] = x;
            bilanganKedua[i] = y;
            if (operasi.equalsIgnoreCase("Tambah"))
            {
                hasil = x + y;
                outputHasil[i] = hasil;
                operatorArray[i] = '+';
            }
            else if (operasi.equalsIgnoreCase("Kurang"))
            {
                hasil = x - y;
                outputHasil[i] = hasil;
                operatorArray[i] = '-';
            }
            else if (operasi.equalsIgnoreCase("Kali"))
            {
                hasil = x * y;
                outputHasil[i] = hasil;
                operatorArray[i] = '*';
            }
            else if (operasi.equalsIgnoreCase("Bagi"))
            {
                hasil = x / y;
                outputHasil[i] = hasil;
                operatorArray[i] = '/';
            }
            else if (operasi.equalsIgnoreCase("Mod"))
            {
                hasil = x % y;
                outputHasil[i] = hasil;
                operatorArray[i] = '%';
            }
        }
        input.close();
        for (int i = 0; i < jumlahOperasi; i++)
        {
            System.out.printf("%.0f%c%c%c%.0f%c%c%c%.2f",bilanganPertama[i],' ',operator,' ',bilanganKedua[i],' ','=',' ',outputHasil[i]);
            if (i != jumlahOperasi - 1)
            {
                System.out.print("\n");
            }
        }
    }
}