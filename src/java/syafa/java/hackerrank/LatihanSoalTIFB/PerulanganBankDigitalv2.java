package syafa.java.hackerrank.LatihanSoalTIFB;
import java.util.*;

public class PerulanganBankDigitalv2
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String nama = input.nextLine();
        int saldo = Integer.parseInt(input.nextLine());
        ArrayList<String> outputArray = new ArrayList<String>();
        String masuk = "";
        String output = "";
        do
        {
            masuk = input.nextLine();
            if (masuk.equalsIgnoreCase("Tabung"))
            {
                masuk.toLowerCase();
                masuk.replace("tabung ","");
                saldo += Integer.parseInt(masuk);
                output = "Penabungan Rp." + ' ' + Integer.parseInt(masuk) + ' ' + "Berhasil";
                outputArray.add(output);
            }
            else if (masuk.contains("Tarik"))
            {
                masuk.toLowerCase();
                masuk.replace("tarik ","");
                if (saldo < Integer.parseInt(masuk))
                {
                    output = "Penarikan Rp." + ' ' + Integer.parseInt(masuk) + ' ' + "Gagal";
                    outputArray.add(output);
                }
                else
                {
                    saldo -= Integer.parseInt(masuk);
                    output = "Penarikan Rp." + ' ' + Integer.parseInt(masuk) + ' ' + "Berhasil";
                    output = "Saldo Rp. " + saldo;
                    outputArray.add(output);
                }
                outputArray.add(output);
            }
            else if (masuk.equalsIgnoreCase("Transfer"))
            {
                outputArray.add(output);
            }
            else if (masuk.equalsIgnoreCase("cek"))
            {
                outputArray.add(output);
            }
            else if (masuk.equalsIgnoreCase("Selesai"))
            {
                break;
            }            
        }
        while (!masuk.equalsIgnoreCase("Selesai"));
        input.close();
        System.out.println("Halo" + ' ' + nama + "\n" + "Saldo Rp. " + saldo);
        System.out.print(outputArray);
    }
}