package ExercicioUm_in;

public class FabricaLampada {
  public Lampada costruir(String modelo){
    if(modelo.equals("Incandescente")){
      return new Incandecente();
    } else if(modelo.equals("Fluorescente")){
      return new Fluorescente();
    } else {
      return null;
    }
  }
}
