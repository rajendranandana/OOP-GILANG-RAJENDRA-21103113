/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Main;

/**
 *
 * @author Rajendra Nandana
 */
public class KomputerPremium extends Komputer{
    protected boolean ruangPrivat;

    public KomputerPremium(int jumlahKomputer, String namaWarnet, float hargaPerJam, boolean ruangPrivat) {
        super(jumlahKomputer, namaWarnet, hargaPerJam);
        this.ruangPrivat = ruangPrivat;
    }

    @Override
    public void informasi() {
        super.informasi();
        System.out.println("Status         : " + (ruangPrivat ? "Ruangan Premium" : "Ruangan Standar"));
        System.out.println("=========================");
        System.out.println("Fasilitas Ruang " + (ruangPrivat ? "Premium" : "Standar") + ":");
        System.out.println("- Ruangan AC pribadi");
        System.out.println("- Sofa nyaman");
        System.out.println("- Komputer spesifikasi " + (ruangPrivat ? "tinggi" : "rendah"));
        System.out.println("- Koneksi internet " + (ruangPrivat ? "dedicated 100Mbps" : "dedicated 10Mbps"));
    }

    public void pesan(int nomorKomputer) {
        System.out.println("\nMemesan komputer nomor : " + nomorKomputer);
    }

    public void tambahLayanan(String makanan) {
        System.out.println("Menambah layanan makanan : " + makanan);
    }

    public void tambahLayanan(String makanan, String minuman) {
        System.out.println("Menambah layanan makanan : " + makanan + " dan minuman: " + minuman);
    }
}
