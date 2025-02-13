public class VariabelEdit1
{
    public static void main(String[] args)
    {
        int nilai = 10;
        double nilai_2 = 5.3;
        int hasil; // Tidak terpakai
        System.out.println(nilai - nilai_2); // Mengurangi variabel "nilai" dengan "nilai_2"
        String s = "Belajar Java";
        System.out.println(nilai + nilai_2);
        System.out.println("Kita sedang " + s);
        //char ch = s; // Tidak bisa mengubah string ke char dan tipe data char hanya bisa memuat satu karakter
        //Program error dan tidak bisa berjalan

        /*
         * Output:
         * 
         * 4.7
         * 15.3
         * Kita sedang Belajar Java
         */
    }
}