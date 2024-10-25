package syafa.java.codex2024;
import java.util.*;

public class ManajemenAntrianVaksinasi
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int operation = Integer.parseInt(input.nextLine());
        ArrayList<String> operationResult = new ArrayList<>();
        ArrayList<Integer> patientRegister = new ArrayList<>();
        for (int i = 0; i < operation; i++)
        {
            String temp = input.nextLine();
            if (temp.contains("DAFTAR"))
            {
                patientRegister.add(Integer.parseInt(temp.replace("DAFTAR ","")));
            }
            else if (temp.equalsIgnoreCase("LAYANI"))
            {
                patientRegister.remove(patientRegister.getFirst());
            }
            else if (temp.equalsIgnoreCase("CEKDEPAN"))
            {
                if (patientRegister.size() != 0)
                {
                    operationResult.add(String.valueOf(patientRegister.getFirst()));
                    continue;
                }
                operationResult.add("ANTRIAN KOSONG");
            }
        }
        input.close();
        for (int i = 0; i < operationResult.size(); i++)
        {
            System.out.print(operationResult.get(i));
            if (operationResult.size() - i != 1)
            {
                System.out.print("\n");
            }
        }
    }
}