using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Game
{

    internal class OfferManager : IOfferService
    {
        IOfferValidationServices _offerValidationServices;

        public OfferManager(IOfferValidationServices offerValidationServices)
        {
            _offerValidationServices = offerValidationServices;
        }

        public void Add(Offer offer)
        {
            Console.WriteLine("Kampanya oluşturuldu");
        }
        public void Update(Offer offer)
        {
            Console.WriteLine("Kampanya güncellendi");
        }
        public void Delete(Offer offer)
        {
            Console.WriteLine("Kampanya silindi");
        }
    }
}
