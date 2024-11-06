package syafa.java.Praktikum.Bab5;
import java.util.*;

public class N05MethodVoid
{
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args)
    {
        int pilih = 3;
        do
        {
            System.out.println("Program Menghitung Sederhana ");
            System.out.println("Pilih salah satu :");
            System.out.println("1. Volume Prisma Segitiga");
            System.out.println("2. Volume Balok");
            System.out.println("3. Luas, keliling, dan sisi miring segitiga (siku-siku)");
            System.out.println("4. Luas dan keliing segitiga sembarang");
            System.out.println("5. Keluar");
            System.out.print("Masukkan Pilihan Anda : ");
            pilih = Integer.parseInt(in.nextLine());
            switch (pilih)
            {
                case 1:
                    volPrismaSegitiga();
                    break;
                case 2:
                    volBalok();
                    break;
                case 3:
                    propertiSegitiga();
                    break;
                case 4:
                    kelilingLuasSegitigaSembarang();
                    break;
            }
        }
        while (pilih != 5);
        in.close();
    }
    private static void volPrismaSegitiga()
    {
        float alas, tinggiSegitiga, luas, tinggiPrisma, volume;
        System.out.print("Masukkan nilai panjang alas :");
        alas = Float.parseFloat(in.nextLine());
        System.out.print("Masukkan nilai tinggi segitiga :");
        tinggiSegitiga = Float.parseFloat(in.nextLine());
        luas = (alas * tinggiSegitiga) / 2;
        System.out.print("Masukkan nilai tinggi prisma :");
        tinggiPrisma = Float.parseFloat(in.nextLine());
        volume = (luas * tinggiPrisma);
        System.out.println("Volume Prisma Segitiga :" + volume);
    }
    private static void volBalok()
    {
        float panjang, lebar, tinggi, volume;
        System.out.print("Masukkan panjang balok : ");
        panjang = Float.parseFloat(in.nextLine());
        System.out.print("Masukkan lebar balok : ");
        lebar = Float.parseFloat(in.nextLine());
        System.out.print("Masukkan tinggi balok : ");
        tinggi = Float.parseFloat(in.nextLine());
        volume = panjang * lebar * tinggi;
        System.out.println("Volume balok : " + volume);
    }
    private static void propertiSegitiga()
    {
        double alas = 0d;
        double tinggi = 0d;
        System.out.print("Masukkan nilai alas: ");
        alas = Double.parseDouble(in.nextLine());
        System.out.print("Masukkan nilai tinggi: ");
        tinggi = Double.parseDouble(in.nextLine());
        System.out.printf("%-14s%-2c%.2f\n","Luas segitiga",':',((alas * tinggi) / 2d));
        System.out.printf("%-18s%-2c%.2f\n","Keliling segitiga",':',(alas + tinggi + (Math.sqrt((Math.pow(alas,2)) + Math.pow(tinggi,2)))));
        System.out.printf("%-21s%-2c%.2f\n","Sisi miring segitiga",':',(Math.sqrt((Math.pow(alas,2)) + Math.pow(tinggi,2))));
    }
    private static void kelilingLuasSegitigaSembarang()
    {
        double alas = 0d;
        double tinggi = 0d;
        double sisiMiring = 0d;
        System.out.print("Masukkan nilai alas: ");
        alas = Double.parseDouble(in.nextLine());
        System.out.print("Masukkan nilai tinggi");
        tinggi = Double.parseDouble(in.nextLine());
        System.out.print("Masukkan nilai sisi miring");
        sisiMiring = Double.parseDouble(in.nextLine());
        System.out.printf("%-14s%-2c%.2f\n","Luas segitiga",':',((alas * tinggi) / 2d));
        System.out.printf("%-18s%-2c%.2f\n","Keliling segitiga",':',(alas + tinggi + sisiMiring));
    }
}