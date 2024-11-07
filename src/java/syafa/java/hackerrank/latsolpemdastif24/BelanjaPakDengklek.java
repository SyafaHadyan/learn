package syafa.java.hackerrank.latsolpemdastif24;
import java.util.*;

public class BelanjaPakDengklek
{
    public static void main(String[] args)
    {
        
        Scanner input = new Scanner(System.in);
        double firstProduct = Double.parseDouble(input.nextLine());
        firstProduct *= Double.parseDouble(input.nextLine());
        double secondProduct = Double.parseDouble(input.nextLine());
        secondProduct *= Double.parseDouble(input.nextLine());
        double thirdProduct = Double.parseDouble(input.nextLine());
        thirdProduct *= Double.parseDouble(input.nextLine());
        input.close();
        System.out.printf
        (
            "%s\n%s%-2c%.2f\n%s%-2c%.2f\n%s%-2c%.2f",
            "Halo Pak Dengklek!",
            "Total harga sebelum pajak",':',(firstProduct + secondProduct + thirdProduct),
            "Jumlah pajak",':',(0.01 * (firstProduct + secondProduct + thirdProduct)),
            "Jumlah diskon",':',(0.05 * (firstProduct + secondProduct + thirdProduct)),
            "Total harga yang harus dibayarkan",':',(0d)
        );
    }
}