# Rotasi Matrix (Easy)

Henry merupakan orang yang sangat ambisius dalam belajar. Pagi tadi Henry telah mempelajari materi tentang matrix 2D. Henry ingin bereksperimen dengan matriks persegi $N×N$. Sekarang dia ingin mencoba membuat program yang bisa melakukan rotasi matriks searah jarum jam sebanyak $K$ kali. Namun Henry mengalami kesulitan. Kamu sebagai teman baiknya hendaklah membantu Henry dalam bereksperimen.

## Input Format

Baris pertama berisi dua bilangan bulat $N\left( 1 \leq N \leq 50 \right) \space \text{dan} \space K \left( 1 \leq K \leq 1000 \right)$.

## Constraints

$K$ bisa sangat besar, tetapi rotasi hanya perlu dilakukan sebanyak `K%4`  karena setelah 4 rotasi matriks kembali ke posisi awal.

## Output Format

Cetak matriks setelah rotasi dalam format $N×N$.

## Sample Input 0

```txt
3 1
1 2 3
4 5 6
7 8 9
```

## Sample Output 0

```txt
7 4 1
8 5 2
9 6 3
```
