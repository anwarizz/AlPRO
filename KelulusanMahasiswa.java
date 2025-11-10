import java.util.Scanner;

public class KelulusanMahasiswa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nama mahasiswa: ");
        String nama = input.nextLine();

        System.out.print("Masukkan nilai mahasiswa: ");
        double nilai = input.nextDouble();

        String keterangan;
        if (nilai > 60) {
            keterangan = "Lulus";
        } else {
            keterangan = "Tidak Lulus";
        }

        // Menampilkan hasil
        System.out.println("\n=== Hasil Kelulusan ===");
        System.out.println("Nama       : " + nama);
        System.out.println("Nilai      : " + nilai);
        System.out.println("Keterangan : " + keterangan);

        input.close();
    }
}
