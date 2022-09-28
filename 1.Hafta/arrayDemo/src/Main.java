public class Main {
    public static void main(String[] args) {
        String ogrenci1 = "Bahar";
        String ogrenci2 = "Melih";
        String ogrenci3 = "Yağız";
        String ogrenci4 ="Abdullah";

        System.out.println(ogrenci1);
        System.out.println(ogrenci2);
        System.out.println(ogrenci3);
        System.out.println(ogrenci4);

        System.out.println("------------------------");

        String[] ogrenciler = new String[4]; // Kaç elemandan oluşacağı anlamına gelir.
        ogrenciler[0] = "Bahar";
        ogrenciler[1] = "Melih";
        ogrenciler[2] = "Yağız";
        ogrenciler[3] = "Abdullah";
        //ogrenciler[4] = "Meyra";

        for(int i=0;i<ogrenciler.length;i++){  //öğrencilerin eleman sayısından küçük ve 0 'dan başlayarak,
            System.out.println(ogrenciler[i]);
        }

        System.out.println("------------------------");

        for (String ogrenci:ogrenciler){   //öğrenciler dizisindeki her bir elemanı gez demektir.
            System.out.println(ogrenci);
        }
    }
}