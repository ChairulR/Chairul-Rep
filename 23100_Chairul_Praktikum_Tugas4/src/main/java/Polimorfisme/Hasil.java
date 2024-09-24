/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Polimorfisme;

/**
 *
 * @author mchai
 */
public class Hasil {
    public static void main(String[] args) {
        BangunRuang kubus = new Kubus(4); 
        BangunRuang balok = new Balok(12, 7, 9); 

        System.out.println("Volume Kubus: " + kubus.volume() + ", Luas Permukaan: " + kubus.luasPermukaan());
        System.out.println("Volume Balok: " + balok.volume() + ", Luas Permukaan: " + balok.luasPermukaan());
    }
}
