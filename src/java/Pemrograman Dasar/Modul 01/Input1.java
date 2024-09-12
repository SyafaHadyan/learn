import java.util.*;

public class Input1
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int nilai1, nilai2, hasil;
        System.out.print("masukkan nilai 1: ");
        nilai1 = input.nextInt();
        System.out.print("masukkan nilai 2: ");
        nilai2 = input.nextInt();
        hasil = nilai1 + nilai2;
        System.out.print("Masukkan nama" + ":" + " ");
        String nama = input.next();
        System.out.print("Masukkan NIM" + ":" + " ");
        int nim = input.nextInt();
        System.out.println("\n" + "maka hasil: " + hasil);
        System.out.println("Nama lengkap" + ":" + " " + nama);
        System.out.print("NIM" + ":" + " " + nim);
        input.close();
    }
}