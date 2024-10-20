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
         * clu hlt io
         * clu hlt io
         * 
         * fto ehg ee dd
         * fto ehg ee dd
         * 
         */
        Scanner input = new Scanner(System.in);
        String encrypt = input.nextLine();
        input.close();
        int encryptCounter = 0;
        int arrayRow = (int)Math.floor(Math.sqrt(encrypt.length()));
        int arrayCol = (int)Math.ceil(Math.sqrt(encrypt.length()));
        if (arrayRow * arrayCol < 8)
        {
            arrayRow = 3;
            arrayCol = 3;
        }
        String[][] encrypted = new String[arrayRow][arrayCol];
        for (int i = 0; i < encrypted.length; i++)
        {
            for (int j = 0; j < encrypted[0].length; j++)
            {
                try
                {
                    encrypted[i][j] = String.valueOf(encrypt.charAt(encryptCounter));
                    encryptCounter++;
                }
                catch (IndexOutOfBoundsException e)
                {
                    //
                }
            }
        }
        for (int i = 0; i < encrypted[0].length; i++)
        {
            for (int j = 0; j < encrypted.length; j++)
            {
                try
                {
                    if (encrypted[j][i] != null)
                    {
                        System.out.print(encrypted[j][i]);
                    }
                }
                catch (Exception e)
                {
                    //
                }
            }
            if (encrypted[0].length - i != 1)
            {
                System.out.print(' ');
            }
        }
    }
}