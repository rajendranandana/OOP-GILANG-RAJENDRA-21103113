/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.Main;

/**
 *
 * @author Rajendra Nandana
 */
public class TPMODUL2_RAJENDRA {

    public static void main(String[] args) {
        // Contoh untuk KomputerVIP dengan VIP Card
        KomputerVIP komputerVIP = new KomputerVIP(20, "Warnet Gaming X", 5000, true);
        komputerVIP.informasi();
        komputerVIP.login("Asep");
        komputerVIP.bermain(2);
        komputerVIP.bermain(2, 30);

        System.out.println("\n");

        // Contoh untuk KomputerPremium tanpa ruang privat
        KomputerPremium komputerPremium = new KomputerPremium(15, "Warnet Gaming X", 8000, false);
        komputerPremium.informasi();
        komputerPremium.pesan(5);
        komputerPremium.tambahLayanan("Mie Goreng");
        komputerPremium.tambahLayanan("Mie Goreng", "Es Teh");
    }
}
