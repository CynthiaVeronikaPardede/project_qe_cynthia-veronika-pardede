# qe_cynthia-veronika-pardede

<b>W1</b><br/><br/>

<b>Video KMQE – Version Control and Branch Management (Git)<b><br/><br/>
Versioning
Yaitu yang mengatur versi atau pelacakan perubahan dari source code program. 
Tujuan untuk mengetahui perubahan:
  <ol type="a">
    <li>Supaya dapat ngetrack kira-kira kesalahan dalam proyek apa</li>
    <li>Yang mengubah code siapa</li>
    <li>Yang disubah apa saja</li>
  </ol>


Kalau tidak ada pencatatan maka tidak memanajemen proyek dengan baik. <br/>
“Untuk nge track setiap perubahan dalam sebuah proyek”.<br/>
Tidak ada proyek yang sempurna. 
Tool yang digunakan untuk melakukan revisi  adalah
<ol type="A">
  <li>
    Version Control System (VCS)<br/>
    Single User 🡪 sudah tertracking tetapi di local<br/>
    - SCCS – 1972 hanya Unix (hanya di local saja karena internet tidak secepat yang sekarang dan sudah ter tracking) dan 
    - RCS -182 hanya Cross platform dan text
    - Centralized 🡪 sudah ada system terpusat di internet atau di server local sendiri, sifatnya ambil ke pusat
    - CVS – 1986, File focus
    - Perforce – 1995
    - Subversion – 2000, track directory structure
    - Microsoft Team Foundation Server – 2005 
    - Distributed 🡪 penggabungan dari single user dan centralized (ada server dan local), ada server pusat, mengeditnya di local namun sudah di synchronize ke server. Banyak perintah command.
    Git – 2005
    Yaitu salah satu version control system popular yang digunakan para developer untuk mengembangkan software secara bersama-sama.
    Mercurial – 2005
    Bazaar - 2005 

Note:
Terdistribusi bukan tersentralisasi, jika ada masalah di server maka file masih ada di local  sehingga tidak akan berpengaruh pada local.

Git Repository (Folder project)
Disini akan ada 2 file yaitu project yang sudah dikerjakan dan folder .git biasanya terhidden berisi semacam konfigurasi dan pencatatan perubahan di project tersebut. Git akan ngetrack semua perubahan dan kapan berubah dan semuanya. Git dapat melakukan “undo” dengan cara mereset. Setiap perubahan dan ketika mengupdate akan dikirimkan dalam 1 paket/commit. Setiap commit ada pesan dan dikirim ke dalam remote server. Commit semacam riwayat perubahan. 
    Github, gitlab, dan bitbucket yaitu git server yang menampung repository atau projek di sebuah server.
    Github ada 2 yaitu
    a. public => dapat diakses oleh orang lain (bersifat open source)
    b. private => hanya dapat diakses oleh pembuat maupun oleh kolaborator yang diberikan akses oleh pembuat
  </li>
  <li>
    Source Code Manager (SCM)
  </li>
  <li>
    Revision Control System(RCS)
  </li>

</ol>

 Perintah Git:
  -git init,untuk inisialisasi awal
  -git add, untuk menambahkan file yang mau kita ubah
  -git commit, untuk menyimpan perubahan sudah dilakukan
  -git branch, untuk membuat branch percabangan
  -git push, untuk menyimpang perubahan di repository global
  -git chechout, untuk mengecek kita berada di branch mana
  -git merge, untuk menyatukan branch yang kita buat dengan branch master
  
  <b>Git Stash</b>
  Git Stash yaitu penyimpanan sementara didalam folder stash area, sehingga cargo disimpan di sash tersebut dan digunakan stash akan dikembalikan
  - git stash apply => mengembalikan stash yang digunakan
  - simbol conflict pada git adalah <<<<<=====>>>>>

Tiga option:
  - accept current change
    <br/>mengembalikan perubahan yang dilakukan sebelum melakukan git stash apply (sesudah melakukan git stash sebelumnya)
  - accept incoming change
    <br/>mengembalikan perubahan yang berasal dari git stash sebelumnya (menghilangkan perubahan yang dilakukan setelah melakukan git stash)
  - accept both change
    <br/>mengembalikan perubahan yang sudah dilakukan setelah stash, ditambah dengan perubahan yang berasal dari stash area.
