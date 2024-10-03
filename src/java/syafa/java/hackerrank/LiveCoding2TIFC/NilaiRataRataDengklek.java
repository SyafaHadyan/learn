package syafa.java.hackerrank.LiveCoding2TIFC;
import java.util.*;

public class NilaiRataRataDengklek
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        double nilai0 = input.nextDouble();
        double nilai1 = input.nextDouble();
        double nilai2 = input.nextDouble();
        input.close();
        String output = "";
        double hasil = (nilai0 + nilai1 + nilai2) / 3;
        if (hasil >= 85)
        {
            output = "Dengklek lulus dengan nilai A dan dengan nilai rata-rata" + ' ';
        }
        else if (hasil >= 75)
        {
            output = "Dengklek lulus dengan nilai B dan dengan nilai rata-rata" + ' ';
        }
        else if (hasil >= 60)
        {
            output = "Dengklek lulus dengan nilai C dan dengan nilai rata-rata" + ' ';
        }
        else
        {
            output = "Dengklek tidak lulus dan dengan nilai rata-rata" + ' ';
        }
        System.out.printf("%s%.2f%c",output,hasil,'.');
    }
}