/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uts.oop;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class UTSOOP {
    private static Kontak[] kontakList = new Kontak[100];
    private static int count = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pilihan;
        
        //menu aplikasi
        
  do {
    System.out.println("\n=== MENU KONTAK ===");
    System.out.println("1. Tambah Kontak");
    System.out.println("2. Tampilkan Semua Kontak");
    System.out.println("3. Ubah Kontak");
    System.out.println("4. Hapus Kontak");
    System.out.println("5. Keluar");
    System.out.print("Masukkan pilihan Anda: ");
    
    if (scanner.hasNextInt()) {
        pilihan = scanner.nextInt();
        scanner.nextLine();

        switch (pilihan) {
            case 1:
                tambahKontak(scanner);
                break;
            case 2:
                tampilkanKontak();
                break;
            case 3:
                ubahKontak(scanner);
                break;
            case 4:
                hapusKontak(scanner);
                break;
            case 5:
                System.out.println("Terima kasih telah menggunakan aplikasi kontak.");
                break;
            default:
                System.out.println("Pilihan tidak valid!");
        }
    } else {
        System.out.println("Masukkan angka yang valid!");
        scanner.nextLine(); 
        pilihan = 0;  
    }
} while (pilihan != 5);

    }
    
    //jika sudah memilih menu
    
    public static void tambahKontak(Scanner scanner) {
        System.out.print("Masukkan Nama: ");
        String nama = scanner.nextLine();
        String nomorHp;
        while (true) {
            System.out.print("Masukkan Nomor HP: ");
            nomorHp = scanner.nextLine();
            if (nomorHp.matches("[0-9]+")) {
                break;
            } else {
                System.out.println("Nomor HP hanya boleh berisi angka! Silakan coba lagi.");
            }
    }

        kontakList[count] = new Kontak(nama, nomorHp);
        count++;
        System.out.println("Kontak berhasil ditambahkan!");
    }

    public static void tampilkanKontak() {
        if (count == 0) {
            System.out.println("Belum ada kontak.");
            return;
        }
        for (int i = 0; i < count; i++) {
            System.out.println((i + 1) + ". " + kontakList[i]);
        }
    }

    public static void ubahKontak(Scanner scanner) {
        System.out.print("Masukkan nama kontak yang ingin diubah: ");
        String namaCari = scanner.nextLine();
        for (int i = 0; i < count; i++) {
            if (kontakList[i].getNama().equalsIgnoreCase(namaCari)) {
                System.out.print("Masukkan nama baru: ");
                String namaBaru = scanner.nextLine();
                String nomorBaru;
                while (true) {
                    System.out.print("Masukkan nomor HP baru: ");
                    nomorBaru = scanner.nextLine();
                    if (nomorBaru.matches("[0-9]+")) {
                        break;
                    } else {
                        System.out.println("Nomor HP hanya boleh berisi angka! Silakan coba lagi.");
                    }
            }
                kontakList[i].setKontak(namaBaru, nomorBaru);
                System.out.println("Kontak berhasil diubah!");
                return;
            }
        }
        System.out.println("Kontak tidak ditemukan.");
    }

    public static void hapusKontak(Scanner scanner) {
        System.out.print("Masukkan nama kontak yang ingin dihapus: ");
        String namaCari = scanner.nextLine();
        for (int i = 0; i < count; i++) {
            if (kontakList[i].getNama().equalsIgnoreCase(namaCari)) {
                for (int j = i; j < count - 1; j++) {
                    kontakList[j] = kontakList[j + 1];
                }
                kontakList[count - 1] = null;
                count--;
                System.out.println("Kontak berhasil dihapus!");
                return;
            }
        }
        System.out.println("Kontak tidak ditemukan.");
    }
}