# Hindari Serangan Benteng (Medium)

Ada grid yang terdiri dari 64 kotak dengan 8 baris dan 8 kolom. Misalkan $\left( i,j \right)$ menyatakan kotak pada baris ke-$i$ dari atas $\left( 1 \leq i \leq 8 \right)$ dan kolom ke-$j$ dari kiri $\left( 1 \leq j \leq 8 \right)$.

Setiap kotak kosong atau memiliki bidak catur yang ditempatkan di atasnya. Keadaan kotak-kotak tersebut direpresentasikan oleh urutan $\left( S1,S2,S3,…,S8 \right)$
dari 8 string dengan panjang 8. Kotak $\left( i,j \right)$ $\left( 1 \leq i \leq 8,1 \leq j \leq 8 \right)$ kosong jika karakter ke-$j$ dari $S_i$ adalah `'.'`, dan memiliki bidak catur jika karakternya adalah `'#'`.

Anda diminta menempatkan bidak catur anda pada kotak kosong sedemikian rupa sehingga tidak dapat dimakan oleh bidak catur yang ada.

Bidak yang ditempatkan pada petak $\left( i,j \right)$ dapat menangkap bidak yang memenuhi salah satu dari kondisi berikut:

- Ditempatkan pada petak di baris $i$
- Ditempatkan pada petak di kolom $j$

Misalnya, bidak yang ditempatkan pada petak $\left( 5,5 \right)$ dapat menangkap bidak yang ditempatkan pada petak yang ditunjukkan dengan warna kuning pada gambar berikut:

![Rook at 5,5](https://github.com/SyafaHadyan/learn/blob/main/src/java/syafa/java/eling/uap2024/Pictures/Rook-0.png)

## Constraints

- Setiap $S_i$ adalah string dengan panjang 8 yang terdiri dari `'.'` dan `'#'` $\left( 1 \leq i \leq 8 \right)$.

## Input Format

$S_1$

$S_2$

$S_3$

$S_4$

$S_5$

$S_6$

$S_7$

$S_8$
​

## Output Format

Cetak jumlah petak kosong tempat anda dapat menempatkan bidak tanpa ditangkap oleh bidak yang sudah ada.

## Sample Input 0

```txt
...#....
#.......
.......#
....#...
.#......
........
........
..#.....
```

## Sample Output 0

4

![Input 0](https://github.com/SyafaHadyan/learn/blob/main/src/java/syafa/java/eling/uap2024/Pictures/Rook-1.png)

Oleh karena itu, anda dapat menempatkan bidak anda tanpa ditangkap pada 4 petak: petak (6,6), petak (6,7), petak (7,6), dan petak (7,7).
