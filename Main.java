import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String nama;
        char jenisKelamin;
        int tahunLahir, umur;

        Scanner objInput = new Scanner(System.in);

        System.out.print("Masukkan Nama: ");
        nama = objInput.nextLine();

        System.out.print("Masukkan Jenis Kelamin (L/P): ");
        jenisKelamin = objInput.next().charAt(0);

        System.out.print("Masukkan Tahun Lahir: ");
        tahunLahir = objInput.nextInt();

        int tahunSekarang = LocalDate.now().getYear();
        umur = tahunSekarang - tahunLahir;

        String jenisKelaminText;
        if (jenisKelamin == 'L' || jenisKelamin == 'l') {
            jenisKelaminText = "Laki-laki";
        } else if (jenisKelamin == 'P' || jenisKelamin == 'p') {
            jenisKelaminText = "Perempuan";
        } else {
            jenisKelaminText = "Tidak diketahui";
        }

        System.out.println("Nama: " + nama);
        System.out.println("Jenis Kelamin: " + jenisKelaminText);
        System.out.println("Umur: " + umur + " tahun");

        objInput.close();
    }
}
