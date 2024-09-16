import java.util.*;

public class IPK
{
    public static void main(String[] args)
    {
        Scanner Input = new Scanner(System.in);
        System.out.print("Masukkan IPK anda" + ':' + ' ');
        float IPK = Float.parseFloat(Input.nextLine());
        System.out.print("\n");
        if (IPK <= 3.5 && IPK >= 4)
        {
            System.out.println("Sangat Memuaskan");
        }
        else if (IPK <= 3.0 && IPK >= 3.4)
        {
            System.out.println("Memuaskan");
        }
        else if (IPK <= 2.5 && IPK >= 2.9)
        {
            System.out.println("Baik Sekali");
        }
        else if (IPK <= 2.0 && IPK >= 2.4)
        {
            System.out.println("Baik");
        }
        else if (IPK <= 1.9 && IPK > 0)
        {
            System.out.println("Kurang");
        }
        else if (IPK == 0)
        {
            System.out.println("Anda tidak lulus");
        }
        else if (IPK < 0)
        {
            System.out.println("IPK tidak valid. Harap ulang kembali");
        }
        Input.close();
    }
}
