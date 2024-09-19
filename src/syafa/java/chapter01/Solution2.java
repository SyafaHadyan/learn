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
        //String jam = input.nextLine();
        //String[] items = jam.split(" ")
        int jam = input.nextInt();
        int menit = input.nextInt();
        input.nextLine();
        int durasi = input.nextInt();
        int hours = durasi / 60;
        int remainingMinutes = durasi % 60;
        long Hours = (long ) Math.floor(remainingMinutes /60);

        System.out.println("Dengklek belajar pukul "+ jam + ':' + menit +" selama " + durasi + " menit dan selesai pada pukul " + Hours + ':' + remainingMinutes + '.');
    }
}