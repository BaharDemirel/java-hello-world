public class Main {
    public static void main(String[] args) {
        String mesaj ="Bugün hava çok güzel.";
        String yeniMesaj = sehirVer();
        //String yeniMesaj = mesaj.substring(0,2); // Bir değer return(döndürüyor) ediyor.
        System.out.println(yeniMesaj);
        int sayi = topla(15,7);
        System.out.println(sayi);
        int toplam = topla2(2,3,4);
        System.out.println(toplam);
    }
    //void operasyonu. Bir şeyi yap deriz, yani emir veririz void ile..
    public static void ekle(){
        System.out.println("Eklendi");
    }
    public static void sil(){
        System.out.println("Silindi");
    }
    public static void guncelle(){
        System.out.println("Güncellendi");
    }

    public static int topla(int sayi1, int sayi2){ // Bu fonksiyon integer türünde bir değer döndürür.
        //return 5;  //Bitir ama 5 döndür.
        return  sayi1+sayi2;
    }

    public static  int topla2(int... sayilar){ //integer da kullandığımız üçnokta (int...) variable arguments anlamına gelir.
        int toplam = 0;
        for (int sayi:sayilar){
            toplam+=sayi;
        }
        return toplam;
    }
    public static String sehirVer(){
        return "Ankara";
    }
}