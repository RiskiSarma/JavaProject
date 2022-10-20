package Project1;

public class Calculator {
  String name;

  Calculator(String temp) {
    name = temp;
  }

  double luasPersegi(double sisi) {
    return sisi * sisi;
  }

  double sin(double nilaiSin) {
    return Math.sin(nilaiSin);
  }
}
