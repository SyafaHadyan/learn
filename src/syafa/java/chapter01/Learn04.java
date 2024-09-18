import java.util.*;

public class Learn04
{
    public static void main(String[] args)
    {
    Scanner Input = new Scanner(System.in);
    double MealCost = Double.parseDouble(Input.nextLine());
    double TipPercent = Integer.parseInt(Input.nextLine());
    double TaxPercent = Integer.parseInt(Input.nextLine());
    double Tip = TipPercent / 100 * MealCost;
    double Tax = TaxPercent / 100 * MealCost;
    double TotalCost = MealCost + Tip + Tax;
    TotalCost = Math.round(TotalCost);
    System.out.printf("%.0f",TotalCost);
    Input.close();
    }
}