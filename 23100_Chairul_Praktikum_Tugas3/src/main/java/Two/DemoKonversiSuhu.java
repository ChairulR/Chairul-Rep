/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Two;

/**
 *
 * @author mchai
 */
public class DemoKonversiSuhu {
    private double nilai;
    private KonversiSuhu converter1;
    private KonversiSuhu2 converter2;

    // Constructor
    public DemoKonversiSuhu(double nilai) {
        this.nilai = nilai;
        this.converter1 = new KonversiSuhu();
        this.converter2 = new KonversiSuhu2();
    }

    // Method untuk menampilkan hasil konversi
    public void demo() {
        System.out.println(this.nilai + "C to Fahrenheit: " + converter1.celciusToFahrenheit(this.nilai) + " F");
        System.out.println(this.nilai + "C to Reamur: " + converter1.celciusToReamur(this.nilai) + " Re");
        double fahrenheit = converter1.celciusToFahrenheit(this.nilai);
        System.out.println(fahrenheit + "F to Reamur: " + converter2.fahrenheitToReamur(fahrenheit) + " Re");
    }

    // Main method untuk menjalankan demo
    public static void main(String[] args) {
        DemoKonversiSuhu DKS = new DemoKonversiSuhu(100); // Contoh dengan nilai 100°C
        DKS.demo();
    }
}
