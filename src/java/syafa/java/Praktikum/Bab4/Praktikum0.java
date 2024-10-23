package syafa.java.Praktikum.Bab4;
import java.util.*;
import java.util.stream.*;

public class Praktikum0
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        /*Create ArrayList inside of ArrayList */
        ArrayList<ArrayList<Double>> inputData = new ArrayList<>();
        int option = 0;
        boolean repeat = true;
        String[] menu =
        {
            "Input Data",
            "Lihat Data",
            "Average",
            "Sum",
            "Max",
            "Min",
            "Keluar"
        };
        while (repeat)
        {
            for (int i = 0; i < menu.length; i++)
            {
                System.out.printf("%d%-2c%s",(i + 1),'.',menu[i]);
                if (menu.length - i != 1)
                {
                    System.out.print("\n");
                    continue;
                }
                System.out.printf("\n%-20s%-2c","Masukkan nilai",':');
                option = Integer.parseInt(input.nextLine());
            }
            repeat = false;
            if (option >= 1 && option <=6)
            {
                repeat = true;
                switch (option)
                {
                    case 1:
                        /*
                         * Clear existing values of inputData
                         * Create new ArrayList
                         * Put values of separated numbers (from string split by space)
                         * Turn into double
                         * Turn into list
                         * Put values from new ArrayList to inputData
                         * 
                         * Source: SO
                         */
                        inputData.clear();
                        inputData.add(new ArrayList<>(Arrays.asList(Stream.of(input.nextLine().split(" ")).mapToDouble(Double::parseDouble).boxed().toArray(Double[]::new))));
                        break;
                    case 2:
                        for (int i = 0; i < inputData.size(); i++)
                        {
                            System.out.print(inputData.get(i));
                            if (inputData.size - i != 1)
                            {
                                System.out.print("\n");
                            }
                        }
                    default:
                        repeat = true;
                }
            }
            else if (option == 7)
            {
                input.close();
                System.exit(0);
            }
        }
        input.close();
    }
}