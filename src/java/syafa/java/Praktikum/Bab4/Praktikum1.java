package syafa.java.Praktikum.Bab4;
import java.util.*;

public class Praktikum1
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String[][] data =
        {
            {"Ekonomi", "Bisnis", "Eksekutif", "Pariwisata"},
            {"50000", "100000", "200000", "300000"},
            {"2", "5", "7", "10"},
            {"Tidak ada", "Ada", "Ada", "Ada"},
            {"Tidak ada", "Tidak ada", "Tidak ada", "Ada"}
        };
        String[] menu =
        {
            "Melihat Daftar Kereta Api",
            "Melihat Daftar Kereta Api yang ada AC",
            "Melihat Daftar Kereta Api yang ada Colokan",
            "Memesan Tikat Kereta Api",
            "Melihat Pesanan Tiket",
            "Keluar",
        };
        input.close();
    }
}