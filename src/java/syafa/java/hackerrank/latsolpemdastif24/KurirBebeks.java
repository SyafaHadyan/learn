package syafa.java.hackerrank.latsolpemdastif24;
import java.util.*;

public class KurirBebeks
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String deliveryOption = input.nextLine();
        int numberOfItems = Integer.parseInt(input.nextLine());
        int totalWeight = Integer.parseInt(input.nextLine());
        if (numberOfItems <= 0 || totalWeight <= 0)
        {
            System.out.print("Pengiriman tidak dapat dilakukan.");
            System.exit(0);
        }
        input.close();
    }
}