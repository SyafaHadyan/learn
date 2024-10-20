package syafa.java.hackerrank.Algorithms.Strings;
import java.util.*;

public class MakingAnagrams
{
    public static void main(String[] args)
    {
        /*
         * cde
         * abc
         * 
         * 4
         * 
         * cde > delete d, e > c
         * abc > delete a, b > c
         * deletions = 4
         * 
         * abc
         * amnop
         * 
         * 6
         * 
         * abc > delete b, c > a
         * amnop > delete m, n, o, p > a
         * deletions = 6
         * 
         * # Step
         * 
         * ## Sort array char
         * 
         * determine shortest char to prevent a full deletion
         * 
         * abc
         * amnop
         * 
         * if i firstChar != i secondChar > delete firstChar[i] && secondChar[i]
         * 
         * ac
         * anop
         * 
         * delete firstChar[i] && secondChar[i]
         * a
         * anop
         * 
         * delete secondChar[i]
         * a
         * aop
         * 
         * delete secondChar[i]
         * a
         * ap
         * 
         * delete secondChar[i]
         * a
         * a
         * 
         * total deletions = 6
         * 
         * 
         */
        Scanner input = new Scanner(System.in);
        ArrayList<String> firstString = new ArrayList<>(Arrays.asList(input.nextLine().split("")));
        ArrayList<String> secondString = new ArrayList<>(Arrays.asList(input.nextLine().split("")));
        input.close();
    }
}