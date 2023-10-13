import java.util.Scanner;

public class CariTempatMakan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Langkah 1: Pemahaman Masalah
        System.out.println("Anda ingin mencari tempat makan. Masukkan lokasi Anda: ");
        String lokasi = scanner.nextLine();

        // Langkah 2: Representasi Ruang Masalah (Tidak diperlukan dalam program ini)

        // Langkah 3: Penentuan Tujuan
        System.out.println("Masukkan jenis makanan yang Anda inginkan: ");
        String jenisMakanan = scanner.nextLine();

        // Langkah 4: Pemilihan Strategi Pencarian (Pencarian Online)
        System.out.println("Mencari restoran terdekat untuk " + jenisMakanan + " di " + lokasi + "...");

        // Langkah 5: Pencarian dan Evaluasi Solusi (Simulasi hasil pencarian)
        // Misalnya, daftar restoran disimulasikan sebagai array
        String[] restoran = {"Resto A", "Resto B", "Resto C", "Resto D"};

        // Langkah 6: Eksekusi
        if (restoran.length > 0) {
            System.out.println("Berikut adalah restoran yang ditemukan:");
            for (String r : restoran) {
                System.out.println(r);
            }
        } else {
            System.out.println("Maaf, tidak ada restoran yang ditemukan sesuai kriteria.");
        }
    }
}
