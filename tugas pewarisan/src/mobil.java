/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author acer
 */
public class mobil {
    private String merek;
    private String warna;
    private int  jumlahpintu;
    private String jenis;
     public String getjenis(){
         return jenis;
     }
     public void setjenis(String jenis){
             this.jenis = jenis;
     }
     public int getjumlahpintu(){
         return jumlahpintu;
     }
     public void setjumlahpintu(int jumlahpintu){
         this.jumlahpintu = jumlahpintu;
     }
     public String getmerek(){
         return merek;
     }
     public void setmerek(String merek){
         this.merek = merek;
     }
     public String getwarna(){
         return warna;
     }
     public void setwarna( String warna){
         this.warna = warna;
     }
     public void tampilkandata(){
         System.out.print("merek mobil");
         System.out.print("warna mobil");
         System.out.print("total pintu mobil");
         System.out.print("jenis mobil");
     }
     public void inputdata(String m,String w,String j,int jp){
         setmerek(m);
         setwarna(w);
         setjenis(j);
         setjumlahpintu(jp);
     }   
}
