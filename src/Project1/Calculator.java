<<<<<<< HEAD
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

//membuat method keliling persegi
    double KelilingPersegi(double sisi){
        return sisi+sisi+sisi+sisi;
    }
    Calculator(String Nama){
        this.Nama =Nama;
    }
}
=======
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
    int bil1, bil2, hasil;

    public Calculator(String Nama) {
        this.Nama = Nama;
    }
    public static void Penjumlahan(int bil1, int bil2) {
        int hasil = bil1 + bil2;
        return hasil;
    }
    
}
>>>>>>> e436f678a162a272f858ae916df57ce7f533285e
