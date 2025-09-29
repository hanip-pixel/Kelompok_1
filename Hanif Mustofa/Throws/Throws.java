import java.io.IOException;

public class Throws {

    // Metode yang mendeklarasikan bisa melempar IOException
    public static void bacaFile() throws IOException {
        // Melempar exception secara manual
        throw new IOException("File tidak ditemukan");
    }
}