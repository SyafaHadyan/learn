package syafa.java.section0;
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
        String jamformat = String.format("%02d", jam);
        String menitformat = String.format("%02d", menit);
        String jamakhir = String.format("%02d", akhirjam);
        String menitakhir = String.format("%02d", akhirmenit);
        System.out.print("Dengklek belajar pukul" + ' ' + jamformat + ':' + menitformat + ' ' + "selama" + ' ' + durasi + ' ' + "menit dan selesai pada pukul" + ' ' + jamakhir + ':' + menitakhir + '.');
    }
}