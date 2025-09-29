public class Throw {
    
    // Metode untuk mengecek usia
    public static void cekUsia(int usia) {
        if (usia < 18) {
            // Melemparkan exception secara manual
            // Kita ubah menjadi public static agar mudah diakses dari Main.java
            throw new ArithmeticException("Usia tidak boleh kurang dari 18 tahun");
        } else {
            System.out.println("Usia valid: " + usia);
        }
    }
}