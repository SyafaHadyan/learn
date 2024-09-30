package syafa.java.hackerrank.LatihanSoalTIFB;
import java.util.*;

public class PercabanganNilaiTempatBilangan
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int nomor = Integer.parseInt(input.nextLine());
        input.close();
        int panjang = (int)(Math.log10(nomor) + 1);
        switch (panjang)
        {
            case 1:
                System.out.print("Satuan");
                break;
            case 2:
                System.out.print("Puluhan");
                break;
            case 3:
                System.out.print("Ratusan");
                break;
            case 4:
                System.out.print("Ribuan");
                break;
            case 5:
                System.out.print("Puluhan Ribu");
                break;
            case 6:
                System.out.print("Ratusan Ribu");
                break;
            case 7:
                System.out.print("Jutaan");
                break;
            default:
                break;
        }
    }
}