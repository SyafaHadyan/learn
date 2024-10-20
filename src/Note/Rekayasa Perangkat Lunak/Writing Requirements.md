# Writing Requirements

## Introduction

- Requirements engineering is a technical process
- It is certainly not like writing a novel, or a book like this; it is not even like the kind of "technical writing" seen in instruction manuals and user guides
- In writing a requirements document, two aspects have to be carefully balanced:
- The need to make the requirements document readable
- The need to make the set of requirements processable

## Good Requirements Are SMART

### Specific

- It must address only one aspect of the system design or performance.
- It must be expressed in terms of the need (what and how well), not the solution (how).

### Measurable

- Performance is expressed objectively and quantitatively
- E.g., an exact pointing requirement (in degrees) can be tested thus verified prior to launch.

### Achievable

- It must be technically achievable at costs considered affordable
- E.g., JWST early designs specified an aperture requirement eventually descoped due to technical issues with deployment.

### Relevant

- It must be appropriate for the level being specified
- E.g., requirement on the solar cells should not be designated at the spacecraft level.

### Traceable

- Lower level rerquirements (children) must clearly flow from and support higher level requirements (parents).
- Requirements without a parent are referred to as orphans, and need to be assessed for necessity of inclusion.

## Contoh Deskripsi Sistem (0)

Sistem Pendaftaran Mahasiswa Baru Online adalah platform digital yang bertujuan untuk menyederhanakan dan mempercepat proses pendaftaran mahasiswa baru di sebuah perguruan tinggi. Sistem ini akan memungkinkan calon mahasiswa untuk mengisi formulir pendaftaran, menunggah dokumen pendukung, melakukan pembayaran biaya pendaftaran, dan memantau status pendaftaran mereka secara online.

## Contoh Deskripsi Sistem (1)

Aplikasi Mobile pemesanan tiket bioskop
Salah satu kebutuhan aplikasi adalah “memproses transaksi pembayaran

- **Specific**: "Aplikasi harus mendukung pembayaran dengan kartu kredit Visa dan MasterCard."
- **Measurable**: "Proses transaksi harus diselesaikan dalam waktu kurang dari 5 detik."
- **Achievable**: Teknologi yang dipilih sudah mendukung integrasi dengan gateway pembayaran yang dapat menangani pembayaran dalam waktu tersebut.
- **Relevant**: Relevansi/Kesesuaian —> pengguna aplikasi akan memesan tiket secara online dan butuh melakukan pembayaran langsung.
- **Traceable**: Kebutuhan ini harus dapat dilacak dari dokumen kebutuhan sampai kode program, pengujian unit, dan pengujian penerimaan pengguna (UAT).

## Kebutuhan Fungsional Sistem

- Sistem harus bisa **mencatat** biodata mahasiswa baru mencakup informasi pribadi, akademik, dan pilihan program studi.
- Sitem harus memungkinkan calon mahasiswa untuk **mengunggah** dokumen pendukung seperti ijazah, transkip nilai, dan surat rekomendasi dalam format PDF atau JPEG.
- Sistem harus bisa **menghasilkan laporan** penerimaah mahasiswa baru berdasarkan program studi, asal sekolah, dan jenis kelamin dalam waktu kurang dari 1 menit.
- Sistem harus bisa **mencatat perubahan data** pendaftaran harus dicatat dalam log sistem, termasuk informasi tentang pengguna yang melakukan perubaha, waktu perubaha, dan data sebelum dan sesudah perubahan.
