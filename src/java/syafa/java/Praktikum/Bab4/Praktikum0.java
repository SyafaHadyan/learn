package syafa.java.Praktikum.Bab4;
import java.util.*;
import java.util.stream.*;

public class Praktikum0
{
    static class sortArray
    {
        public static double[] bubbleSortDouble(double[] array)
        {
            boolean sorted = false;
            while (!sorted)
            {
                for (int i = 0; i < array.length; i++)
                {
                    if (array[i] < array[i - 1])
                    {
                        double tempStore = array[i];
                        array[i] = array[i - 1];
                        array[i - 1] = tempStore;
                        sorted = false;
                    }
                }
            }
            return array;
        }
        public static int[] bubbleSortInteger(int[] array)
        {
            boolean sorted = false;
            while (!sorted)
            {
                for (int i = 0; i < array.length; i++)
                {
                    if (array[i] < array[i - 1])
                    {
                        int tempStore = array[i];
                        array[i] = array[i - 1];
                        array[i - 1] = tempStore;
                        sorted = false;
                    }
                }
            }
            return array;
        }
        public static double getMaxDouble(double[] array)
        {
            return array[array.length - 1];
        }
        public static int getMaxInteger(int[] array)
        {
            return array[array.length - 1];
        }
    }
    static class checkDataType
    {
        public static boolean isDouble(ArrayList<String> arrayString)
        {
            for (int i = 0; i < arrayString.size(); i++)
            {
                try
                {
                    Integer.parseInt(arrayString.get(i));
                }
                catch (NumberFormatException e)
                {
                    return false;
                }
            }
            return true;
        }
        public static double[] convertArrayDouble(ArrayList<String> arrayString)
        {
            double[] convertedArray = new double[arrayString.size()];
            for (int i = 0; i < convertedArray.length; i++)
            {
                convertedArray[i] = Double.parseDouble(arrayString.get(i));
            }
            return convertedArray;
        }
        public static int[] convertArrayInteger(ArrayList<String> arrayString)
        {
            int[] convertedArray = new int[arrayString.size()];
            for (int i = 0; i < convertedArray.length; i++)
            {
                convertedArray[i] = Integer.parseInt(arrayString.get(i));
            }
            return convertedArray;
        }
    }
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
                        try
                        {
                            int[] tempIntegersum = new int[data.size()];
                            for (int i = 0; i < data.size(); i++)
                            {
                                tempIntegersum[i] = Integer.parseInt(data.get(i));
                            }
                            System.out.printf("\n%.5f\n\n",(IntStream.of(tempIntegersum).sum()));
                        }
                        catch (NumberFormatException e)
                        {
                            double[] tempDoubleSum = new double[data.size()];
                            for (int i = 0; i < data.size(); i++)
                            {
                                tempDoubleSum[i] = Double.parseDouble(data.get(i));
                            }
                            System.out.printf("\n%.5f\n\n",(DoubleStream.of(tempDoubleSum).sum()));
                        }
                        break;
                    case 5:
                        if (checkDataType.isDouble(data))
                        {
                            System.out.printf("\n%.5f\n\n",sortArray.getMaxDouble(((sortArray.bubbleSortDouble(checkDataType.convertArrayDouble(data))))));
                            break;
                        }
                        System.out.printf("\n%.5f\n\n",sortArray.getMaxInteger(((sortArray.bubbleSortInteger(checkDataType.convertArrayInteger(data))))));
                        break;
                    case 6:
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