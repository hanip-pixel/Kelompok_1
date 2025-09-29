// File: Main.java
import java.io.IOException; // Tetap diperlukan untuk menangkap IOException

public class Main {
    public static void main(String[] args) {
        try {
            // Memanggil metode yang dideklarasikan melempar IOException
            Throws.bacaFile(); 
        } catch (IOException e) {
            // Menangkap exception yang dilempar oleh metode bacaFile
            System.out.println("Terjadi error: " + e.getMessage());
        }

        System.out.println("Program tetap berjalan setelah throws");
    }
}