package syafa.java.learn.chapter2;
import java.util.*;

public class FahrenheitToCelcius
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        double fahrenheit = Double.parseDouble(input.nextLine());
        input.close();
        double celcius = (5 / 9) * (fahrenheit- 32);
        System.out.printf("%-20c%-2c%.5f","Celcius",':',celcius);
    }
}