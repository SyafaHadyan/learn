import java.util.*;

public class IPK
{
    public static void main(String[] args)
    {
        Scanner Input = new Scanner(System.in);
        System.out.print("Masukkan IPK anda" + ':' + ' ');
        float IPK = Float.parseFloat(Input.nextLine());
        if (IPK <= 3.5 && IPK >= 4)
        {
            System.out.println("Sangat Memuaskan");
        }
        else if (IPK <= 3.0 && IPK >= 3.4)
        {
            System.out.println("Memuaskan");
        }
        else if
        Input.close();
    }
}
