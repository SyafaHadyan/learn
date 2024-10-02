package syafa.java.hackerrank.LatihanSoalTIFB;
import java.util.*;

public class PerulanganBankDigitalv2
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String nama = input.nextLine();
        int saldo = Integer.parseInt(input.nextLine());
        String inputPertama;
        int inputKedua;
        String inputKetiga;
        ArrayList<String> outputArray = new ArrayList<String>();
        while (true)
        {
            String[] masuk = input.nextLine().split(" ");
            inputPertama = masuk[0];
            if (inputPertama.equalsIgnoreCase("Tabung"))
            {
                inputKedua = Integer.parseInt(masuk[1]);
                saldo += inputKedua;
                outputArray.add("Penabungan Rp." + ' ' + inputKedua + ' ' + "Berhasil");
            }
            else if (inputPertama.equalsIgnoreCase("Tarik"))
            {
                inputKedua = Integer.parseInt(masuk[1]);
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
                inputKedua = Integer.parseInt(masuk[1]);
                inputKetiga = (masuk[2]);
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
                input.close();
                break;
            }
        }
        System.out.println("Halo" + ' ' + nama + ' ' + '-' + ' ' + "Saldo Rp." + ' ' + saldo);
        for (String output : outputArray)
        {
            System.out.println(output);
        }
        System.out.print("Transaksi selesai");
    }
}