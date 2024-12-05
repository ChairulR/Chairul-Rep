/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package No2;

/**
 *
 * @author mchai
 */
import java.util.Scanner;

public class DiskonBeraksi {
    public static void main(String[] args) {
        Diskon diskon = new Diskon();

        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan total yang dibayarkan RP.");
        diskon.TotalPembelian = input.nextDouble();
        diskon.HitungDiskon();
        input.close();
    }
}
