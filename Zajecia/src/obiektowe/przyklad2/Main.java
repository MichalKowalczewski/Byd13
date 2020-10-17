package obiektowe.przyklad2;

public class Main {
    public static void main(String[] args) {
        //Osoba osoba = new Osoba("Jan", "Kowalski", 50);
        Pracownik pracownik = new Pracownik("Jan", "Kowalski", 50, 3000);
        pracownik.describe();

        Manager manager = new Manager("Andrzej", "Nowak", 40, 8000);
        manager.describe();

        Pracownik programista = new Programista("Maria", "Curie", 120, 12000);
        programista.describe();

        Manager manager2 = new Manager("Test", "Test", 60, 7000);

        Pracownik senior = new ProgramistaSenior("Nowy", "Programista", 15, 99999);

        Pracownik[] osoby = {pracownik, manager2, senior, programista};

        String sprawdz = programista instanceof Pracownik ? "Jest" : "Nie jest";
        System.out.println(sprawdz);
        if (programista instanceof Manager) {
            Manager pracownik1 = (Manager) programista;
            System.out.println(pracownik1.getPensja());
        }

        manager.setPodlegliPracownicy(osoby);
        System.out.println("__________");
        manager.describe();
        for(Pracownik p : manager.getPodlegliPracownicy()){
            p.describe();
        }



    }
}
