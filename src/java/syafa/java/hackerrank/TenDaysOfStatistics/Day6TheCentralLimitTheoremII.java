package syafa.java.hackerrank.TenDaysOfStatistics;
import java.util.*;

public class Day6TheCentralLimitTheoremII
{
    public static double erf(double z)
    {
        double t = 1.0 / (1.0 + 0.5 * Math.abs(z));
        double ans = 1 - t * Math.exp( -z*z   -   1.26551223 +
                                            t * ( 1.00002368 +
                                            t * ( 0.37409196 +
                                            t * ( 0.09678418 +
                                            t * (-0.18628806 +
                                            t * ( 0.27886807 +
                                            t * (-1.13520398 +
                                            t * ( 1.48851587 +
                                            t * (-0.82215223 +
                                            t * ( 0.17087277))))))))));
        if (z >= 0) return  ans;
        else        return -ans;
    }
    public static void main(String[] args)
    {
        /*
         * 250
         * 100
         * 2.4
         * 2.0
         */
        Scanner input = new Scanner(System.in);
        double availableTicket = Double.parseDouble(input.nextLine());
        double amountOfStudents = Double.parseDouble(input.nextLine());
        double ticketPurchaseMean = Double.parseDouble(input.nextLine());
        double standardDeviation = Double.parseDouble(input.nextLine());
        input.close();
        double std = Math.sqrt(amountOfStudents) * standardDeviation;
        double m = amountOfStudents * ticketPurchaseMean;
        double result = (1 + erf((availableTicket - m) / (std * Math.sqrt(2.0)))) / 2.0;
        System.out.printf("%.4f",result);
    }
}