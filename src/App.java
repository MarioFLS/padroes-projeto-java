import base.SingletonEager;
import base.SingletonLazeHolder;
import base.SingletonLazy;

public class App {
    public static void main(String[] args) throws Exception {
        SingletonLazy lazy = SingletonLazy.getInstance();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstance();
        System.out.println(lazy);

        SingletonEager eager = SingletonEager.getInstance();
        System.out.println(eager);
        eager = SingletonEager.getInstance();
        System.out.println(eager);

        SingletonLazeHolder lazyHolder = SingletonLazeHolder.getInstance();
        System.out.println(lazyHolder);
        lazyHolder = SingletonLazeHolder.getInstance();
        System.out.println(lazyHolder);
    }
}
