package syafa.java.hackerrank.LatihanSoalTIFB;
import java.util.*;

public class InputHurufKeN {

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String nama = input.nextLine();
        int hurufKe = Integer.parseInt(input.nextLine());
        input.close();
        hurufKe--;
        System.out.print(nama.charAt(hurufKe));
    }
}