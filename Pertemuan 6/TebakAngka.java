/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author Yudaaa
 */

import java.util.Random;
import java.util.Scanner;
public class TebakAngka {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        
        int n = random.nextInt(100)+1;
        int percobaan = 0;
        
        
        System.out.println("Selamat datang di permainan tebak angka!");
        System.out.println("Pilih angka dari 1 - 100");
        System.out.println("Tebak atau ketik 0 untuk keluar");
        
        while(true){
            System.out.print("Masukkan tebakan anda: ");
            int angka = scanner.nextInt();
            
            if(angka == 0){
                System.out.println("Tebak angka berakhir");
                break;
            }
            
            percobaan++;
            
            if(angka==n){
                System.out.println("Anda menebak angka dengan benar dalam "+percobaan+" percobaan");
                System.out.println("Terimakasih telah bermain");
                break;
            }else if(angka>n){
                System.out.println("Terlalu besar");
            }else{
                System.out.println("Terlalu kecil");
            }
        }
        scanner.close();
    }
}
