# qe_cynthia-veronika-pardede
## **Section 21**<br><br>
### **Review Web UI Testing with Serenity**<br><br>

Suatu cara yang dilakukan untuk testing web yang dibuat. QA memastikan pekerjaan dari software engineer sudah dilakukan dengan benar.<br>
Tools yang digunakan:<br>
- Katalon
- Cypress, hanya pada web
- Robotframework (python), bisa untuk web, API, mobile
- Test project bisa digunakan untuk mobile dan web
- Serenity BDD merupakan library open source yang membantu tester dalam menulis acceptance test yang terstruktur dan laporan yang bermakna. menghasilkan laporan fitur apa yang diuji.<br><br>

Serenity BDD merupakan library open source yang membantu tester dalam menulis acceptance test yang terstruktur dan laporan yang bermakna. menghasilkan laporan fitur apa yang diuji. <br><br>Arsitektur:
- Requirement
- Tests
- Steps
- Pages
- Report<br><br><br>

**Mendefinisikan Requirement**<br><br>
Saat menggunakan Serenity, Anda mulai dengan persyaratan yang perlu Anda terapkan.
Ini sering dinyatakan sebagai "stories" pengguna dengan kriteria penerimaan yang membantu memperjelas persyaratan.
Ini adalah "stories" yang diotomatisasi Serenity.<br>

Contoh:<br>
Search by keyword<br>
In order for buyers to find what they are <br>looking for more efficiently As a seller<br>
I want buyers to be able to search for<br>
articles by keywords<br>

**Automate Acceptance Criteria**<br>
Selanjutnya, jelaskan kriteria penerimaan dalam high level business term. Record acceptance criteria menggunakan alat BDD seperti Mentimun dengan formulir "fitur", sehingga Serenity dapat menjalankannya.<br>

Contoh:<br>
Feature: Search by keyword<br>

In order for buyers to find what they are looking <br>
I want buyers to be able search articles by keywords<br>
As a seller<br><br>

Scenario: Search for articles by keyword<br>
Given I want to buy a wool scarf<br>
When I search for 'wool'<br>
Then I should see only articles related to 'wool'<br>

Scenario: Search by shop name<br>
Given I want to see articles from a particular shop <br>
When I search by shop 'docksmith<br>
Then I should find 1 shop call 'docksmith'<br><br><br>

**Implement The test**<br><br>
Serenity memberikan laporan rinci tentang hasil pengujian dan eksekusi, termasuk:
Sebuah narasi untuk setiap tes
Tangkapan layar untuk setiap langkah dalam ujian
Hasil pengujian termasuk waktu eksekusi dan pesan kesalahan jika tes gagal<br><br>


**BDD Framework With Cucumber**<br><br>
**BDD With Jbehave**<br><br>
Step:<br>
1. Menulis Story (Gherkin Syntax [Given, When, Then])
2. Configure Stories, Konfigurasi stori dan step
3. Browser Interaction, map step ke browser manipulation
4. Run Stories, Intellij iDEA, maven 
5. View Reports, membuat report menggunakan serenity<br><br><br>

### **Bagian Kedua**<br><br>
**Web Testing**<br><br>
yaitu pengujian terhadap website baik fungsionalitas pada web. Penting karena ada bug memerlukan biaya yang tinggi jika berada pada saat production atau dipakai pengguna (development).  <br><br>

**Web Automation Tools**<br>
- Katalon
- Cypress
- Test Project
- Selenium
- Robotframework<br><br><br>

**Katalon**<br><br>
Automation testing software yang dikembangkan oleh Katalon, Inc. Software ini dibangun berdasarkan open source Selenium, Appium dengan interface IDE khusus. Katalon rilis untuk penggunaan internal pada Januari 2015. Sedangkan untuk rilis publik pertamanya adalah pada September 2016.<br><br>

**Key Features**<br>
- Simple development => tools yang lain sudah di support di katalon
- Quick Easy & Setup => mudah instalasi dan dapat memilih browser
- Faster & Better Result => pengguna baru diberikan template
- Flexible Modes => record and play, pembuat script dapat memilih manual script dan record
- Ease of USe
- Multi OS Application => mendukung beberapa platform: Windows (7 ke atas),  linux, OS dll

