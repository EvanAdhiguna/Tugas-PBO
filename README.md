# <p align="center">**Pemesanan Makanan Online**</p>

# **Pengenalan**
Selamat datang di program Pemesanan Makanan Online!
Program ini dibuat menggunakan konsep Object Oriented Programming (OOP) dan menggunakan bahasa pemrograman Java. Program ini menggunakan basis Command Line Interface (CLI) dan dijalankan melalui terminal.
<br>

# **UML Program**
Program makanan online ini memiliki 6 class utama. Kelima class tersebut yaitu Admin, Login, Main, Menu, Order, Restaurant. Hubungan antara class-class tersebut dapat dilihat pada Unified Modeling Language (UML) berikut.
<img src = "IMAGE/UML PBO.png">
<br>

# **Alur Program**
Alur jalannya program makanan online adalah sebagai berikut.<br>

**1) Login** <br>
Peratama pengguna akan dihadapkan dengan tampilan login yang dimana pengguna diminta untuk menginput username dan password. Pada program ini terdapat dua tipe yaitu admin dan customer. Jika pengguna menginputkan [username == customer] dan [password == kelazz] maka program akan berjalan sebagai customer sedangkan ketika pengguna menginputkan[username == evan] dan [password == gacorr] maka program akan berjalan sebagai admin. <br>
<img src = "IMAGE/login.png"><br>Gambar diatas merupakan tampilan dari menu Login. Dapat dilihat pada gambar, menu pengguna akan diminta untuk memasukkan username dan password.

**2) Admin Menu**<br>
Ketika pengguna masuk sebagai admin Tampilan awal yang dihadapkan pengguna adalah adalah Admin menu. Pada tahap ini, sebagai admin dapat melihat daftar restoran, menambah restoran, dan menghapus restoran.<br>
<img src = "IMAGE/adminMenu.png"><br>Gambar diatas merupakan tampilan dair menu admin. Pada tahap ini, admin dapat menentukan aksi yang akan dilakukannya.

**3) Lihat Restoran**<br>
Sebagai seorang Admin dapat melihat restoran apa saja yang telah dimilikinya. 
<img src = "IMAGE/lihatRestoran.png"><br> Gambar diatas adalah tampilan saat memilih pilihan lihat restoran. Disini admin dapat melihat semua restoran yang dimilikinya. 

**4) Tambah Restoran**<br>
Selain melihat restoran, admin juga dapat menambahkan restoran. Pada saat menambah restoran, admin diharuskan untuk menyertakan id restoran nama restoran, dan lokasi dari restoran. <br>
<img src = "IMAGE/tambahRestoran.png"><br>Gambar diatas merupakan tahap dari pilihan tambah restoran. Pada tahap ini, admin diminta untuk memasukkan id restoran, nama restoran, dan lokasi dari restoran.

**5) Hapus Restoran**<br>
Pilihan terakhir yang tersedia untuk admin adalah menghapus restoran. Tampilan dari tahap ini ketika dijalankan dapat dilihat pada gambar dibawah.<br>
<img src = "IMAGE/hapusRestoran.png"><br>Gambar diatas merupakan tahap dari pilihan hapus restoran. Pada tahap ini, admin memilih pilihan restoran mana yang akan dihapusnya.

**6) Customer**<br>
Pada bagian ini pengguna akan masuk sebagi customer dengan menginputkan [username == customer] dan [password == kelazz] di bagian login tadi. 
<img src = "IMAGE/loginCustomer.png"><br> Gambar diatas merupakan username dan password ketika ingin login sebagai customer. <br>

**7) Menu Customer**<br>
Pada bagian ini program akan berjalan dan menampilkan menu customer. Tahap ini customer dapat Order makanan/minuman, Lihat pesanan Tampilan dari menu customer dapat dilihat pada gambar dibawah ini.<br>
<img src = "IMAGE/menuCustomer.png"><br> Gambar diatas merupakan tampilan dari menu customer. <br>

**8) Melakukan Pemesanan**<br>
pada bagian ini sebagai custoer dapat membuat suatu pesanan. Awalanya, customer akan diminta untuk memilih akan memesan dari restoran mana dengan menginputkan nama restoran.<br>
<img src = "IMAGE/memilihRestoran.png"><br>
Setelah memilih restoran, customer dapat melihat menu apa saja dari restoran yang dipilihnya dan juga dapat memilih menu apa yang akan dipesan dan jumlah yang dipesan.<br>
<img src = "IMAGE/membuatOrderan.png"><br>
Setelah memilih menu yang tersedia, customer dapat memberi tahu jarak pengantaran dari restoran dengan lokasi ia bearada pada saat ini dalam(km).<br>
<img src = "IMAGE/jarakPengantaran.png"><br>
Setelah memilih menu yang akan dipesan,customer dapat memilih untuk menambah menu yang lain yang dinginkan customer atau melanjutkan ke tahap checkout. Jika customer memilih tambah pesanan, maka akan mengulang proses pada gambar diatas. dan customer juga akan diminta untuk menginputkan jarak pengantaran dari titik customer berada ke lokasi restoran

**9) Melihat Pesanan**<br>
pada bagian ini sebagai customer dapat melihat pesanan apa saja yang sudah di beli dan total pembayaran yang harus dibayar customer.
<img src = "IMAGE/billPembayaran.png">
