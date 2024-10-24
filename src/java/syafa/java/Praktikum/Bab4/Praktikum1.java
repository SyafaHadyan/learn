package syafa.java.Praktikum.Bab4;
import java.util.*;

public class Praktikum1
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int option = 0;
        boolean repeat = true;
        String[] tableHeader =
        {
            "Jenis",
            "Harga",
            "Diskon",
            "AC",
            "Colokan"
        };
        String[][] data =
        {
            {"Ekonomi", "Bisnis", "Eksekutif", "Pariwisata"},
            {"50000", "100000", "200000", "300000"},
            {"2", "5", "7", "10"},
            {"Tidak ada", "Ada", "Ada", "Ada"},
            {"Tidak ada", "Tidak ada", "Tidak ada", "Ada"}
        };
        String[] menu =
        {
            "Melihat Daftar Kereta Api",
            "Melihat Daftar Kereta Api yang ada AC",
            "Melihat Daftar Kereta Api yang ada Colokan",
            "Memesan Tikat Kereta Api",
            "Melihat Pesanan Tiket"
        };
        ArrayList<String> ticketBook = new ArrayList<>();
        while (repeat)
        {
            repeat = false;
            for (int i = 0; i < menu.length; i++)
            {
                System.out.printf("%d%-2c%s",(i + 1),'.',menu[i]);
                if (menu.length - i != 1)
                {
                    System.out.print("\n");
                    continue;
                }
                System.out.printf("\n%d%-2c%s",0,'.',"Keluar");
                System.out.printf("\n%-20s%-2c","Masukkan nilai",':');
                option = Integer.parseInt(input.nextLine());
            }
            if (option >= 1 && option <= 5)
            {
                repeat = true;
                switch (option)
                {
                    case 1:
                    /*
                     * Ekonomi             50000               2                   Tidak ada           Tidak ada
                     */
                        for (int i = 0; i < tableHeader.length; i++)
                        {
                            System.out.printf("%-20s",tableHeader[i]);
                            if (data.length - i != 1)
                            {
                                continue;
                            }
                            System.out.print("\n");
                            for (int j = 0; j < 90; j++)
                            {
                                System.out.print('=');
                            }
                            System.out.print("\n");
                        }
                        for (int i = 0; i < data[0].length; i++)
                        {
                            for (int j = 0; j < data.length; j++)
                            {
                                System.out.printf("%-20s",data[j][i]);
                                if (data.length - j != 1)
                                {
                                    continue;
                                }
                                System.out.print("\n");
                            }
                        }
                        break;
                    case 2:
                        for (int i = 0; i < 2; i++)
                        {
                            System.out.printf("%-20s",(i == 0 ? "Jenis" : "AC"));
                        }
                        System.out.print("\n");
                        for (int i = 0; i < 36; i++)
                        {
                            System.out.print('=');
                        }
                        System.out.print("\n");
                        for (int i = 0; i < data[0].length; i++)
                        {
                            for (int j = 0; j < 4; j += 3)
                            {
                                System.out.printf("%-20s",data[j][i]);
                            }
                            if (data.length - i != 1)
                            {
                                System.out.print("\n");
                            }
                        }
                        break;
                    case 3:
                        for (int i = 0; i < 2; i++)
                        {
                            System.out.printf("%-20s",(i == 0 ? "Jenis" : "Colokan"));
                        }
                        System.out.print("\n");
                        for (int i = 0; i < 36; i++)
                        {
                            System.out.print('=');
                        }
                        System.out.print("\n");
                        for (int i = 0; i < data[0].length; i++)
                        {
                            for (int j = 0; j < 5; j += 4)
                            {
                                System.out.printf("%-20s",data[j][i]);
                            }
                            if (data.length - i != 1)
                            {
                                System.out.print("\n");
                            }
                        }
                        break;
                    case 4:
                        System.out.printf("%-40s%-2c","Masukkan jumlah tiket yang akan dipesan",':');
                        int ticketAmount = Integer.parseInt(input.nextLine());
                        for (int i = 0; i < ticketAmount; i++)
                        {
                            System.out.printf("\n%s%\n%s","Masukkan nama penumpang dan jenis tiket (Nama Jenis)","Contoh: Dengklek\nPariwisata");
                            String tempPassengerName = input.nextLine();
                            String tempPassengerTicketBook = input.nextLine();
                        }
                        break;
                    case 5:
                        //
                        break;
                }
            }
            else if (option == 0)
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