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
        String inputPertama;
        int inputKedua;
        String inputKetiga;
        String halo = "Halo" + ' ' + nama + ' ' + '-' + ' ' + "Saldo Rp." + ' ' + saldo;
        outputArray.add(halo);
        while (true)
        {
            String[] masuk = input.nextLine().split(" ");
            inputPertama = masuk[0];
            if (inputPertama.equalsIgnoreCase("Tabung"))
            {
                inputKedua = Integer.parseInt(masuk[1]);
                saldo += inputKedua;
                outputArray.add("Penabungan Rp." + ' ' + inputKedua + ' ' + "berhasil");
            }
            else if (inputPertama.equalsIgnoreCase("Tarik"))
            {
                inputKedua = Integer.parseInt(masuk[1]);
                if (saldo < inputKedua)
                {
                    outputArray.add("Penarikan Rp." + ' ' + inputKedua + ' ' + "gagal");
                }
                else
                {
                    saldo -= inputKedua;
                    outputArray.add("Penarikan Rp." + ' ' + inputKedua + ' ' + "berhasil");
                }
            }
            else if (inputPertama.equalsIgnoreCase("Transfer"))
            {
                inputKedua = Integer.parseInt(masuk[1]);
                inputKetiga = (masuk[2]);
                if (inputKedua > saldo)
                {
                    outputArray.add("Transfer Rp." + ' ' + inputKedua + ' ' + "ke" + ' ' + inputKetiga + ' ' + "gagal");
                }
                else
                {
                    outputArray.add("Transfer Rp." + ' ' + inputKedua + ' ' + "ke" + ' ' + inputKetiga + ' ' + "berhasil");
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
        for (String output : outputArray)
        {
            System.out.println(output);
        }
        System.out.print("Transaksi selesai");
    }
}