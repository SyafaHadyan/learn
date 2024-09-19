import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution2
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int jam = input.nextInt();
        int menit = input.nextInt();
        input.nextLine();
        int durasi = input.nextInt();
        input.close();
        int totalmenit = jam * 60 + menit + durasi;
        int akhirjam = (totalmenit / 60) % 24;
        int akhirmenit = totalmenit % 60;
        String jamakhir = String.format("%02d", akhirjam);
        String menitakhir = String.format("%02d", akhirmenit);
        System.out.println("Dengklek belajar pukul" + ' ' + jam + ':' + menit + ' ' + "selama" + ' ' + durasi + ' ' + "menit dan selesai pada pukul" + ' ' + jamakhir + ':' + menitakhir + '.');
    }
}