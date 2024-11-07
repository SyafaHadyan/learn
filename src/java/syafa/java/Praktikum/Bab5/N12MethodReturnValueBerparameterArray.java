package syafa.java.Praktikum.Bab5;

public class N12MethodReturnValueBerparameterArray
{
    public static void main(String[] args)
    {
        int[] arr = {2, 7, 5, 19, 4, 11, 3, 27, 17, 10};
        arr = sortBesarKecil(arr);
        System.out.println("Sort besar ke kecil");
        for (int i = 0; i < arr.length; i++)
        {
            System.out.println("Index ke " + (i + 1) + " : " + arr[i]);
        }
        arr = sortKecilBesar(arr);
        System.out.print("Sort kecil ke besar");
        for (int i = 0; i < arr.length; i++)
        {
            System.out.print("\n");
            System.out.print("Index ke " + (i + 1) + " : " + arr[i]);
        }
    }
    private static int[] sortBesarKecil(int[] acak)
    {
        int bil1 = 0;
        int bil2 = 0;
        while (bil1 < acak.length)
        {
            bil2 = bil1;
            while (bil2 < acak.length)
            {
                if (acak[bil1] < acak[bil2])
                {
                    int temp = acak[bil1];
                    acak[bil1] = acak[bil2];
                    acak[bil2] = temp;
                }
                bil2++;
            }
            bil1++;
        }
        return acak;
    }
    private static int[] sortKecilBesar(int[] array)
    {
        for (int i = 0; i < array.length; i++)
        {
            for (int j = 0; j < array.length; j++)
            {
                if (array[i] > array[j])
                {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }
}