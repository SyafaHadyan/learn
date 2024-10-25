package syafa.java.codex2024;
import java.util.*;

public class ManajemenDaftarTugas
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int operation = Integer.parseInt(input.nextLine());
        ArrayList<String> taskList = new ArrayList<>();
        ArrayList<String> result = new ArrayList<>();
        for (int i = 0; i < operation; i++)
        {
            String temp = input.nextLine();
            if (temp.contains("TAMBAH"))
            {
                taskList.add(temp.replace("TAMBAH ",""));
            }
            else if (temp.contains("HAPUS"))
            {
                taskList.remove(Integer.parseInt(temp.replace("HAPUS ","")) - 1);
            }
            else if (temp.contains("CEKLIS"))
            {
                try
                {
                    result.add(taskList.get(Integer.parseInt(temp.replace("CEKLIS ","")) - 1));
                }
                catch (IndexOutOfBoundsException e)
                {
                    result.add("TIDAK ADA TUGAS");
                }
            }
            else if (temp.equalsIgnoreCase("CEKSEMUA"))
            {
                StringBuilder tempCheck = new StringBuilder();
                if (taskList.isEmpty())
                {
                    result.add("TIDAK ADA TUGAS");
                    continue;
                }
                for (int j = 0; j < taskList.size(); j++)
                {
                    tempCheck.append(taskList.get(j));
                    if (taskList.size() - j != 1)
                    {
                        tempCheck.append(" ");
                    }
                }
                result.add(String.valueOf(tempCheck));
            }
        }
        input.close();
        for (int i = 0; i < result.size(); i++)
        {
            System.out.print(result.get(i));
            if (result.size() - i != 1)
            {
                System.out.print("\n");
            }
        }
    }
}