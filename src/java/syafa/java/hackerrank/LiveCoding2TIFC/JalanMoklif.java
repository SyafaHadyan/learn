package syafa.java.hackerrank.LiveCoding2TIFC;
import java.util.*;

public class JalanMoklif
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int hari = Integer.parseInt(input.nextLine());
        String kota = input.nextLine();
        int nomor = Integer.parseInt(input.nextLine());
        String kode = input.nextLine();
        input.close();
        String output = "";
        String namaHari = "";
        String boleh = "";
        switch (hari)
        {
            case 0:
                namaHari = "Senin";
                break;
            case 1:
                namaHari = "Selasa";
                break;
            case 2:
                namaHari = "Rabu";
                break;
            case 3:
                namaHari = "Kamis";
                break;
            case 4:
                namaHari = "Jumat";
                break;
            case 5:
                namaHari = "Sabtu";
                break;
            case 6:
                namaHari = "Minggu";
                break;
            default:
                break;
        }
        if (hari == 0 || hari == 1 || hari == 2)
        {
            if (nomor % 2 == 0)
            {
                boleh = "diperbolehkan";
            }
            else
            {
                boleh = "tidak diperbolehkan";
            }
        }
        else if (hari == 3 || hari == 4 || hari == 5)
        {
            if (nomor % 2 != 0)
            {
                boleh = "diperbolehkan";
            }
            else
            {
                boleh = "tidak diperbolehkan";
            }
        }
        else
        {
            boleh = "diperbolehkan";
        }
        output = "Kendaraan Dengklek dengan plat" + ' ' + kota + ' ' + nomor + ' ' + kode + ' ' + boleh + ' ' + "lewat Jalan Dengklek pada hari" + ' ' + namaHari + '.';
        System.out.print(output);
    }
}