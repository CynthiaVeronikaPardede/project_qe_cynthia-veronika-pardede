# qe_cynthia-veronika-pardede

## PRACTICE TIME <br><br>

1. Cobalah semua Linux Command yang sudah dijelaskan di materi ini. (Screenshot dan Analisa/Keterangan)<br><br>Jawab:<br>
**Linux Commands Structure**<br><br>
ls (list directory content) berfungsi untuk menampilkan semua file di direktori  kerja.<br> 
    - -a menampilkan output termasuk file dan folder yang tersembunyi (hidden file and folder, biasanya diawali dengan '.').
    
    - -l menampilkan output yang lengkap, beserta informasi mengenai hak akses, pemilik, grup, ukuran, dan tanggal modifikasi.
    - Is -al membuat daftar file dan direktori yang memuat informasi mendetail, seperti permission (hak akses), ukuran (size), pemilik (owner), dll. <br><br>![Soal](/10_Linux%20Basic%20Command/screenshots/1.png)<br><br> ![Soal](/10_Linux%20Basic%20Command/screenshots/2.png)<br><br>
    ![Soal](/10_Linux%20Basic%20Command/screenshots/3.png)<br><br>

    **Basic Command**<br>
    - cal cal berfungsi untuk menampilkan calender
    ![Soal](/10_Linux%20Basic%20Command/screenshots/4.png)<br>

    - date berfungsi untuk menampilkan tanggal dan zona waktu yang tertera di OS
    ![Soal](/10_Linux%20Basic%20Command/screenshots/5.png)<br>
    - etc<br><br>


    **File System Commands**<br>
    - touch untuk membuat file yang kosong melalui baris perintah linux
    ![Soal](/10_Linux%20Basic%20Command/screenshots/6.png)<br><br> Setelah perintah diatas ditambahkan maka akan muncul  file baru dengan nama "Praktikum.txt"
    ![Soal](/10_Linux%20Basic%20Command/screenshots/7.png)<br><br>
            
    - cat untuk membuat daftar konten atau isi file pada standar output ![Soal](/10_Linux%20Basic%20Command/screenshots/8.png)<br>tidak memunculkan apa-apa karena belum ditemukan isi dari file praktikum.txt.<br><br>
    ![Soal](/10_Linux%20Basic%20Command/screenshots/9.png)<br><br>Setelah ditambahkan isi dari file praktikum.txt, maka akan muncul isi filenya pada saat command cat dipanggil.![Soal](/10_Linux%20Basic%20Command/screenshots/10.png)<br>
        
    - cp untuk untuk menyalin file ke direktori yang berbeda<br>
    ![Soal](/10_Linux%20Basic%20Command/screenshots/11.png)<br> Setelah dilakukan perintah seperti tampilan diatas maka file praktikum.txt yang ada pada home akan dicopy ke folder Document. ![Soal](/10_Linux%20Basic%20Command/screenshots/12.png)<br>
        
    - mv untuk memindahkan  file meskipun sebenarnya untuk mengganti mengubah nama file <br>![Soal](/10_Linux%20Basic%20Command/screenshots/13.png)<br> Setelah perintah diatas dijalankan maka file  praktikum.txt akan berpindah ke folder Music. Sehingga file praktikum.txt yang ada di home akan hilang dan berpindah ke folder Music.<br><br>
    ![Soal](/10_Linux%20Basic%20Command/screenshots/14.png)<br><br>


    - rm untuk menghapus direktori beserta isinya<br><br>![Soal](/10_Linux%20Basic%20Command/screenshots/15.png)<br><br> Setelah perintah diatas diajalan maka file "coba" akan terhapus.
    ![Soal](/10_Linux%20Basic%20Command/screenshots/16.png)<br>
        

    - mkdir untuk untuk membuat direktori baru
    ![Soal](/10_Linux%20Basic%20Command/screenshots/17.png)<br> Akan memunculkan folder baru di HOME
    ![Soal](/10_Linux%20Basic%20Command/screenshots/18.png)<br><br>

        
    - rmdir untuk menghapus direktori yang kosong ![Soal](/10_Linux%20Basic%20Command/screenshots/20.png)<br> Setelah perintah diatas dijalan maka folder ALTA akan terhapus
    ![Soal](/10_Linux%20Basic%20Command/screenshots/19.png)<br>



    - cd untuk menjelajahi direktori linux
    ![Soal](/10_Linux%20Basic%20Command/screenshots/21.png)<br>


    - pwd untuk mencari path dari direktori yang digunakan saat ini dan akan mengembalikan path yang absolute yang pada dasarnya path semua direktori yang diawali dengan garis miring
    ![Soal](/10_Linux%20Basic%20Command/screenshots/22.png)<br><br>

    **Processes Control Commands**<br>
    - top menampilkan daftar proses yang sedang berlangsung dan seberapa banyak ruang CPU yang digunakan oleh tiap proses tersebut, melakukan pengawasan terhadap penggunaan resource sistem sangatlah disarankan terutama ketika mencari tau dimana proses yang perlu dimatikan karena terlalu banyak menggunakan resource. ![Soal](/10_Linux%20Basic%20Command/screenshots/23.png)<br><br>
        
    - clear untuk membersihkan terminal ketika didalamnya sudah banyak command
    ![Soal](/10_Linux%20Basic%20Command/screenshots/24.png)<br><br>
    Apabila perintah diatas telah dijalankan maka keseluruhan isi terminal akan terhapus.
    ![Soal](/10_Linux%20Basic%20Command/screenshots/25.png)<br><br>


    - history mengecek kembali (review) command yang sudah ditambahkan sebelumnya.
    ![Soal](/10_Linux%20Basic%20Command/screenshots/26.png)<br><br>

    - etc<br><br>

    **Utilities Program Command**<br>
    - ls menampilkan semua file di directory kerja
    ![Soal](/10_Linux%20Basic%20Command/screenshots/27.png)<br>

    - which mencari file yang dapat dieksekusi terkait dengan command yang diberikan
    ![Soal](/10_Linux%20Basic%20Command/screenshots/28.png)<br>

    - sudo (super user do) menjalankan task yang memerlukan hak akses 
    ![Soal](/10_Linux%20Basic%20Command/screenshots/29.png)<br>
        
    - find untuk mencari file atau direktori 
    ![Soal](/10_Linux%20Basic%20Command/screenshots/30.png)<br>
    - etc <br><br>


    **File Access Permissions**<br>
    - chmod untuk membaca menulis dan menjalankan permissions dari file dan direktori
    ![Soal](/10_Linux%20Basic%20Command/screenshots/31.png)<br>

    - chown untuk mengubah atau mentransfer kepemilikikan file khusus atau yang spesifik.
    ![Soal](/10_Linux%20Basic%20Command/screenshots/32.png)<br>

    - etc<br><br>

2. Buatlah Shell Script dengan minimal 5 Command dan jelaskan. (Screenshot dan Keterangan)<br><br>Jawab:<br>
Shell Script adalah sebuah bahasa pemograman yang disusun berdasarkan komen-komen shell dan program yang berfungsi sebagai jemabatan atara user dan kernel.<br>
**echo** untuk memindahkan beberapa data ke dalam satu file.atau mencetak string yang akan di proses sebagai argumen ke output standar.atau skrip shell untuk menampilkan pesan atau menampilkan hasil dari perintah lain.<br><br>
![Soal](/10_Linux%20Basic%20Command/screenshots/a.png)<br>
Tampilan diatas menunjukkan bahwa bahwa echo yang pertama berbeda dengan echo yang kedua karena echo yang pertama tertimpa oleh echo yang kedua.<br><br>
![Soal](/10_Linux%20Basic%20Command/screenshots/b.png)<br> Berbeda dengan tampilan diatas, tampilan diatas menunjukkan 2 output yang berbeda untuk dimunculkan dikarenakan syntax pada perintah di command “>>”<br><br><br>
Apabila ingin menambahkan isi dari file task,txt dapat menggunakan “nano task.txt”
![Soal](/10_Linux%20Basic%20Command/screenshots/c.png)<br><br> Akan memunculkan text editor  di linux seperti tampilan dibawah ini
![Soal](/10_Linux%20Basic%20Command/screenshots/d.png)<br><br><br>


Untuk menampilkan "Hello World!!"<br>
![Soal](/10_Linux%20Basic%20Command/screenshots/e.png)<br><br> Akan ditampilkan apabila dipanggil<br>
![Soal](/10_Linux%20Basic%20Command/screenshots/f.png)<br><br><br>


Untuk menampilkan hasil test dengan inputan nama dengan menprint "Hello 'nama yang diinput'"
![Soal](/10_Linux%20Basic%20Command/screenshots/g.png)<br><br>
![Soal](/10_Linux%20Basic%20Command/screenshots/h.png)<br><br><br>


Untuk menampilkan hasil dari penjumlahan 3+9 <br>Ekspresi numerik juga dapat dihitung dan disimpan dalam variabel 
![Soal](/10_Linux%20Basic%20Command/screenshots/i.png)<br><br>
![Soal](/10_Linux%20Basic%20Command/screenshots/j.png)<br><br> Untuk menampilkan hasil bagi dari 6/4 dengan scalenya 2, 2 angka dibelakang koma
![Soal](/10_Linux%20Basic%20Command/screenshots/k.png)<br><br>
![Soal](/10_Linux%20Basic%20Command/screenshots/l.png)<br><br><br>


Untuk menampilkan penjumlahan namun dengan input yang diinput sendiri.
![Soal](/10_Linux%20Basic%20Command/screenshots/m.png)<br><br>
![Soal](/10_Linux%20Basic%20Command/screenshots/n.png)<br><br><br>


Untuk menampilkan hasil bagi dari 6/4 dengan scalenya 2, 2 angka dibelakang koma
![Soal](/10_Linux%20Basic%20Command/screenshots/k.png)<br><br>
![Soal](/10_Linux%20Basic%20Command/screenshots/l.png)<br><br><br>


Untuk menampilkan penjumlahan namun dengan input yang diinput sendiri.
![Soal](/10_Linux%20Basic%20Command/screenshots/m.png)<br><br>
![Soal](/10_Linux%20Basic%20Command/screenshots/n.png)<br><br><br>


Untuk menampilkan loop dengan meloop angka 1 sampai 5. Loop memungkinkan untuk mengeksekusi pernyataan beberapa kali.
![Soal](/10_Linux%20Basic%20Command/screenshots/o.png)<br><br>
![Soal](/10_Linux%20Basic%20Command/screenshots/p.png)<br><br><br>


Untuk menampilkan "Saya belajar" dari sekelompok perintah yang dapat digunakan sebagai single handle. Untuk menjalankan kumpulan perintah ini, panggil fungsi dengan nama yang diberikan.
![Soal](/10_Linux%20Basic%20Command/screenshots/r.png)<br><br>
![Soal](/10_Linux%20Basic%20Command/screenshots/s.png)<br><br>