import java.util.*;

public class N_04_ConditionalAssignment
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        boolean cekInput = true;
        while (cekInput)
        {
            System.out.printf("%-25s%-2c","Masukkan nama anda",':');
            String nama = input.nextLine();
            System.out.printf("%-25s%-2c","Masukkan password anda",':');
            String password = input.nextLine();
        }
    }
}