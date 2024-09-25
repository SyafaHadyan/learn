import java.util.*;

public class N_10_NestedIf
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("masukkan nilai: ");
        int nilai = in.nextInt();
        in.close();
        if (nilai * 2 < 50 && nilai <= 20)
        {
            nilai += 10;
            System.out.println("Filkom");
            if (nilai % 2 == 1)
            {
                System.out.println("UB");
            }
            else
            {
                System.out.println("Brawijaya");
            }
        }
        else
        {
            System.out.println("PTIIK");
            if (nilai % 2 == 1)
            {
                System.out.println("UB");
            }
            else
            {
                System.out.println("Brawijaya");
            }
        }
    }
}