package exceptions.przyklad2;

import java.util.Random;

public class Operacja {

    Random random = new Random();

    public void operuj() {
        System.out.println("Zaczynam operacje");
        int szansaNaBlad = random.nextInt(10);
        if(szansaNaBlad >5){
            popelnijBlad();
        }
    }

    public void popelnijBlad()  {
        throw new MyException("Popelniles blad");
    }

}
