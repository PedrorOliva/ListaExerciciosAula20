package ExercicioUm_ca;

public class DVDs extends Produto{
  Double duracao;

  public DVDs(Integer codigo, String nome, Double preco, Double duracao) {
    super(codigo, nome, preco);
    this.duracao = duracao;
  }

  @Override
  void mostrarDetalhesDoItem() {
    System.out.println("---- Detalhes do item ----");
    System.out.println("Código: " + codigo);
    System.out.println("Nome: " + nome);
    System.out.println("Preço R$: " + preco);
    System.out.println("Duração: " + duracao);
  }
}
