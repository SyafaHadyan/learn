import java.util.*;

public class NilaiMatakuliah
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        boolean cekNilai = true;
        boolean CekIPK = true;
        double nilaiTugas = 0;
        double nilaiKuis = 0;
        double nilaiUAS = 0;
        double nilaiAkhir = 0;
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
        System.out.printf("%-30s%-2c%.2f","Nilai akhir",':',nilaiAkhir);
        while (CekIPK)
        {
            System.out.print("Masukkan IPK anda" + ':' + ' ');
            double IPK = Double.parseDouble(Input.nextLine());
            System.out.print("\n");
            if (IPK >= 3.5 && IPK <= 4)
            {
                System.out.println("Sangat Memuaskan");
                CekIPK = false;
            }
            else if (IPK >= 3.0 && IPK <= 3.4)
            {
                System.out.println("Memuaskan");
                CekIPK = false;
            }
            else if (IPK >= 2.5 && IPK <= 2.9)
            {
                System.out.println("Baik Sekali");
                CekIPK = false;
            }
            else if (IPK >= 2.0 && IPK <= 2.4)
            {
                System.out.println("Baik");
                CekIPK = false;
            }
            else if (IPK < 2 && IPK > 0)
            {
                System.out.println("Kurang");
                CekIPK = false;
            }
            else if (IPK == 0)
            {
                System.out.println("Anda tidak lulus");
                CekIPK = false;
            }
            else if (IPK < 0 || IPK > 4)
            {
                System.out.println("IPK tidak valid. Harap ulang kembali" + "\n");
                CekIPK = true;
            }
        }
    }
}