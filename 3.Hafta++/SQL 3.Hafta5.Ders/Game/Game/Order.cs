using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Game
{
    internal class Order
    {
        List<Product> _productList;
        Offer _offer;

        public Order(List<Product> productList, Offer offer)
        {
            _productList = productList;
            _offer = offer;
        }
    }
}
