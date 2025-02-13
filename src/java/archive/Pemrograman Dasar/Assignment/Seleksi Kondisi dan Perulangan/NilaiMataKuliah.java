import java.util.*;

public class NilaiMataKuliah
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        boolean cekNilai = true;
        double nilaiTugas = 0;
        double nilaiKuis = 0;
        double nilaiUAS = 0;
        double nilaiAkhir = 0;
        int IPK = 0;
        while (cekNilai)
        {
            System.out.printf("%-30s%-2c","Masukkan nilai tugas",':');
            nilaiTugas = Double.parseDouble(input.nextLine());
            System.out.printf("%-30s%-2c","Masukkan nilai kuis",':');
            nilaiKuis = Double.parseDouble(input.nextLine());
            System.out.printf("%-30s%-2c","Masukkan nilai UAS",':');
            nilaiUAS = Double.parseDouble(input.nextLine());
            if (nilaiTugas <= 100 && nilaiKuis <= 100 && nilaiUAS <= 100)
            {
                cekNilai = false;
                input.close();
            }
            else
            {
                System.out.println("\n" + "Nilai tidak valid, harap masukkan ulang nilai" + "\n");
                cekNilai = true;
            }
        }
        if (nilaiKuis > nilaiUAS)
        {
            nilaiAkhir = (nilaiKuis * 40 / 100) + (nilaiUAS * 40 / 100) + (nilaiTugas * 20 / 100);
        }
        else if (nilaiUAS >= nilaiKuis)
        {
            nilaiAkhir = (nilaiKuis * 30 / 100) + (nilaiUAS * 50 / 100) + (nilaiTugas * 20 / 100);
        }
        System.out.println("==============================");
        if (nilaiAkhir >= 85 && nilaiAkhir <= 100)
        {
            IPK = 4;
            System.out.printf("%-30s%-2c%.2f\n","Nilai akhir",':',nilaiAkhir);
            System.out.printf("%-30s%-2c%d\n","IPK",':',IPK);
            System.out.printf("%-30s%-2c%s","Nilai Huruf",':',"Sangat Baik");
        }
        else if (nilaiAkhir >= 75 && nilaiAkhir <= 84)
        {
            IPK = 3;
            System.out.printf("%-30s%-2c%.2f\n","Nilai akhir",':',nilaiAkhir);
            System.out.printf("%-30s%-2c%d\n","IPK",':',IPK);
            System.out.printf("%-30s%-2c%s","Nilai Huruf",':',"Baik");
        }
        else if (nilaiAkhir >= 65 && nilaiAkhir <= 74)
        {
            IPK = 2;
            System.out.printf("%-30s%-2c%.2f\n","Nilai akhir",':',nilaiAkhir);
            System.out.printf("%-30s%-2c%d\n","IPK",':',IPK);
            System.out.printf("%-30s%-2c%s","Nilai Huruf",':',"Cukup");
        }
        else if (nilaiAkhir >= 50 && nilaiAkhir <= 64)
        {
            IPK = 1;
            System.out.printf("%-30s%-2c%.2f\n","Nilai akhir",':',nilaiAkhir);
            System.out.printf("%-30s%-2c%\n","IPK",':',IPK);
            System.out.printf("%-30s%-2c%s","Nilai Huruf",':',"Kurang");
        }
        else if (nilaiAkhir >= 0 && nilaiAkhir <= 49)
        {
            IPK = 0;
            System.out.printf("%-30s%-2c%.2f\n","Nilai akhir",':',nilaiAkhir);
            System.out.printf("%-30s%-2c%d\n","IPK",':',IPK);
            System.out.printf("%-30s%-2c%s","Nilai Huruf",':',"Gagal");
        }
    }
}