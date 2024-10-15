/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Satu;

/**
 *
 * @author mchai
 */
public class GanjilGenap {
    public static void main(String[] args) {
        System.out.print("Bilangan Genap: ");
        for (int i = 0; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }

        System.out.print("\nBilangan Ganjil: ");
        for (int i = 0; i <= 20; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
    }
}

