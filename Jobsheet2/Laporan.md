|  | Algorithm and Data Structure |
|--|--|
| **NIM** |  244107020051 |
| **Nama** |  Ahmad Zainudin Fanani |
| **Kelas** | TI - 1H |
| **Repository** | [GitHub Repository]() |

# Jobsheet 2

## 2.1 Percobaan 1: Deklarasi Class, Atribut, dan Method

![Screenshot](png)

1. **Sebutkan dua karakteristik class atau object!**
   - Class merupakan blueprint atau cetak biru dari sebuah entitas nyata. Di dalamnya terdapat atribut dan metode, termasuk metode khusus yang disebut konstruktor.
2. **Perhatikan class Mahasiswa pada Praktikum 1 tersebut, ada berapa atribut yang dimiliki oleh class Mahasiswa? Sebutkan apa saja atributnya!**
- Terdapat 4 atribut yaitu `nama`, `nim`, `kelas`, dan `ipk`.
3. **Ada berapa method yang dimiliki oleh class tersebut? Sebutkan apa saja methodnya!**
- Terdapat 4 method yaitu `tampilkanInformasi()`, `ubahKelas(String kelasBaru)`, `updateIpk(double ipkBaru)`, dan `nilaiKinerja()`.
4. **Perbaiki kesalahan pada potongan kode berikut!**
   ```java
   if (ipkBaru >= 0.0 && ipkBaru <= 4.0) {
       ipk = ipkBaru;
   } else {
       System.out.println("IPK tidak valid. Harus antara 0.0 dan 4.0");
   }
   ```
5. **Jelaskan bagaimana cara kerja method nilaiKinerja() dalam mengevaluasi kinerja mahasiswa, kriteria apa saja yang digunakan untuk menentukan nilai kinerja tersebut, dan apa yang dikembalikan (di-return-kan) oleh method nilaiKinerja() tersebut?**
- Method ini mengevaluasi nilai IPK dengan menggunakan `if-else` dan mengembalikan `String` berdasarkan kondisi yang sesuai.
 **Commit Github :**
