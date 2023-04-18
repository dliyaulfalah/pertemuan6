package arrays;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class array1D {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
// deskripsi arrays 1d
        String[] namamk = new String[3];
        int[] sks = new int[3];
        int[] bobot = new int[3];
// input
// length = mengulang sebanyak panjang array
        for (int i = 0; i < namamk.length; i++) {
            System.out.print("Nama MK " + (i+1) + ": ");
            namamk[i] = br.readLine();
            System.out.print("SKS MK " + (i+1) + ": ");
            sks[i] = Integer.parseInt(br.readLine());
            System.out.print("Bobot MK " + (i+1) + ": ");
            bobot[i] = Integer.parseInt(br.readLine());
        }
// output
        System.out.println("Daftar Mata Kuliah");
        System.out.println("===================");
        for (int i = 0; i < namamk.length; i++) {
            System.out.println("Mata Kuliah " + (i+1) + ": " + namamk[i]);
            System.out.println("SKS: " + sks[i]);
            System.out.println("Bobot: " + bobot[i]);
        }
    }
}

