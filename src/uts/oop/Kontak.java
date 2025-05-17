/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uts.oop;

/**
 *
 * @author Asus
 */
public class Kontak {
    private String nama;
    private String nomorHp;

    public Kontak() {
        this.nama = "Tidak Diketahui";
        this.nomorHp = "000000";
    }

    public Kontak(String nama, String nomorHp) {
        this.nama = nama;
        this.nomorHp = nomorHp;
    }

    public void setKontak(String nama, String nomorHp) {
        this.nama = nama;
        this.nomorHp = nomorHp;
    }

    public String getNama() {
        return nama;
    }

    @Override
    public String toString() {
        return "Nama: " + nama + ", Nomor HP: " + nomorHp;
    }
}

