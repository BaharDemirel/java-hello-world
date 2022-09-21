public class Main {
    public static void main(String[] args) {
        String mesaj = "Bugün hava çok güzel.";
        System.out.println(mesaj);

        /*System.out.println("Eleman sayısı : "+mesaj.length()); // metindeki karakter sayısını verir.
        System.out.println("5.eleman : "+mesaj.charAt(4)); //metindeki 5.harfi yani karakteri yazdırıyoruz.
        System.out.println(mesaj.concat(" Yaşasın!")); // iki metni birleştirmektedir.
        System.out.println(mesaj.startsWith("A")); //metin "A" ile başlıyor mu? false ve true döner.
        System.out.println(mesaj.endsWith("."));  // metin "." ile bitiyor mu? false ve true döner.

        char[] karakterler = new  char[5]; //0 'dan itibaren 5 e kadar olanları karakterlere atanır.
        mesaj.getChars(0,5,karakterler,0); //getChars : karakterleri alma
        System.out.println(karakterler);
        System.out.println(mesaj.indexOf("av")); // metin içerisinde arama yapar. Aramaya başladığında ilk "a" harfi bulur yazdırır.
        System.out.println(mesaj.lastIndexOf("a")); //Aramaya sağdan başlar.*/


        String yeniMesaj = mesaj.replace(' ','-'); //karakterleri değiştirmek için kullanırız.
        System.out.println(yeniMesaj);

        //System.out.println(mesaj.substring(2)); // metinde belirtilen indeksten ititbaren keser.
        System.out.println(mesaj.substring(2,5)); // 2 den başla 5 e kadar kes. Sıklıkla kullanılır.

        for(String kelime : mesaj.split(" ")){ //split ile boşluğa göre alt alta ayır.
            System.out.println(kelime);
        }

        System.out.println(mesaj.toLowerCase()); // mesaj ı küçük harfe çevir.
        System.out.println(mesaj.toUpperCase()); // mesaj ı büyük harfe çevir.

        System.out.println(mesaj.trim()); // metinin başındaki ve sonundaki boşlukları atar.
    }
}