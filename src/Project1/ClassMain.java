package Project1;

public class ClassMain {
    public static void main(String[] args) {
        Calculator orizkaaulia = new Calculator("Rizka Aulia");
        System.out.println(orizkaaulia.nama+" Hasil penjumlahan : " + orizkaaulia.penjumlahan(10,10));
    
        Calculator oDea = new Calculator("Dea Syafira");
        System.out.println(oDea.nama+" Hasil perkalian : " + oDea.perkalian(10,10));
        
        Calculator ofuzlaazkia = new Calculator("Fuzla azkia");
        System.out.println(ofuzlaazkia.nama + " Hasil Modulus : " + ofuzlaazkia.modulus (20,3));

        Calculator oHusna = new Calculator("Husna");
        System.out.println(oHusna.nama + " Hasil pembagian : " + oHusna.pembagian (20,3));
    
        Calculator omitha = new Calculator("mitha");
        System.out.println(omitha.nama + " Hasil pangkat : " + omitha.pangkat(2, 4));
        
        Calculator oDhynanti = new Calculator("Dhynanti");
         oDhynanti.Persentase(2, 20);

         Calculator oAmzar = new Calculator("Muhammad amzar");
         System.out.println(oAmzar.nama + " Hasil Keliling persegi : " + oAmzar.KelilingPersegi(10));

         Calculator oAlfi = new Calculator("Alfi Syahrin");
         System.out.println(oAlfi.nama + " sin : " + oAlfi.sin(5));

         Calculator oHaiqal = new Calculator("haiqal murthada");
         System.out.println(oHaiqal.nama + " luas persegi panjang : " + oHaiqal.luasPersegiPanjang(5,5));

         Calculator oMunawarIman = new Calculator("munawar iman");
         System.out.println(oMunawarIman.nama + " hasil luas kubus : " + oMunawarIman.luaskubus(6));
 
    }

    }
