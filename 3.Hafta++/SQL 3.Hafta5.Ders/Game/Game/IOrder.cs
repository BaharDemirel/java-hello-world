using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Game
{
    internal interface IOrder
    {
        void AddProduct(Product product);
        void UpdateProduct(Product product);
        void DeleteProduct(Product product);
        void AddOffer(Offer offer);
        void DeleteOffer(Offer offer);
    }
}
