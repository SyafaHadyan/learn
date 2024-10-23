package syafa.java.Praktikum.Bab4;
import java.util.*;
import java.util.stream.*;

public class Praktikum0
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        ArrayList<String> data = new ArrayList<>();
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
                        data.clear();
                        data.addAll(Arrays.asList(input.nextLine().split(" ")));
                        break;
                    case 2:
                        System.out.print("\n");
                        for (int i = 0; i < data.size(); i++)
                        {
                            System.out.println(data.get(i));
                        }
                        System.out.print("\n");
                        break;
                    case 3:
                        double[] tempDoubleAverage = new double[data.size()];
                        for (int i = 0; i < data.size(); i++)
                        {
                            tempDoubleAverage[i] = Double.parseDouble(data.get(i));
                        }
                        System.out.printf("\n%.5f\n\n",(DoubleStream.of(tempDoubleAverage).sum() / tempDoubleAverage.length));
                        break;
                    case 4:
                        double[] tempDoubleSum = new double[data.size()];
                        for (int i = 0; i < data.size(); i++)
                        {
                            tempDoubleSum[i] = Double.parseDouble(data.get(i));
                        }
                        System.out.printf("\n%.5f\n\n",(DoubleStream.of(tempDoubleSum).sum() / tempDoubleSum.length));
                        break;
                    case 5:
                        Collections.sort(data);
                        try
                        {
                            System.out.printf("\n%d\n\n",Integer.parseInt(data.get(data.size() - 1)));
                        }
                        catch (NumberFormatException e)
                        {
                            System.out.printf("\n%.5f\n\n",Double.parseDouble(data.get(data.size() - 1)));
                        }
                        break;
                    case 6:
                        Collections.sort(data);
                        try
                        {
                            System.out.printf("\n%d\n\n",Integer.parseInt(data.get(0)));
                        }
                        catch (NumberFormatException e)
                        {
                            System.out.printf("\n%.5f\n\n",Double.parseDouble(data.get(0)));
                        }
                        break;
                }
            }
            else if (option == 7)
            {
                input.close();
                System.exit(0);
            }
            else
            {
                repeat = true;
            }
        }
    }
}