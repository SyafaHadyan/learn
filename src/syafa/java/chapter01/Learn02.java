package syafa.java.chapter01;

import java.util.*;

public class Learn02
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int Panjang = Integer.parseInt(input.nextLine());
        int Lebar = Integer.parseInt(input.nextLine());
        String Istana = input.nextLine();
        int BatuBata = (Panjang + Lebar) * 113;
        int Pilar = ((Panjang + Lebar) / 10) * 37;
        int TotalBatuBata = BatuBata + Pilar;
        int Keliling = Panjang + Lebar;
        System.out.printf("%-25s%c%c%s%c%s%s","Nama istana",':',' ',"Istana",' ',Istana,"\n");
        System.out.printf("%-25s%c%c%d%c%s%s","Batu bata",':',' ',TotalBatuBata,' ',"buah","\n");
        System.out.printf("%-25s%c%c%d%c%s%s","Panjang",':',' ',Panjang,' ',"meter","\n");
        System.out.printf("%-25s%c%c%d%c%s%s","Lebar",':',' ',Lebar,' ',"meter","\n");
        System.out.printf("%-25s%c%c%d%c%s","Keliling",':',' ',Keliling,' ',"meter");
        input.close();
    }
}
