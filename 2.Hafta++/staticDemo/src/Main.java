public class Main {  //Stattik bir metoddur main metodu..

    public static void main(String[] args) {
        ProductManager manager=new ProductManager();
        Product product=new Product();
        product.price=10;
        product.name ="";

        manager.add(product);
    }
}