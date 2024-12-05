/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package No2;

public class Diskon {
    public double TotalPembelian;
    public double Diskon;
    public double potongan;
   
    public void HitungDiskon() {
        if (TotalPembelian >= 50000) {
            Diskon = TotalPembelian * 0.20;
            System.out.println("Besarnya potongan " + "20%");
        } else {
            System.out.println("Besarnya potongan " + "5%");
            Diskon = TotalPembelian *  0.05;
        }

        System.out.println("Total pembelian Rp." + TotalPembelian);

        double TotalBayar = TotalPembelian - Diskon;
        System.out.println("Jumlah yang harus dibayarkan Rp." + TotalBayar);
    }
}