package syafa.java.hackerrank.latsolpemdastif24;
import java.util.*;

public class TekaTekiAngkaPakDengklek
{
    public static void main(String[] args)
    {
        /*
         * Dengklek
         * 5
         * 3
         * 2
         * 
         * Halo Pak Dengklek!
         * Hasil perhitungan pertama: 14
         * Hasil perhitungan kedua: 2
         * Apakah hasil pertama lebih besar dari hasil kedua? true
         * Apakah a lebih besar dari b dan b lebih besar dari c? false
         * Apakah a sama dengan b atau b sama dengan c? true
         */
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        int firstNumber = Integer.parseInt(input.nextLine());
        int secondNumber = Integer.parseInt(input.nextLine());
        int thirdNumber = Integer.parseInt(input.nextLine());
        input.close();
        System.out.println("Halo Pak" + " " + name + " " + "!");
        System.out.printf
        (
            "%s%-2c%d\n%s%-2c%d",
            "Hasil perhitungan pertama",':',(0),
            "Hasil perhitungan kedua",':',(0)
        );
        System.out.print("Apakah hasil pertama lebih besar dari hasil kedua?" + " ");
        System.out.print(());
    }
}