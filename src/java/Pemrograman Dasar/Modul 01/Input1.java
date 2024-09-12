import java.util.*;

public class Input1
{
    public static void main(String[] args)
	{
        Scanner input = new Scanner(System.in);
        int nilai1, nilai2, hasil;
        System.out.print("masukkan nilai 1: ");
        nilai1 = input.nextInt();
        System.out.print("masukkan nilai 2: ");
        nilai2 = input.nextInt();
        input.nextLine(); // Error
        System.out.print("masukkan nama" + ':' + ' ');
        String nama = input.nextLine();
        System.out.print("masukkan nim" + ':' + ' ');
        double nim = input.nextDouble();
        hasil = nilai1 + nilai2;
        System.out.println("\n" + "maka hasil: " + hasil);
        System.out.println("nama" + ':' + ' ' + nama);
        System.out.printf("%s%.0f","nim: ",nim);
        input.close();

        /*
         * Output:
         * 
         * masukkan nilai 1: 9823
         * masukkan nilai 2: 435987
         * masukkan nama: Syafa Hadyan Rasendriya
         * masukkan nim: 245150207111047
         *  
         * maka hasil: 445810
         * nama: Syafa Hadyan Rasendriya
         * nim: 245150207111047
         */
    }
}