package syafa.java.hackerrank.LatihanSoalTIFB;
import java.util.*;

public class PercabanganSatuDuaTiga
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int masuk = Integer.parseInt(input.nextLine());
        input.close();
        if (masuk == 1)
        {
            System.out.print("Satu");
        }
        else if (masuk == 2)
        {
            System.out.print("Dua");
        }
        else if (masuk == 3)
        {
            System.out.print("Tiga");
        }
    }
}