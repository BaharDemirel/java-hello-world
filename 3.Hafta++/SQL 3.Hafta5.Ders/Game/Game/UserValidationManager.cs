using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Game
{
    internal class UserValidationManager : IUserValidationService
    {
        public bool Validate(Gamer gamer)
        {
            if(gamer.BirthYear == 1988 && gamer.FirstName == "Bahar" && gamer.LastName == "DEMİREL" && gamer.IdentityNumber == 12345)
            {
                return true;
            }
            else
            {
                return false;
            }
        }
    }
}
