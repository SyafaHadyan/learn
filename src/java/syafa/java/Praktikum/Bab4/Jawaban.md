# Bab 4 - Array

## Array 1D

### 1. Jelaskan dan perbaiki jika menemui kesalahan

Kesalahan pada `i+` yang seharusnya `i++`.

### 2. Jalankan kelas `Array1` dan benahi jika menemukan kesalahan

Iterasi 10 kali (mulai dari 0 sampai 9) dan elemen ke-`i` dari `bil[]` akan diisi dengan $1+(Random)\space\text{antara}\space0.0\space\text{hingga}\space1.0$ menggunakan `Math.random()` yang akan menggenerate `double` antara `0.0` hingga `1.0` kemudian dikali dengan `100` yang hasilnya di `cast` menjadi `int` yang disimpan pada `bil[i]`.

### 3. Pada baris ketiga, hapus angka `10` kemudian amati apa yang terjadi dan jelaskan

Kode tidak akan bisa berjalan karena ukuran `int[]` tidak diinisialisasi.

### 4. Pada baris 5, kode tersebut diubah menjadi `for (i = 2; i <= 8; i++)` kemudian amati apa yang terjadi dan jelaskan

Karena `i` mulai dari 2 hingga 8, maka `bil[]` hanya akan diisi mulai dari 2 hingga 8 dengan `Math.random() * 100` dan elemen yang lainnya nilainya 0.

### 5. Pada baris 5 – 7, jelaskan arti dari kode tersebut dan bila kode tersebut diubah menjadi `bil[i] = 1 + (Math.random() * 100);` kemudian amati apa yang terjadi dan jelaskan

#### `For-loop` pertama

Karena tidak ada cast ke `int` dan tipe data dari `bil[]` adalah `int`, maka kode tidak bisa berjalan karena tidak bisa convert `double` ke `int`. kecuali tipe data `bil[]` diubah menjadi `double`.

#### `For-loop` kedua

Pada `for-loop` kedua digunakan untuk `print` seluruh nilai dari `bil[]`

### 6. Pada baris 8, kode tersebut diubah menjadi `for (i = 0;i <= 10; i++)` kemudian amati apa yang terjadi dan jelaskan

Pada saat kode akan mengakses elemen ke 10, Java akan `throw` [`IndexOutOfBoundsException`](https://docs.oracle.com/javase/8/docs/api/java/lang/IndexOutOfBoundsException.html) karena elemen yang akan diakses diluar range dari `bil[]`

## Array 2D

### 7. Jalankan kelas Array2 dan benahi jika menemukan kesalahan

Tidak ada kesalahan

### 8. Pada baris 5, syntax `int[][] coba` diganti `int coba[][]` amati yang terjadi dan jelaskan

Tidak ada yang berubah karena keduanya sama

### 9. Pada baris 6, syntax `double[][] bank` diganti `float bank[]` dan amati apa yang terjadi, jelaskan

Kode akan error karena array menjadi 1D dan error pada `for` ke 2 karena tidak bisa convert `double` ke `float` kecuali cast jadi `float`.

### 10. Tambahkan variabel dengan nama `nilaiRata2` yang bertipe data double dan diberi nilai awal 0 kemudian carilah nilai rata – rata dari array coba dan dicetak di akhir program

```java
package syafa.java.Praktikum.Bab4;
import java.util.*;
import java.util.stream.*;

public class N10Array2D
{
    @SuppressWarnings("unused")
    public static void main(String args[])
    { 
        Scanner in = new Scanner(System.in);
        in.close(); 
        String nama[] = new String[10];
        int[][] coba = {{1,2,3}, {4,5,6}, {7,8,9}, {10,11,12}};
        double [][] bank = new double [2][3];
        double nilaiRata2 = 0d;
        System.out.println(" i  j coba[i][j]");
        for (int i = 0; i < 4; i++)
        {
            for (int j = 0; j < 3; j++)
            {
                System.out.printf("%2d %2d %3d\n",i,j,coba[i][j]);
            }
        }
        for (int i = 0; i <= 1; i++)
        {
            for (int j = 0; j < 3 ; j++)
            {
                bank[i][j] = i * 0.5 + j * 0.25;
                nilaiRata2 += i * 0.5 + j * 0.25;
            }
        }
        for (int i = 0; i <= 1; i++)
        {
            for (int j = 0; j < 3 ; j++)
            { 
                System.out.print(bank[i][j] + " ");
            }
        }
        System.out.println("\nCara manual");
        System.out.println(nilaiRata2 / (bank[0].length + bank[1].length));
        System.out.println("Cara lain");
        System.out.print(((DoubleStream.of(bank[0]).sum() + DoubleStream.of(bank[1]).sum()) / ((bank[0].length + bank[1].length))));
    }
}
```

### 11. Tambahkan variabel dengan nama `nilaiMax` dan `nilaiMin` yang bertipe data `double` kemudian lakukan pencarian nilai minimal dan maksimal dari array `bank` lalu cetaklah di akhir program

```java
package syafa.java.Praktikum.Bab4;
import java.util.*;

public class N11Array2D
{
    @SuppressWarnings("unused")
    public static void main(String args[])
    { 
        Scanner in = new Scanner(System.in);
        in.close(); 
        String nama[] = new String[10];
        int[][] coba = {{1,2,3}, {4,5,6}, {7,8,9}, {10,11,12}};
        double [][] bank = new double [2][3];
        double nilaiMin = Double.MAX_VALUE;
        double nilaiMax = Double.MIN_VALUE;
        System.out.println(" i  j coba[i][j]");
        for (int i = 0; i < 4; i++)
        {
            for (int j = 0; j < 3; j++)
            {
                System.out.printf("%2d %2d %3d\n",i,j,coba[i][j]);
            }
        }
        for (int i = 0; i <= 1; i++)
        {
            for (int j = 0; j < 3 ; j++)
            {
                bank[i][j] = i * 0.5 + j * 0.25;
            }
        }
        for (int i = 0; i <= 1; i++)
        {
            for (int j = 0; j < 3 ; j++)
            { 
                System.out.print(bank[i][j] + " ");
            }
        }
        for (int i = 0; i < bank.length; i++)
        {
            for (int j = 0; j < bank[i].length; j++)
            {
                if (bank[i][j] > nilaiMax)
                {
                    nilaiMax = bank[i][j];
                }
                if (bank[i][j] < nilaiMin)
                {
                    nilaiMin = bank[i][j];
                }
            }
        }
        System.out.print("Nilai max" + "\n" + nilaiMax + "\n" + "Nilai min" + "\n" + nilaiMin);
    }
}
```

## Array 3D

### 12. Jalankan kelas Array3 dan benahi jika menemukan kesalahan

Tidak ada kesalahan

### 13. Jelaskan maksud dari statement baris ke-7

Pada baris ke 7, membuat array `Integer` `c[]` dengan panjang `pjg = 9` karena hasil dari `Math.max(a.length,b.length)` adalah 9 (panjang dari array `b[]`).

### 14. Jelaskan perbedaan indeks array dan panjang array! Berikan contoh di kelas Array3

Panjang array `namaArray.length` adalah banyak elemen di array `namaArray[]` (jika elemennya `1,2,3,4,5`, maka `namaArray.length` = 5). Sedangkan indeks array adalah penomoran array yang dimulai dari 0. Contoh `int a[] = {2,7,6,8,1};` nilai indeks ke 0 adalah `2`, sedangkan nilai indeks ke 4 adalah `1`

### 15. Tambahkan variabel dengan nama `jumlahGenap` dan `jumlahGanjil` yang bertipe data `integer` kemudian lakukan penambahan untuk bilangan genap dan ganjil

```java
package syafa.java.Praktikum.Bab4;

public class N13Array3D
{
    public static void main(String args[])
    {
        int a[] = {2,7,6,8,1};
        int b[] = {3,4,2,8,9,7,2,7,5};
        int pjg;
        int jumlahGenap = 0;
        int jumlahGanjil = 0;
        int banyakBilanganGenap = 0;
        int banyakBilanganGanjil = 0;
        pjg = Math.max(a.length,b.length); 
        int c[] = new int[pjg];
        for (int i = 0; i < pjg; i++)
        {
            if(a.length < i + 1)
                c[i] = b[i];
            else if(b.length < i + 1) 
                c[i] = a[i];
            else
                c[i] = a[i] + b[i];
            System.out.print(c[i] + " ");
        }
        for (int i = 0; i < c.length; i++)
        {
            if (c[i] % 2 == 0)
            {
                jumlahGenap += c[i];
                banyakBilanganGenap++;
            }
            else if (c[i] % 2 != 0)
            {
                jumlahGanjil += c[i];
                banyakBilanganGanjil++;
            }
        }
        System.out.print
        (
            "\nJumlah bilangan genap" + "\n" +
            jumlahGenap + "\n" +
            "Jumlah bilangan ganjil" + "\n" +
            jumlahGanjil + "\n" +
            "Banyak bilangan genap" + "\n" +
            banyakBilanganGenap + "\n" +
            "Banyak bilangan ganjil" + "\n" +
            banyakBilanganGanjil
        );
    }
}
```

## Praktikum

### Praktikum 1

#### Penjelasan Praktikum 1

> Note: kode sebelumnya (sebelum revisi) diubah menjadi comments.

Inisialisasi `dataInput` sebesar 1000 dan `dataAmount` (nanti yang akan digunakan ketika `for loop` sehingga tidak loop 1000 kali untuk print data)

Jika pilihan adalah 7, program akan keluar dengan `System.exit()` selain dari 1-6, program akan mengulang kembali print menu.

Jika pilihan 1, maka input data yang dipisah spasi dan menggunakan `.next()` yang kemudian di loop sebanyak yang dimau user. (variabel `dataAmount` akan digunakan di seluruh kode program untuk membatasi maksimal `for loop`)

Jika input pilihan ke 2, kode akan print seluruh elemen dari `dataInput` tadi kemudian print menu kembali.

Jika input pilihan 3, maka akan hitung rata-rata dari seluruh data dengan membuat variabel `double` sementara untuk kemudian print sum dengan membagi dengan `dataAmount`.

Jika input pilihan 4, buat variabel sementara dan loop hingga `dataAmount` kemudian print hasil sum.

Jika input pilihan 5, maka langsung menggunakan Bubble Sort yang akan iterate 2 kali banyak data yang kemudian print nilai terakhir `dataAmount - 1`

##### Unused

Jika input pilihan 4, program akan mencoba dulu untuk menaruh seluruh data ke variabel sementara `int[]` yang kemudian jika ada salah satu data yang bernilai double, Java akan `throw` [`NumberFormatException`](https://docs.oracle.com/en/java/javase/23/docs/api/java.base/java/lang/NumberFormatException.html). Jika iya, maka akan mencoba untuk menggunakan tipe data `double[]` untuk menghitung sum dari seluruh data.

Jika input pilihan 5 maka kode akan memanggil `method` `isDouble` di dalam kelas `checkDataType`. di dalam `isDouble` kode akan looping ke seluruh data dengan `Integer.parseInt()` Jika ada salah satu yang `double`, Java akan `throw` [`NumbereFormatException`](https://docs.oracle.com/en/java/javase/23/docs/api/java.base/java/lang/NumberFormatException.html) dan di dalam `catch` `return true`. Jika program berhasil parse seluruh data ke `Integer`, maka `return false`. Kembali ke `case 5`. Di dalam `if` tadi, jika true maka `method` yang dipanggil juga beda dengan `method` yang dipanggil saat seluruh tipe data adalah `Integer`. Jadi ada 2 Bubble Sort dan 2 cek max min. Kembali ke `if`. Di dalam `if`, langsung `printf` dengan maksimal 5 digit di belakang koma dengan memangggil`class` `checkDAtaType` `method` `convertArrayDouble` (Karena tadi sudah dicek dan ada minimal 1 tipe data `double`). Di dalam `convertArrayDouble`, kode akan membuat variabel sementara `double[]` untuk memasukkan seluruh data kemudian `return` hasil. Setelah itu panggil `class` `sortArray` `method` `bubbleSortDouble` (Jika `Integer`, yang dipanggil adalah `bubbleSortInteger`) Di dalam `bubbleSortDouble` ada algoritma standar Bubble Sort yang akan mengcompare indeks ke j apakah lebih besar dengan indeks yang selanjutnya, jika iya akan di swap denga variabel sementara yang kemudian diiterasi / loop lagi (`for loop` luar) sampai sebanyak banyak data kemudian `return array` hasil sorting. Kemudian, hasil tadi akan langsung memanggil `method` `getMaxDouble` di kelas `sortArray` (Jika `Integer` maka yang dipanggil adalah `GetMaxInteger`, jika mau ambil nilai min, yang dipanggil adalah `get[Min atau Max][Double atau Integer]`). Di dalam `getMaxDouble`, akan langsung `return` eleme terakhir yaitu panjang `array` dikurangi 1, sama juga kalau yang dicari adala nilai min, akan langsung `return` indeks pertama yaitu 0.

### Kode Praktikum 1

```java
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
```

### Praktikum 2

#### Penjelasan Praktikum 2

> Note: Semua variabel yang didahului dengan `temp` hanya digunakan pada saat itu saja dan tidak digunakan di tempat lain.

Kode inisialisasi `int option` dan inisialisasi `boolean repeat` ke `true` untuk nanti digunakan di pilihan menu, `String[] tableHeader` untuk print header table saat pilihan 1, 2,dan 3. `String[][] data` yang berisi data dari tabel. `String[] menu` untuk print pilihan nanti di awal. `ArrayList String passengerName`, `Integer ticketPrice`, dan `Double discountedTicketPrice` yang digunakan nanti saat user memesan tiket karena jumlah penumpang yang masih belum diketahui.

Masuk ke `while repeat` kemudian `for loop` print setiap pilihan menu yang diawali nomor (dari 1), dan di saat iterasi terakhir (`i = 4`), akan print opsi keluar (0) dan meminta user untuk memasukkan nilai piliihan. Jika pilihan adalah 1 hingga 5, akan masuk ke menu pilihan, jika 0, program akan keluar dengan `System.exit(0)` Selain dari itu, program akan langsung keluar jika input diluar yang diminta.

Jika pilihan 1 hingga 5, akan masuk ke `switch case`. Jika pilihan 1, maka print seluruh isi tabel termasuk headernya dan program akan print menu lagi untuk user memilih pilihan opsi dimulai dari header tabel, pembatas tabel `=` sebanyak 90 kali, dan kemudian isi tabel.

Jika pilihan 2, maka print hanya daftar kereta api yang ada ACnya termasuk header dari tabel, jika `i = 0`, print header tabel jenis, jika tidak, print tabel header AC, kemudian masuk ke `for loop` pembatas `=` sebanyak 36 kali kemudian masuk `for loop` yang terluar untuk print ke bawah, dan yang dalam untuk print menyamping, `for loop` yang di dalam `increment` nilai `j` sebanyak sampai nilai `j = 4` karena untuk mendapatkan elemen ke 3 dari `data[][]` yaitu AC kemudian print newline jika sudah 2 kali menyamping.

Pilihan 3 sama seperti pilihan 2 tetapi yang membedakan adalah `increment` `j` sebanyak 4 untuk mendapatkan data dari kelas kereta yang memiliki colokan.

Pilihan 4 print untuk meminta user memasukkan jumlah tiket yang akan dipesan yang disimpan di `ticketAmount` kemudian minta user memasukkan nama (nama akan langsung dimasukkan ke dalam `ArrayList`) dan jenis tiket kereta yang akan dipesan (jenis tiket yang akan dipesan harus sesuai dengan yang ada di `data[][]`), jika jenis tiket yang dipesan tidak sesuai dengan daftar, maka user akan diminta lagi untuk memasukkan lagi input yang diminta + nama penumpang yang sedang diinput, contoh, Dengklek `Enter` pariwis `Enter` pariwis tidak masuk di pilhan manaput, jadi print unutk meminta user memasukkan kembali jenis tiket yang akan dipesan + nama penumpang yang memesan tiket saat ini (`tempValidTicketPrice = false`) di dalam setiap if, akan dihitung tiket sebelum dan setelah diskon yang dimasukkan di `ArrayList`.

Pilihan 5 print daftar penumpang yang memesan tiket, jika tidak ada (`ArrayList.size() == 0`) maka print anda belum memesan tiket dan kemudian break dilanjutkan dengan print lagi pilihan menu. Jika sudah ada booking tiket, print header tabel nama penumpang, harga tiket, dan harga setelah diskon kemudian loop border tabel sebanyak 80 kali kemudian print nama penumpang, harga tiket, dan harga tiket setelah diskon. Setelah selesai, buat variabel `double` `tempTotalDiscountedTicketPrice` kemudian `for each` tambahkan semua tiket setelah diskon ke `tempTotalDiscountedPrice` di akhir tabel, print jumlah penumpang dan total harga tiket setelah diskon.

#### Kode Praktikum 2

```java
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
                        /*
                        for (double tempTotalDiscountedTicketPrice : discountedTicketPrice)
                        {
                            tempTotalDiscountedPriceSum += tempTotalDiscountedTicketPrice;
                        }
                        */
                        for (int i = 0; i < passengerAmount; i++)
                        {
                            tempTotalDiscountedPriceSum += discountedTicketPrice[i];
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
```
