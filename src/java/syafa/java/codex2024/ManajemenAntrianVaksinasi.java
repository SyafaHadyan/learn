package syafa.java.codex2024;
import java.util.*;

public class ManajemenAntrianVaksinasi
{
    public static void main(String[] args)
    {
        /*
         * 7
         * DAFTAR 101
         * DAFTAR 202
         * CEKDEPAN
         * LAYANI
         * CEKDEPAN
         * LAYANI
         * CEKDEPAN
         * 
         * 101
         * 202
         * ANTRIAN KOSONG
         * 
         * 
         * Orang dengan ID 101 mendaftar ke dalam antrian.
         * Orang dengan ID 202 mendaftar setelahnya.
         * Saat dicek, orang dengan ID 101 berada di depan antrian.
         * Orang dengan ID 101 dilayani dan keluar dari antrian.
         * Saat dicek kembali, orang dengan ID 202 berada di depan.
         * Orang dengan ID 202 dilayani dan keluar dari antrian.
         * Antrian kosong ketika dicek terakhir.
         */
        Scanner input = new Scanner(System.in);
        int operation = Integer.parseInt(input.nextLine());
        ArrayList<String> operationResult = new ArrayList<>();
        ArrayList<Integer> patientRegister = new ArrayList<>();
        for (int i = 0; i < operation; i++)
        {
            String temp = input.nextLine();
            if (temp.contains("DAFTAR"))
            {
                patientRegister.add(Integer.parseInt(temp.replace("DAFTAR ",null)));
            }
        }
        input.close();
    }
}