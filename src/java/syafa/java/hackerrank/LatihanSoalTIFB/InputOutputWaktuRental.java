package syafa.java.hackerrank.LatihanSoalTIFB;
import java.util.*;

public class InputOutputWaktuRental
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String nama = input.nextLine();
        int mulai = Integer.parseInt(input.nextLine());
        int selesai = Integer.parseInt(input.nextLine());
        int hargaPerJam = Integer.parseInt(input.nextLine());
        input.close();
        int total = selesai - mulai;
        if (selesai >= 24)
        {
            selesai = selesai % 24;
        }
        System.out.println("Halo" + ' ' + nama);
        System.out.println("Anda merental Game Corner pada jam" + ' ' + mulai + ' ' + '-' + ' ' + selesai);
        System.out.println("Total durasi" + ' ' + total + ' ' + "jam");
        System.out.print("Harga rental" + ' ' + "Rp" + total * hargaPerJam);
    }
}