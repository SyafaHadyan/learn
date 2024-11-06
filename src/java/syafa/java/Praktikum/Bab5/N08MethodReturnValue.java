package syafa.java.Praktikum.Bab5;
import java.util.*;

public class N08MethodReturnValue
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Program Pendataan Mahasiswa");
        System.out.println();
        String nim1, nama1, nim2, nama2, jur1, jur2, umur1, umur2;
        System.out.print("Masukkan NIM Mahasiswa 1 : ");
        nim1 = in.nextLine();
        System.out.print("Masukkan Nama Mahasiswa 1 : ");
        nama1 = in.nextLine();
        System.out.print("Masukkan Jurusan Mahasiswa 1 : ");
        jur1 = in.nextLine();
        System.out.print("Masukkan Tempat, Tanggal Lahir Mahasiswa 1 : ");
        umur1 = in.nextLine();
        System.out.print("Masukkan NIM Mahasiswa 2 : ");
        nim2 = in.nextLine();
        System.out.print("Masukkan Nama Mahasiswa 2 : ");
        nama2 = in.nextLine();
        System.out.print("Masukkan Jurusan Mahasiswa 2 : ");
        jur2 = in.nextLine();
        System.out.print("Masukkan Tempat, Tanggal Lahir Mahasiswa 2 : ");
        umur2 = in.nextLine();
        in.close();
        System.out.println("Data Mahasiswa : ");
        System.out.println(showData(nim1, nama1, jur1, umur1));
        System.out.print(showData(nim2, nama2, jur2, umur2));
    }
    public static String showData(String nim, String nama, String jurusan, String umur)
    {
        String show = "\nnim : " + nim + "\nnama : " + nama + "\nJurusan : " + jurusan + "\nUmur : " + (2024 /* change in 2025 */ - Integer.parseInt(umur.substring(umur.length() - 4,umur.length())) < 20 ? "Teen" : "Adult");
        return show;
    }
}