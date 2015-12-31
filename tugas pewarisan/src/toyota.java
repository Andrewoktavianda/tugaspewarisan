/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author acer
 */
public class toyota extends mobil{
    public void tampilkan (){
        double besarsilinder=32.5;
        String bahanbakar="solar";
        String katagori="of-road";
        
        mobil m = new mobil();
        
        m.inputdata("avanza", "putih", "ekonomi", 5);
        m.tampilkandata();
        
        System.out.println("silinder :"+besarsilinder);
        System.out.println("jenis bahan bakar :"+bahanbakar);
        System.out.println("jenis katagori :"+katagori);
    }
    
}
