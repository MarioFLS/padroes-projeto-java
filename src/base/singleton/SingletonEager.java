package base.singleton;

/**
 * Singleton "apressado"
 * 
 * @author Mario
 */

public class SingletonEager {
  private static SingletonEager instancia = new SingletonEager();

  private SingletonEager() {
    super();
  }

  public static SingletonEager getInstance() {
    return instancia;
  }
}
