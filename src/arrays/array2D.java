package arrays;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class array2D {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // Deklarasi array 2D
        String[][] ips = new String[3][4];

        // Karena array bertipe string, maka ada konversi tipe data ke double bagi data sks, bobot, total, jumlah sks, dan IP
        double sks, bobot, totalbobot, jumlahsks, grandtotal = 0, ip;

        try {
            // Input
            for (int i = 0; i < ips.length; i++) {
                System.out.print("NIM: ");
                String nim = br.readLine();
                System.out.print("Nama: ");
                String nama = br.readLine();

                // Input data matakuliah (jumlah matakuliah > 1)
                for (int j = 0; j < ips[i].length - 1; j++) {
                    System.out.print("Nama MK: ");
                    ips[i][0] = br.readLine();
                    System.out.print("SKS: ");
                    ips[i][1] = br.readLine();
                    // Konversi tipe data dari ips[i][1] (string) ke double
                    sks = Double.parseDouble(ips[i][1]);
                    System.out.print("Bobot: ");
                    ips[i][2] = br.readLine();
                    bobot = Double.parseDouble(ips[i][2]);

                    // Memasukkan perhitungan IPS
                    totalbobot = sks * bobot;
                    // Totalbobot per index
                    // Konversi dari numerik (int, double, dll) ke string --> String.valueOf
                    ips[i][3] = String.valueOf(totalbobot);
                    System.out.println("Total: " + ips[i][3]);

                    // Hitung grandtotal
                    grandtotal += totalbobot;
                    System.out.println("-----------------");
                }

                System.out.println("Grand Total (SKS + Bobot): " + grandtotal);

                // Hitung IP
                System.out.print("Jumlah SKS yang diambil: ");
                jumlahsks = Double.parseDouble(br.readLine());
                ip = grandtotal / jumlahsks;
                System.out.println("IP Anda semester ini adalah " + ip);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
