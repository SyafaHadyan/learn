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
                //saldo += Integer.parseInt(masuk);
                //output = "Penabungan Rp." + ' ' + Integer.parseInt(masuk) + ' ' + "Berhasil";
                outputArray.add(output);
            }
            else if (masuk.contains("tarik"))
            {
                masukInput = masuk.replace("tarik ","");
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
        }
        while (!masuk.equalsIgnoreCase("Selesai"));
        input.close();
        System.out.println("Halo" + ' ' + nama + "\n" + "Saldo Rp. " + saldo);
        System.out.print(outputArray);
    }
}