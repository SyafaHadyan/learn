# Statistika

## Data Berkelompok

### Mengubah Data Tunggal Menjadi Data Berkelompok

#### Jangkauan

$$J=X_{max}-X_{min}$$

#### Banyak Kelas dengan Kaidah Empiris Sturgess

$$K=1+3.3logn\space(n=\text{banyak data})$$

#### Panjang Kelas

$$C=\frac{J}{K}$$

### Formula Pemusatan Data

|Rumus|Data Tunggal|Data Berkelompok|
|:---:|:---:|:---:|
|Mean|$$\tilde{x}=\frac{\sum X_i}{n}$$|$$\tilde{x}=\frac{\sum f_i x_i}{\sum f_i}$$|
|Modus|$$Modus=X_i\text{(nilai yang paling sering muncul)}$$|$$Modus=T_B+\left(\frac{d_1}{d_1 + d_2}\right)\times p$$|
|Median|Ganjil $$Median=\left(X_{\frac{n+1}{2}}\right)$$ Genap $$Median=\frac{1}{2}\left(X_{\frac{n}{2}}+X_{\frac{n}{2}+1}\right)$$|$$Median = T_B+\left(\frac{\frac{n}{2}-f_k}{f_m}\right) \times p$$|
|Kuartil|$$Q_i=\left(X_{\frac{i(n+1)}{4}}\right)$$ $$i=1,2,3,...$$|$$Q_i=T_B+\left(\frac{\frac{iN}{4}-f_K}{f_Q}\right) \times p$$|
|Desil|$$D_i=\left(X_{\frac{i(n+1)}{10}}\right)$$ $$i=1,2,3,...$$|$$D_i=T_B+\left(\frac{\frac{iN}{10}-f_K}{f_D}\right) \times p$$|

### Mean

#### Mean Data Tunggal

##### Rumus Mean Data Tunggal

$$\tilde{x}=\frac{\sum X_i}{n}$$

##### Keterangan Rumus Mean Data Tunggal

|Simbol|Keterangan|
|:---:|:---|
|$X$|Rata-rata (mean) variabel $X$|
|$\sum X_i$|Penjumlahan unsur pada variabel $X$|
|$n$|Jumlah subjek|

#### Mean Data Berkelompok

##### Rumus Mean Data Berkelompok

$$\tilde{x}=\frac{\sum f_i x_i}{\sum f_i}$$

##### Keterangan Rumus Mean Data Berkelompok

|Simbol|Keterangan|
|:---:|:---|
|$\tilde{x}$|Rata-rata|
|$x_i$|Nilai-nilai pengamatan yang diwakili dengan nilai tengah kelas|
|$f_i$|Frekuensi relatif tiap kelas interval|
|$n$|Jumlah subjek|

##### Contoh Soal Mean Data Berkelompok

|No|Kategori Nilai|$x_i$|$f_i$|$f_ix_i$|
|:---:|:---:|:---:|:---:|:---:|
|1|$48$ &mdash; $52$|$50$|$2$|$100$|
|2|$53$ &mdash; $57$|$55$|$3$|$165$|
|3|$58$ &mdash; $62$|$60$|$5$|$300$|
|4|$63$ &mdash; $67$|$65$|$9$|$585$|
|5|$68$ &mdash; $72$|$70$|$10$|$700$|
|6|$73$ &mdash; $77$|$75$|$12$|$900$|
|7|$78$ &mdash; $82$|$80$|$7$|$560$|
|8|$83$ &mdash; $87$|$85$|$2$|$170$|
|9|$88$ &mdash; $92$|$90$|$3$|$270$|
|10|$93$ &mdash; $97$|$95$|$1$|$95$|
|||$$\sum x_i=725$$|$$\sum f_i=54$$|$$\sum f_ix_i=3845$$|

$$\tilde{x}=\frac{\sum x_if_i}{n}=\frac{3845}{54}=71.203\approx71$$

### Median

#### Median Data Tunggal

##### Rumus Data Ganjil

$60$ &ensp; $61$ &ensp; $62$ &ensp; $64$ &ensp; $65$ &ensp; $66$ &ensp; $67$

$$Median=64$$

##### Rumus Data Genap

$60$ &ensp; $61$ &ensp; $62$ &ensp; $64$ &ensp; $65$ &ensp; $66$ &ensp; $67$ &ensp; $68$

$$Median=\frac{64+65}{2}=64.5$$

#### Median Data Berkelompok

##### Rumus Median Data Berkelompok

$$M=L+\left(\frac{\frac{1}{2}n-F}{f_m}\right)\times i$$

##### Keterangan Rumus Median Data Berkelompok

|Simbol|Keterangan|
|:---:|:---|
|$M$|Median|
|$L$|Batas bawah kelas di mana terdapat $\frac{1}{2}n$|
|$F$|Frekuensi kumulatif kelas dibawah kelas median|
|$f_m$|Frekuensi relatif kelas di mana terdapat $\frac{1}{2}n$|
|$n$|Jumlah subjek|
|$i$|Panjang / jarak interval kelas|

##### Contoh Soal Median Data Berkelompok

|No|Kategori Nilai|$f_i$|$f_k$|
|:---:|:---:|:---:|:---:|
|1|$48$ &mdash; $52$|$2$|$2$|
|2|$53$ &mdash; $57$|$3$|$5$|
|3|$58$ &mdash; $62$|$5$|$10$|
|4|$63$ &mdash; $67$|$9$|$19$|
|5|$68$ &mdash; $72$|$10$|$29$|
|6|$73$ &mdash; $77$|$12$|$41$|
|7|$78$ &mdash; $82$|$7$|$48$|
|8|$83$ &mdash; $87$|$2$|$50$|
|9|$88$ &mdash; $92$|$3$|$53$|
|10|$93$ &mdash; $97$|$1$|$54$|

$$\frac{n}{2}=\frac{54}{2}=27$$

Data ke $27$ ada di kelas ke $5$ ($F=29$), maka kelas median adalah kelas ke $5$

$$\text{Tepi bawah}=L=\text{BB Kelas Median}-0.5$$
$$=68-0.5=67.5$$
$$\text{Interval}=i\left(BA-BB\right)+1$$
$$=\left(72-68\right)+1=5$$
$$F=19$$
$$f_i=10$$

Karena kelas Median adalah kelas ke $5$, maka menggunakan nilai $F$ dengan nilai $frekuensi\space kumulatif$ sebelum kelas Median (nilai $F$ sebelum $F$ kelas Median)

Hitung median dengan menggunakan rumus data berkelompok

$$M=L\left(\frac{\frac{1}{2}n-F}{fm}\right)i$$
$$=67.5+\left(\frac{\frac{1}{2}54-19}{10}\right)5$$
$$=67.5+\left(\frac{27-19}{10}\right)5$$
$$=67.5+\left(\frac{8}{10}\right)5$$
$$=67.5+\left(0.8\right)5$$
$$=67.5+4=71.5$$

### Modus

Nilai yang sering muncul

#### Modus Data Tunggal

|Angka|Frekuensi|
|:---:|:---:|
|$3$|$1$|
|$3$|$2$|
|$4$|$3$|
|$5$|$4$|
|$5$|$5$|
|$5$|$6$|
|$7$|$7$|
|$8$|$8$|
|$9$|$9$|
|$9$|$10$|

Modus $5$ Frekuensi $15$

#### Modus Data Berkelompok

##### Rumus Modus Data Berkelompok

$$Modus=L+i\left(\frac{b_1}{b_1+b_2}\right)$$

##### Keterangan Rumus Modus Data Berkelompok

|Simbol|Keterangan|
|:---:|:---|
|$Mo$|Modus|
|$L$|Batas bawah kelas yang memiliki frekuensi relatif terbesar|
|$b_1$|Frekuensi relatif kelas modus dikurangi frekuensi relatif kelas sebelumnya|
|$b_2$|Frekuensi relatif kelas modus dikurangi frekuensi relatif kelas berikutnya|
|$i$|Jarak interval kelas|

## Regresi Linear

$y=f(x)=ax+b$

- $x=\text{variabel bebas}$
- $y=\text{variabel tergantung}$

|$x$|$y$|$y$|
|:---:|:---:|:---:|
|$x_1$|$y_1$|$e_1$|
|$x_2$|$y_2$|$e_2$|
|$...$|$...$|$...$|
|$x_n$|$y_n$|$e_n$|

```mermaid
xychart-beta
    title "Regresi Linier"
    x-axis [0,10,20,30,40,50,60]
    y-axis 0 --> 60
    line [0,10,20,30,40,50,60]
```

$y=a_1x_1+a_2x_2+b$

- $x_1x_2=\text{variabel bebas}$
- $y=\text{variabel tergantung}$

$y=a_1x^2+a_2x+b$

$e_1^2+e_2^2+...+e_n^2=\sum\left(y_i-ax_i-b\right)^2$

$$\frac{\sigma\epsilon}{\sigma\alpha}=2\sum\left(y_1-ax_1-b\right)x_i=0$$

$$\sum x_1y_1-a\sum x_i^2-b\sum x_i=0$$

$$a\sum x_i^2+b\sum x_i=\sum x_iy_i...\left(1\right)$$

$$\frac{\sigma\epsilon}{\sigma b}=2\sum\left(y_i-ax_i-b\right)\left(-1\right)=0$$

$$\sum\left(y_i-ax_i-b\right)=0$$

$$a\sum x_i+nb=\sum y_i=...\left(2\right)$$

$e_1=y_1-\left(ax_1+b\right)$

$e_2=y_2-\left(ax_2+b\right)$

$a=\frac{\begin{bmatrix}\sum x_iy_i&\sum x_i\cr\sum y_i&n\end{bmatrix}}{\begin{bmatrix}\sum x_i^2&\sum x_i\cr\sum x_i&n\end{bmatrix}}$
$b=\frac{\begin{bmatrix}\sum x_i^2&\sum x_iy_i\cr\sum x_i&\sum y_i\end{bmatrix}}{\begin{bmatrix}\sum x_i^2&\sum x_iy_i\cr\sum x_i&n\end{bmatrix}}$

$a=\frac{n\sum x_iy_i-\sum x_i\sum y_i}{n\sum x_i^2-\left(\sum x_i\right)^2}$
$b=\frac{\sum x_i^2\sum y_i-\sum x_iy_i\sum x_i}{n\sum x_i^2-\left(\sum x_i\right)^2}$

$\tilde{y}=a+bx^2$

Dimana: $\tilde{y}=\frac{\sum_{i=1}^ny_1}{n}$ dan $\tilde{x}=\frac{\sum_{n=1}^nx_i}{n}$

$a$

Dimana:

- $y_i$ adalah nilai aktual
- $a$ adalah
- $a$ adalah
- $a$ adalah
