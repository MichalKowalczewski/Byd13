package obiektowe.zadanie2;

public class Main {
    public static void main(String[] args) {
        Samolot samolot = new Samolot() {
            @Override
            String getName() {
                return "Samolot1";
            }
        };

        Samolot samolot2 = new Samolot() {
            @Override
            String getName() {
                return "Samolot2";
            }
        };

        Samolot samolot3 = new Samolot() {
            @Override
            String getName() {
                return "Samolot3";
            }
        };

        System.out.println(samolot.getName());
        System.out.println(samolot2.getName());
        System.out.println(samolot3.getName());


    }
}
