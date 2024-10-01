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
            output.add(masuk);
        }
        while (!masuk.equalsIgnoreCase("Selesai"));
        System.out.println("Halo" + ' ' + nama + ' ' + "Saldo Rp. " + saldo);
        input.close();
    }
}