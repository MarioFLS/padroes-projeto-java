package base.strategy;

public class ComportamentoNormal implements Compartamento {
  @Override
  public void mover() {
    System.out.println("Movendo-se normalmente...");
  }
}
