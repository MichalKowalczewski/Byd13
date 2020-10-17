package obiektowe.przyklad5;

public class Main {
    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass();
        outerClass.displayInner();
        outerClass.display();
        OuterClass.InnerClass test = new OuterClass.InnerClass();
        test.display();

        class LocalClass{
            void test() {
                System.out.println("test lokalnej");
            }
        }

        LocalClass localClass = new LocalClass();
        localClass.test();

    }

}
