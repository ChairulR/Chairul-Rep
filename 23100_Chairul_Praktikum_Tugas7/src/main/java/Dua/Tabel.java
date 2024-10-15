/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Dua;

/**
 *
 * @author mchai
 */
import java.util.Scanner;

public class Tabel {
    public static void main(String[] args) {
        Scanner tabel = new Scanner(System.in);
        System.out.print("Masukkan ukuran tabel (n <= 10): ");
        int n = tabel.nextInt();

        if (n > 0 && n <= 10) {
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    System.out.print(i * j + "\t");
                }
                System.out.println();
            }
        } else {
            System.out.println("Nilai n harus lebih besar dari 0 dan kurang atau sama dengan 10.");
        }

        tabel.close();
    }
}