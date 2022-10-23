using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Game
{
    internal interface IOfferService
    {
        void Add(Offer offer);
        void Update(Offer offer);
        void Delete(Offer offer);

    }
}
