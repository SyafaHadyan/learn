package syafa.java.Praktikum.Bab4;
import java.util.*;

public class Praktikum0
{
    /*
    static class sortArray
    {
        public static double[] bubbleSortDouble(double[] array)
        {
            for (int i = 0; i < array.length - 1; i++)
            {
                for (int j = 0; j < array.length - i - 1; j++)
                {
                    if (array[j] > array[j + 1])
                    {
                        double temp = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = temp;
                    }
                }
            }
            return array;
        }
        public static int[] bubbleSortInteger(int[] array)
        {
            for (int i = 0; i < array.length - 1; i++)
            {
                for (int j = 0; j < array.length - i - 1; j++)
                {
                    if (array[j] > array[j + 1])
                    {
                        int temp = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = temp;
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
        public static double getMinDouble(double[] array)
        {
            return array[0];
        }
        public static int getMinInteger(int[] array)
        {
            return array[0];
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
                    return true;
                }
            }
            return false;
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
    */
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        //ArrayList<String> data = new ArrayList<>();
        double[] dataInput = new double[1000];
        int dataAmount = 0;
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
                        data.clear();
                        data.addAll(Arrays.asList(input.nextLine().split(" ")));
                        */
                        System.out.printf("%-35s%-2c",String.valueOf("Masukkan jumlah data (1 -" + " " + dataInput.length + ")"),':');
                        dataAmount = Integer.parseInt(input.nextLine());
                        for (int i = 0; i < dataAmount; i++)
                        {
                            dataInput[i] = Double.parseDouble(input.next());
                        }
                        input.nextLine();
                        break;
                    case 2:
                        System.out.print("\n");
                        for (int i = 0; i < dataAmount; i++)
                        {
                            System.out.println(dataInput[i]);
                        }
                        System.out.print("\n");
                        break;
                    case 3:
                        double tempDoubleAverage = 0d;
                        for (int i = 0; i < dataAmount; i++)
                        {
                            tempDoubleAverage += dataInput[i];
                        }
                        System.out.printf("\n%.5f\n\n",(tempDoubleAverage / Double.parseDouble(String.valueOf(dataAmount))));
                        break;
                    case 4:
                        double tempDoubleSum = 0d;
                        for (int i = 0; i < dataAmount; i++)
                        {
                            tempDoubleSum += dataInput[i];
                        }
                        System.out.printf("\n%.5f\n\n",(tempDoubleSum));
                        break;
                        /*try
                        {
                            int[] tempIntegersum = new int[data.size()];
                            for (int i = 0; i < data.size(); i++)
                            {
                                tempIntegersum[i] = Integer.parseInt(data.get(i));
                            }
                            System.out.printf("\n%d\n\n",(IntStream.of(tempIntegersum).sum()));
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
                        */
                    case 5:
                        for (int i = 0; i < dataAmount; i++)
                        {
                            for (int j = 0; j < dataAmount - i - 1; j++)
                            {
                                if (dataInput[j] > dataInput[j + 1])
                                {
                                    double temp = dataInput[j];
                                    dataInput[j] = dataInput[j + 1];
                                    dataInput[j + 1] = temp;
                                }
                            }
                        }
                        System.out.printf("\n%.5f\n\n",dataInput[dataAmount - 1]);
                        break;
                        /*
                        if (checkDataType.isDouble(data))
                        {
                            System.out.printf("\n%.5f\n\n",sortArray.getMaxDouble(((sortArray.bubbleSortDouble(checkDataType.convertArrayDouble(data))))));
                            break;
                        }
                        System.out.printf("\n%d\n\n",sortArray.getMaxInteger(((sortArray.bubbleSortInteger(checkDataType.convertArrayInteger(data))))));
                        break;
                        */
                    case 6:
                        for (int i = 0; i < dataAmount; i++)
                        {
                            for (int j = 0; j < dataAmount - i - 1; j++)
                            {
                                if (dataInput[j] > dataInput[j + 1])
                                {
                                    double temp = dataInput[j];
                                    dataInput[j] = dataInput[j + 1];
                                    dataInput[j + 1] = temp;
                                }
                            }
                        }
                        System.out.printf("\n%.5f\n\n",(dataInput[0]));
                        break;
                        /*
                        if (checkDataType.isDouble(data))
                        {
                            System.out.printf("\n%.5f\n\n",sortArray.getMinDouble(((sortArray.bubbleSortDouble(checkDataType.convertArrayDouble(data))))));
                            break;
                        }
                        System.out.printf("\n%d\n\n",sortArray.getMinInteger(((sortArray.bubbleSortInteger(checkDataType.convertArrayInteger(data))))));
                        break;
                        */
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