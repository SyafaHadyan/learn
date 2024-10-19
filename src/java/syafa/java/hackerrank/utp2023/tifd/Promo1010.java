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
    }
}