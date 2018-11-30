## Project Workspace

- src
    - Factory
        - Factory.java
    - Implements 
        - BaseImpl.java
        - DetailTransaksiImpl.java
        - PaketLaundrympl.java
        - PelangganImpl.java
        - TransaksiImpl.java
        - ImLaundry.java
    - Interfaces
        - IBase.java
        - IDetailTransaksi.java
        - IPaketLaundry.java
        - IPelanggan.java
        - ITransaksi.java
        - ILaundry.java
    - Models                            
        - ModelBase.java                
        - DetailTransaksi.java
        - Laundry.java
        - PaketLaundry.java
        - Pelanggan.java
        - Transaksi.java
    - Views                      
        - FrmAbout.form/java
        - FrmBatalTransaksi.form/java
        - FrmLogin.form/java
        - FrmMain.form/java
        - FrmMain.form/java
        - FrmManual.form/java
        - FrmPaket.form/java
        - FrmPelanggan.form/java
        - FrmRekapTransaksi.form/java
        - FrmTransaksi.form/java
    - sila
        - SILA.java    


## Penjelasan

1. **Folder Model** Berisi semua Object model (class) pelanggan, paket laundry dll yang akan kita gunakan dalam aplikasi.

    > Semua model mengimplementasikan interface `Serializable` agar object yang dihasilkan bisa disimpan dalam file.

2. Kita akan memiliki kumpulan object untuk di kelola. Di **Folder Interfaces** ini berisi kumpulan interface class yang masing-masing mendeklarasikan fungsi yang akan di buat untuk mengelola kumpulan object kita berdasarkan tipe/**model** yang telah kita buat di **Folder Model**. fungsi-fungsi tersebut nantinya akan diimplementasikan di class pada **folder Implements**. 

    Tujuan kita membuat interface ini adalah untuk mengabtraksi fungsi yang mengelola kumpulan object yang kita buat. Jadi di form kita tidak memanggil Fungsi tersebut secara tidak langsung tapi melalui interface (jika menggunakan database). disini akan sedikit berbeda.

3. **Folder Implements** berisi class yang mengimplementasikan fungsi - fungsi yang di deklarasikan pada interface yang kita buat. Tentunya berdasarkan tipe data(model) yang kita buat.

    Umumnya class - class di folder ini digunakan untuk berinteraksi langsung dengan entity tabel dalam database dengan menggunakan variabel `ArrayList<T>` atau `List<T>` sesuai dengan tipe/model yang telah dibuat sebagai swap data. Setelah itu mengelolanya dengan fungsi-fungsi yang biasanya berisi query ke database.
    
    Tapi karena kita tidak akan menggunakan database, maka disini kita akan menggunakan data statis yang nantinya diisi oleh user ke variabel `ArrayList<T>` atau kita juga bisa menambahkan inisial data pada konstruktor.

4. **Folder Factory** hanya berisi satu file `Factory.java`. Class ini membantu kita untuk mengakses data dan fungsi yang kita buat tadi tanpa harus mengakses semuanya sekaligus, jadi cukup yang ingin kita gunakan pada view/form Tersebut. Selain itu juga membantu kita untuk mengabstraksi fungsi yang kita implementasikan. Jadi fungsi tersebut tidak secara langsung dipanggil di view tapi melalui class `Factory` ini.

    Umumnya class ini merupakan class statis tapi karena kita tidak menggunakan database maka kita memperlakukan class ini sebagai model. Tujuannya untuk tetap mendapatkan data yang sama dari yang ditambahkan/diubah user dari form.


5. **Folder Views** berisi kumpulan form / User interface digunakan untuk memudahkan User berinteraksi dengan program ini tanpa harus mengetahui bagaimana program bekerja secara teknis.

    Disini kita menghubungkan fungsi-fungsi yang telah kita buat dengan kontrol/event pada form. Karena kita tidak menggunakan database maka cukup buat object `Factory` dan akses semua fungsi - fungsinya dari situ.

6. **Folder sila** berisi satu file `sila.java` yang merupakan main class dari aplikasi ini. class ini dieksekusi pertamakali saat program dijalankan.

> **Catatan** : Cek versi [`alpha`](https://github.com/K-SI-A/SILA/releases) untuk lebih memahami konsep diatas. 

File `Laundry.java`(models), `ILaundry.java`(interfaces), `ImLaundry.java`(implements) tidak ada kaitannya dengan aplikasi logik. _model_ disini diperlakukan seperti database yang memiliki 4 tabel dan untuk melakukan koneksi menggunakan fungsi yang diimplementasikan pada `ImLaundry.java`(implements). Karena kita tidak benar-benar menggunakan database, tentu tidak bisa melakukan query dari sini.

## Perubahan Versi Terakhir

1. Menambahkan **ModelBase.java** class. 
    Untuk mengimplementasikan konsep inheritance.

2. Menambahkan **IBase.java** Generic interface 

    Kita memiliki beberapa fungsi di setiap interface yang nantinya digunakan untuk menjalankan operasi yang sama. Disini seharunya kita bisa menggunakan konsep inheritance untuk class-class tersebut, tapi tipe data yang diproses oleh fungsi tersebut berbeda satu sama lainnya. Jadi kita menggunakan **Generic Interface** untuk bisa mengimplementasikan inheritance.

    Sehingga nantinya pada setiap interface kita menggunakan syntaks `extends IBase<type data>` pada deklarasi interfacenya.

3. Menambahkan **BaseImpl.java** Generic class

    Untuk mengimplementasikan fungsi interface **IBase.java**, juga untuk mengimplementasikan konsep inherintance pada class lainnnya.

4. User Interface baru, Dari materi PCS.