/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author acer
 */
public class honda extends mobil{
    public void tampilkan (){
        double besarsilinder=5.5;
        String bahanbakar="pertamax";
        String katagori="sport";
        
        mobil m = new mobil();
        
        m.inputdata("crv", "silver", "mewah", 4);
        m.tampilkandata();
        
        System.out.println("silinder :"+besarsilinder);
        System.out.println("jenis bahan bakar :"+bahanbakar);
        System.out.println("jenis katagori :"+katagori);
    }
    
}
