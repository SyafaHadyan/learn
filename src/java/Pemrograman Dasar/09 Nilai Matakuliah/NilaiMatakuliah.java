import java.util.*;

public class NilaiMatakuliah
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.printf("%-30s%-2c","Masukkan nilai tugas",':');
        double nilaiTugas = Double.parseDouble(input.nextLine());
        System.out.printf("%-30s%-2c","Masukkan nilai kuis",':');
        double nilaiKuis = Double.parseDouble(input.nextLine());
        System.out.printf("%-30s%-2c","Masukkan nilai UAS",':');
        double nilaiUAS = Double.parseDouble(input.nextLine());
        input.close();
        double nilaiAkhir = 0;
        if (nilaiKuis > nilaiUAS)
        {
            nilaiAkhir = (40 / 100 * nilaiKuis) + (40 / 100 * nilaiUAS) + (20 / 100 * nilaiTugas);
        }
        else if (nilaiUAS >= nilaiKuis)
        {
            nilaiAkhir = (30 / 100 * nilaiKuis) + (50 / 100 * nilaiUAS) + (20 / 100 * nilaiTugas);
        }
        System.out.printf("%-30s%-2c%.2f","Nilai akhir",':',nilaiAkhir);
    }
}