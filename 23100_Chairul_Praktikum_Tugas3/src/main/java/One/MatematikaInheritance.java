/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package One;

/**
 *
 * @author mchai
 */
public class MatematikaInheritance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Matematika2 mtk = new Matematika2 ();
        System.out.println("Pertambahan : " + mtk.pertambahan(10, 7));
        System.out.println("Pengurangan : " + mtk.pengurangan(10, 7));
        System.out.println("Perkalian : " + mtk.perkalian(5, 5));
        System.out.println("Pembagian : " + mtk.pembagian(9, 3));
        System.out.println("Modulus : " + mtk.modulus(5, 2));
    }
    
}
