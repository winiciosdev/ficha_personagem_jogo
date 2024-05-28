public class mago extends PersonagenDeJogo{
  private String mana;

public mago(String nome, String pontosDeVida, String mana){
  super(nome, pontosDeVida);
  this.mana = mana;
}
  public String getMana(){
    return mana;
  }

  public void setMana(String mana){
    this.mana = mana;
  }

  public void exibirPersonagens(){
    System.out.println("\n" + "nome: " + super.getNome() + "\n" + "pontos de vida :" + super.getPontosDeVida() + "\n" + "mana: " + mana);
  }
  
} 