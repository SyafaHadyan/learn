import java.util.*;

public class Input
{
    public static void main(String[] args)
	{
        Scanner input = new Scanner(System.in);
        int nilai1, nilai2, hasil;
        System.out.print("masukkan nilai 1: ");
        nilai1 = input.nextInt();
        System.out.print("masukkan nilai 2: ");
        nilai2 = input.nextInt();
        hasil = nilai1 + nilai2;
        System.out.print("maka hasil: " + hasil);
        input.close();

        /*
         * Output:
         * 
         * masukkan nilai 1: 32
         * masukkan nilai 2: 3245
         * maka hasil: 3277
         */
    }
}