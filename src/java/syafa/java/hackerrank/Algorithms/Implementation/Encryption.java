package syafa.java.hackerrank.Algorithms.Implementation;
import java.util.*;

public class Encryption
{
    public static void main(String[] args)
    {
        /*
         * haveaniceday
         * 
         * sqrt input is 3.46...
         * arr row = Math.floor sqrt input = 3
         * arr col = Math.ceil sqrt input = 4
         * 
         * have
         * anic
         * eday
         * 
         * output = hae and via ecy
         * 
         * 
         * feedthedog
         * 
         * sqrt input = 3.16...
         * arr row = Math.floor sqrt input = 3
         * arr col = Math.ceil sqrt input = 4
         * 
         * feed
         * thed
         * og
         * 
         * output = fto ehg ee dd
         * 
         */
        Scanner input = new Scanner(System.in);
        String encrypt = input.nextLine();
        input.close();
        int arrayRow = (int)Math.floor(Math.sqrt(encrypt.length()));
        int arrayCol = (int)Math.ceil(Math.sqrt(encrypt.length()));
    }
}