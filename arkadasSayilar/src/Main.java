public class Main {
    public static void main(String[] args) {
        //220-284 1 den başlayıp 220(220 dahil değil) yi bölen tüm sayıların toplamı 284 iken, 1 den başlayıp 284(284 dahil değil) e kadar tüm sayıların toplamı 220 ye eşit ise bu sayılar arkadaştır.

        int sayi1 = 220;
        int sayi2 = 288;
        int toplam1 = 0;
        int toplam2 = 0;

        for (int i=1;i<sayi1;i++){
            if (sayi1%i==0){
                toplam1= toplam1+i;
            }
        }

        for (int i=1;i<sayi2;i++){
            if (sayi2%i==0){
                toplam2= toplam2+i;
            }
        }

        if (sayi1==toplam2 && sayi2==toplam1){
            System.out.println("Bu iki sayı arkadaştır.");
        }else {
            System.out.println("Bu iki sayı arkadaş değildir.");
        }
    }
}