package syafa.java.hackerrank.LatihanSoalTIFB;
import java.util.*;

public class PerulanganKalkulatorKompleks
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int jumlahOperasi = Integer.parseInt(input.nextLine());
        String outputArray[] = new String[jumlahOperasi];
        double hasil = 0d;
        String output = "";
        for (int i = 0; i < jumlahOperasi; i++)
        {
            String operasi = input.next();
            int x = input.nextInt();
            int y = input.nextInt();
            input.nextLine();
            if (operasi.equalsIgnoreCase("Tambah"))
            {
                hasil = x + y;
                output = x + " + " + y + " = " + hasil;
                outputArray[i] = output;
            }
            else if (operasi.equalsIgnoreCase("Kurang"))
            {
                hasil = x - y;
                output = x + " - " + y + " = " + hasil;
                outputArray[i] = output;
            }
            else if (operasi.equalsIgnoreCase("Kali"))
            {
                hasil = x * y;
                output = x + " * " + y + " = " + hasil;
                outputArray[i] = output;
            }
            else if (operasi.equalsIgnoreCase("Bagi"))
            {
                hasil = x / y;
                output = x + " / " + y + " = " + hasil;
                outputArray[i] = output;
            }
            else if (operasi.equalsIgnoreCase("Mod"))
            {
                hasil = x % y;
                output = x + " % " + y + " = " + hasil;
                outputArray[i] = output;
            }
        }
        input.close();
        for (int i = 0; i < jumlahOperasi; i++)
        {
            System.out.print(outputArray[i]);
            if (i != jumlahOperasi - 1)
            {
                System.out.print("\n");
            }
        }
    }
}