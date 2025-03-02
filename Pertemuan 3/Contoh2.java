/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author Yudaaa
 */

interface Hewan {
    void bersuara();
}

class Kucing implements Hewan{
    @Override
    public void bersuara(){
        System.out.println("Kusing mengeong: Miaw Miaw!");
    }
}

class Anjing implements Hewan{
    @Override
    public void bersuara(){
        System.out.println("Anjing menggongong: Woof Woof!");
    }
}

public class Contoh2 {
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Hewan kucing = new Kucing();
        Hewan anjing = new Anjing();
        
        kucing.bersuara();
        anjing.bersuara();
    }
    
}

