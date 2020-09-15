/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package keramikpakbejo;

/**
 *
 * @author niputunk
 */
public class KeramikPakBejo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /* instansiasi mengetahui harga termurah */
        Keramik a = new Keramik();
        a.luasKeramik = 30 * 30;
        a.harga       = 54000;
        a.box         = 10;
        a.Keramik();
        a.jumlahBox();
        a.bayar();
        
        Keramik b = new Keramik();
        b.luasKeramik = 40 * 40;
        b.harga       = 65000;
        b.box         = 5;
        b.Keramik(); 
        b.jumlahBox();
        b.bayar();
        
        Keramik c = new Keramik();
        c.luasKeramik = 30 * 40;
        c.harga       = 60000;
        c.box         = 8;
        c.Keramik();
        c.jumlahBox();
        c.bayar();          
    }  
}
