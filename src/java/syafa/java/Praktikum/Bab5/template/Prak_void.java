package syafa.java.Praktikum.Bab5.template;
import java.util.*;

public class Prak_void
{
    @SuppressWarnings("resource")
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int pilih = 3;
        do {
            System.out.println("Program Menghitung Sederhana ");
            System.out.println("Pilih salah satu :");
            System.out.println("1. Volume Prisma Segitiga");
            System.out.println("2. Volume Balok");
            System.out.println("3. Keluar");
            System.out.print("Masukkan Pilihan Anda : ");
            pilih = in.nextInt();
            switch (pilih)
            {
                case 1:
                    volPrismaSegitiga();
                    break;
                case 2:
                    //volBalok();
                    break;
            }
        }
        while (pilih != 3);
    }

    @SuppressWarnings("resource")
    private static void volPrismaSegitiga()
    {
        Scanner in = new Scanner(System.in);
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

    @SuppressWarnings("resource")
    void volBalok()
    {
        Scanner in = new Scanner(System.in);
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
}