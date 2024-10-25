package syafa.java.codex2024;
import java.util.*;

public class ManajemenDaftarTugas
{
    public static void main(String[] args)
    {
        /*
         * Kamu diminta untuk mengimplementasikan sebuah sistem manajemen daftar tugas (to-do list) menggunakan struktur data ArrayList.
         * Setiap pengguna dapat menambah, menghapus, atau melihat daftar tugas yang harus diselesaikan.
         * 
         * Ada empat jenis operasi yang dapat dilakukan pada to-do list:
         *     TAMBAH x: Menambahkan tugas dengan nama ( x ) ke dalam daftar tugas.
         *     HAPUS n: Menghapus tugas yang berada pada posisi ke-( n ) dalam daftar (1-indexed). Jika tugas pada posisi tersebut tidak ada, operasi ini diabaikan.
         *     CEKLIS n: Menampilkan tugas pada posisi ke-( n ) dalam daftar (1-indexed). Jika tidak ada tugas pada posisi tersebut, cetak "TIDAK ADA TUGAS".
         *     CEKSEMUA: Menampilkan semua tugas yang ada dalam daftar. Jika daftar kosong, cetak "DAFTAR KOSONG".
         * Input
         *     Baris pertama berisi sebuah bilangan bulat ( N ) (1 ≤ ( N ) ≤ 1000), yang merupakan jumlah total operasi.
         *     Setiap baris berikutnya berisi salah satu dari empat operasi: "TAMBAH x", "HAPUS n", "CEKLIS n", atau "CEKSEMUA".
         * Output
         *     Untuk setiap operasi "CEKLIS" dan "CEKSEMUA", cetak hasil sesuai yang diminta.
         * Contoh Input
         * 
         * 7
         * TAMBAH Belajar
         * TAMBAH Makan
         * CEKSEMUA
         * CEKLIS 1
         * HAPUS 2
         * CEKSEMUA
         * CEKLIS 2
         * 
         * Belajar Makan
         * Belajar
         * Belajar
         * TIDAK ADA TUGAS
         * 
         * Penjelasan
         *     Tambahkan tugas "Belajar" ke dalam daftar.
         *     Tambahkan tugas "Makan" setelahnya.
         *     Saat dicek semua tugas, daftar berisi "Belajar Makan".
         *     Saat dicek tugas pada posisi 1, hasilnya "Belajar".
         *     Hapus tugas pada posisi 2, yaitu "Makan".
         *     Saat dicek semua tugas, daftar hanya berisi "Belajar".
         *     Saat dicek tugas pada posisi 2, hasilnya "TIDAK ADA TUGAS" karena posisi 2 sudah dihapus.

         */
        Scanner input = new Scanner(System.in);
        int operation = Integer.parseInt(input.nextLine());
        ArrayList<String> taskList = new ArrayList<>();
        ArrayList<String> result = new ArrayList<>();
        for (int i = 0; i < operation; i++)
        {
            String temp = input.nextLine();
            if (temp.contains("TAMBAH"))
            {
                taskList.add(temp.replace("TAMBAH ",""));
            }
            else if (temp.contains("HAPUS"))
            {
                taskList.remove(Integer.parseInt(temp.replace("HAPUS ","")) - 1);
            }
            else if (temp.contains("CEKLIS"))
            {
                if (taskList.get(Integer.parseInt(temp.replace("CEKLIS ","")) - 1).equalsIgnoreCase(null))
                {
                    result.add("TIDAK ADA TUGAS");
                    continue;
                }
                result.add(taskList.get(Integer.parseInt(temp.replace("CEKLIS ","")) - 1));
            }
            else if (temp.equalsIgnoreCase("CEKSEMUA"))
            {
                StringBuilder tempCheck = new StringBuilder();
                if (taskList.isEmpty())
                {
                    result.add("TIDAK ADA TUGAS");
                    continue;
                }
                for (int j = 0; j < taskList.size(); j++)
                {
                    tempCheck.append(taskList.get(i));
                    if (taskList.size() - j != 1)
                    {
                        tempCheck.append(" ");
                    }
                }
                result.add(String.valueOf(tempCheck));
            }
        }
        input.close();
    }
}