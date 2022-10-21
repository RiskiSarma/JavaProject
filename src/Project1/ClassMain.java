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
    
    }

    }
