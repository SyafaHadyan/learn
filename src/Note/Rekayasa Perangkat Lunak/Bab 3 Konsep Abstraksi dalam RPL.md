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

`for_all i in 1..10, exists j in 1..10: Square (i) = j2`
