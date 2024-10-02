# RAID (Redundant Array of Independent Disks)

## 1. Perbandingan Teknis

- **RAID 0 (Striping)**: Membagi data ke beberapa disk tanpa redundansi. Semua disk bekerja secara paralel, meningkatkan kecepatan baca/tulis. Namun, tidak ada proteksi terhadap kegagalan disk; jika satu disk gagal, seluruh data hilang.
- **RAID 1 (Mirroring)**: Menggandakan data pada dua disk. Memberikan proteksi data maksimal karena setiap disk memiliki salinan identik. Memerlukan dua kali kapasitas penyimpanan.
- **RAID 2**: Menggunakan striping dengan koreksi kesalahan Hamming Code. Tidak umum digunakan karena RAID 3, 4, dan 5 lebih efisien dengan fungsi serupa.
- **RAID 3 (Striping with Dedicated Parity)**: Menggunakan striping dengan satu disk paritas khusus. Lebih efisien dalam penyimpanan daripada RAID 1, tapi jika disk paritas gagal, sistem tidak dapat menulis data hingga diperbaiki.
- **RAID 4 (Striping with Block-Level Parity)**: Mirip dengan RAID 3, tetapi menggunakan striping di tingkat blok. Hal ini meningkatkan kinerja baca untuk blok individual, namun menulis tetap terbatas oleh disk paritas.
- **RAID 5 (Striping with Distributed Parity)**: Data dan paritas didistribusikan ke semua disk. Jika satu disk gagal, data dapat direkonstruksi dari paritas, memberikan proteksi dengan efisiensi ruang yang baik. Kinerja menulis lebih lambat karena perhitungan paritas.
- **RAID 6 (Dual Distributed Parity)**: Sama seperti RAID 5, tetapi dengan dua lapis paritas. Proteksi lebih kuat karena bisa menahan kegagalan dua disk. Namun, penalti kinerja menulis lebih besar.

## 2. Analisis Keunggulan dan Kekurangan Relatif

- **RAID 0**:
  - *Keunggulan*: Kinerja baca/tulis sangat tinggi karena data dipecah dan ditulis secara paralel.
  - *Kekurangan*: Risiko kehilangan data sangat tinggi; jika satu disk gagal, semua data hilang.
- **RAID 1**:
  - *Keunggulan*: Keamanan data terbaik dengan pemulihan cepat, karena setiap disk memiliki salinan identik.
  - *Kekurangan*: Penggunaan kapasitas disk tinggi (50%), karena data disalin ke semua disk.
- **RAID 2**:
  - *Keunggulan*: Memiliki deteksi dan koreksi kesalahan yang baik melalui Hamming Code.
  - *Kekurangan*: Kompleksitas tinggi, penggunaan tidak efisien dibanding RAID modern.
- **RAID 3**:
  - *Keunggulan*: Proteksi data dengan efisiensi ruang lebih baik daripada RAID 1.
  - *Kekurangan*: Disk paritas menjadi titik tunggal kegagalan; menulis data terbatas.
- **RAID 4**:
  - *Keunggulan*: Kinerja baca yang lebih baik daripada RAID 3 karena striping pada tingkat blok.
  - *Kekurangan*: Kinerja menulis masih lambat karena ketergantungan pada disk paritas tunggal.
- **RAID 5**:
  - *Keunggulan*: Efisiensi penyimpanan tinggi dan dapat menangani kegagalan satu disk. Membaca data lebih cepat.
  - *Kekurangan*: Kinerja menulis lebih lambat karena membutuhkan perhitungan dan penulisan paritas.
- **RAID 6**:
  - *Keunggulan*: Proteksi data yang sangat baik, mampu menangani kegagalan dua disk sekaligus.
  - *Kekurangan*: Kinerja menulis lebih rendah dibanding RAID 5, karena dua lapis paritas harus dihitung.

## 3. Tabel Perbandingan:

|RAID Level|Redundansi|Efisiensi Ruang|Kinerja Baca|Kinerja Tulis|Keamanan Data|Aplikasi Umum|
|:---:|:---|:---|:---|:---|:---|:---|
|RAID 0|Tidak ada|100%|Sangat Tinggi|Sangat Tinggi|Rendah|Video editing, Image processing|
|RAID 1|100%|50%|Tinggi|Sedang|Sangat Tinggi|Sistem yang membutuhkan uptime tinggi|
|RAID 2|Paritas (Hamming Code)|Rendah|Rendah|Rendah|Tinggi|Sangat jarang digunakan di aplikasi modern|
|RAID 3|Paritas|Tinggi|Tinggi|Rendah|Tinggi|Sistem pengolahan data dengan ukuran besar|
|RAID 4|Paritas|Tinggi|Tinggi|Rendah|Tinggi|Server database|
|RAID 5|Paritas|Tinggi|Tinggi|Rendah-sedang|Tinggi|Server file, database|
|RAID 6|Paritas ganda|Lebih rendah dari RAID 5|Tinggi|Rendah|Sangat tinggi|Aplikasi kritis yang tidak boleh gagal|
