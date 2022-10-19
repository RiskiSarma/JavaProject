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
    Double nilai1;

    public Calculator(String Nama) {
        this.Nama = Nama;
    }

    public double getSin() {
        return nilai1;
    }

    public void setSin(Double nilai1) {
        this.nilai1 = Math.sin(nilai1);
    }

}
