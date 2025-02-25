|  | Algorithm and Data Structure |
|--|--|
| **NIM** |  244107020051 |
| **Nama** |  Ahmad Zainudin Fanani |
| **Kelas** | TI - 1H |
| **Repository** | [GitHub Repository](https://github.com/Ahmad-Zainudin-Fanani/ALSD_1) |

# Jobsheet 2

## 2.1 Percobaan 1: Deklarasi Class, Atribut, dan Method

![Screenshot](error.png)

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

---

## 2.2 Percobaan 2: Instansiasi Object, serta Mengakses Atribut dan Method

![Screenshot](2.png)

### **2.2.3 Pertanyaan**
1. **. Pada class MahasiswaMain, tunjukkan baris kode program yang digunakan untuk proses instansiasi! Apa nama object yang dihasilkan?**
   - `mhs1` ![Screenshot](3.png)
2. **Bagaimana cara mengakses atribut dan method dari suatu objek?**
   - **Atribut:** Gunakan `objek.nama_atribut`
   - **Method:** Panggil dengan `objek.method()`
3. **Mengapa hasil output pemanggilan method tampilkanInformasi() pertama dan kedua berbeda?**
   - Karena nilai atribut `kelas` dan `ipk` pada objek `mhs1` telah mengalami perubahan sebelum pemanggilan yang kedua.

---

## 2.3 Percobaan 3: Membuat Konstruktor

![Screenshot](4.png)

### **Fungsi Mahasiswa02 Secara Keseluruhan**
1. Menampilkan data mahasiswa menggunakan metode `tampilkanInformasi()`.
2. Mengganti kelas mahasiswa melalui metode `ubahKelas()`.
3. Memperbarui IPK dengan memastikan nilainya tetap dalam rentang 0.0 - 4.0 menggunakan metode `updateIpk()`.
4. Menentukan kategori kinerja mahasiswa berdasarkan IPK dengan metode `nilaiKinerja()`.

### **2.3.3 Pertanyaan**
1. **. Pada class Mahasiswa di Percobaan 3, tunjukkan baris kode program yang digunakan untuk mendeklarasikan konstruktor berparameter!**
   ![Screenshot](5.png)
2. **Perhatikan class MahasiswaMain. Apa sebenarnya yang dilakukan pada baris program berikut?**
   - Pada baris program tersebut, objek `mhs2` dibuat dengan memanfaatkan konstruktor yang memiliki parameter.
3. **Hapus konstruktor default pada class Mahasiswa, kemudian compile dan run program. Bagaimana hasilnya? Jelaskan mengapa hasilnya demikian!**
   - Bisa, karena di `MahasiswaMain02` terdapat konstruktor tanpa parameter. ![Screenshot](6.png)
4. **Setelah melakukan instansiasi object, apakah method di dalam class Mahasiswa harus diakses secara berurutan? Jelaskan alasannya!**
   - Tidak, karena dalam Java, method akan dieksekusi berdasarkan urutan pemanggilan yang ditentukan di dalam `main()`, bukan berdasarkan posisi di dalam class.
5. **Buat object baru dengan nama mhs<NamaMahasiswa> menggunakan konstruktor berparameter dari class Mahasiswa!**
   ![Screenshot](7.png)

---

## 2.4 Latihan Praktikum

### **1. Class MataKuliah02**
![Screenshot](8.png)

**Fungsi MataKuliah01 Secara Keseluruhan:**
1. Menampilkan detail mata kuliah menggunakan metode `tampilInformasi()`.
2. Mengupdate jumlah SKS melalui metode `ubahSKS()`.
3. Menambah durasi jam pertemuan dengan metode `tambahJam()`.
4. Mengurangi jam pertemuan menggunakan metode `kurangiJam()`,  dengan validasi agar nilai jam tidak negatif.

### **2. Class Dosen02**
![Screenshot](9.png)

**Fungsi Dosen01 Secara Keseluruhan:**
1. Metode `tampilInformasi()` digunakan untuk menampilkan profil dosen.
2. Status aktif dosen dapat diperbarui dengan metode `setStatusAktif()`.
3. Metode `hitungMasaKerja()` berfungsi untuk menghitung lama pengabdian dosen berdasarkan tahun saat ini.
4. Perubahan bidang keahlian dosen dapat dilakukan melalui metode `ubahKeahlian()`.