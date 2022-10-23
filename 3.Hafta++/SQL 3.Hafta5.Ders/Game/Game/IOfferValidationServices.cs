using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Game
{
    internal interface IOfferValidationServices
    {
        bool Validate(Offer offer);
    }
}
