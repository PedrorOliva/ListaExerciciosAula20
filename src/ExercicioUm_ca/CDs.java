package ExercicioUm_ca;

public class CDs extends Produto{
  Integer faixas;

  public CDs(Integer codigo, String nome, Double preco, Integer faixas) {
    super(codigo, nome, preco);
    this.faixas = faixas;
  }

  @Override
  void mostrarDetalhesDoItem() {
    System.out.println("---- Detalhes do item ----");
    System.out.println("Código: " + codigo);
    System.out.println("Nome: " + nome);
    System.out.println("Preço R$: " + preco);
    System.out.println("Nº de faixas: " + faixas);
  }
}
