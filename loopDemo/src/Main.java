import java.rmi.server.LogStream;

public class Main {
    public static void main(String[] args) {
        //For
        for (int i=2;i<=10;i+=2){    //"+=2" örneği 2 şer 2 şer artıracaktır.
            System.out.println(i);
        }

        System.out.println("Döngü Bitti");

        //while

        int i=1;
        while (i<10){
            System.out.println(i);
            i+=2;
        }
        //infinite loop: sürekli dönen, durmayan döngü.
        System.out.println("While Döngüsü Bitti");

        //Do-While
        int j=100;
        do {
            System.out.println(j);
            j+=2;
        }while (j<10);

        System.out.println("Do-While Döngüsü Bitti");

        //Do-While: şart uymasa bile bir kere daha çalışacaktır.
    }
}