package ExercicioUm_ca;

import java.util.Objects;

abstract class Produto {
  Integer codigo;
  String nome;
  Double preco;

  public Produto(Integer codigo, String nome, Double preco) {
    this.codigo = codigo;
    this.nome = nome;
    this.preco = preco;
  }

  abstract void mostrarDetalhesDoItem();

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Produto produto = (Produto) o;
    return Objects.equals(codigo, produto.codigo);
  }


// public String equal(Object obj){
//   if(obj instanceof Produto) {
//     Produto encontra = (Produto) obj;
//     return this.codigo.equals(encontra.codigo);
//   } else {
//     return false;
//   }
// }

}
