/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author Yudaaa
 */
import java.util.Scanner;
public class KalkulatorSederhana {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        char pilih;
        
        do{
            System.out.print("Masukkan angka pertama: ");
            double angka1 = scanner.nextDouble();

            System.out.print("Pilih operator (+, -, *, /, %): ");
            char operator = scanner.next().charAt(0);

            System.out.print("Masukkan angka kedua: ");
            double angka2 = scanner.nextDouble();
            
            switch(operator){
                case '+':
                    System.out.println("Hasil: "+ (angka1+angka2));
                    break;
                case '-':
                    System.out.println("Hasil: "+ (angka1-angka2));
                    break;    
                case '*':
                    System.out.println("Hasil: "+ (angka1*angka2));
                    break;
                case '/':
                    System.out.println("Hasil: "+ (angka1/angka2));
                    break;
                case '%':
                    System.out.println("Hasil: "+ (angka1%angka2));
                    break;
                default:
                    System.out.println("Opertaor tidak valid!");
            }
            
            System.out.print("Ingin menghitung lagi? (y/n)? :");
            pilih = scanner.next().charAt(0);
            
        }while (pilih == 'y' || pilih == 'Y');
        
        System.out.println("Kalkulator telah berhenti");
        scanner.close();
    }
}
