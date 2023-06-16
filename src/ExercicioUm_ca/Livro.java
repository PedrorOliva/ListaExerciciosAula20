package ExercicioUm_ca;

public class Livro extends Produto{
  String autor;

  public Livro(Integer codigo, String nome, Double preco, String autor) {
    super(codigo, nome, preco);
    this.autor = autor;
  }

  @Override
  void mostrarDetalhesDoItem() {
    System.out.println("---- Detalhes do item ----");
    System.out.println("Código: " + codigo);
    System.out.println("Nome: " + nome);
    System.out.println("Preço R$: " + preco);
    System.out.println("Autor: " + autor);

  }
}
