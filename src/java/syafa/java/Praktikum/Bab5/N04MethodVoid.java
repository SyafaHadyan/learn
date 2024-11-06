package syafa.java.Praktikum.Bab5;
import java.util.*;

public class N04MethodVoid
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
            System.out.println("4. Keluar");
            System.out.print("Masukkan Pilihan Anda : ");
            pilih = in.nextInt();
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
            }
        }
        while (pilih != 4);
        in.close();
    }
    private static void volPrismaSegitiga()
    {
        float alas, tinggiSegitiga, luas, tinggiPrisma, volume;
        System.out.print("Masukkan nilai panjang alas :");
        alas = in.nextFloat();
        System.out.print("Masukkan nilai tinggi segitiga :");
        tinggiSegitiga = in.nextFloat();
        luas = (alas * tinggiSegitiga) / 2;
        System.out.print("Masukkan nilai tinggi prisma :");
        tinggiPrisma = in.nextFloat();
        volume = (luas * tinggiPrisma);
        System.out.println("Volume Prisma Segitiga :" + volume);
    }
    private static void volBalok()
    {
        float panjang, lebar, tinggi, volume;
        System.out.print("Masukkan panjang balok : ");
        panjang = in.nextFloat();
        System.out.print("Masukkan lebar balok : ");
        lebar = in.nextFloat();
        System.out.print("Masukkan tinggi balok : ");
        tinggi = in.nextFloat();
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
        System.out.printf("%-14s%-2c%.2f","Luas segitiga",':',((alas * tinggi) / 2d));
    }
}