package syafa.java.hackerrank.LatihanSoalTIFB;
import java.util.*;

public class PerulanganBankDigitalv2
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String nama = input.nextLine();
        int saldo = Integer.parseInt(input.nextLine());
        String output = "";
        String inputPertama = "";
        int inputKedua = 0;
        String inputKetiga = "";
        ArrayList<String> outputArray = new ArrayList<String>();
        do
        {
            inputPertama = input.nextLine();
            if (inputPertama.equalsIgnoreCase("cek"))
            {
                break;
            }
            else if (inputPertama.equalsIgnoreCase("Tarik") || inputPertama.equalsIgnoreCase("Tabung"))
            {
                inputKedua = Integer.parseInt(input.nextLine());
            }
            else if (inputPertama.equalsIgnoreCase("Transfer"))
            {
                inputKetiga = input.nextLine();
            }
            if (inputPertama.equalsIgnoreCase("Tabung"))
            {
                saldo += inputKedua;
                output = "Penabungan Rp." + ' ' + inputKedua + ' ' + "Berhasil";
                outputArray.add(output);
            }
            else if (inputPertama.equalsIgnoreCase("Tarik"))
            {
                if (saldo < inputKedua)
                {
                    output = "Penarikan Rp." + ' ' + inputKedua + ' ' + "Gagal";
                    outputArray.add(output);
                }
                else
                {
                    saldo -= inputKedua;
                    output = "Penarikan Rp." + ' ' + inputKedua + ' ' + "Berhasil";
                    output = "Saldo Rp. " + saldo;
                    outputArray.add(output);
                }
                outputArray.add(output);
            }
            else if (inputPertama.equalsIgnoreCase("Transfer"))
            {
                if (inputKedua > saldo)
                {
                    output = "Transfer Rp." + ' ' + inputKedua + ' ' + "ke" + ' ' + inputKetiga + ' ' + "Gagal";
                }
                else
                {
                    output = "Transfer Rp." + ' ' + inputKedua + ' ' + "ke" + ' ' + inputKetiga + ' ' + "Berhasil";
                    saldo -= inputKedua;
                }
                outputArray.add(output);
            }
            else if (inputPertama.equalsIgnoreCase("Cek"))
            {
                output = "Saldo Rp." + ' ' + saldo;
                outputArray.add(output);
            }   
        }
        while (!inputPertama.equalsIgnoreCase("Selesai"));
        input.close();
        System.out.println("Halo" + ' ' + nama + ' ' + '-' + ' ' + "Saldo Rp." + ' ' + saldo);
        for (int i = 0; i < outputArray.size(); i++)
        {
            System.out.print(outputArray[i]);
        }
        System.out.print("\n" + "Transaksi selesai");
    }
}