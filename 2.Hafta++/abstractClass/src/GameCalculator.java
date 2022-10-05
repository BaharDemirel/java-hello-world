public abstract class GameCalculator { //hangi sınıf inherit ediyorsa o sınıf kendi hesaplamalarını yapan kodlarını yazmak zorunda.
    public abstract void hesapla();

    public final void gameOver(){
        System.out.println("Oyun Bitti...");
    }
}
