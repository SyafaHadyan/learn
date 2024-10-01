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
            inputPertama = input.next();
            inputKedua = input.nextInt();
            inputKetiga = input.next();
            input.nextLine();
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
                //Transfer Rp. 5000 ke Iqbal berhasil
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
        System.out.print(outputArray);
    }
}