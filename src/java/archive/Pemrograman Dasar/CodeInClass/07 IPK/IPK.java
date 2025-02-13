import java.util.*;

public class IPK
{
    public static void main(String[] args)
    {
        boolean CheckIPK = true;
        Scanner Input = new Scanner(System.in);
        while (CheckIPK)
        {
            System.out.print("Masukkan IPK anda" + ':' + ' ');
            double IPK = Double.parseDouble(Input.nextLine());
            System.out.print("\n");
            if (IPK >= 3.5 && IPK <= 4)
            {
                System.out.println("Sangat Memuaskan");
                CheckIPK = false;
            }
            else if (IPK >= 3.0 && IPK <= 3.4)
            {
                System.out.println("Memuaskan");
                CheckIPK = false;
            }
            else if (IPK >= 2.5 && IPK <= 2.9)
            {
                System.out.println("Baik Sekali");
                CheckIPK = false;
            }
            else if (IPK >= 2.0 && IPK <= 2.4)
            {
                System.out.println("Baik");
                CheckIPK = false;
            }
            else if (IPK < 2 && IPK > 0)
            {
                System.out.println("Kurang");
                CheckIPK = false;
            }
            else if (IPK == 0)
            {
                System.out.println("Anda tidak lulus");
                CheckIPK = false;
            }
            else if (IPK < 0 || IPK > 4)
            {
                System.out.println("IPK tidak valid. Harap ulang kembali" + "\n");
                CheckIPK = true;
            }
        }
        Input.close();
    }
}
