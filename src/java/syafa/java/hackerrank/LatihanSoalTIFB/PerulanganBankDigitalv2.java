package syafa.java.hackerrank.LatihanSoalTIFB;
import java.util.*;

public class PerulanganBankDigitalv2
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String nama = input.nextLine();
        int saldo = Integer.parseInt(input.nextLine());
        ArrayList<String> output = new ArrayList<String>();
        String masuk = "";
        // TODO: Put inputs into array then print
        do
        {
            masuk = input.nextLine();
            if (masuk.equalsIgnoreCase("Tabung"))
            {
                output.add(masuk);
            }
            else if (masuk.equalsIgnoreCase("Tarik"))
            {
                output.add(masuk);
            }
            else if (masuk.equalsIgnoreCase("Tarik"))
            {
                output.add(masuk);
            }
            else if (masuk.equalsIgnoreCase("Tarik"))
            {
                output.add(masuk);
            }
            else if (masuk.equalsIgnoreCase("Tarik"))
            {
                output.add(masuk);
            }
            else if (masuk.equalsIgnoreCase("Selesai"))
            {
                break;
            }            
        }
        while (!masuk.equalsIgnoreCase("Selesai"));
        input.close();
        System.out.println("Halo" + ' ' + nama + "\n" + "Saldo Rp. " + saldo);
    }
}