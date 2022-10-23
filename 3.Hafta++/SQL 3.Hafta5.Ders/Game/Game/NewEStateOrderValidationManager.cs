using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Game
{
    internal class NewEStateOrderValidationManager : IOrderValidationServices
    {
        public bool Validate(Order order)
        {
            return true;
        }
    }
}
