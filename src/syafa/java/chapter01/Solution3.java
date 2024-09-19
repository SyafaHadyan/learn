import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution3
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String nama = input.nextLine();
        String nim = input.nextLine();        
        String item1 = input.nextLine();
        double harga1 = Double.parseDouble(input.nextLine());
        String item2 = input.nextLine();
        double harga2 = Double.parseDouble(input.nextLine());
        String item3 = input.nextLine();
        double harga3 = Double.parseDouble(input.nextLine());
        double pajak = Double.parseDouble(input.nextLine());
        double uang = Double.parseDouble(input.nextLine());
        double subtotal = harga1 + harga2 + harga3;
        double uangpajak = subtotal * pajak / 100;
        double total = subtotal + uangpajak;

        String toko = "Toko Moklif";
        String tanggal = "14 September 2024";

        // coding disini

        // Ini jangan dihapus kalau ga mau ribet :D
        int width = 40;
        System.out.println("========================================");
        System.out.printf("%" + (width / 2 + toko.length() / 2) + "s%n", toko);
        System.out.printf("%" + (width / 2 + tanggal.length() / 2) + "s%n", tanggal);
        System.out.printf("----------------------------------------%n");
        System.out.printf("Name %5s %s%n", ":", nama);
        System.out.printf("NIM %6s %s%n", ":", nim);
        System.out.printf("----------------------------------------%n");
        System.out.printf("%-20s%20s %n", "Nama Barang", "Harga($)");
        System.out.printf("----------------------------------------%n");
        System.out.printf("%-20s%20.2f %n", item1, harga1);
        System.out.printf("%-20s%20.2f %n", item2, harga2);
        System.out.printf("%-20s%20.2f %n", item3, harga3);
        System.out.printf("----------------------------------------%n");
        System.out.printf("%-20s%20.2f %n", "subTotal", subtotal);
        System.out.printf("%-20s%20.2f %n", "Total", total);
        System.out.printf("%-20s%20.2f %n", "Bayar", uang);
        System.out.printf("%-20s%20.2f %n", "Kembali", uang - total);
        System.out.println("========================================");

        // lanjut coding disini
    }
}