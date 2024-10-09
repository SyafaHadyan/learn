# BAB 3 KONSEP ABSTRAKSI DALAM RPL

## Pengertian

- Abstraction:
  - the act or process of leaving out of consideration one or more properties of a complex object so as to attend to others [Jeff Kramer, 2007].
  - a process that involves recognizing and focusing on the important characteristics of a situation or object, and filtering out or ignoring all of the unessential details [J. Barker, 2004].
- Abstraksi: pengurangan objek ke dalam esensinya sehingga hanya elemen yang penting yang direpresentasikan [KBBI].
- Abstraction level
  - tingkat kedalaman abstraksi -> seberapa banyak informasi yang dipertahankan/diabaikan semakin ke atas semakin umum (general), semakin ke bawah semakin khusus/detil/spesifik.
  - contoh: Google Maps (zoom out, zoom in).

## Urgensi

Complexity Management

- hiding unnecessary details.
- better understanding.
- good conceptualization.
- improved maintainability.
- enhanced scalability.

## Teknik

- Dekomposisi (decomposition)
  - dari yang umum menuju ke yang lebih detil.
  - pendekatan deduktif.
  - specialization.
  - contoh: dunia -> benua -> negara -> pulau -> kota -> ….
- Komposisi (composition)
  - dari yang detil menuju yang lebih umum.
  - pendekatan induktif.
  - generalization.
  - dilakukan dengan agregasi dan/atau klasifikasi.
  - contoh: … -> pulau -> negara -> benua -> dunia.

## Konsep Pemodelan

- Model:
  - representasi abstrak dari sesuatu yang nyata ataupun yang tidak nyata.
  - representasi dari sebuah obyek, sistem atau ide dalam bentuk yang berbeda dari.
  - aslinya.
  - sebuah obyek yang dibuat untuk merepresentasikan sesuatu untuk kemudahan pemahaman.
  - a theoretical construct that represents processes, with a set of variables and a set of logical & quantitative relationships between them.
- Pemodelan adalah bagian dari proses abstraksi -> representasi dari abstraksi.
- Contoh : model jembatan, model arus lalu lintas, model pesawat terbang, model proses pengembangan PL
- Karekteristik model:
  - lebih mudah dan lebih cepat dibangun/dibuat.
  - bisa untuk simulasi -> memahami sebuah konsep.
  - dapat berkembang/berubah sesuai dengan pemahaman kita tentang sebuah konsep.
  - dapat diseleksi yang perlu didetilkan atau diabaikan dari sebuah konsep.
  - representasi dari sesuatu yang nyata ataupun tidak dari berbagai domain.
  - dibangun secara iteratif.
- Diagram: representasi visual atau grafis bagian-bagian dari sebuah model.

## Urgensi Pemodelan

- Memudahkan manajemen proyek.
- Memberikan gambaran yang utuh tentang sistem yang akan dibangun.
- Memperjelas struktur sistem dan relasi antar elemen sistem.
- Memudahkan komunikasi dan pemahaman, baik antar anggota tim maupun tim dengan konsumen.
- Membantu proses pengujian dan penjaminan kualitas sistem.
- Mampu menjelaskan berbagai aspek dari sistem.

## Kualitas Pemodelan

- Kualitas sintaks -> sintaks pemodelan (notasi dan regulasi) harus benar sesuai dengan bahasa pemodelan yang digunakan.
- Kualitas semantik -> model harus bisa merepresentasikan domain masalah secara lengkap dan benar.
- Kualitas pragmatis:
  - model harus bisa dipahami dengan baik oleh pengguna.
  - terdapat alat bantu pemodelan.

## Tipe-tipe Model

- Natural language models
  - Useful for gathering requirement details.
  - Natural language is inherently ambiguous, aim for a structured approach.
  - Can be over flexible and long.
- Diagramatic models
  - Can be ad hoc, or follow a specific notation with clearly defined syntax.
  - Can show static or dynamic relationships and behaviors.
- Formal models
  - State-based models using formal algebraic and logical approaches.

## Tipe-tipe Model (Contoh)

### Natural language models

- User inserts credit/debit card into the slot.
- System authenticates user PIN.
- If the PIN is invalid, the system displays an error message and returns the card.
- System displays a list of options and the user makes a selection.
- If the user selection is incorrect, the system displays an error message and then displays a list of options again.
- If the user selects cash withdrawal then
  - The system asks the user to enter the amount of cash to be withdrawn, and the user enters the selection.
  - The system checks that the amount entered does not exceed the amount contained in the cash dispenser, and the amount in the user’s account.
  - System dispenses cash to the user.
Etc.

### Diagramatic models

![Diagramatic Models](https://github.com/SyafaHadyan/learn/blob/main/src/Note/Rekayasa%20Perangkat%20Lunak/Pictures/Bab%203/DiagramaticModels.png)

### Formal models

for_all $i$ in 1..10, exists $j$ in 1..10: Square $(i)$ = $j^2$

## Jenis-jenis Model

- Context models
  - show the relationships of the system to other systems.
  - used to establish the system boundaries.
- Behavioral models
  - show the processes that are supported by the system.
- Data flow models
  - show the flow of information from one process to another.
  - can be easily understood by the client.
- State models
  - show how the states of the system change in response to external or internal stimuli.
- Object models
  - show attributes, methods, and relationships of object classes within the system.

## Metode Pemodelan

- Klasik
  - Entity-relationship modeling (ERM) -> pemodelan data (entity, relationship, attribute, attribute value, modality, cardinality).
  - Finite state machines (FSM) -> pemodelan keadaan (state) dan transisi (transition).
  - Data flow -> pemodelan proses dan aliran data antar proses -> entity, process, storage, data flow.
  - CRC cards -> pemodelan kebutuhan (requirements) -> class, responsibility, collaborators.
- Berorientasi objek (OO)
  - Unified modeling language (UML) -> pemodelan sistem berorientasi objek hasil unifikasi dari OMT (Rumbaugh), Booch’s methods and OOSE (Jacobson) -> widely used in OOA and OOD

## Problem Domain

- Ranah/domain masalah -> daerah kajian spesifik dimana masalah muncul.
- Urgensi: memahami dengan jelas kondisi (proses, batasan, aktivitas) yang sedang berjalan (current conditions) sehingga muncul masalah (daerah terdampak) -> dasar untuk identifikasi masalah dengan tepat.
- Teknik: wawancara, observasi, analisis dokumen (literatur).
- Panduan eksplorasi: what, how, who, when, why.
- **BUKAN** masalah umum (general problem) atau masalah utama (main problem).
- Contoh:
  - Akademik Fakultas ABC -> proses apa saja yang dilakukan saat ini?, bagaimana proses-proses
tersebut dilakukan?, siapa saja yang berperan dalam proses?, dan seterusnya.
  - Manajemen Klinik ABC -> deskripsi secara spesifik dari proses/batasan/aktivitas yang terjadi saat
ini di Klinik ABC, dan bukan di klinik yang lain.

## Problem

- Masalah yang menjadi perhatian untuk diselesaikan dengan solusi yang akan dikerjakan.
- Diidentifikasi berdasarkan problem domain.
- Ketepatannya dipengaruhi oleh tingkat pemahaman terhadap problem domain -> pemahaman problem domain yang parsial berdampak pada identifikasi masalah yang tidak tepat dan solusi yang salah.
- Contoh:
  - Masalah dalam Akademik Fakultas ABC (berdasarkan problem domain yang ada) -> jadwal kuliah yang bentrok, inkonsistensi mata kuliah dalam KRS, dll.
  - Masalah dalam Manajemen Klinik ABC -> antrian pasien yang tidak teratur, perbedaan stok obat antara jumlah tercatat dengan fisik.
