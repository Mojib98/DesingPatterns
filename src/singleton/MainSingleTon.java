package singleton;

public class MainSingleTon {
    public static void main(String[] args) {
        var s = SimpleSingleton.singleton();
        var s2 = SimpleSingleton.singleton();
        var w1=LazyHolderSingleton.get();
    }
}
