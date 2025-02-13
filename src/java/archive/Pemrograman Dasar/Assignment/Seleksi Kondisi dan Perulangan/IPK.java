import java.util.*;

public class IPK
{
    public static void main(String[] args)
    {
        boolean cekIPK = true;
        Scanner input = new Scanner(System.in);
        while (cekIPK)
        {
            System.out.print("Masukkan IPK anda" + ':' + ' ');
            double IPK = Double.parseDouble(input.nextLine());
            System.out.print("\n");
            if (IPK >= 3.5 && IPK <= 4)
            {
                System.out.println("Sangat Memuaskan");
                cekIPK = false;
            }
            else if (IPK >= 3.0 && IPK <= 3.4)
            {
                System.out.println("Memuaskan");
                cekIPK = false;
            }
            else if (IPK >= 2.5 && IPK <= 2.9)
            {
                System.out.println("Baik Sekali");
                cekIPK = false;
            }
            else if (IPK >= 2.0 && IPK <= 2.4)
            {
                System.out.println("Baik");
                cekIPK = false;
            }
            else if (IPK < 2 && IPK > 0)
            {
                System.out.println("Kurang");
                cekIPK = false;
            }
            else if (IPK == 0)
            {
                System.out.println("Anda tidak lulus");
                cekIPK = false;
            }
            else if (IPK < 0 || IPK > 4)
            {
                System.out.println("IPK tidak valid. Harap ulang kembali" + "\n");
                cekIPK = true;
            }
        }
        input.close();
    }
}
