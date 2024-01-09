import java.util.Scanner;
//Nama : Humaidi
//NPM : 2022020200009
public class AplikasiPerpustakaan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pilihan = 0;

        while (pilihan != 4) {
            System.out.println("===== Aplikasi Perpustakaan =====");
            System.out.println("1. Cari Buku");
            System.out.println("2. Pinjam Buku");
            System.out.println("3. Kembalikan Buku");
            System.out.println("4. Keluar");
            System.out.print("Masukkan pilihan Anda: ");
            pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.println("Anda memilih opsi Cari Buku");
                    cariBuku();
                    break;
                case 2:
                    System.out.println("Anda memilih opsi Pinjam Buku");
                    pinjamBuku();
                    break;
                case 3:
                    System.out.println("Anda memilih opsi Kembalikan Buku");
                    kembalikanBuku();
                    break;
                case 4:
                    System.out.println("<=Thank you for using our application😁=>");
                    System.out.println("              ©humaidi2023");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
                    break;
            }
        }

        scanner.close();
    }

    private static void cariBuku() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Daftar Buku:");
        System.out.println("1. Buku sakti pemrograman web");
        System.out.println("2. Buku python 3");
        System.out.println("3. Buku HTML CSS JAVASCRIPT");
        System.out.println("4. Buku PHP");
        System.out.println("5. Buku Database MySql");
        System.out.print("Masukkan nomor buku yang ingin dicari: ");
        int nomorBuku = scanner.nextInt();

        String judulBuku = "";

        switch (nomorBuku) {
            case 1:
                judulBuku = "Buku sakti pemrograman web";
                break;
            case 2:
                judulBuku = "Buku python 3";
                break;
            case 3:
                judulBuku = "Buku HTML CSS JAVASCRIPT";
                break;
            case 4:
                judulBuku = "Buku PHP";
                break;
            case 5:
                judulBuku = "Buku Database MySql";
                break;
            default:
                System.out.println("Nomor buku tidak valid.");
                scanner.close();
        }

        System.out.println("Anda memilih buku nomor " + nomorBuku + ": " + judulBuku);
        System.out.println("Silahkan Pilih:");
        System.out.println("1. Pinjam Buku?");
        System.out.println("2. Kembalikan Buku?");
        System.out.print("Masukkan pilihan Anda: ");
        int pilihan = scanner.nextInt();

        switch (pilihan) {
            case 1:
                System.out.println(judulBuku + " berhasil dipinjam.");
                System.out.println("        <<<Terimakasih>>>");
                break;
            case 2:
                System.out.println(judulBuku + " berhasil dikembalikan.");
                System.out.println("         <<<Terimakasih!>>>");
                break;
            default:
                System.out.println("Pilihan tidak valid.");
                break;
        }

    }

    private static void pinjamBuku() {
        System.out.println("   Untuk Pinjam Buku Klik Menu 1");
        System.out.println("   <<Silahkan Cari Buku di Menu 1>>");
    }

    private static void kembalikanBuku() {
        System.out.println("   Anda Masih Belum Meminjam Buku");
        System.out.println("    <<Silahkan Cari Buku di Menu 1>>");
    }
}
