package creational.singleton;

public final class Singleton {
    private static final Singleton INSTANCE = new Singleton();

    private static String connection;

    // Private constructor is essential
    private Singleton() {
       Singleton.connection = "DB connection object with ID: " + (5 + (int)(Math.random() * ((10 - 5) + 1)));
    }

    // globally accessible static method
    public static String getConnection(){
        return connection;
    }

    // globally accessible static method
    public static Singleton getInstance(){
        return INSTANCE;
    }
}
