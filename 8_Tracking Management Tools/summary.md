# qe_cynthia-veronika-pardede
## **Section 8**<br><br>

### **Tracking Management Tools** <br><br>

Tracking Management Tools adalah sebuah software yang digunakan dalam mengelolah suatu proyek atau development software agar dapat berjalan secara efisien dan efektif. Seperti Jira, Tracker, Trello dsb. <br><br>

**JIRA**<br><br>
Jira dikembangkan oleh atlansia sebagai alat bantu yang bertujuan untuk 
1. Bug Tracking (pelacakan bug), 
2. Issue Tracking (pelacakan isu),
3. Project Management.<br><br>

**Fitur unggulan yang dimiliki Jira:**<br>
1. Fitur test assignment, dilengkapi dengan antarmuka mengenai workflow yang dijalankan. Hal ini membuat anggota tim bahkan tim yang lain dapat mengetahui sejauh mana progres  dari suatu proyek tersebut. 
2. Scrub dan cumbut, dalam proyek management terdapat proyek yang dapat digunakan untuk mendapatkan hasil yang maksimal. salah satu pembeda dengan aplikasi yang lain adalah pada fitur ini. Fitur ini memudahkan tim untuk melakukan brainstorming. Fitur ini cukup intuitif sehingga setiap anggota tim dapat saling berkolaborasi menentukan kolaborasi kerja, anggota tim juga dapat melihat kesalahan anggota tim lain yang diperoleh selama berproses. 
3. Road maps, gambaran kedepannya seperti apa. Anggota tim akan lebih fokus terhadap apa yang dikerjakannya, tim leader memiliki kontrol penuh dengan berbagai kerja yang dilakukan dan melihat gambaran proyek secara utuh sehingga mempermudah pengambilan keputusan. 
4. Conectivitas dengan aplikasi yang lain 
5. Laporan dan reporting, laporan dengan visualisasi yang menarik dan mempermudah tim leader dalam membuat kebijakan depannya terhadap  pengerjaan proyek. <br><br>


**Cara membuat project baru di Jira dengan metode scrum:**
1. Pastikan ada akses di Jira<br>
    - klik button drop down menu di sebelah kiri atas dan klik “create project”
    - pilih scrum dan konfirmasi
    - pilih project time
    - buat nama project
    - klik button “create project”
2. Membuat panel dengan mengklik button + dan menginput nama panel
    - Panel to do => story yang akan dikerjakan dan sudah diprioritaskan selama planning, story yang paling atas menandakan story  tersebut prioritas utama 
    - in progress => story yang sedang dikerjakan oleh software engineer dan developer. 
    - finish => story yang sudah dikerjakan oleh para developer namun belum siap  dalam testing
    - deliver => story yang  siap memasuki tahap testing oleh quality engineer
    - testing => story yang sedang dikerjakan quality engineer
    - need fix => story yang berisi hasil testing yang tidak lolos kriteria oleh tim development
    - done => story yang berisi hasil testing sudah lolos kriteria oleh team development <br><br>

**Cara membuat issue baru di Jira:** <br>
1. Issue akan melacak masalah yang mendasari proyek ataupun bug
2. Create button untuk membuat issue
memilih proyek sesuai dengan issue yang ingin dibuat
3. memilih issue type (Story, task, bug, epic):
    - Story jenis issue yang biasa digunakan untuk membuat fitur baru
    - Task jenis issue yang biasa digunakan untuk melakukan perincian tugas-tugas yang akan dikerjakan
    - Bug jenis issue yang biasa digunakan jika terjadi penemuan bug saat proses testing oleh Quality Engineer
    - Epic jenis issue untuk melakukan pengelompokan task
4. membuat summary sesuai dengan  issue yang ditemukan
5. membuat deskripsi, membuat maksud dari issue dengan jelas menggunakan format yang sama dengan dituliskan pada pivotal tracker
6. meng add participant
7. meng add label
8. mengisi  sprint => berdasarkan dari ruang waktu pengerjaan sebuah rask atau issue (1-2 minggu)
9. memilih priority, berdasarkan tingkat kesulitan sebuah  task atau issue
10. assignee => berdasarkan orang yang bertanggung jawab mengerjakan tugas
11. reporter (pembuat issue) => berdasarkan yang membuat tugas
12. tekan button create<br><br>
![Soal](/8_Tracking%20Management%20Tools/screenshots/summary.png)<br><br><br>

**Fase Pada  Jira**<br>

![Soal](/8_Tracking%20Management%20Tools/screenshots/summary2.png)<br><br>

**Apa yang perlu diperhatikan quality engineer pada Jira?** <br><br>
1. Jika  menemukan bugs, harus membuat issue dengan type  bugs kemudian jelaskan kondisi sekarang, expected seperti apa, dan langkah-langkah untuk membuat testing tersebut
2. Pindahkan story yang berkaitan dengan bug ke panel in progress

