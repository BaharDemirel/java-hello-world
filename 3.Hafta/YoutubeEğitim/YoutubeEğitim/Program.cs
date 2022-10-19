// See https://aka.ms/new-console-template for more information
namespace YouTubeEgitim
{
    class Program{
        static void Main(string[] args)
        {
            //IoC Container(Inversion of Control) : Uygulamanın yaşam döngüsü boyunca birbirine
            //bağımlılığı az (loose coupling) olan nesneler oluşturmayı amaçlayan bir yazılım geliştirme prensibidir.
            CustomerManager customerManager =new CustomerManager(new Customer(), new CarCreditManager());
            customerManager.GiveCredit();

            //CreditManager creditManager = new CreditManager();
            //creditManager.Calculate();
            //creditManager.Calculate();
            //creditManager.Save();

            //Customer customer = new Customer(); //örneğini oluşturmak, instance oluşturmak, instance creation
            //customer.Id = 1;
            //customer.City = "Samsun";

            //CustomerManager customerManager = new CustomerManager(customer);
            //customerManager.Save();
            //customerManager.Delete();

            //Company company = new Company();
            //company.TaxNumber = "100000";
            //company.CompanyName = "Bosch";
            //company.Id = 100;

            //CustomerManager customerManager2 = new CustomerManager(new Person());

            //Person person = new Person();
            //Person.NationalIdentity ="";
            //Person.FirstName = "";

            //Customer c1 = new Customer();
            //Customer c2 = new Person();
            //Customer c3 = new Company();

            Console.ReadLine();

          //----------------------------------------------------------

          // int[] sayilar1 = new[] { 1, 2, 3 };
          // int[] sayilar2 = new[] { 10, 20, 30 };
          // sayilar1 = sayilar2;

          // sayilar2[0] = 1000;

          //Console.WriteLine(sayilar1[0]);

          //----------------------------------------------------------


          //int sayi1 = 10;  1.Örnek
          //int sayi2 = 20;
          //sayi1 = sayi2;
          //sayi2 = 100;

          //Console.WriteLine(sayi1);
        }
    }

    class CreditManager  
    {
        public void Calculate(int creditType)
        {
            //sonar qube

            Console.WriteLine("Hesaplandı");
        }

        public void Save()
        {
            Console.WriteLine("Kredi verildi.");
        }
    }

    interface ICreditManager 
    {
        void Calculate();
        void Save();
    }

    abstract class BaseCreditManager : ICreditManager
    {
        public abstract void Calculate(); //tamamlanmamış operasyon.

        public virtual void Save() //tamamlanmış operasyon. virtual(sanal)
        {
             Console.WriteLine("Kaydedildi");
        }
    }

    class TeacherCreditManager : BaseCreditManager, ICreditManager
    {
        public override void Calculate() //ovverride: üstüne yaz demektir.
        {
            //hesaplamalar
            Console.WriteLine("Öğretmen kredisi hesaplandı");
        }

        public override void Save()
        {
            base.Save();
        }


    }
    class MilitaryCreditManager :BaseCreditManager, ICreditManager
    {
        public override void Calculate() //ovverride: üstüne yaz demektir.
        {
            //hesaplamalar
            Console.WriteLine("Asker kredisi hesaplandı");
        }

    }

    class CarCreditManager :BaseCreditManager, ICreditManager
    {
        public override void Calculate()
        {
            Console.WriteLine("Araba kredisi hesaplandı");
        }

    }
    //SOLID prensipleri: geliştirilen herhangi bir yazılımın esnek, yeniden kullanılabilir,

    //sürdürülebilir ve anlaşılır olmasını sağlayan, ayrıca kod tekrarını önleyen prensiplerdir. 
    // S : Single Responsibility Principle (SRP) - Her method ve class’ın tek bir görevi ve sorumluluğu vardır.
    // O : Open Closed Principle (OSP) - Her class geliştirmeye açık olmalı fakat değişime kapalı olmadılır.
    // L: Liskov Substitution Principle (LSP) - Alt sınıflardan oluşturulan nesnelerin üst sınıfların nesneleriyle
    // yer değiştirdiklerinde aynı davranışı göstermek zorundadır.Yani; türetilen sınıflar,
    // türeyen sınıfların tüm özelliklerini kullanmak zorundadır. 
    // I:  Interface Segregation Principle (ISP) - Her interface’in belirli bir amacı olmalıdır.
    // Tüm metodları kapsayan tek bir interface kullanmak yerine, herbiri ayrı metod gruplarına hizmet veren
    // birkaç interface tercih edilmektedir.
    // D: Dependency Inversion Principle (DIP) - Üst seviye (High-Level) sınıflar, alt seviye (Low-Level) sınıflara
    // bağlı olmamalıdır, ilişki abstraction veya interface kullanarak sağlanmalıdır,
    // Abstraction(soyutlama) detaylara bağlı olmamalıdır, tam tersi detaylar abstraction(soyutlama)’lara bağlı olmalıdır.

    class Customer
    {
        public Customer()
        {
            Console.WriteLine("Müşteri nesnesi başlatıldı.");
        }
        public int Id { get; set; } 
        public string City { get; set; }

    }

    class Person : Customer
    {
        public string FirstName { get; set; }
        public string LastName { get; set; }
        public string NationalIdentity { get; set; }
    }

    class Company : Customer //Şirket Müşteri nesnesinden inherit oluyor.
    {
        public string CompanyName { get; set; }
        public string TaxNumber { get; set; }
    }

    //Katmanlı Mimariler
    class CustomerManager
    {
        private Customer _customer; //private : sadece bu class içerisinde kullanılır.
        private ICreditManager _creditManager;

        public CustomerManager(Customer customer, ICreditManager creditManager)
        {
            _customer = customer;
            _creditManager = creditManager;
        }
        public void Save()  //Müşteri nesnesini parametre olarak gönderiyoruz.
        {
            Console.WriteLine("Müşteri kaydedildi: ");
            //Console.WriteLine("Müşteri kaydedildi." + _customer.FirstName);
        }
        public void Delete()  
        {
            Console.WriteLine("Müşteri silindi: ");
            //Console.WriteLine("Müşteri silindi." + _customer.FirstName);
        }
        public void GiveCredit()
        {
            _creditManager.Calculate();
            Console.WriteLine("Kredi verildi.");
        }
    }
}

