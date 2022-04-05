package singleton;

import java.sql.Connection;
import java.sql.DriverManager;

public class LazyHolderSingleton {
    private LazyHolderSingleton(){}
    private static class Lazy{
         static LazyHolderSingleton  Instance=new LazyHolderSingleton();
        static  Connection connection;
        static {
            try {
                Class.forName("org.postgresql.Driver");
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
//            connection = DriverManager.getConznection("jdbc:postgresql://localhost:5432/mojib", "mojib", "1");
         }
    }
    public static LazyHolderSingleton get(){
        return Lazy.Instance;
    }
}
