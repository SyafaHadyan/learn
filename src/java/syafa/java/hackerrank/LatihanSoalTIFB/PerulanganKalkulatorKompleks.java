package syafa.java.hackerrank.LatihanSoalTIFB;
import java.util.*;

public class PerulanganKalkulatorKompleks
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int jumlahOperasi = Integer.parseInt(input.nextLine());
        int bilanganPertamaKedua[] = new int[jumlahOperasi];
        String outputArray[] = new String[jumlahOperasi];
        double outputHasil[] = new double[jumlahOperasi];
        double hasil = 0d;
        String output = "";
        for (int i = 0; i < jumlahOperasi; i++)
        {
            String operasi = input.next();
            double x = input.nextDouble();
            double y = input.nextDouble();
            if (operasi.equalsIgnoreCase("Tambah"))
            {
                hasil = x + y;
                output = x + " + " + y + " = ";
                outputArray[i] = output;
                outputHasil[i] = hasil;
            }
            else if (operasi.equalsIgnoreCase("Kurang"))
            {
                hasil = x - y;
                output = x + " - " + y + " = ";
                outputArray[i] = output;
                outputHasil[i] = hasil;
            }
            else if (operasi.equalsIgnoreCase("Kali"))
            {
                hasil = x * y;
                output = x + " * " + y + " = ";
                outputArray[i] = output;
                outputHasil[i] = hasil;
            }
            else if (operasi.equalsIgnoreCase("Bagi"))
            {
                hasil = x / y;
                output = x + " / " + y + " = ";
                outputArray[i] = output;
                outputHasil[i] = hasil;
            }
            else if (operasi.equalsIgnoreCase("Mod"))
            {
                hasil = x % y;
                output = x + " % " + y + " = ";
                outputArray[i] = output;
                outputHasil[i] = hasil;
            }
        }
        input.close();
        for (int i = 0; i < jumlahOperasi; i++)
        {
            System.out.print(outputArray[i]);
            System.out.printf("%.2f",outputHasil[i]);
            if (i != jumlahOperasi - 1)
            {
                System.out.print("\n");
            }
        }
    }
}