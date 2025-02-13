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
        int bilanganTerbesar = bilanganPertama;
        String bilanganTerbesarKe = "bilangan pertama";
        if(bilanganTerbesar < bilanganKedua)
        {
            bilanganTerbesar = bilanganKedua;
            bilanganTerbesarKe = "bilangan kedua";
        }
        else if (bilanganTerbesar < bilanganKetiga)
        {
            bilanganTerbesar = bilanganKetiga;
            bilanganTerbesarKe = "bilangan ketiga";
        }
        System.out.printf("%-30s%c%d%c%s%c%s","Bilangan terbesar adalah bilangan",' ',bilanganTerbesar,' ',"yaitu",' ',bilanganTerbesarKe);
    }
}