import java.util.*;

public class ConditionalAssignment
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        input.close();
        String val = (s.equalsIgnoreCase("Filkom"))? "Brawijaya" : "null";
        System.out.println(s + ' ' + val);
    }
}