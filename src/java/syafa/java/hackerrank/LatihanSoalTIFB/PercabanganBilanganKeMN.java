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
        int digitKeM = jumlahDigit - m;
        int digitKeN = jumlahDigit - n;
        char digitKeZM = stringZ.charAt(digitKeM);
        char digitKeZN = stringZ.charAt(digitKeN);
        int intDigitKeZM = digitKeZM - '0';
        int intDigitKeZN = digitKeZN - '0';
        int hasil = 0;
        if (m > n)
        {
            hasil = intDigitKeZM + intDigitKeZN;
        }
        else if (m < n)
        {
            hasil = intDigitKeZM - intDigitKeZN;
        }
        else if (m == n)
        {
            hasil = intDigitKeZM * intDigitKeZN;
        }
        System.out.print(hasil);
        //int digitkeM = Integer.parseInt(stringZ);
        //int digitkeM = stringZ.charAt(digitkeM - m - 1);
    }
}