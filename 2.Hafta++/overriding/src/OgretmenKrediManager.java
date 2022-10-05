public class OgretmenKrediManager extends BaseKrediManager{
    @Override
    public double hesapla(double tutar) {
        return tutar * 1.10;
    }
}
