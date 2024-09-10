/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package One;

/**
 *
 * @author mchai
 */
public class Matematika implements InterfaceMatematika {
    @Override
    public void pertambahan (int a, int b){
        int z = a + b;
        System.out.println("pertambahan :"+ a +" + "+ b + "="+ z);
    }
    @Override
    public void pengurangan (int a, int b){
        int z = a - b;
        System.out.println("pertambahan :"+ a +" + "+ b + "="+ z);
    }
    @Override
    public void perkalian (int a, int b){
        int z = a * b;
        System.out.println("pertambahan :"+ a +" + "+ b + "="+ z);
    }
    @Override
    public void pembagian (float a, float b){
        float z = a / b;
        System.out.println("pertambahan :"+ a +" + "+ b + "="+ z);
    }
}