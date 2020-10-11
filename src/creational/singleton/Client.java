package creational.singleton;

public class Client {
    public static void main(String[] args) {
        String connection = Singleton.getConnection();

        System.out.println(connection);

        // here the connection will be the same as first
        String anotherConnection = Singleton.getConnection();

        System.out.println(anotherConnection);
    }
}
