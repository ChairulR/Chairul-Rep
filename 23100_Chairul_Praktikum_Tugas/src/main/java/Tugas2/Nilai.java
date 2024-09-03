/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas2;

/**
 *
 * @author mchai
 */
class Nilai {
    String nim;
    String nama;
    float NilaiAbsen;
    float NilaiTugas;
    float NilaiUTS;
    float NilaiUAS;
    float NilaiAkhir;

    float hitungNilaiAkhir() {
        return (NilaiAbsen * 10 / 100) + (NilaiTugas * 20 / 100) + (NilaiUTS * 30 / 100) + (NilaiUAS * 40 / 100);
    }

    void CetakNilai() {
        NilaiAkhir = hitungNilaiAkhir();
        System.out.println("NIM : " + nim);
        System.out.println("Nama : " + nama);
        System.out.println("Nilai Absen [10%] : " + NilaiAbsen);
        System.out.println("Nilai Tugas [20%] : " + NilaiTugas);
        System.out.println("Nilai UTS [30%] : " + NilaiUTS);
        System.out.println("Nilai UAS [40%] : " + NilaiUAS);
        System.out.println("Nilai Akhir : " + NilaiAkhir);
    }
}