import java.util.*;

public class Learn02 {
    public static void main(String args[]) throws Exception {
        Scanner input = new Scanner(System.in);
        
        // Read the first integer
        int first = input.nextInt();
        
        // Read the second integer
        int second = input.nextInt();
        
        // Perform arithmetic operations and print the results
        System.out.printf("%-25s%-1c%-1c%1.0d\n", "Hasil penjumlahan", ':', ' ', first + second);
        System.out.printf("%-25s%-1c%-1c%1.0d\n", "Hasil pengurangan", ':', ' ', first - second);
        System.out.printf("%-25s%-1c%-1c%1.0d\n", "Hasil perkalian", ':', ' ', first * second);
        System.out.printf("%-25s%-1c%-1c%1.1d", "Hasil pembagian", ':', ' ', first / second);
        
        // Close the Scanner object
        input.close();
    }
}