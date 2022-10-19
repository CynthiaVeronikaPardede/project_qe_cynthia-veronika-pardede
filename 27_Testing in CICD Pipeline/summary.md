# qe_cynthia-veronika-pardede
## **Section 27**<br><br>
### **Testing in CI/CD Pipeline**<br><br>

**Continuous Integration** <br>
Continuous Integration adalah praktik pengembangan software dimana developer mengubah kode serta melakukan merge pada sebuah repository atau penyimpanan secara reguler secara terus menerus.  Jika ada push dan commit yang baru maka akan dijalankan dan hasilnya dapat langsung diketahui. Jika ada kesalahan maka  developer bisa melakukan tindakan dengan memperbarui koe sehingga, kualitas ditingkatkan dan menghemat waktu serta melakukan validasi dan update. CI sebagai solusi menyederhanakan tahapan pengembangan software sehingga issue bisa diperbaiki.  <br><br>
CI terdapat 3 stage:
1. Build
2. Unit Test
3. Integration Test<br><br>


Setelah selesai akan dilanjutkan ke CD (Continuous Delivery)/deployment.<br><br>
**Continuous Delivery**<br>
Continuous Delivery adalah proses setelah CI, dimana developer sudah menjalankan build dan test dan memilih untuk tidak melimpahkannya ke CI. 
Continuous Deployment adalah fase akhir dari CD. yaitu fase  setelah CI selesai dijalankan dan otomatis akan release ke production<br><br>

**Delivery vs Deployment**<br>
Delivery butuh manual action untuk release ke production sedangkan development langsung release ke deployment tanpa perlu approval dari developer<br><br>

**Hal yang membuat CI bagus**<br>
- Decoupled Stages => step-step yang berjalan harus mengerjakan CI dengan single task. berfokus pada task. 
- Repeatable => stages dapat dipakai berulang-ulang
- Fail Fast => ketika ada error di line yang pertama maka langsung fail.
- Design with system in mind => tercover ke development sepert: application, infrastructure, configuration, data.
- Pipelines => meningkatkan confidences untuk bisa ke production
- Globally Unique versions => mengerti stage-stage setiap waktu dan perbedaan current stage dan future stage. <br><br>


**CI/CD Process**<br>
yaitu proses yang berkelanjutan dalam software deployment. 
1. Commit
2. Build
3. Test
4. Deploy<br><br>

**Manfaat CI/CD:**<br>
dapat mendeteksi bug dengan cepat
bug yang ditemukan akan dikurangi
mempercepat proses release
efisien<br><br>

**Manfaat CD**<br>
- Reduce the risk
- painless deployment
- reduces cost
- automated and transparent process
- release more frequently<br><br>

**CI Cost:**
- White automated test
- server for automated test
- merge the code as often as possible<br><br>

**CD/Deployment Cost:**
- Strong Foundation in CI
- Need Highest quality of test
- dokumentation need to be updated frequently<br><br>

**CI/CD Tools:**
1. Jenkins 
yang paling sering digunakan. Open source. menggunakan bahasa pemrograman Java dengan plugin dibagun menggunakan CI<br><br>
Kelebihan:
    - Open source tools
    - easy to install
    - over 1000++ plugins
    - build with java
    - free of cost
    - automatically minotaur code quality and metrics
2. Bamboo
yaitu yang dapat mengintegrasi management perilisan software sekaligus menciptakan continues delivery tesplaint<br>
kelebihan:
    - 100 remote build agents
    - parallel test
    - create image and save to register
    - ensures easy and fast functionality
3. circleci
uaotu memudahkan untuk menerapkan CI/CD.dapat diintegrasikan dengan github dll<br>
Kelebihan:
    - Allows to select build env
    - support many language
    - automatically cancel any queued
    - integrate with vcs tools
    - optional caching and parallelism
    - split and balance test
4. AWS Code Build
yaitu CI//CD tools yang mendeveloper untuk build dan test code to continuous scale.<br>
Kelebihan:
    - continuous scale
    - extensible
    - secure
    - integrate and delivery with  another tools
5. Azure DevOps
yaitu yang dapat relis di plaing testing, deploying atau distibusi. dibuat oleh microsoft<br>
kelebihan:
    - free
    - full features
    - support net
    - fast and easy process
6. CICD
7. Travis CI
yaitu tools pertama untuk service tools. bisa dilakukan dalan build di cloud<br>
Kelebihan:
    - easy deployment and configuration
    - integrate with another tools
    - parallel test
    - support multiple language
8. Github Action
yaitu untuk melakukan automation test dan development<br>
Kelebihan:
    - hosted VM with multiple OS
    - CI templates
    - simple container and OS testing
    - free
9. Gitlab CI
yaitu CI dari gitlab yang dapat digunakan untuk mengatur development software. berbasis <br>
Kelebihan:
    - Integrated in gitlab interface
    - simple usage
    - integrate with other tools
    - execute on multiple platform
    - open source<br><br>

**Github Action**<br><br>
Komponen:
1. Workflows yaitu proses otomatis yang menjalankan 1 atau lebih jobs. sebagai file YAML yang untuk mengecek repository dan akan berjalan saat di trigger secara manual. dapat memilih workflow yang berbeda.
2. jobs yaitu serangkaian steps in workflow saat di execute saat menjalankan bersamaan. tidak mendeteksi jobs lain. akan berjalan secara paralel.
3. action yaitu aplikasi khusus untuk melakukan jobs yang complex dan selalu berulang dan menarik repository dari github.
4. event yaitu aktivitas spesifik dalam repository trigger workflow berjalan. 

