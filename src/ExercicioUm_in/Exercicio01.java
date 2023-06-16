package ExercicioUm_in;

import java.util.Scanner;

public class Exercicio01 {
  public static void main(String[] args) {
    Scanner inputUsuario = new Scanner(System.in);
    FabricaLampada novaLampada = new FabricaLampada();

    System.out.println("Qual o modelo de lâmpada deseja fabricar? ");
    String escolhaLampada = inputUsuario.next();

    Lampada lampada = novaLampada.costruir(escolhaLampada);

    if(lampada != null){
      lampada.ligar();

      lampada.desligar();
    } else {
      System.out.println("Essa lâmpada não existe!!!");
    }
  }
}
