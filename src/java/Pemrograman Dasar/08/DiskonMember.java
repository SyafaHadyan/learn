import java.util.*;

public class DiskonMember
{
    public static void main(String[] args)
    {
        boolean CheckInput = true;
        Scanner Input = new Scanner(System.in);
        System.out.printf("%-30s%c%c","Masukkan total belanja",':',' ');
        double TotalBelanja = Double.parseDouble(Input.nextLine());
        while (CheckInput)
        {
            System.out.printf("Apakah anda memiliki member?" + ' ' + "(Y/N)" + "\n" + "Masukkan" + ':' + ' ');
            String CheckMember = Input.nextLine();
            if (CheckMember.equalsIgnoreCase("Y"))
            {
                System.out.print("Masukkan nomor member anda" + ':' + ' ');
                int Member = Integer.parseInt(Input.nextLine());
                System.out.println();
                System.out.println("Selamat datang" + ' ' + Member + '!');
                double Diskon = 0.1 * TotalBelanja;
                double HargaTotal = TotalBelanja - Diskon;
                System.out.println();
                System.out.printf("%-30s%c%c%s%c%1.2f%s","Diskon member anda adalah",':',' ',"Rp",' ',Diskon,"\n");
                System.out.printf("%-30s%c%c%s%c%1.2f%s","Total belanja anda adalah",':',' ',"Rp",' ',HargaTotal,"\n");
                System.out.print("Terimakasih telah berbelanja");
                CheckInput = false;
            }
            else if (CheckMember.equalsIgnoreCase("N"))
            {
                double Diskon = 0.01 * TotalBelanja;
                double HargaTotal = TotalBelanja - Diskon;
                System.out.printf("%-30s%c%c%s%c%1.2f%s","Diskon non-member anda adalah",':',' ',"Rp",' ',Diskon,"\n");
                System.out.printf("%-30s%c%c%s%c%1.2f%s","Total belanja anda adalah",':',' ',"Rp",' ',HargaTotal,"\n");
                System.out.println("Segera gabung member untuk mendapatkan diskon eksklusif khusus member!");
                System.out.print("Terimakasih telah berbelanja");
                CheckInput = false;
            }
            else
            {
                System.out.println("Pilihan yang anda masukkan salah, silahkan coba lagi");
                CheckInput = true;
            }
        }
        Input.close();
    }
}