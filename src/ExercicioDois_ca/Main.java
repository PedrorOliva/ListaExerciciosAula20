package ExercicioDois_ca;

public class Main {
  public static void main(String[] args) {
    Forma[] formas = new Forma[5];

    formas[0] = new Retangulo(5, 3);
    formas[1] = new Circulo(2);
    formas[2] = new Quadrado(4);
    formas[3] = new Circulo(3);
    formas[4] = new Retangulo(2, 4);

    for(Forma forma : formas) {
      System.out.println("Área: " + forma.calcularArea());
      System.out.println("Perímetro: " + forma.calcularPerimetro());
    }
  }
}
