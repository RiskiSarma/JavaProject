package Project1;

public class Calculator {
    String nama;

    Calculator(String nama) {
        this.nama = nama;
    }

    // rizka aulia
    public double penjumlahan(double bil1, double bil2) {
        double hasil = bil1 + bil2;
        return hasil;
    }

    // Dea Syafira
    public double perkalian(double bil1, double bil2) {
        double hasil = bil1 * bil2;
        return hasil;
    }

    // Fuzla Azkia
    public int modulus(int angka1, int angka2) {
        int hasil = angka1 % angka2;
        return hasil;
    }

    // Nurjannatul Husna
    public int pembagian(int angka1, int angka2) {
        int hasil = angka1 / angka2;
        return hasil;
    }

    // Mitha Zahara
    public double pangkat(int angka1, int pangkat) {
        int hasil = 1;
        for (int i = 1; i <= pangkat; i++) {
            hasil = hasil * angka1;
        }
        return hasil;
    }

    // Dhynanti Amanda
    public int Persentase(int bil1, int bil2) {
        int persent;
        persent = ((bil1 * 100) / bil2);
        System.out.print(" Dhynanti hasil persen nya adalah : " + persent);
        System.out.println("%");
        return persent;
    }

    // Muhammad Amzar
    public int KelilingPersegi(int sisi) {
        return sisi + sisi + sisi + sisi;
    }

    // alfi syahrin
    public double sin(double nilai) {
        return Math.sin(nilai);
    }

    // haiqal murthada
    public double luasPersegiPanjang(double panjang, double lebar) {
        return panjang * lebar;
    }

    // munawar iman
    public int luaskubus(int sisi) {
        int hasil = 6 * sisi * sisi;
        return hasil;
    }

    // Zaky Abrar
    public double luastrapesium(double t, double a, double b) {
        double l = ((a + b) * t);
        double u = 1.5 * l;
        return u;
    }

    // MaulaJuwandaPratama
    public double volumebalok(double p, double l, double t) {
        double v = p * l * t;
        return v;
    }
    //Rizki Saputra Sarma
    public double sudut(double angka1){
        double hasil= Math.tan(Math.toRadians(angka1));
        return hasil;
    }
        //salmiani
       public double cos(double angka1){
        double hasil= Math.cos(Math.toRadians(angka1));
        return hasil;
        }
       
       //nailatul muna
       public double belahketupat(double d1, double d2){
        return 0.5*d1*d2;
       }

       //muhammad dhiauddin
       public double luaspersegi(double num1){
        return num1*num1;
       }

       //muhammad kadar
       public double sisipersegi(double luas){
        return Math.sqrt(luas);
       }
       
       //teuku firmansyah
        double volume_bola(double jari){
        double hasil = jari*jari*jari*3.14*4/3;
        return hasil;
        }
        //akmal sutansyah
        double jariLingkaran(double jari) {
           double hasil = 3.14 * jari;
           return hasil;
    }
}