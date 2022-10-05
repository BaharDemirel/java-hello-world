public class ProductValidator {

    static{
        System.out.println("Static yapıcı blok çalıştı.");
    }

    public ProductValidator(){
        System.out.println("Yapıcı blok çalıştı.");
    }
    public static boolean isValid(Product product){
        if(product.price>0 && !product.name.isEmpty()){ //isEmpty: değer girilmedi.
            return true;
        }else{
            return false;
        }
    }

    public void bisey(){

    }

//    public static class BaskaBirClass{  //inner Class; genellikle guruplama olarak kullanılır.
//        public static void Sil(){
//
//        }
//    }
}
