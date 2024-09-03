/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Tugas2;

/**
 *
 * @author mchai
 */
public class DemoNilai {
    public static void main(String[] args) {
        
        Nilai nilai0 = new Nilai();
        
        nilai0.nim = "23100";
        nilai0.nama = "Chairul";
        nilai0.NilaiAbsen = 10;
        nilai0.NilaiTugas = 90;
        nilai0.NilaiUTS = 90;
        nilai0.NilaiUAS = 90;
        
        nilai0.CetakNilai();
    }
}