package syafa.java.hackerrank.latsolpemdastif24;
import java.util.*;

public class BelanjaPakDengklek
{
    public static void main(String[] args)
    {
        
        Scanner input = new Scanner(System.in);
        input.nextLine();
        double firstProduct = Double.parseDouble(input.nextLine());
        firstProduct *= Double.parseDouble(input.nextLine());
        double secondProduct = Double.parseDouble(input.nextLine());
        secondProduct *= Double.parseDouble(input.nextLine());
        double thirdProduct = Double.parseDouble(input.nextLine());
        thirdProduct *= Double.parseDouble(input.nextLine());
        input.close();
        System.out.printf
        (
            "%s\n%s%-2c%1s%.2f\n%s%-2c%1s%.2f\n%s%-2c%1s%.2f\n%s%-2c%1s%.2f",
            "Halo Pak Dengklek!",
            "Total harga sebelum pajak",':',"Rp",(firstProduct + secondProduct + thirdProduct),
            "Jumlah pajak",':',"Rp",(0.1 * (firstProduct + secondProduct + thirdProduct)),
            "Jumlah diskon",':',"Rp",(0.05 * (firstProduct + secondProduct + thirdProduct)),
            "Total harga yang harus dibayarkan",':',"Rp",((firstProduct + secondProduct + thirdProduct) + (0.1 * (firstProduct + secondProduct + thirdProduct)) - (0.05 * (firstProduct + secondProduct + thirdProduct)))
        );
    }
}