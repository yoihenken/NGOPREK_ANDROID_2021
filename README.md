# NGOPREK_ANDROID_2021
Ngoprek Mobile Android 


Android Lifecycke

-   **onCreate()**
    
    Di-_method_  ini Activity sudah dimulai tapi belum terlihat oleh pengguna. Inisialisasi sebagian besar dimulai di sini. Misalnya memanggail  `setContentView()`  untuk membaca layout, membaca View, dll.
    
-   **onStart()**
    
    Activity sudah terlihat tapi belum bisa berinteraksi.  _Method_  ini jarang dipakai, tapi bisa sangat berguna untuk mendaftarkan sebuah BroadcastReceiver untuk mengamati perubahan yang dapat mempengaruhi UI.
    
-   **onResume()**
    
    Activity sudah terlihat dan pengguna sudah dapat berinteraksi. Di sini adalah tempat terbaik untuk menjalankan animasi, membuka akses seperti camera, mengupdate UI, dll.
    
-   **onPause()**
    
    Kebalikan dari  `onResume()`. Activity sudah akan bersiap-siap meninggalkan layar (masih terlihat) dan sudah tidak berinteraksi dengan pengguna. Biasanya bila perlu melakukan  _undo_  untuk pekerjaan yang dilakukan di  `onResume()`  kita lakukan di sini.
    
-   **onStop()**
    
    Kebalikan dari  `onStart()`  Activity sudah tidak terlihat. Biasanya kita melakukan  _undo_  untuk pekerjaan yang dilakukan di dalam  `onStart()`.
    
-   **onDestroy()**
    
    Kebalikan dari  `onCreate()`. Method ini dapat terpanggil karena memanggil method  `finish()`  atau karena sistem membutuhkan memori lebih. Di dalam  `onDestroy()`  kita biasanya membersihkan proses-proses yang ada di belakang layar. Misalnya pengunduhan data dari internet yang mungkin masih berjalan jika tidak dihentikan di  `onDestroy()`.
    
-   **onRestart()**
    
    Dipanggil saat activity sudah melalui  `onStop()`  tapi akan diaktifkan lagi. Method ini jarang di implementasi.
