package syafa.java.hackerrank.latsolpemdastif24;
import java.util.*;

public class TekaTekiAngkaPakDengklek
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        int firstNumber = Integer.parseInt(input.nextLine());
        int secondNumber = Integer.parseInt(input.nextLine());
        int thirdNumber = Integer.parseInt(input.nextLine());
        input.close();
        int firstResult = (firstNumber+++--secondNumber) * thirdNumber;
        int secondResult = firstNumber % secondNumber + thirdNumber;
        System.out.printf("%-9s%s%c\n","Halo Pak",name,'!');
        System.out.printf
        (
            "%s%-2c%d\n%s%-2c%d\n",
            "Hasil perhitungan pertama",':',(firstResult),
            "Hasil perhitungan kedua",':',(secondResult)
        );
        System.out.printf
        (
            "%s%-2c%s\n",
            "Apakah hasil pertama lebih besar dari hasil kedua",'?',
            (firstResult > secondResult)
        );
        System.out.printf
        (
            "%s%-2c%s\n",
            "Apakah a lebih besar dari b dan b lebih besar dari c",'?',
            (firstNumber > secondNumber && secondNumber > thirdNumber)
        );
        System.out.printf
        (
            "%s%-2c%s",
            "Apakah a sama dengan b atau b sama dengan c",'?',
            (firstNumber == secondNumber || secondNumber == thirdNumber)
        );
    }
}