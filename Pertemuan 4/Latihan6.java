/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author Yudaaa
 */

class Kalkulator{
    int tambah(int a, int b){
        return a+b;
    }
    int tambah(int a, int b, int c){
        return a+b+c;
    }
    double tambah(double a, double b){
        return a+b;
    }
}

public class Latihan6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Kalkulator kalk = new Kalkulator();
        System.out.println(kalk.tambah(5, 10));
        System.out.println(kalk.tambah(5, 10, 15));
        System.out.println(kalk.tambah(5.5, 2.5));
    }
}
