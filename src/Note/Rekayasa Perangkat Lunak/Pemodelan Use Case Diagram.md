# Pekan 10: Pemodelan Use Case Diagram

## Capaian Pembelajaran

- Konsep pemodelan berorientasi objek secara umum.

Mengaplikaisikan:

- Pemodelan kebutuhan dengan use case diagram.

## Object Oriented Approach

- Mulai populer akhir '80an - '90an (Booch, Rumbaugh-OMT, Jacobson-OOSE, Coad+Yourdon, Wirfs-Brock):
  - Elistisasi kebutuhan *customer*
  - Identifikasi skenario / use-case (*use-case diagram*)
  - Identifikasi klas berrdasarkan kebutuhan *customer*
  - Identifikasi atribut dan operasi setiap klas
  - Deifinisi struktur klas (*class diagram*)
  - Definisi model relasi antar klas (*collaboration diagram*)
  - Definisi perpindahan status sistem (*statechart diagram*)
- 1996: UML (*Unified Modelling Language*) - Grady Booch+James Rumbaugh+Ivar Jacobson

## Keuntungan OO

- Sangat natural, sesuai dengan cara berpikir manusia -> *improve analyst and problem domain expert interaction*
- Meningkatkan konsistensi hasil analisis -> abstraksi atribut-operasi dalam sebuah objek
- Konsep penurunan klas memberikan kemudahan dalam generalisasi objek
- Kemudahan dalam perubahan
- Terjaganya konsistensi model antara analisi dan perancangan
- Konsep *reusability*

## *Object, Class*

### Objek (*Object*)

- A concept, abstraction, or thing with crisp boundaries and meaning for the problem at hand [Rumbaugh]
- Benda (*tangible & intangible thing*)
- Contoh: Andi, Eko, Susi (sistem akademik)
- Sebuah objek memiliki karatkteristik **Identity** (identitas-pembeda), **state** (sekumpulan atribut) & **behaviour** (sekumpulan operasi, aksi, servis)

Table

### Klas (*Class*)

- A **description** of one or more objects with a uniform set of attributes and services,

## Diagram UML

- *Use-case diagram* (statis)
- *Class diagram* (statis)
- *Collaboration/sequence diagram (dinamis)
- *Statechart diagram (dinamis)

## *Use-Case Diagram*

- Menjelaskan perilaku sistem dari tampak luar
- Menyediakan fungsii-fungsi yang harus dipenuhi sistem sesuai dengan aktornya
- Elemen: *actor* (orang, sistem lain) dan *use-case*
- Setiap *use-case* dilengkapi dengan skenario (deksripsi)
- Langkah-langkah:
  - Identifikasi aktor
  - Identifikasi *use-case* per aktor
