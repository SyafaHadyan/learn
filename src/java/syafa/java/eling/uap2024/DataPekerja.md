# Data Pekerja (Easy)

Sebuah perusahaan konstruksi memiliki beberapa tukang bangunan yang bekerja di berbagai proyek. Gaji mereka dihitung berdasarkan jam kerja per hari dengan ketentuan berikut:

- Jam kerja minimum: Setiap tukang bangunan diwajibkan bekerja minimal 8 jam per hari.
  - Jika bekerja kurang dari 8 jam, maka untuk setiap jam yang kurang, mereka dikenakan pengurangan gaji sebesar 50% dari gaji per jam.
- Jam kerja lembur: Jika bekerja lebih dari 12 jam per hari
  - Untuk setiap jam lembur, mereka mendapatkan tambahan gaji sebesar 50% dari gaji per jam.
- Bonus pekerja terbaik: Tukang bangunan yang bekerja paling banyak mendapatkan tambahan bonus sebesar 10% dari total gaji yang dia dapatkan.
- Gaji perjam adalah 15000

## Input Format

```txt
n m
a[0][0] a[0][1] ... a[0][m]
a[1][0] a[1][1] ... a[1][m]
.
.
.
a[n][0] a[n][1] ... a[n][m]
```

- n merupakan banyak pekerja
- m merupakah banyak hari mereka bekerja

### Constraint

- Jumlah pekerja selalu bilangan bulat dan positif
- Jumlah hari selalu bilangan bulan dan positif
- Gaji perjam sudah ditentukan. Yaitu 15000 per jam
- Hanya ada satu pekerja terbaik

## Output Format

```txt
Tukang Bangunan 1:
- Total jam kerja: <jamKerja orang ke-1> jam
- Gaji: Rp <gaji orang ke-1>
Tukang Bangunan 2:
- Total jam kerja: <jamKerja orang ke-2> jam
- Gaji: Rp <gaji orang ke-2>
Tukang Bangunan 3:
- Total jam kerja: <jamKerja orang ke-3> jam
- Gaji: Rp <gaji orang ke-3>
Tukang Bangunan n:
- Total jam kerja: <jamKerja orang ke-n> jam
- Gaji: Rp <gaji orang ke-n>

Pekerja terbaik: Tukang Bangunan <pekerja terbaik>
Bonus tambahan: Rp <bonus>
Total Gaji yang diterima Tukang Bangunan <pekerja terbaik>: Rp <total gaji pekerja terbaik>
```

- ***n*** tergantung jumlah pekerja
- ***jamKerja*** adalah total jam kerja dari seorang pekerja
- ***gaji*** merupakan gaji murni yang didapat oleh seorang pekerja
- ***pekerja terbaik*** merupakan pekerja yang memiliki jam kerja paling banyak
- ***bonus*** merupakan tambahan yang diberikan kepada pekerja terbaik, yang merupakan 10% dari gaji murni pekerja terbaik
- ***total gaji*** merupakan bonus ditambah gaji murni.

## Sample Input

```txt
4 3
6 6 6
9 9 9
15 15 15
20 20 20
```

## Sample Output

```txt
Tukang Bangunan 1:
- Total jam kerja: 18 jam
- Gaji: Rp 225000.0
Tukang Bangunan 2:
- Total jam kerja: 27 jam
- Gaji: Rp 405000.0
Tukang Bangunan 3:
- Total jam kerja: 45 jam
- Gaji: Rp 742500.0
Tukang Bangunan 4:
- Total jam kerja: 60 jam
- Gaji: Rp 1080000.0

Pekerja terbaik: Tukang Bangunan 4
Bonus tambahan: Rp 108000.0
Total Gaji yang diterima Tukang Bangunan 4: Rp 1188000.0
```

### Penjelasan Sample

#### Pada Tukang Bangunan 1

- Jam Kerjanya adalah $18$ jam $\left( 6+6+6 \right)$
- Dikarenakan minimum jam nya adalah $24$ jam $\left( \text{dari} \space 8* \space \text{total hari kerja} \right)$, maka pekerja tersebut minus $6$ jam
- Gaji nya adalah $18*15000=270000$
- Perhitungan denda adalah $6 *15000*50\%=45000$
- Gaji murni untuk tukang 1 adalah $270000-67500=225000$

#### Pada Tukang Bangunan 2

- Jam kerja nya diatas minimum jam kerja dan dibawah maksimum jam kerja.
- Gaji murni untuk tukang 2 adalah $27*15000=405000$

#### Pada Tukang Bangunan 4

- Jam kerjanya lebih dari $36$ jam $\left( 12* \space \text{total hari kerja} \right)$
- Dikarenakan maks jamnya adalah $36$ jam, maka pekerja tersebut plus $24$ jam
- Perhitungan bonus adalah $24*15000*50\%$
- Gaji murni tukang 4 adalah $60*15000+ \space \text{bonus}$

Pekerja terbaik adalah tukang 4 dan mendapatkan bonus $10\%$

Total gaji menampilkan gaji murni + bonus
