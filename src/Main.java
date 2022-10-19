import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Değişkenleri tanımlayalım
        double fiyat, KdvTutati;
        Scanner input = new Scanner(System.in);
        System.out.print("Ürün Fiyatını Giriniz:");
        fiyat= input.nextDouble();
        boolean kdv18 = fiyat<1000;
        boolean kdv8 = fiyat>1000;
        double kdv = (kdv18)?  0.18 : 0.08;
        System.out.println( "Kdv Oranı:" +kdv);
        double KdvTutari = (fiyat*kdv);
        System.out.println( "Kdv Tutarı:" +KdvTutari);
        double KdvliFiyat = (fiyat + KdvTutari);
        System.out.println( "Kdv'li Fiyat:" +KdvliFiyat);



    }
}