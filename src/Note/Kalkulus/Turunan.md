# Turunan

## Konsep Turunan

### Garis Singgung

Kemiringan tali busur $PQ$ adalah:

$$m_{PQ}=\frac{f\left(x\right)-f\left(a\right)}{x-a}$$

Jika $x\to a$, maka tali busur $PQ$ akan berubah menjadi garis singgung di titik $P$ dengan kemiringan

$$m-\lim_{x\to a}\frac{f\left(x\right)-f\left(a\right)}{x-a}$$

### Kecepatan Sesaat

Misal sebuah benda bergerak sepanjang garis koordinat sehingga posisinya setiap saat diberikan oleh $s=f\left(t\right)$. Pada saat $t=c$ benda berada di $f\left(c\right)$ dan saat $t=c+h$ benda berada di $f\left(c+h\right)$

Sehingga kecepatan rata-rata pada selang waktu $\left(c,c+h\right)$ adalah

$$v_{rata-rata}=\frac{f\left(c+h\right)-f\left(c\right)}{h}$$

Jika $h\to0$, diperoleh kecepatan sesaat di $x=c$:

$$v=\lim_{h\to0}v_{rata-rata}=\lim_{k\to0}\frac{f\left(c+h\right)-f\left(c\right)}{h}$$

Misal $X=c+h$, bentuk di atas dapat dituliskan dalam bentuk

$$v=\lim_{x\to c}\frac{f\left(x\right)-f\left(c\right)}{x-c}$$

Dari dua bentuk di atas: kemiringan garis singgung dan kecepatan sesaat terlihat bahwa dua masalah tersebut berada dalam satu tema, yaitu turunan

**Definisi 4.1**: Turunan pertama fungsi $f$ di titik $x=c$, notasi $f\rq\left(c\right)$ didefinisikan sebagai berikut:

$$f\rq\left(c\right)=\lim_{x\to c}\frac{f\left(x\right)-f\left(c\right)}{x-c}$$

Notasi lain:

$$\frac{df\left(c\right)}{dx},y\rq\left(c\right)$$

Contoh: Diketahui $f\left(x\right)=\frac{1}{x}$ tentukan $f\rq\left(3\right)$

$$f\rq\left(3\right)=\lim_{x\to3}\frac{f\left(x\right)-f\left(3\right)}{x-3}$$

$$f\rq\left(3\right)=\lim_{x\to3}\frac{\frac{1}{x}-\frac{1}{3}}{x-3}$$

$$f\rq\left(3\right)=\lim_{x\to3}\frac{3-x}{3x\left(x-3\right)}$$

$$f\rq\left(3\right)=\lim_{x\to3}{-\left(x-3\right)}{3x\left(x-3\right)}$$

$$f\rq\left(3\right)=\lim_{x\to3}\frac{-1}{3x}$$

$$f\rq\left(3\right)=-\frac{1}{9}$$

## Turunan Sepihak

Turunan kiri dari fungsi $f$ di titik $c$, didefinisikan sebagai: $f\rq_-\left(c\right)=\lim_{x\to c^-}\frac{f\left(x\right)-f\left(c\right)}{x-c}$

Turunan kanan dari fungsi $f$ di titik $c$, didefinisikan sebagai: $f\rq_+\left(c\right)=\lim_{x\to c^+}\frac{f\left(x\right)-f\left(c\right)}{x-c}$

Fungsi $f$ dikatakan mempunyai turunan (diferensiabel) di $c$ atau $f\rq\left(c\right)$ ada, jika

$$f\rq_-\left(c\right)=f\rq_+\left(c\right)\space\text{dan}\space f\rq\left(c\right)=f\rq_-\left(c\right)=f\rq_+\left(c\right)$$
