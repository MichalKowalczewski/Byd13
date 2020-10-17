package obiektowe.przyklad5;

public class OuterClass {

    private static String testPola = "testPola";

    public static class InnerClass{
        public void display(){
            System.out.println(testPola);
            System.out.println("Inner Class");
            test();
            testPola="Jan";
        }
    }

    public void displayInner(){
        InnerClass innerClass = new InnerClass();
        innerClass.display();
    }

    public void display() {
        System.out.println(testPola);
    }

    private static void test(){
        System.out.println("test");
    }

}