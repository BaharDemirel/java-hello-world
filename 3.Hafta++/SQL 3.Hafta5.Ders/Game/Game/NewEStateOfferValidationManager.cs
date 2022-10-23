using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Game
{
    internal class NewEStateOfferValidationManager : IOfferValidationServices
    {
        public bool Validate(Offer offer)
        {
            return true;
        }
    }
}
