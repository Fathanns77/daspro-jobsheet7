/**
 * Bioskop
 */

import java.util.Scanner;

public class Bioskop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalTiket = 0;
        double totalPenjualan = 0;
        int hargaTiket = 50000;

        System.out.println("Sistem Penjualan Tiket Bioskop");
        
        while (true) {
            System.out.print("Masukkan jumlah tiket yang dibeli (ketik 0 untuk tutup hari): ");
            int tiket = sc.nextInt();

            if (tiket == 0) {
                break;
            }

            if (tiket < 0) {
                System.out.println("Input jumlah tiket tidak valid. Silakan masukkan ulang.");
                continue;
            }

            double diskon = 0;
            if (tiket > 10) {
                diskon = 0.15;
            } else if (tiket > 4) {
                diskon = 0.10;
            }

            double totalHargaTransaksi = tiket * hargaTiket * (1 - diskon);
            
            totalTiket += tiket;
            totalPenjualan += totalHargaTransaksi;
            
            System.out.println("Total pembayaran untuk transaksi ini: Rp " + totalHargaTransaksi);
            System.out.println("------------------------------------------------");
        }

        System.out.println("\n--- Rekapitulasi Penjualan Hari Ini ---");
        System.out.println("Total tiket terjual: " + totalTiket);
        System.out.println("Total pendapatan: Rp " + totalPenjualan);
        
        sc.close();
    }
}