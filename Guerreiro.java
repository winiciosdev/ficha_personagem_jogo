public class Guerreiro extends PersonagenDeJogo {
  private String forca;

  public Guerreiro(String nome, String pontosDeVida, String forca){
    super(nome, pontosDeVida);
    this.forca = forca;
  }
  public String getForca(){
    return forca;
  }
  public void setForca(String forca){
    this.forca = forca;
  }
  public void exibirPersonagens(){
   System.out.println("\n" + "Nome: " + super.getNome() + "\n" +  "pontos de vida: " + super.getPontosDeVida() + "\n" + "forca: " + forca);
  }
}