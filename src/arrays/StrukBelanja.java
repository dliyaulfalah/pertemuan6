package arrays;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class StrukBelanja {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // Deklarasi variabel dan array 2D
        String[][] belanjaan = new String[5][3]; // 5 barang dan 3 kolom (nama, harga satuan, jumlah)
        double totalHarga = 0, bayar, kembalian;

        try {
            // Input belanjaan
            for (int i = 0; i < belanjaan.length; i++) {
                System.out.print("Nama Barang " + (i+1) + ": ");
                belanjaan[i][0] = br.readLine();
                System.out.print("Harga Satuan: ");
                belanjaan[i][1] = br.readLine();
                System.out.print("Jumlah: ");
                belanjaan[i][2] = br.readLine();

                // Hitung total harga
                double hargaSatuan = Double.parseDouble(belanjaan[i][1]);
                int jumlah = Integer.parseInt(belanjaan[i][2]);
                totalHarga += hargaSatuan * jumlah;
                System.out.println("-----------------");
            }

            // Output struk belanjaan
            System.out.println("-------- STRUK BELANJA --------");
            System.out.printf("%-20s %-10s %-10s %-10s\n", "Nama Barang", "Harga Satuan", "Jumlah", "Total");
            for (int i = 0; i < belanjaan.length; i++) {
                double hargaSatuan = Double.parseDouble(belanjaan[i][1]);
                int jumlah = Integer.parseInt(belanjaan[i][2]);
                double total = hargaSatuan * jumlah;
                System.out.printf("%-20s %-10.0f %-10d %-10.0f\n", belanjaan[i][0], hargaSatuan, jumlah, total);
            }
            System.out.println("-------------------------------");
            System.out.printf("Total Harga: %.0f\n", totalHarga);

            // Input pembayaran dan hitung kembalian
            System.out.print("Bayar: ");
            bayar = Double.parseDouble(br.readLine());
            kembalian = bayar - totalHarga;
            System.out.printf("Kembalian: %.0f", kembalian);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

