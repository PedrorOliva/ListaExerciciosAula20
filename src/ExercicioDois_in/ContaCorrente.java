package ExercicioDois_in;

public class ContaCorrente implements Tributos {
  private double saldo;
  @Override
  public Double calculaTributo() {
    return saldo * 0.01;
  }
}
