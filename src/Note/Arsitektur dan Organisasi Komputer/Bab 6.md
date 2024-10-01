# Bab 6 - Memori Eksternal

## 1. Pendahuluan

- Bab ini bertujuan untuk menjelaskan berbagai jenis memori eksternal seperti **disk magnetik**, **RAID**, **SSD**, **memori optik**, dan **pita magnetik**. Selain itu, membahas perbedaan karakteristik dan kinerja dari setiap jenis memori eksternal.

## 2. Disk Magnetik

- **Disk magnetik** terdiri dari piringan bundar yang terbuat dari bahan nonmagnetik, dilapisi dengan bahan magnetik. Ada dua bahan substrat yang umum digunakan:
  - **Aluminium**: digunakan secara tradisional.
  - **Kaca**: lebih modern, memberikan manfaat seperti keandalan yang lebih tinggi dan tahan terhadap guncangan.
- **Mekanisme read-write** menggunakan head yang menangani data yang dikirim atau diambil dari disk melalui medan magnet.

## 3. Format dan Organisasi Data pada Disk Magnetik

- Data disusun dalam **track** konsentris di permukaan piringan, yang dipisahkan oleh **intertrack gaps** untuk menghindari kesalahan akibat ketidaksejajaran head.
- **Sektor**: Setiap track dibagi menjadi beberapa sektor dengan ukuran tetap (biasanya 512 byte).
- **Cylinder**: Kumpulan semua track yang memiliki posisi relatif sama di seluruh piringan.

## 4. Layout Disk

- Ada dua model layout:
  - **Constant Angular Velocity (CAV)**: Semua track memiliki jumlah sektor yang sama, menyebabkan kepadatan data yang lebih rendah di track luar.
  - **Multiple Zone Recording (MZR)**: Setiap zona memiliki jumlah track dan bit yang tetap, memberikan kapasitas penyimpanan yang lebih besar.

## 5. Karakteristik Fisik Disk Magnetik

- Disk dapat memiliki:
  - **Head tetap** atau **head bergerak**.
  - **Disk nonremovable** (tetap di dalam drive) atau **removable** (dapat dilepas dan diganti).
  - **Satu sisi (single-sided)** atau **dua sisi (double-sided)** untuk penyimpanan data.
  - **Multiple platters**: menambah kapasitas dan meningkatkan kecepatan transfer data.

## 6. Kinerja Disk

- **Seek time**: Waktu yang dibutuhkan untuk memposisikan head di track.
- **Rotational latency**: Waktu yang diperlukan sektor untuk mencapai head.
- **Access time**: Gabungan seek time dan rotational latency.
- **Transfer time**: Waktu yang dibutuhkan untuk membaca atau menulis data setelah head berada di posisi yang benar.

## 7. RAID (Redundant Array of Independent Disk)

- **RAID** adalah teknologi untuk menggabungkan beberapa disk menjadi satu sistem logika, memungkinkan peningkatan performa dan redundansi data.
- Terdapat beberapa level RAID, masing-masing dengan karakteristik yang berbeda:
  - **RAID 0**: Tidak ada redundansi, hanya meningkatkan kecepatan dengan distribusi data ke beberapa disk.
  - **RAID 1**: Mirroring, semua data disalin ke disk lain, menyediakan redundansi.
  - **RAID 2 hingga RAID 6**: Menggunakan teknik seperti paritas dan striping untuk memberikan berbagai tingkat redundansi dan kinerja.

## 8. Solid State Drive (SSD)

- **SSD** adalah perangkat penyimpanan berbasis memori semikonduktor (NAND flash memory), yang lebih cepat daripada HDD tetapi lebih mahal.
- SSD memiliki keunggulan seperti performa I/O yang tinggi, umur lebih lama, dan konsumsi daya yang rendah.
- Namun, SSD cenderung melambat setelah penggunaan jangka panjang, dan memiliki batasan jumlah siklus tulis.

## 9. Memori Optik

- **CD, DVD, dan Blu-ray** adalah contoh media memori optik. Data disimpan dalam bentuk lubang-lubang mikroskopik (pits) yang dibaca menggunakan sinar laser.
- CD dan DVD sering digunakan untuk penyimpanan data, dengan kapasitas yang bervariasi dari 650 MB (CD) hingga 17 GB (DVD).
- **Blu-ray** memiliki kepadatan penyimpanan yang lebih besar, digunakan untuk video berdefinisi tinggi.

## 10. Pita Magnetik

- **Pita magnetik** adalah teknologi penyimpanan data yang lama tetapi masih digunakan, terutama untuk penyimpanan data berkapasitas besar di pusat data.
- Data disimpan secara serial dalam track paralel sepanjang pita.
- **LTO (Linear Tape-Open)** adalah teknologi pita magnetik yang menggunakan sistem cartridge dan digunakan untuk penyimpanan data dalam jumlah besar.

## 11. Perbandingan Teknologi Memori Eksternal

- **HDD**: Murah, kapasitas besar, tetapi lebih lambat dan lebih rentan terhadap kerusakan mekanik.
- **SSD**: Cepat, tahan lama, dan efisien daya, tetapi lebih mahal dan memiliki keterbatasan jumlah siklus tulis.
- **Memori Optik**: Cocok untuk penyimpanan jangka panjang, tetapi dengan waktu akses yang lebih lambat.
- **Pita Magnetik**: Masih digunakan untuk arsip dan cadangan data dengan kapasitas yang sangat besar, tetapi lebih lambat dalam hal waktu akses.

## 12. Generasi LTO (Linear Tape-Open)

- LTO adalah teknologi pita magnetik yang banyak digunakan untuk penyimpanan besar dengan harga yang relatif murah, tetapi perangkat pembacanya lebih mahal dibanding media penyimpanannya.
