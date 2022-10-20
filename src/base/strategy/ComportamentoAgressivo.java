package base.strategy;

public class ComportamentoAgressivo implements Compartamento {
  @Override
  public void mover() {
    System.out.println("Movendo-se agressivamente");
  }

}
