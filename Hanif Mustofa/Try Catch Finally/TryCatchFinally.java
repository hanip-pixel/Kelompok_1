// File: ContohTryCatchFinally.java
public class TryCatchFinally {
    
    // Metode untuk menjalankan logika try-catch-finally
    public static void jalankanLogika() {
        try {
            // Kode yang berpotensi error
            int angka = 10 / 0; // Ini akan menyebabkan ArithmeticException
            System.out.println("Hasil: " + angka);
        } catch (ArithmeticException e) {
            // Menangani error jika terjadi pembagian dengan nol
            System.out.println("Terjadi error: Pembagian dengan nol tidak diperbolehkan");
        } finally {
            // Kode ini selalu dijalankan
            System.out.println("Blok finally selalu dijalankan, baik ada error atau tidak");
        }
    }
}