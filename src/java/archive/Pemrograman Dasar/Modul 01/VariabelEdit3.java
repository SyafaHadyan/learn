public class VariabelEdit3
{
    public static void main(String[] args)
    {
        int nilai = 10;
        double nilai_2 = 5.3;
        int nilai3 = 100;
        int hasil = nilai3 / nilai; // Pembagian int nilai3 dan int nilai
        String s = "Belajar Java";
        System.out.println(nilai - nilai_2); // Mengurangi variabel "nilai" dengan "nilai_2"
        System.out.println(nilai + nilai_2); // Penjumlahan int nilai dan double nilai_2
        System.out.println(hasil); // Print nilai hasil
        System.out.println(nilai3 / nilai); // Pembagian variabel "nilai3" dengan "nilai" tanpa harus disimpan ke dalam variabel
        System.out.println("Kita sedang " + s);
        //char ch = s; // Tidak bisa mengubah string ke char dan tipe data char hanya bisa memuat satu karakter
        //Program error dan tidak bisa berjalan

        /*
         * Output:
         * 
         * 4.7
         * 15.3
         * 10
         * 10
         * Kita sedang Belajar Java
         */
    }
}