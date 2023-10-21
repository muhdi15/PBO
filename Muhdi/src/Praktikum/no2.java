package Praktikum;

import java.util.Scanner;

public class no2 {

    double[] data = {91.35, 4.72, 26, 3.5, 8, 61, 65.36, 12, 5.6, 7.11, 27, 9.53, 549, 2.23, 17.31, 4.25, 2.13, 83, 7, 102.4, 53.21, 3.42, 0.21, 70.02, 819.4, 6173, 4.25, 19.8, 17.35, 5.768};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        no2 n2 = new no2();
        while (true) {
            System.out.println("======================================================");
            System.out.println("                    Tugas No 2");
            System.out.println("======================================================");
            System.out.print("Masukkan no Menu: \n 1. Cetak \n 2. Temukan Max \n 3. Temukan Min \n 4. Sum Array \n 5. Find Average \n => ");
            int menu = sc.nextInt();

            if (menu == 1) {
                System.out.println("Hasil Cetak");
                n2.cetak();  
            } else if (menu == 2) {
                System.out.println("Hasil Max");
                n2.max();
            } else if (menu == 3) {
                System.out.println("Hasil Min");
                n2.min();
            } else if (menu == 4) {
                System.out.println("Hasil SUM");
                n2.sum();
            } else if (menu == 5) {
                System.out.println("Rata-Ratanya ");
                n2.average();
            } else {
                System.out.println("pilihan tidak ada");
                break;
            }

        }
    }

    void cetak() {
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i]);

        }
    }

    void min() {
        double min = data[0];
        for (int i = 0; i < data.length; i++) {
            if (data[i] < min) {
                min = data[i];
            }
        }
        System.out.println("Nilai min adalah :" + min);
    }

    void max() {
        double max = data[0];
        for (int i = 0; i < data.length; i++) {
            if (data[i] > max) {
                max = data[i];
            }
        }
        System.out.println("Nilai min adalah :" + max);
    }

    void sum() {
        double sum = 0;
        for (int i = 0; i < data.length; i++) {
            sum += data[i];
        }
        System.out.println("Hasil sum :" + sum);
    }

    void average() {
        double sum = 0;
        int count = 0;
        for (int i = 0; i < data.length; i++) {
            sum += data[i];
            count++;
        }
        double avg = sum / count;
        System.out.println("Rata-rata  :" + avg);
    }

}
