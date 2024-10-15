/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Satu;
import java.util.Scanner;
/**
 *
 * @author mchai
 */
public class Ayam {
    public static void main(String[] args) {
        Scanner ayam = new Scanner(System.in);
        System.out.print("Lagu Anak AYAM, Jumlah Anak Ayam: ");
        int n = ayam.nextInt();

        while (n > 0) {
            if (n == 1) {
                System.out.println("Anak ayam turun " + n + ", mati satu tinggal induknya");
            } else {
                System.out.println("Anak ayam turun " + n + ", mati satu tinggal " + (n - 1));
            }
            n--;
        }
        ayam.close();
    }
}

