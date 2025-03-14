package syafa.java.hackerrank.utp2023.tifd;
import java.util.*;
import java.util.stream.*;

public class Promo1010
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        int[] purchaseCoffee = Stream.of(input.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        input.close();
        int counter = 0;
        double totalPrice = 0d;
        double discount = 0d;
        double extraDiscount = 0d;
        double kopiAmericano = 20000d;
        double kopiSusu = 28000d;
        double kopiVietnam = 23000d;
        double kopiCappucino = 31000d;
        double kopiMochaRum = 35000d;
        while (counter < purchaseCoffee.length)
        {
            if (counter == 0)
            {
                if (purchaseCoffee[counter] > 3)
                {
                    discount += 0.05 * (purchaseCoffee[counter] * kopiAmericano);
                    totalPrice += purchaseCoffee[counter] * kopiAmericano;
                    kopiAmericano = 0.95 * (purchaseCoffee[counter] * kopiAmericano);
                }
                else if (purchaseCoffee[counter] > 0)
                {
                    totalPrice += kopiAmericano * purchaseCoffee[counter];
                    kopiAmericano = kopiAmericano * purchaseCoffee[counter];
                }
                else
                {
                    kopiAmericano = 0;
                }
                counter++;
            }
            else if (counter == 1)
            {
                if (purchaseCoffee[counter] > 2)
                {
                    discount += 0.08 * (purchaseCoffee[counter] * kopiSusu);
                    totalPrice += purchaseCoffee[counter] * kopiSusu;
                    kopiSusu = 0.92 * (purchaseCoffee[counter] * kopiSusu);
                }
                else if (purchaseCoffee[counter] > 0)
                {
                    totalPrice += kopiSusu * purchaseCoffee[counter];
                    kopiSusu = kopiSusu * purchaseCoffee[counter];
                }
                else
                {
                    kopiSusu = 0;
                }
                counter++;
            }
            else if (counter == 2)
            {
                if (purchaseCoffee[counter] > 4)
                {
                    discount += 0.12 * (purchaseCoffee[counter] * kopiVietnam);
                    totalPrice += purchaseCoffee[counter] * kopiVietnam;
                    kopiVietnam = 0.88 * (purchaseCoffee[counter] * kopiVietnam);
                }
                else if (purchaseCoffee[counter] > 0)
                {
                    totalPrice += kopiVietnam * purchaseCoffee[counter];
                    kopiVietnam = kopiVietnam * purchaseCoffee[counter];
                }
                else
                {
                    kopiVietnam = 0;
                }
                counter++;
            }
            else if (counter == 3)
            {
                if (purchaseCoffee[counter] > 0)
                {
                    totalPrice += kopiCappucino * purchaseCoffee[counter];
                    kopiCappucino = kopiCappucino * purchaseCoffee[counter];
                }
                else
                {
                    kopiCappucino = 0;
                }
                counter++;
            }
            else if (counter == 4)
            {
                if (purchaseCoffee[counter] > 2)
                {
                    discount += 10000;
                    totalPrice += kopiMochaRum * purchaseCoffee[counter];
                    kopiMochaRum = (kopiMochaRum * purchaseCoffee[counter]) - 10000;
                }
                else if (purchaseCoffee[counter] > 0)
                {
                    totalPrice += kopiMochaRum * purchaseCoffee[counter];
                    kopiMochaRum = kopiMochaRum * purchaseCoffee[counter];
                }
                else
                {
                    kopiMochaRum = 0;
                }
                counter++;
            }
            if ((totalPrice - discount) >= 250000)
            {
                extraDiscount = 0.10 * (totalPrice - discount);
            }
        }
        System.out.printf("%-12s%-13s%-2c%s%.1f\n","Harga total","americano",':',"Rp",kopiAmericano);
        System.out.printf("%-12s%-13s%-2c%s%.1f\n","Harga total","kopi susu",':',"Rp",kopiSusu);
        System.out.printf("%-12s%-13s%-2c%s%.1f\n","Harga total","kopi vietnam",':',"Rp",kopiVietnam);
        System.out.printf("%-12s%-13s%-2c%s%.1f\n","Harga total","cappucino",':',"Rp",kopiCappucino);
        System.out.printf("%-12s%-13s%-2c%s%.1f\n","Harga total","mocha rum",':',"Rp",kopiMochaRum);
        System.out.println("=====================================");
        System.out.printf("%-25s%-2c%s%.1f\n","Total harga pesanan",':',"Rp",(totalPrice - discount));
        System.out.printf("%-25s%-2c%s%.1f\n","Harga yang harus dibayar",':',"Rp",(totalPrice - (discount + extraDiscount)));
    }
}