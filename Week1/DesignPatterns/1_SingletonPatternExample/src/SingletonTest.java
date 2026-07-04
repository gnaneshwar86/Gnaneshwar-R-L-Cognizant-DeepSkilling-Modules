public class SingletonTest {

    public static void main(String[] args) {

        Logger logger1 = Logger.getInstance();
        logger1.log("Application Started");

        Logger logger2 = Logger.getInstance();
        logger2.log("Loading Modules");

        System.out.println();

        if (logger1 == logger2) {
            System.out.println("Only one Logger instance exists.");
        }

        System.out.println("logger1 HashCode : " + logger1.hashCode());
        System.out.println("logger2 HashCode : " + logger2.hashCode());
    }
}