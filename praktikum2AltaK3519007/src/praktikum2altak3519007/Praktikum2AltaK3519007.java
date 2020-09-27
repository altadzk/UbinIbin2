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
public class Praktikum2AltaK3519007 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /* instansiasi*/
        /*ukuran dalam satuan (cm) */
     Keramik a = new Keramik(10,30*30,54000);
     System.out.println("Jumlah Box: " + a.jumlahDus() + "pcs");
     System.out.println("Total Harga: " + "Rp" + a.totalHarga());
    
     Keramik b = new Keramik(5,40*40,65000);
     System.out.println("Jumlah Box: " + b.jumlahDus() + "pcs");
     System.out.println("Total Harga: " + "Rp" + b.totalHarga());
     
     Keramik c = new Keramik(8,30*40,60000);
     System.out.println("Jumlah Box: " + c.jumlahDus() + "pcs");
     System.out.println("Total Harga: " + "Rp" + c.totalHarga());
    }
    
    
}
