public class MySqlCustomerDal implements ICustomerDal, IRepository{ //Mysql için Add operasyonu..
    @Override
    public void Add() {
        System.out.println("Mysql eklendi");
    }
}
