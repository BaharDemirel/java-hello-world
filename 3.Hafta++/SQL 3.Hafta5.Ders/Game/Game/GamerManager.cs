using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Game
{
    //MicroService
    internal class GamerManager : IGamerService
    {
        IUserValidationService _userValidationService; 

        public GamerManager(IUserValidationService userValidationService)    //GamerManager servisinin doğrulama servisini kullanacağım demektir. 
        {
            _userValidationService = userValidationService;
        }

        public void Add(Gamer gamer)
        {

            if (_userValidationService.Validate(gamer)==true)
            {
                Console.WriteLine("Kayıt oldu");
                
            }
            else
            {
                Console.WriteLine("Doğrulama başarısız.Kayıt başarısız.");

            }

        }

        public void Delete(Gamer gamer)
        {
            Console.WriteLine("Kayıt silindi");
        }

        public void Update(Gamer gamer)
        {
            Console.WriteLine("Kayıt güncellendi");
        }
    }
}
