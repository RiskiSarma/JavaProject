package Project1;

public class ClassMain {
    public static void main(String[] args) {
        Calculator orizkaaulia = new Calculator("Rizka Aulia");
        System.out.println(orizkaaulia.nama + " Hasil penjumlahan : " + orizkaaulia.penjumlahan(10, 10));

        Calculator oDea = new Calculator("Dea Syafira");
        System.out.println(oDea.nama + " Hasil perkalian : " + oDea.perkalian(10, 10));

        Calculator ofuzlaazkia = new Calculator("Fuzla azkia");
        System.out.println(ofuzlaazkia.nama + " Hasil Modulus : " + ofuzlaazkia.modulus(20, 3));

        Calculator oHusna = new Calculator("Husna");
        System.out.println(oHusna.nama + " Hasil pembagian : " + oHusna.pembagian(20, 3));

        Calculator omitha = new Calculator("mitha");
        System.out.println(omitha.nama + " Hasil pangkat : " + omitha.pangkat(2, 4));

        Calculator oDhynanti = new Calculator("Dhynanti");
        oDhynanti.Persentase(2, 20);

        Calculator oAmzar = new Calculator("Muhammad amzar");
        System.out.println(oAmzar.nama + " Hasil Keliling persegi : " + oAmzar.KelilingPersegi(10));

        Calculator oAlfi = new Calculator("Alfi Syahrin");
        System.out.println(oAlfi.nama + " sin : " + oAlfi.sin(5));

        Calculator oHaiqal = new Calculator("haiqal murthada");
        System.out.println(oHaiqal.nama + " luas persegi panjang : " + oHaiqal.luasPersegiPanjang(5, 5));

        Calculator oMunawarIman = new Calculator("munawar iman");
        System.out.println(oMunawarIman.nama + " hasil luas kubus : " + oMunawarIman.luaskubus(6));

        Calculator oZakyAbrar = new Calculator("Zaky Abrar");
        System.out.println(oZakyAbrar.nama + " hasil luas trapesium : " + oZakyAbrar.luastrapesium(6, 7, 4));

        Calculator oMaula = new Calculator("Maula");
        System.out.println(oMaula.nama + " hasil Volume Balok : " + oMaula.volumebalok(3, 6, 9));
        
        Calculator oRiskisarma = new Calculator("Riski Sarma");
       System.out.println(oRiskisarma.nama+ " hasil tan: " + oRiskisarma.sudut(20));
       
       Calculator osalmiani = new Calculator("salmiani");
       System.out.println (osalmiani.nama + "hasil cos :" + osalmiani.cos(5));
       
       Calculator Nailatulmuna = new Calculator("Nailatulmuna");
        System.out.println(Nailatulmuna.nama +"hasil belah ketupat:" + Nailatulmuna.belahketupat(20,10));

        Calculator oDhiauddin = new Calculator("Muhammad Dhiauddin");
        System.out.println(oDhiauddin.nama + " hasil luas persegi:" + oDhiauddin.luaspersegi(20));

        Calculator oMuhammadkadar = new Calculator("Muhammadkadar");
        System.out.println(oMuhammadkadar.nama + "hasil sisi persegi : "+ oMuhammadkadar.sisipersegi(20));
    }
}
