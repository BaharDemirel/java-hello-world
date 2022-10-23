using Game;
using System;

namespace GameProject
{
    class Program
    {
        static void Main(string[] args)
        {
            GamerManager gamerManager = new GamerManager(new NewEStateUserValidationManager());
            gamerManager.Add(new Gamer { Id = 1, BirthYear = 1988, FirstName = "Bahar", LastName = "DEMİREL", IdentityNumber = 12345 });
            
            List<Product> MyProducts = new List<Product>();
            
            Product MyProduct1 = new Product();
            MyProduct1.Id = 1;
            MyProduct1.ProductName = "Product 1";
            MyProduct1.Price = 99;
            MyProducts.Add(MyProduct1);

            Product MyProduct2 = new Product();
            MyProduct2.Id = 2;
            MyProduct2.ProductName = "Product 2";
            MyProduct2.Price = 99;
            MyProducts.Add(MyProduct2);

            Offer MyOffer = new Offer();
            MyOffer.Id = 1;
            MyOffer.OfferName = "%10 Discount";
            MyOffer.Discount = 10;

            OfferManager offerManager = new OfferManager(new NewEStateOfferValidationManager());
            offerManager.Add(MyOffer);

            Order MyOrder = new Order(MyProducts, MyOffer);

            OrderManager orderManager = new OrderManager(new NewEStateOrderValidationManager());
            orderManager.Add(MyOrder);
        }
    }
}