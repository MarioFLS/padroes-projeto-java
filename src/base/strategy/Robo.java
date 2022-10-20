package base.strategy;

public class Robo {
  private Compartamento comportamento;

  public void setComportamento(Compartamento comportamento) {
    this.comportamento = comportamento;
  }

  public void mover() {
    comportamento.mover();
  }
}
