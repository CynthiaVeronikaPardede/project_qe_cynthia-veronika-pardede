# qe_cynthia-veronika-pardede

## **Linux Basic Command** <br><br>

Linux Commands adalah sebuah utilitas dari sistem operasi linux. Semua tugas dasar dapat dilakukan dengan menjalankan commands. Commands dijalankan di terminal linux. Terminal merupakan antarmuka baris perintah untuk berinteraksi dengan sistem yang mirip dengan command form di windows.  Command di linux sentitif terhadap huruf besar dan huruf kecil. <br>
Command line di linux sepenuhnya “TEXT-BASED” dan lebih cepat dibandingkan dengan menggunakan GUI. <br><br>
Kelebihan:<br>
1. Less Resources, command line ringan digunakan dan tidak mengharuskan komputer untuk memiliki spesifikasi tinggi. 
2. Repetitive Task Friendly, dapat menyimpan script untuk meautomatiskan tugas yang sama berulangkali. 
3. Powerful, karena hanya menggunakan test antarmuka sistem operasi  terlihat lebih stabil dibandingkan GUI. Tidak akan mempengaruhi aktivitas karena tidak memakan resource memori yang terlalu banyak dan lebih stabil.<br><br><br>

**Linux Commands Structure**<br>

command [options] [parameter]<br><br>
Contoh:<br>
ls berfungsi untuk menampilkan semua file di direktori  kerja. Pada prakteknya command tanpa option tidak berguna, mungkin harus membutuhkan direktori file khusus atau daftar file dari direktori tertentu pada kondisi yang paling komplek.<br><br>
ls -a/ust<br>

ls -a -l<br>
ls -al<br><br>


**Basic Command**<br>
- cal berfungsi untuk menampilkan calender
- date berfungsi untuk menampilkan tanggal dan  zona waktu yang tertera di OS
- etc <br><br><br>

**File System Commands**<br>
- touch untuk membuat file yang kosong melalui baris perintah linux
- cat untuk membuat daftar konten atau isi file pada standar output
- cp untuk untuk menyalin file ke direktori yang berbeda
- mv untuk memindahkan  file meskipun sebenarnya untuk mengganti mengubah nama file 
- rm untuk menghapus direktori beserta isinya
- mkdir untuk untuk membuat direktori baru
- rmdir untuk menghapus direktori yang kosong
- cd untuk menjelajahi direktori linux
- pwd untuk mencari path dari direktori yang digunakan saat ini dan akan mengembalikan path yang absolute yang pada dasarnya path semua direktori yang diawali dengan garis miring<br><br><br>

**Processes Control Commands**<br>
- top menampilkan daftar proses yang sedang berlangsung dan seberapa banyak ruang CPU yang digunakan oleh tiap proses tersebut, melakukan pengawasan terhadap penggunaan resource sistem sangatlah disarankan terutama ketika mencari tau dimana proses yang perlu dimatikan karenaa terlalu banyak menggunakan resource.
- clear untuk membersihkan terminal ketika didalamnya sudah banyak command
- history
- etc<br><br><br>

**Utilities Program Command**<br>
- ls menampilkan semua file di directory kerja
- which mencari file yang dapat dieksekusi terkait dengan command yang diberikan
- sudo (super user do) menjalankan task yang memerlukan hak akses 
- find mencari file atau direktori 
- etc<br><br><br>

**File Access Permissions**<br>
- chmod untuk membaca menulis dan menjalankan permissions dari file dan direktori
- chown untuk mengubah atau mentransfer kepemilikikan file khusus atau yang spesifik.
- etc<br><br>

![Soal](/10_Linux%20Basic%20Command/screenshots/summary.png)<br><br>

d  rwx  rwx rwx<br>
B=111 111 111<br>
D= 7       7      7<br>
 
'd' -> berkategori direktori<br>
'-'  -> berkategori file<br>

rwx => permission untuk pemilik file<br>
rwx => permission untuk grup ownernya<br>
rwx => permission untuk user lain<br><br>

**Shell Script**<br><br>
Shell Script adalah sebuah bahasa pemograman yang disusun berdasarkan komen-komen shell dan program yang berfungsi sebagai jemabatan atara user dan kernel.<br><br>
Keuntungan:<br>
Ketika ingin mengeksekusi beberapa commands secara berturut-turut dari hal itu harus menunggu command pertama baru dapat melakukan command berikutnya. <br><br>
Shell Script tidak perlu menunggu lagi dan tinggal menuliskan apa saja yang akan dilakukan sesuai urutan yang dieksekusi dengan 1 klik saja. 

