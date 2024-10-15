package Satu;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author mchai
 */
public class BilanganDeret {
    public static void main(String[] args) {
        System.out.print("Bilangan Prima: ");
        for (int num = 2; num <= 20; num++) {
            boolean isPrime = true;
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(num + " ");
            }
        }

        System.out.print("\nBilangan Bukan Prima: ");
        for (int num = 2; num <= 20; num++) {
            boolean isPrime = true;
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (!isPrime) {
                System.out.print(num + " ");
            }
        }
    }
}
