package syafa.java.hackerrank.LatihanSoalTIFB;
import java.util.*;

public class PercabanganBilanganKeMN
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        long z = Long.parseLong(input.nextLine());
        int m = Integer.parseInt(input.nextLine());
        int n = Integer.parseInt(input.nextLine());
        input.close();
        String stringZ = Long.toString(z);
        int jumlahDigit = stringZ.length();
        int digitKeM = jumlahDigit - m - 1;
        int digitKeN = jumlahDigit - n - 1;
        //int digitkeM = Integer.parseInt(stringZ);
        //int digitkeM = stringZ.charAt(digitkeM - m - 1);
    }
}