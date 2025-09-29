public class Main {
    public static void main(String[] args) {
        try {
            // Memanggil metode dari kelas ContohThrow
            Throw.cekUsia(15); // Akan melempar exception
        } catch (ArithmeticException e) {
            // Menangkap exception dari metode cekUsia()
            System.out.println("Terjadi error: " + e.getMessage());
        }

        System.out.println("Program tetap berjalan setelah throw");
    }
}