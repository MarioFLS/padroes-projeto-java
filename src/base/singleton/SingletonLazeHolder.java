package base.singleton;

public class SingletonLazeHolder {
  private static class InstanceHolder {
    public static SingletonLazeHolder instancia = new SingletonLazeHolder();
  }

  private SingletonLazeHolder() {
    super();
  }

  public static SingletonLazeHolder getInstance() {
    return InstanceHolder.instancia;
  }
}
