package syafa.java.Praktikum.Bab4;
import java.util.*;

public class Praktikum1
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int option = 0;
        int passengerAmount = 0;
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
            {"Ekonomi","Bisnis","Eksekutif","Pariwisata"},
            {"50000","100000","200000","300000"},
            {"2","5","7","10"},
            {"Tidak ada","Ada","Ada","Ada"},
            {"Tidak ada","Tidak ada","Tidak ada","Ada"}
        };
        String[] menu =
        {
            "Melihat Daftar Kereta Api",
            "Melihat Daftar Kereta Api yang ada AC",
            "Melihat Daftar Kereta Api yang ada Colokan",
            "Memesan Tikat Kereta Api",
            "Melihat Pesanan Tiket"
        };
        /*
        ArrayList<String> passengerName = new ArrayList<>();
        ArrayList<Integer> ticketPrice = new ArrayList<>();
        ArrayList<Double> discountedTicketPrice = new ArrayList<>();
        */
        String[] passengerName = new String[5];
        int[] ticketPrice = new int[5];
        Double[] discountedTicketPrice = new Double[5];
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
                                System.out.printf("%-20s", j == 2 ? String.valueOf((data[j][i]) + " %") : data[j][i]);
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
                            System.out.printf("%-20s",(i == 0 ? tableHeader[0] : tableHeader[3]));
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
                            System.out.printf("%-20s",(i == 0 ? tableHeader[0] : tableHeader[4]));
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
                        int tempPreviousPassengerAmount = passengerAmount;
                        passengerAmount += Integer.parseInt(input.nextLine());
                        System.out.printf("\n%s\n%s\n","Masukkan nama penumpang dan jenis tiket (Nama Jenis)","Contoh:\nDengklek\nPariwisata\n");
                        for (int i = tempPreviousPassengerAmount; i < passengerAmount; i++)
                        {
                            System.out.println("Data penumpang ke" + ' ' + (i + 1) + ':');
                            passengerName[i] = input.nextLine();
                            boolean tempValidTicketType = false;
                            while (!tempValidTicketType)
                            {
                                String tempTicketType = input.nextLine();
                                for (int j = 0; j < data[0].length; j++)
                                {
                                    if (tempTicketType.equalsIgnoreCase(data[0][j]))
                                    {
                                        {
                                            //ticketPrice.add(Integer.parseInt(data[1][j]));
                                            ticketPrice[i] = Integer.parseInt(data[1][j]);
                                            //discountedTicketPrice.add(((100 - Double.parseDouble(data[2][j])) * Double.parseDouble(data[1][j])) / 100);
                                            discountedTicketPrice[i] = ((100 - Double.parseDouble(data[2][j])) * Double.parseDouble(data[1][j])) / 100;
                                            tempValidTicketType = true;
                                            break;
                                        }
                                    }
                                }
                                if (!tempValidTicketType)
                                {
                                    //System.out.println("Jenis tiket yang anda masukkan salah, silahkan masukkan kembali jenis tiket untuk penumpang" + ' ' + passengerName.getLast());
                                    System.out.println("Jenis tiket yang anda masukkan salah, silahkan masukkan kembali jenis tiket untuk penumpang" + ' ' + passengerName[i]);
                                }
                            }
                        }
                        break;
                    case 5:
                        if (passengerAmount == 0)
                        {
                            System.out.println("Anda belum memesan tiket");
                            break;
                        }
                        System.out.printf("%-40s%-20s%s\n","Nama Penumpang","Harga Tiket","Harga Setelah Diskon");
                        for (int i = 0; i < 80; i++)
                        {
                            System.out.print('=');
                        }
                        System.out.print("\n");
                        for (int i = 0; i < passengerAmount; i++)
                        {
                            System.out.printf("%-40s%-20d%.5f\n",passengerName[i],ticketPrice[i],discountedTicketPrice[i]);
                        }
                        double tempTotalDiscountedPriceSum = 0d;
                        for (double tempTotalDiscountedTicketPrice : discountedTicketPrice)
                        {
                            tempTotalDiscountedPriceSum += tempTotalDiscountedTicketPrice;
                        }
                        System.out.printf
                        (
                            "%-60s%.5f\n",
                            String.valueOf("Total penumpang" + ':' + ' ' + passengerAmount),
                            tempTotalDiscountedPriceSum
                        );
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
                input.close();
                System.exit(0);
            }
        }
    }
}