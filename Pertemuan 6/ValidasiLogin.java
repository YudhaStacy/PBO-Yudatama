/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author Yudaaa
 */
import java.util.Scanner;

public class ValidasiLogin {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        
        String username = "admin";
        String password = "password123";
        
        int percobaan = 1;
               
        while(percobaan<=3){
            System.out.print("Masukkan Username: ");
            String user = scanner.nextLine();
            System.out.print("Masukkan Password: ");
            String pass = scanner.nextLine();
            
            if(user.equals(username) && pass.equals(password)){
                System.out.print("Selamat datang "+user);
                break;
            }else{
                System.out.println("Password atau username salah! Percobaan: "+percobaan+"/3");
            }
            
            percobaan++;
            
            if(percobaan>3){
                System.out.println("Akun di blokir sementara!");
                break;
            }
        }
        scanner.close();
    }
}
