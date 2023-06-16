package ExercicioUm_ca;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Loja {
  public static void main(String[] args) {
    Scanner inputUsuario = new Scanner(System.in);
    List<Produto> catalogo = new ArrayList<>();

    Produto CD1 = new CDs(1, "CD Teste1", 29.90, 10);
    CD1.mostrarDetalhesDoItem();
    Produto CD2 = new CDs(2, "Cd Teste2", 32.90, 14);
    CD2.mostrarDetalhesDoItem();
    Produto Livro1 = new Livro(3, "Livro Teste1", 49.50, "Autor Teste");
    Livro1.mostrarDetalhesDoItem();
    Produto Livro2 = new Livro(3, "Livro Teste2", 57.68, "Autor Teste 2");
    Livro2.mostrarDetalhesDoItem();
    Produto DvD1 = new DVDs(5, "Dvd Teste1", 45.55, 1.69);
    DvD1.mostrarDetalhesDoItem();

    catalogo.add(CD1);
    catalogo.add(CD2);
    catalogo.add(Livro1);
    catalogo.add(Livro2);
    catalogo.add(DvD1);

    System.out.println("Produtos com o mesmo código: " + Livro1.codigo.equals(Livro2.codigo));


  }
}
