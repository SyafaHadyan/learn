package syafa.java.hackerrank.LatihanSoalTIFB;
import java.util.*;

public class PerulanganBankDigitalv2
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String nama = input.nextLine();
        int saldo = Integer.parseInt(input.nextLine());
        String inputPertama = "";
        int inputKedua = 0;
        String inputKetiga = "";
        boolean ulang = true;
        ArrayList<String> outputArray = new ArrayList<String>();
        do
        {
            inputPertama = input.next();
            inputKedua = input.nextInt();
            inputKetiga = input.next();
            if (inputPertama.equalsIgnoreCase("Tabung"))
            {
                saldo += inputKedua;
                outputArray.add("Penabungan Rp." + ' ' + inputKedua + ' ' + "Berhasil");
            }
            else if (inputPertama.equalsIgnoreCase("Tarik"))
            {
                if (saldo < inputKedua)
                {
                    outputArray.add("Penarikan Rp." + ' ' + inputKedua + ' ' + "Gagal");
                }
                else
                {
                    saldo -= inputKedua;
                    outputArray.add("Penarikan Rp." + ' ' + inputKedua + ' ' + "Berhasil");
                }
            }
            else if (inputPertama.equalsIgnoreCase("Transfer"))
            {
                if (inputKedua > saldo)
                {
                    outputArray.add("Transfer Rp." + ' ' + inputKedua + ' ' + "ke" + ' ' + inputKetiga + ' ' + "Gagal");
                }
                else
                {
                    outputArray.add("Transfer Rp." + ' ' + inputKedua + ' ' + "ke" + ' ' + inputKetiga + ' ' + "Berhasil");
                    saldo -= inputKedua;
                }
            }
            else if (inputPertama.equalsIgnoreCase("Cek"))
            {
                outputArray.add("Saldo Rp." + ' ' + saldo);
            }
            else if (inputPertama.equalsIgnoreCase("Selesai"))
            {
                ulang = false;
            }
        }
        while (ulang);
        input.close();
        System.out.println("Halo" + ' ' + nama + ' ' + '-' + ' ' + "Saldo Rp." + ' ' + saldo);
        for (String output : outputArray)
        {
            System.out.println(output);
        }
        System.out.print("\n" + "Transaksi selesai");
    }
}