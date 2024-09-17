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
    public static void main(String[] args) {
        KonversiSuhu2 konversi = new KonversiSuhu2();
        double celcius = 100, fahrenheit = 212;

        System.out.println(celcius + " Celcius ke Fahrenheit = " + konversi.celciusToFahrenheit(celcius));
        System.out.println(celcius + " Celcius ke Reamur = " + konversi.celciusToReamur(celcius));
        System.out.println(fahrenheit + " Fahrenheit ke Reamur = " + konversi.fahrenheitToReamur(fahrenheit));
    }
}
