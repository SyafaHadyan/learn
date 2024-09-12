import java.util.*;

public class Input0
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int nilai1, nilai2, hasil;
        System.out.print("masukkan nilai 1: ");
        nilai1 = input.nextDouble(); // Error: tidak bisa convert double ke int
        System.out.print("masukkan nilai 2: ");
        nilai2 = input.nextInt();
        hasil = nilai1 + nilai2;
        System.out.print("maka hasil: " + hasil);
        input.close();
    }
}