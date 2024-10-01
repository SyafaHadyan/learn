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
        String output = "";
        do
        {
            String inputPertama = input.next();
            int inputKedua = input.nextInt();
            String inputKegita = input.next();
            input.nextLine();
            if (inputPertama.equalsIgnoreCase("Tabung"))
            {
                saldo += inputKedua;
                output = "Penabungan Rp." + ' ' + inputKedua + ' ' + "Berhasil";
                outputArray.add(output);
            }
            else if (inputKedua.equalsIgnoreCase("Tarik"))
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
            else if (masuk.equalsIgnoreCase("Transfer"))
            {
                outputArray.add(output);
            }
            else if (masuk.equalsIgnoreCase("cek"))
            {
                outputArray.add(output);
            }   
        }
        while (!masuk.equalsIgnoreCase("Selesai"));
        input.close();
        System.out.println("Halo" + ' ' + nama + "\n" + "Saldo Rp. " + saldo);
        System.out.print(outputArray);
    }
}