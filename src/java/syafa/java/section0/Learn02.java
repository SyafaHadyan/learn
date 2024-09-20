package syafa.java.section0;

import java.util.*;

public class Learn02
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int Panjang = Integer.parseInt(input.nextLine());
        int Lebar = Integer.parseInt(input.nextLine());
        String Istana = input.nextLine();
        int Keliling = (Panjang + Lebar) * 2;
        int BatuBata = Keliling * 113;
        int Pilar = (Keliling / 10) * 37;
        int TotalBatuBata = BatuBata + Pilar;
        input.close();
        if (Panjang < 0 || Panjang > 1000000)
        {
            return;
        }
        else if (Lebar < 0 || Lebar > 1000000)
        {
            return;
        }
        System.out.printf("%-25s%c%c%s%c%s%s","Nama istana",':',' ',"Istana",' ',Istana,"\n");
        System.out.printf("%-25s%c%c%d%c%s%s","Batu bata",':',' ',TotalBatuBata,' ',"buah","\n");
        System.out.printf("%-25s%c%c%d%c%s%s","Panjang",':',' ',Panjang,' ',"meter","\n");
        System.out.printf("%-25s%c%c%d%c%s%s","Lebar",':',' ',Lebar,' ',"meter","\n");
        System.out.printf("%-25s%c%c%d%c%s","Keliling",':',' ',Keliling,' ',"meter");
    }
}
