/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author Yudaaa
 */
class Hewan {
    String nama;
    String jenis;
    int umur;

    Hewan(String nama, String jenis, int umur){
        this.nama = nama;
        this.jenis = jenis;
        this.umur = umur;
    }

    void tampilkanInfo(){
        System.out.println("Nama: "+ nama + ", Jenis: "+ jenis + ", Umur: "+ umur + " tahun");
    }

    void bertambahUmur(int tahun){
        this.umur += tahun;
        System.out.println(nama + " Telah bertambah umur menjadi "+ umur +" tahun");
    }

    void suaraHewan(){
        if(nama.equalsIgnoreCase("Kucing")){
            System.out.println(nama + ": Miawww!");
        }else if(nama.equalsIgnoreCase("Burung")){
            System.out.println(nama + ": kiw kiw!");
        }else if(nama.equalsIgnoreCase("Ayam")){
            System.out.println(nama + ": kukuruyuk!!");
        }else{
            System.out.println(nama + ": suara tidak ditemukan.");
        } 
    }

}
public class Latihan1{
    public static void main(String args[]) {
        Hewan hewan1 = new Hewan("Kucing", "Mamalia", 2);
        Hewan hewan2 = new Hewan("Burung", "Unggas", 3);
        Hewan hewan3 = new Hewan("Ayam", "Unggas", 2);
        
        hewan1.tampilkanInfo();
        hewan1.suaraHewan();
        hewan1.bertambahUmur(2);
        hewan1.tampilkanInfo();
        
        System.out.println();
        
        hewan2.tampilkanInfo();
        hewan2.suaraHewan();
        hewan2.bertambahUmur(1);
        hewan2.tampilkanInfo();
        
        System.out.println();    
        
        hewan3.tampilkanInfo();
        hewan3.suaraHewan();
        hewan3.bertambahUmur(3);
        hewan3.tampilkanInfo();
    }
}

