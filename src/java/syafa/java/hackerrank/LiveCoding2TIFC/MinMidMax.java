package syafa.java.hackerrank.LiveCoding2TIFC;
import java.util.*;

public class MinMidMax
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int a = Integer.parseInt(input.nextLine());
        int b = Integer.parseInt(input.nextLine());
        int c = Integer.parseInt(input.nextLine());
        input.close();
        int bilanganTerkecil = a;
        int bilanganTengah = a;
        int bilanganTerbesar = a;
        String tandaSatu = "<";
        String tandaDua = "<";
        if (bilanganTerkecil > b)
        {
            bilanganTerkecil = b;
        }
        if (bilanganTerkecil > c)
        {
            bilanganTerkecil = c;
        }
        if ((bilanganTengah < b && bilanganTengah < c) && (b < c))
        {
            bilanganTengah = b;
        }
        if ((bilanganTengah < b && bilanganTengah < c) && (b > c))
        {
            bilanganTengah = c;
        }
        if ((bilanganTengah > b && bilanganTengah > c) && (b > c))
        {
            bilanganTengah = b;
        }
        if ((bilanganTengah > b && bilanganTengah > c) && (b < c))
        {
            bilanganTengah = c;
        }
        if (bilanganTerbesar < b)
        {
            bilanganTerbesar = b;
        }
        if (bilanganTerbesar < c)
        {
            bilanganTerbesar = c;
        }
        if (bilanganTerkecil == bilanganTengah)
        {
            tandaSatu = "=";
        }
        if (bilanganTengah == bilanganTerbesar)
        {
            tandaDua = "=";
        }
        System.out.print(bilanganTerkecil + " " + tandaSatu + " " + bilanganTengah + " " + tandaDua + " " + bilanganTerbesar);

    }
}