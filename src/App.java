import base.singleton.SingletonEager;
import base.singleton.SingletonLazeHolder;
import base.singleton.SingletonLazy;
import base.strategy.Compartamento;
import base.strategy.ComportamentoAgressivo;
import base.strategy.ComportamentoDefensivo;
import base.strategy.ComportamentoNormal;
import base.strategy.Robo;

public class App {
    public static void main(String[] args) throws Exception {

        // Singleton

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

        // Strategy
        Compartamento normal = new ComportamentoNormal();
        Compartamento devensivo = new ComportamentoDefensivo();
        Compartamento agressivo = new ComportamentoAgressivo();

        Robo robo = new Robo();
        robo.setComportamento(normal);
        robo.mover();
        robo.mover();

        robo.setComportamento(agressivo);
        robo.mover();
        robo.mover();

        robo.setComportamento(devensivo);
        robo.mover();
        robo.mover();

    }
}
