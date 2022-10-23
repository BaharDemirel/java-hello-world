using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Game
{

    internal class OrderManager : IOrderService
    {
        IOrderValidationServices _orderValidationServices;

        public OrderManager(IOrderValidationServices orderValidationService)
        {
            _orderValidationServices = orderValidationService;
        }

        public void Add(Order order)
        {
            Console.WriteLine("Sipariş oluşturuldu");
        }
        public void Update(Order order)
        {
            Console.WriteLine("Sipariş güncellendi");
        }
        public void Delete(Order order)
        {
            Console.WriteLine("Sipariş silindi");
        }
    }
}
