package syafa.java.Praktikum.Bab5;
import java.util.*;

public class N07MethodReturnValue
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Program Pendataan Mahasiswa");
        System.out.println();
        String nim1, nama1, nim2, nama2, jur1, jur2;
        System.out.print("Masukkan NIM Mahasiswa 1 : ");
        nim1 = in.nextLine();
        System.out.print("Masukkan Nama Mahasiswa 1 : ");
        nama1 = in.nextLine();
        System.out.print("Masukkan Jurusan Mahasiswa 1 : ");
        jur1 = in.nextLine();
        System.out.print("Masukkan NIM Mahasiswa 2 : ");
        nim2 = in.nextLine();
        System.out.print("Masukkan Nama Mahasiswa 2 : ");
        nama2 = in.nextLine();
        System.out.print("Masukkan Jurusan Mahasiswa 2 : ");
        jur2 = in.nextLine();
        in.close();
        System.out.println("Data Mahasiswa : ");
        System.out.println(showData(nim1, nama1, jur1));
        System.out.print(showData(nim2, nama2, jur2));
    }
    public static String showData(String nim, String nama, String jurusan)
    {
        String show = "\nnim : " + nim + "\nnama : " + nama + "\nJurusan : " + jurusan;
        return show;
    }
}