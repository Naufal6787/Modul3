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
public class UjiEkskul extends Ekskul {
    
    private int kartupelajarmoklet;
 
    public UjiEkskul(String namaekskul, int kartupelajarmoklet,String nama, int usia, int NIS, String Kelas) {
        super(nama, usia, NIS, Kelas, namaekskul);
        this.kartupelajarmoklet=kartupelajarmoklet;
        
   }
    public void info(){
        System.out.println("NO. Kartu Pelajar Telkom : " + this.kartupelajarmoklet);
          super.info();
}

}
