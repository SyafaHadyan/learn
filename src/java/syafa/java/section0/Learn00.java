package syafa.java.section0;

import java.util.*;

public class Learn00
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        double first = Double.parseDouble(input.nextLine());
        double second = Double.parseDouble(input.nextLine());
        System.out.printf("%-26s%-1c%-1c%1.0f\n","Hasil penjumlahan",':',' ',first + second);
        System.out.printf("%-26s%-1c%-1c%1.0f\n","Hasil pengurangan",':',' ',first - second);
        System.out.printf("%-26s%-1c%-1c%1.0f\n","Hasil perkalian",':',' ',first * second);
        System.out.printf("%-26s%-1c%-1c%1.1f","Hasil pembagian",':',' ',first / second);
        input.close();
    }
}