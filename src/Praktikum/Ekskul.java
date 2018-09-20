/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum;

/**
 *
 * @author Naufal K D
 */
public class Ekskul {
    private String namaekskul;
    private String nama;
    private int usia;
    private int NIS;
    private String Kelas;
    
    public Ekskul(String nama, int usia, int NIS, String Kelas,String namaekskul) {
        this.namaekskul=namaekskul;
        this.nama = nama;
        this.usia = usia;
        this.NIS=NIS;
        this.Kelas=Kelas;
    }

    public void info () {
        System.out.println("Ekstrakulikuler yang diikuti : "+namaekskul);
        System.out.println("Nama : "+this.nama);
         System.out.println("Usia : "+this.usia);
          System.out.println("NIS : "+this.NIS);
           System.out.println("Kelas : "+this.Kelas);
        
    }
}
