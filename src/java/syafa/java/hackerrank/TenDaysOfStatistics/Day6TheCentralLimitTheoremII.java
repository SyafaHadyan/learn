package syafa.java.hackerrank.TenDaysOfStatistics;
import java.util.*;
import java.math.*;
import java.math.MathContext;

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
    @SuppressWarnings("unused")
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
        double tempResult = Math.sqrt(amountOfStudents) * standardDeviation;
        double result = (1 + (amountOfStudents * Math.) )/ 2;
    }
}