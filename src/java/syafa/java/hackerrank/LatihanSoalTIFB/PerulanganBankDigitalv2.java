package syafa.java.hackerrank.LatihanSoalTIFB;
import java.util.*;

public class PerulanganBankDigitalv2
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String nama = input.nextLine();
        int saldo = Integer.parseInt(input.nextLine());
        String fungsi = "";
        ArrayList<String> output = new ArrayList<String>();
        // TODO: Put inputs into array then print
        do
        {
            String masuk = input.nextLine();
            output.add(masuk);
        }
        while (!fungsi.equalsIgnoreCase("Selesai"));
        input.close();
    }
}