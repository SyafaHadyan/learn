package syafa.java.hackerrank.KlinikKoding;
import java.util.*;

public class MamPermen
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int jumlahPermen = Integer.parseInt(input.nextLine());
        int bagi = jumlahPermen / 3;
        int anton = bagi;
        int budiono = bagi;
        int caca = bagi;
        int david = jumlahPermen % 3;
        System.out.println("Anton: " + anton + " permen");
        System.out.println("Budiono: " + budiono + " permen");
        System.out.println("Caca: " + caca + " permen");
        System.out.println("\nDavid: " + david + " permen");
    }
}