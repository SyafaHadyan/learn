package syafa.java.Praktikum.Bab5;
import java.util.*;

public class N16MethodRekursif
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan bilangan : ");
        int bilangan = Integer.parseInt(input.nextLine());
        input.close();
        int hasil;
        hasil = faktorial(bilangan);
        System.out.println("Nilai dari " + bilangan + "! adalah " + hasil);
    }
    private static int faktorial(int bil)
    {
        if (bil == 1)
            return 1;
        else
            return (bil * faktorial(bil-1));
    }
}