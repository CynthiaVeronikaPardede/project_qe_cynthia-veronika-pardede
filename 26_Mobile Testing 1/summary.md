# qe_cynthia-veronika-pardede
## **Section 26**<br><br>
### **Mobile  Testing 1**<br><br>

**Mobile Automation Testing With Appium**<br><br>

Mobile testing adalah proses dimana aplikasi yang dikembangkan  untuk mobile, diuji untuk kegunaan konsistensinya. Ada 2 macam testing yang dilakukan yaitu
1. Pengujian  Hardware
Termasuk prosesor, memori, ukuran layar, resolusi, ram, bluetooth dll.
2. Pengujian Software
Aplikasi akan diuji secara mendetail. Fungsi dan konsistensi akan diuji,<br> 
Aplikasi mobile terbagi menjadi 3:
    1. Natif
    2. Hybrid
    3. Web<br><br>

Sistem operasi yang bermacam, ukuran layar yang bermacam, jenis jaringan mobile merupakan kesulitan testing di mobile.
Testing yang dilakukan aplikasi mobile:
1. Usability testing, memastikan mobile mudah untuk digunakan dan eksperience yang baik untuk penggunanya. 
2. Interface testing, pengujian tombol, histori, pengaturan, navigasi dalam aplikasi dll
3. Service testing, pengujian aplikasi dalam keadaan online maupun offline
4. Low level resource testing, pengujian memori, auto delete file-file sementara, database
5. Performance testing, pengujian kinerja aplikasi dan mengubah koneksi dari 2G ke wifi atau 3G ke wifi, kemampuan berbagi dokumen, kapasitas baterai yang dibutuhkan.
6. Operational testing, backup dan rencana recovery jika baterai melemah, atau saat kehilangan upgrade
7. Installation testing, menginstal aplikasi, meng uninstall aplikasi dll
8. Security testing, pengujian aplikasi apakah data terlindungi di aplikasi<br><br>


Untuk memastikan kualitas dan standar terpenuhi maka adanya strategi testing aplikasi mobile seperti menganalisis pasar, pemilihan perangkat, memilih perangkat yang banyak digunakan. Keputusan didasarkan berdasarkan user atau developer yang mempertimbangkan faktor popularitas sistem tertentu. 
Emulator membantu dalam pembangunan awal karena memungkinkan pengecekan secara cepat dan efisien. Sistem yang menjalankan software yang seolah-olah membawa kepada sistem yang lain. <br><br>

**Appium**<br>
Appium adalah mobile automation frameworks to run mobile automation test. Appium supports many programming languages such as java, python, javascript, ruby, etc. Appium library is created on top of selenium library.  It supports Android, iOS, and Windows apps.

Keuntungan:
- Membantu regression tes menjadi lebih mudah
- Mendukung multiple platform dan language (android, IOS dll)
- Menggunakan  testing apapun
- tidak membutuhkan source

Kekurangan:
- tidak mendukung android versi 17 kebawah
- lambat digunakan pada platform IOS
- gesture support sangat terbatas<br><br><br>

**Arsitektur Level Appium**<br><br>
**Client** akan berkomunikasi dengan **Server Appium** melalui rest API dan ditangani oleh **XCUITest, UIAutomator2/Espreso, WinAppDriver**. <br><br>

**Appium Components**<br>
terdiri dari:
- Appium Server, komponen inti dari appium.
- Appium Client, kapasitas untuk membuat beberapa sesi di beberapa perangkat.
