package base.strategy;

public class ComportamentoDefensivo implements Compartamento {
  @Override
  public void mover() {
    System.out.println("Movendo-se de forma devensiva");
  }

}