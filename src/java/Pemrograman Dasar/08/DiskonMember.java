import java.util.*;

public class DiskonMember
{
    public static void main(String[] args)
    {
        Scanner Input = new Scanner(System.in);
        System.out.printf("%s%-30s%c%c","Masukkan total belanja",':',' ');
        int TotalBelanja = Integer.parseInt(Input.nextLine());
        System.out.println("Apakah anda memiliki member?" + "(Y/N)");
        String CheckMember = Input.nextLine();
        if (CheckMember.equalsIgnoreCase("Y"))
        {
            System.out.println();
        }
        else if (CheckMember.equalsIgnoreCase("N"))
        {
            System.out.println();
        }
        else
        {
            System.out.println("Pilihan yang anda masukkan salah, silahkan coba lagi");
        }
    }
}
