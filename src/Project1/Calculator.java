/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Project1;

/**
 *
 * @author ASUS
 */
public class Calculator {
    String Nama;

    public Calculator(String Nama) {
        this.Nama = Nama;
        public static void main(String[] args){
        double sudut;        
        System.out.println("masukkan sudut");
        Scanner sP= new Scanner(System.in);
        sudut =sP.nextInt();
        
        System.out.println("Sin = " Math.sin(Math.toRadians(sudut)));
    }
}
    
