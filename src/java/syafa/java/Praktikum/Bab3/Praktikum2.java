package syafa.java.Praktikum.Bab3;
import java.util.*;

public class Praktikum2
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.printf("%s\n%s\n%s\n%s\n%s\n%s\n%s\n\n%-20s%-2c",
                            "MENU",
                            "0. KELUAR",
                            "1. HITUNG VOLUME BALOK",
                            "2. HITUNG VOLUME BOLA",
                            "3. HITUNG VOLUME KERUCUT",
                            "4. HITUNG VOLUME SILINDER",
                            "5. HITUNG VOLUME LIMAS SEGITIGA",
                            "MASUKKAN PILIHAN ANDA",':');
        int selection = Integer.parseInt(input.nextLine());
        input.close();
    }
}