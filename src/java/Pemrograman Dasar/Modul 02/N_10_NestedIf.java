import java.util.*;

public class N_10_NestedIf
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("masukkan nilai: ");
        int nilai = in.nextInt();
        in.close();
        if (nilai * 2 < 50)
        {
            nilai += 10;
        }
        if (nilai <= 20 && nilai % 2 == 1)
        {
            System.out.println("Filkom");
            System.out.println("UB");
        }
        else if (nilai <= 20 && nilai % 2 == 0)
        {
            System.out.println("FILKOM");
            System.out.println("Brawijaya");
        }
        else if (nilai % 2 == 1)
        {
            System.out.println("PTIIK");
            System.out.println("UB");
        }
        else
        {
            System.out.println("PTIIK");
            System.out.println("Brawijaya");
        }

    }
}