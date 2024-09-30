package syafa.java.hackerrank.LatihanSoalTIFB;
import java.util.*;

public class PercabanganHubunganTigaAngka
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        input.close();
        int bilanganTerkecil = a;
        int bilanganTerbesar = a;
        if (bilanganTerkecil > b)
        {
            bilanganTerkecil = b;
        }
        if (bilanganTerkecil > c)
        {
            bilanganTerkecil = c;
        }
        if (a > b && a > c)
        {
            if(b>c)
            {
                System.out.println(b);
            }
            else
            {
                System.out.println(c);
            }
        }
        if (b > a && b > c) {
        if(a>c){
        System.out.println(a);
        }
        else{
            System.out.println(c);
        mm }
        }
        if (c > b && c > a) {
        if(b>a){
            System.out.println(b);
            }
        else{
        System.out.println(a);
        }
        }
        if (bilanganTerbesar < b)
        {
            bilanganTerbesar = b;
        }
        if (bilanganTerbesar < c)
        {
            bilanganTerbesar = c;
        }
        System.out.print(bilanganTerkecil + ' ' + '' + bi + ' ' + '' + bilanganTerbesar);
    }
}