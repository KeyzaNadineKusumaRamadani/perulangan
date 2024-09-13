package Perulangan;

import java.util.Scanner;

public class NilaiSiswa {
    public static void main(String[] args) {
        int jumlahSiswa, nilai, totalNilai;
        Scanner s = new Scanner (System.in);
        System.out.println("Masukkan jumlah siswa :");
        jumlahSiswa = s.nextInt();
        int total = 0;
    

        for (int i = 1; i <=jumlahSiswa; i++) {
            System.out.println("masukkan nilai siswa: " + i  );
            nilai = s.nextInt();
            total += nilai;
    }       
             double rataRata = (double) total / jumlahSiswa;
             System.out.println("Total nilai: " + total);
             System.out.println("Rata-rata nilai: " + rataRata);
        
       
}
}