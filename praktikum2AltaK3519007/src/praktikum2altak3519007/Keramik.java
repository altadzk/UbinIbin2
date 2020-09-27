/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum2altak3519007;

/**
 *
 * @author Alta K3519007
 */
public class Keramik {
    /*atribut */
    /* satuan (m) dikonversi menjadi (cm)*/
    
    int luas = 1000*1000;
    int box;
    int ukuran;
    int rupiah;
    
    /*constructor*/
    Keramik(int b, int u, int r){
        this.box = b;
        this.ukuran = u;
        this.rupiah = r;
                
    }
    /*methods*/
   
    int jumlahDus(){
        int dus;
                dus = (this.luas/this.ukuran)/this.box;
                return dus;
    }
    int totalHarga(){
        int harga;
                harga = ((this.luas/this.ukuran)/this.box)*this.rupiah;
                return harga;
    }

}
