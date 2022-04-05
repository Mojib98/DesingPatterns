package singleton;

public class SimpleSingleton {
    private static SimpleSingleton INSTANCE = new SimpleSingleton();
    private SimpleSingleton(){
        System.out.println("hey");
    }
    public static SimpleSingleton singleton(){
        return INSTANCE;
    }


}
