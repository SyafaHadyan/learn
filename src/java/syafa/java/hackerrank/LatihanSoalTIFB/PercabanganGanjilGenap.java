package syafa.java.hackerrank.LatihanSoalTIFB;
import java.util.*;

public class PercabanganGanjilGenap
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int masuk = Integer.parseInt(input.nextLine());
        input.close();
        if (masuk % 2 == 0)
        {
            System.out.print("Genap");
            return;
        }
        System.out.print("Ganjil");
    }
}