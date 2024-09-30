package syafa.java.hackerrank.LatihanSoalTIFB;
import java.util.*;

public class PercabanganKalkulatorSimpel
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        double a = Double.parseDouble(input.nextLine());
        double b = Double.parseDouble(input.nextLine());
        String perintah = input.nextLine();
        input.close();
        double hasil;
        if (perintah.equalsIgnoreCase("Tambah") || perintah.equalsIgnoreCase("+"))
        {
            hasil = a + b;
            System.out.printf("%.3f",hasil);
        }
        else if (perintah.equalsIgnoreCase("Kurang") || perintah.equalsIgnoreCase("-"))
        {
            hasil = a - b;
            System.out.printf("%.3f",hasil);
        }
        else if (perintah.equalsIgnoreCase("Kali") || perintah.equalsIgnoreCase("*"))
        {
            hasil = a * b;
            System.out.printf("%.3f",hasil);
        }
        else if (perintah.equalsIgnoreCase("Bagi") || perintah.equalsIgnoreCase("/"))
        {
            hasil = a / b;
            System.out.printf("%.3f",hasil);
        }
        else if (perintah.equalsIgnoreCase("Mod") || perintah.equalsIgnoreCase("%"))
        {
            hasil = a % b;
            System.out.printf("%.3f",hasil);
        }
    }
}