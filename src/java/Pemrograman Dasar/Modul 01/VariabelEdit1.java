public class VariabelEdit1
{
    public static void main(String[] args)
    {
        int nilai = 10;
        double nilai_2 = 5.3;
        int hasil; // Tidak terpakai
        String s = "Belajar Java";
        System.out.println(nilai - nilai_2);
        System.out.println(nilai + nilai_2);
        System.out.println("Kita sedang " + s);
        char ch = 'Belajar Java' // Error, karena char tidak bisa memuat lebih dari 1
    }
}