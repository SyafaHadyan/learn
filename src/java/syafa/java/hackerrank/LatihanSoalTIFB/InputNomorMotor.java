package syafa.java.hackerrank.LatihanSoalTIFB;
import java.util.*;

public class InputNomorMotor {

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String kota = input.nextLine();
        int nomor = Integer.parseInt(input.nextLine());
        String nama = input.nextLine();
        input.close();
        System.out.printf("%s%c%d%c%s",kota,' ',nomor,' ',nama);
    }
}