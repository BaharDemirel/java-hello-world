using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Game
{
    internal interface IOrderService
    {
        void Add(Order order);
        void Update(Order order);
        void Delete(Order order);

    }
}
