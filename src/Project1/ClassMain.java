/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Project1;

/**
 *
 * @author ASUS
 */
public class ClassMain {
  public static void main(String[] args) {
    calculator cal = new calculator("Ti-2B");
    System.out.println("Alfi Syahrin Sin = " + cal.sin(10));
    System.out.println("Rahmad Kurniawan Sisi Persegi = " + cal.sisiPersegi(10));
    System.out.println("Maula Juanda Pratama Volume Balok = " + cal.volumeBalok(10, 5, 4));
  }
}