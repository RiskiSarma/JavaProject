package Project1;

public class ClassMain {
    public static void main(String[] args) {
        Calculator orizkaaulia = new Calculator("Rizka Aulia");
        System.out.println(orizkaaulia.nama+" Hasil penjumlahan : " + orizkaaulia.penjumlahan(10,10));
    
    Calculator oDea = new Calculator("Dea Syafira");
        System.out.println(oDea.nama+" Hasil perkalian : " + oDea.perkalian(10,10));
    }
}
