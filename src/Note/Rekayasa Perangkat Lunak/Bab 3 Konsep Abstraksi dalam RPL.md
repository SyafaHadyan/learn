# BAB 3 KONSEPABSTRAKSI DALAM RPL

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
