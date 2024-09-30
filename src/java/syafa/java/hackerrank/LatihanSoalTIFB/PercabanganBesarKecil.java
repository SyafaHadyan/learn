package syafa.java.hackerrank.LatihanSoalTIFB;
import java.util.*;

public class PercabanganBesarKecil
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String masuk = input.nextLine();
        String perintah = input.nextLine();
        input.close();
        if (perintah.equalsIgnoreCase("Besar"))
        {
            System.out.print(masuk.toUpperCase());
        }
        else if (perintah.equalsIgnoreCase("Kecil"))
        {
            System.out.print(masuk.toLowerCase());
        }
        else
        {
            System.out.print("Input perintah salah");
        }
    }
}