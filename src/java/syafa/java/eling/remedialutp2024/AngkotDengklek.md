# Angkot Dengklek

Pak Dengklek adalah seorang sopir angkot yang beroperasi setiap hari. Setiap hari, ia ingin menghitung keuntungan bersih dari pengoperasian angkotnya. Setiap penumpang yang naik dikenakan tarif berbeda: penumpang dewasa dikenakan biaya Rp12.000, sedangkan penumpang anak kecil dikenakan biaya Rp8.000.Selain itu, angkot Pak Dengklek memiliki tangki bensin yang berkapasitas 20 liter. Setiap jam operasional, angkot menghabiskan 2 liter bensin. Harga bensin bervariasi sepanjang hari, yaitu:

```txt
Pagi (00:00 - 11:59): Rp10.000/liter.
Siang (12:00 - 17:59): Rp12.000/liter.
Malam (18:00 - 23:59): Rp11.000/liter.
```

Jika bensin habis di tengah operasi, Pak Dengklek harus mengisi ulang bensinnya hingga penuh (20 liter). Setelah selesai operasi, tangki harus diisi hingga penuh juga jika kurang dari 20 liter. Harga bensin di akhir jam operasional tergantung pada waktu operasi (pagi, siang, atau malam).Tugas kamu adalah membantu Pak Dengklek menghitung total pendapatan, jumlah penumpang dewasa, jumlah penumpang anak kecil, pengeluaran bensin, durasi operasi, dan keuntungan / kerugian bersih yang diperoleh hari ini.

## Input Format

```txt
m: Baris pertama adalah jam mulai operasi dalam format 24 jam 
s: Baris kedua adalah jam selesai operasi dalam format 24 jam
tp: Baris ketiga adalah total penumpang yang naik hari ini.
jp: jenis penumpang sebanyak tp
```

### Jenis-jenis penumpang

```txt
dewasa: Penumpang dewasa.
anak kecil: Penumpang anak kecil.
```

## Constraints

```txt
0 <= jam_mulai <= 23
0 <= jam_selesai <= 23
0 <= total_penumpang <= 100
tipe_penumpang hanya bisa berupa dewasa atau anak kecil.
```

## Output Format

```txt
Durasi operasi (dalam jam).
Jumlah penumpang dewasa.
Jumlah penumpang anak kecil.
Total pendapatan (dalam Rupiah).
Pengeluaran bensin (dalam Rupiah).
Keuntungan / Kerugian (dalam Rupiah, bisa negatif jika rugi).
```

## Input Sample 0

```txt
7
14
10
dewasa
anak kecil
dewasa
dewasa
anak kecil
dewasa
anak kecil
dewasa
anak kecil
dewasa
```

## Output Sample 0

```txt
Durasi operasi              : 7 jam
Jumlah penumpang dewasa     : 6 orang
Jumlah penumpang anak kecil : 4 orang
Total pendapatan            : Rp104000.00,-
Pengeluaran bensin          : Rp168000.00,-
Pak Dengklek mengalami kerugian sebesar Rp64000.00,-
```

## Sample Explanation 0

Pak Dengklek memulai operasional angkotnya pada pukul 07:00 dan selesai pada pukul 14:00, sehingga total durasinya adalah 7 jam. Selama periode tersebut, ia mengangkut 10 penumpang yang terdiri dari 6 penumpang dewasa dan 4 penumpang anak kecil. Pendapatan dari penumpang dewasa adalah 6 x Rp12.000 = Rp72.000, dan dari penumpang anak kecil adalah 4 x Rp8.000 = Rp32.000, sehingga total pendapatan hari itu mencapai Rp104.000. Dalam 7 jam operasinya, angkot Pak Dengklek menghabiskan 2 liter bensin per jam, dengan total 14 liter bensin. Harga bensin pada jam 14:00 adalah Rp12.000 per liter, sehingga pengeluaran untuk bensin mencapai 14 x Rp12.000 = Rp168.000. Setelah mengurangi pengeluaran dari pendapatan, Pak Dengklek mengalami kerugian sebesar Rp64.000

## Input Sample 1

```txt
8
13
15
dewasa
anak kecil
dewasa
dewasa
anak kecil
dewasa
dewasa
anak kecil
dewasa
dewasa
dewasa
anak kecil
dewasa
anak kecil
dewasa
```

## Output Sample 1

```txt
Durasi operasi              : 5 jam
Jumlah penumpang dewasa     : 10 orang
Jumlah penumpang anak kecil : 5 orang
Total pendapatan            : Rp160000.00,-
Pengeluaran bensin          : Rp120000.00,-
Pak Dengklek mendapat keuntungan sebesar Rp40000.00,-
```

## Sample Explanation 1

Pak Dengklek memulai operasional angkotnya pada pukul 08:00 dan selesai pada pukul 13:00, sehingga total durasinya adalah 5 jam. Selama periode tersebut, ia mengangkut 15 penumpang yang terdiri dari 10 penumpang dewasa dan 5 penumpang anak kecil. Pendapatan dari penumpang dewasa adalah 10 x Rp12.000 = Rp120.000, dan dari penumpang anak kecil adalah 5 x Rp8.000 = Rp40.000, sehingga total pendapatan hari itu mencapai Rp160.000. Dalam 5 jam operasinya, angkot Pak Dengklek menghabiskan 2 liter bensin per jam, dengan total 10 liter bensin. Harga bensin pada jam 13:00 adalah Rp12.000 per liter, sehingga pengeluaran untuk bensin mencapai 10 x Rp12.000 = Rp120.000. Setelah mengurangi pengeluaran dari pendapatan, Pak Dengklek mendapat keuntungan sebesar Rp40.000.
