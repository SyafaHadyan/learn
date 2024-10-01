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
                inputKedua = input.nextInt();
                inputKetiga = input.nextLine();
                input.nextLine();
            }
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
        }
        while (!inputPertama.equalsIgnoreCase("Selesai"));
        input.close();
        System.out.println("Halo" + ' ' + nama + ' ' + '-' + ' ' + "Saldo Rp." + ' ' + saldo);
        for (int i = 0; i < outputArray.size(); i++)
        {
            System.out.print(outputArray.get(i));
            if (i < outputArray.size() - 1)
            {
                System.out.print("\n");
            }
        }
        System.out.print("\n" + "Transaksi selesai");
    }
}