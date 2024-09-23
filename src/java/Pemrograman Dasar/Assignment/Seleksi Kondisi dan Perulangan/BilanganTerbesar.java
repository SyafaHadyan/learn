import java.util.*;

public class BilanganTerbesar
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.printf("%-30s%-2c","Masukkan bilangan pertama",':');
        int bilanganPertama = Integer.parseInt(input.nextLine());
        System.out.printf("%-30s%-2c","Masukkan bilangan kedua",':');
        int bilanganKedua = Integer.parseInt(input.nextLine());
        System.out.printf("%-30s%-2c","Masukkan bilangan ketiga",':');
        int bilanganKetiga = Integer.parseInt(input.nextLine());
        input.close();
        int BilanganTerbesar = bilanganPertama;
    }
}