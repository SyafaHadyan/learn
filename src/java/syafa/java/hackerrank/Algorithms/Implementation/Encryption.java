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
        char[][] encrypted = new char[arrayRow][arrayCol];
        for (int i = 0; i < encrypted.length; i++)
        {
            for (int j = 0; j < encrypted[i].length; j++)
            {
                encrypted[i][j] = encrypt.charAt((i + 1) * j);
            }
        }
    }
}