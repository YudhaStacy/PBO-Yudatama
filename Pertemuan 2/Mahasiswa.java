/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author Yudaaa
 */
class Mahasiswa1 {

    String nama;
    int nim;  
    
    Mahasiswa1(String nama, int nim){
        this.nama = nama;
        this.nim = nim;
    }
    
    void tampilkanInfo(){
        System.out.println("Nama: "+ nama + ", NIM: " + nim);
    }
}

public class Mahasiswa{
    public static void main(String args[]) {
        Mahasiswa1 mhs1 = new Mahasiswa1("Budi", 220001);
        Mahasiswa1 mhs2 = new Mahasiswa1("Siti", 220002);

        mhs1.tampilkanInfo();
        mhs2.tampilkanInfo();  
    }
}



