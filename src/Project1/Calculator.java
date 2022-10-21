package Project1;

public class Calculator {
    String nama;

    Calculator(String nama){
        this.nama = nama;
    }

 //rizka aulia
    public double penjumlahan(double bil1, double bil2){
        double hasil=bil1+bil2;
        return hasil;
    }
    //Dea Syafira
    public double perkalian(double bil1, double bil2){
        double hasil=bil1*bil2;
        return hasil;
    }
    //Fuzla Azkia
     public int modulus(int angka1,int angka2){
    int hasil = angka1 % angka2;
    return hasil;
}

// Nurjannatul Husna
public int pembagian(int angka1, int angka2) {
    int hasil = angka1 / angka2;
    return hasil;
}

//Mitha Zahara
public double pangkat(int angka1, int pangkat){
    int hasil=1;
    for(int i=1;i<=pangkat;i++){
        hasil=hasil*angka1;
    }
    return hasil;
}
}
