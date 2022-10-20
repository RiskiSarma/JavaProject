package Project1;

public class calculator {
  String name;

  calculator(String temp) {
    name = temp;
  }

  double luasPersegi(double sisi) {
    return sisi * sisi;
  }

  double sin(double nilaiSin) {
    return Math.sin(nilaiSin);
  }

  double sisiPersegi(double sisi) {
    return sisi * sisi;
  }
  
    double volumeBalok(double panjang, double lebar, double tinggi) {
    return panjang * lebar * tinggi;
  }

}
