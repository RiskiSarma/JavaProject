/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Project1;

import java.io.Serial;

/**
 *
 * @author ASUS
 */
public class Calculator {
    String Nama;
    Double nilai1;

    double luasPersegi(double sisi) {
        return sisi * sisi;
    }

    Calculator(String Nama) {
        this.Nama = Nama;
    }

    double sin(double nilaiSin) {
        return Math.sin(nilaiSin);
    }

}
