# Bab 4 - Cache Memory

## Memori

### 1. Karakteristik Sistem Memori

- Memori komputer memiliki berbagai jenis dengan karakteristik seperti lokasi, kapasitas, metode akses, dan kecepatan.
- Memori dapat bersifat **internal** (register, cache, memori utama) atau **eksternal** (disk magnetik, disk optik).
- Metode akses data dalam memori dapat berupa **sekuensial**, **langsung**, **acak**, atau **asosiatif**. Memori cache sering kali menggunakan akses asosiatif.

### 2. Kapasitas dan Kinerja Memori

- **Waktu akses**: Waktu yang dibutuhkan untuk membaca atau menulis data di memori.
- **Siklus memori**: Waktu akses ditambah waktu tambahan yang diperlukan sebelum akses berikutnya bisa dimulai.
- **Tingkat transfer**: Kecepatan data dipindahkan dari atau ke unit memori, yang menentukan kinerja keseluruhan sistem.

### 3. Hirarki Memori

- Hirarki memori dibangun berdasarkan trade-off antara kapasitas, waktu akses, dan biaya.
- Semakin cepat waktu akses, semakin mahal biaya per bit. Semakin besar kapasitas, semakin murah biaya per bit tetapi waktu akses lebih lambat.
- Penggunaan cache dalam hirarki memori mempercepat akses data dengan menyimpan data yang sering digunakan lebih dekat ke CPU.

### 4. Memori Cache

- **Cache** adalah memori berkecepatan tinggi yang menyimpan salinan data yang sering diakses dari memori utama.
- Memori cache meningkatkan performa dengan mengurangi waktu yang dibutuhkan CPU untuk mengakses data.
- Cache dapat memiliki beberapa level, seperti **L1 (level 1)** yang lebih cepat dan dekat dengan CPU, **L2**, dan bahkan **L3**, tergantung pada desain sistem.

### 5. Struktur dan Operasi Cache

- Ketika CPU memerlukan data, cache pertama kali diperiksa. Jika data ada di cache (**hit**), CPU mengambil data langsung dari cache. Jika tidak ada (**miss**), data diambil dari memori utama dan disimpan ke cache.
- Tiga metode pemetaan cache:
  - **Pemetaan langsung**: Setiap blok memori hanya bisa dipetakan ke satu baris di cache.
  - **Pemetaan asosiatif**: Setiap blok memori dapat dipetakan ke baris mana saja di cache.
  - **Pemetaan set-asosiatif**: Blok memori dapat dipetakan ke salah satu baris dalam set cache tertentu.

### 6. Algoritma Penggantian Cache

- Ketika cache penuh dan blok baru perlu dimasukkan, blok lama harus diganti. Algoritma penggantian umum meliputi:
  - **Least Recently Used (LRU)**: Mengganti blok yang paling lama tidak diakses.
  - **First-In-First-Out (FIFO)**: Mengganti blok yang paling lama berada di cache.
  - **Least Frequently Used (LFU)**: Mengganti blok yang paling jarang diakses.

### 7. Kebijakan Penulisan Cache

- **Write-through**: Setiap penulisan ke cache juga langsung ditulis ke memori utama. Ini sederhana tetapi menyebabkan lalu lintas memori yang tinggi.
- **Write-back**: Data hanya ditulis ke memori utama saat blok tersebut digantikan. Ini lebih efisien tetapi lebih kompleks.

### 8. Cache Multilevel

- Cache multilevel (L1, L2, L3) memanfaatkan cache on-chip dan off-chip untuk mengurangi waktu akses dan meningkatkan performa.
- Cache L1 sering dibagi menjadi cache instruksi dan data untuk meningkatkan efisiensi akses selama eksekusi instruksi.

### 9. Cache Pentium 4

- Prosesor seperti **Pentium 4** menggunakan cache multilevel dengan L1, L2, dan L3, serta teknik seperti pemisahan cache instruksi dan data untuk meningkatkan efisiensi eksekusi.

### 10. Prinsip Desain Cache

- Desain cache mencakup beberapa elemen penting seperti ukuran cache, fungsi pemetaan, algoritma penggantian, kebijakan penulisan, dan ukuran garis cache.
- Cache multilevel dan pemisahan cache instruksi dan data sangat penting dalam meningkatkan kinerja sistem.

Secara keseluruhan, file ini membahas prinsip dasar memori cache, bagaimana cache diimplementasikan dalam hirarki memori, teknik optimasi seperti pemetaan cache, serta bagaimana penggunaan cache dapat meningkatkan performa komputer secara signifikan【29†source】.

## Perbedaan Level-level Cache (L1, L2, L3)

Perbedaan antara level-level **cache** (L1, L2, L3) terutama terletak pada **kecepatan akses**, **kapasitas**, dan **lokasi** dalam sistem komputer. Berikut adalah rincian perbedaan antara level-level cache tersebut:

### 1. L1 Cache (Level 1 Cache)

- **Lokasi**: Cache ini biasanya terletak langsung di dalam **chip prosesor**.
- **Kecepatan**: **L1 cache** adalah yang **paling cepat** di antara semua level cache karena berada paling dekat dengan CPU dan biasanya beroperasi pada kecepatan prosesor.
- **Kapasitas**: Ukurannya **paling kecil**, umumnya berkisar antara 8 KB hingga 64 KB per inti prosesor.
- **Fungsi**: Dibagi menjadi dua jenis:
  - **L1 Instruction Cache**: Menyimpan instruksi yang sedang diambil oleh CPU.
  - **L1 Data Cache**: Menyimpan data yang sedang diproses oleh CPU.
- **Keunggulan**: Kecepatan aksesnya sangat tinggi, sehingga sangat efisien untuk data yang sering diakses.

### 2. L2 Cache (Level 2 Cache)

- **Lokasi**: Biasanya masih berada di dalam chip prosesor tetapi terpisah dari inti CPU, atau kadang-kadang di luar chip tetapi terhubung dekat dengan prosesor.
- **Kecepatan**: **L2 cache** lebih lambat dibandingkan dengan **L1 cache**, tetapi masih lebih cepat daripada memori utama (RAM).
- **Kapasitas**: Lebih besar dari L1, biasanya berukuran antara 256 KB hingga beberapa MB per inti prosesor.
- **Fungsi**: L2 cache menyimpan data yang lebih besar dan lebih jarang diakses daripada yang disimpan di L1 cache, tetapi masih sering digunakan oleh CPU.

### 3. L3 Cache (Level 3 Cache)

- **Lokasi**: **L3 cache** biasanya berada di luar inti prosesor tetapi masih di dalam chip prosesor. Pada beberapa prosesor, L3 cache berbagi antara beberapa inti (multicore).
- **Kecepatan**: **Lebih lambat** dibandingkan L1 dan L2, tetapi tetap lebih cepat daripada memori utama (RAM).
- **Kapasitas**: L3 cache memiliki kapasitas **paling besar**, sering kali berukuran antara beberapa MB hingga puluhan MB (misalnya, 8 MB hingga 32 MB atau lebih) yang dibagi di antara semua inti prosesor.
- **Fungsi**: Menyimpan data yang lebih besar atau lebih jarang digunakan daripada L2 cache, serta berfungsi untuk mempercepat akses ke data bagi seluruh inti prosesor.

### Perbedaan Utama

|**Level Cache**|**Lokasi**|**Kecepatan**|**Kapasitas**|**Fungsi**|
|:---|:---|:---|:---|:---|
|**L1 Cache**|Di dalam inti CPU|Paling cepat|Kecil (8 KB-64 KB)|Menyimpan instruksi dan data yang sering digunakan oleh CPU.|
|**L2 Cache**|Di dalam atau dekat chip prosesor|Cepat|Lebih besar (256 KB-8 MB)|Menyimpan data yang sering diakses tetapi lebih jarang dibanding L1.|
|**L3 Cache**|Di luar inti, berbagi dengan banyak inti|Lebih lambat dari L1 & L2|Sangat besar (hingga puluhan MB)|Menyimpan data yang jarang diakses dan mempercepat akses antar inti CPU.|

### Intisari

- **L1 cache**: Paling cepat, ukuran terkecil, digunakan untuk data dan instruksi yang paling sering diakses.
- **L2 cache**: Lebih besar dan lebih lambat daripada L1, tetapi lebih dekat daripada memori utama.
- **L3 cache**: Ukuran terbesar, digunakan untuk mempercepat akses memori antara beberapa inti prosesor dan lebih lambat dibandingkan L1 dan L2.
