public class PersonagenDeJogo{
  private String nome;
  private String pontosDeVida;

public PersonagenDeJogo(String nome, String pontosDeVida){
  this.nome = nome;
  this.pontosDeVida = pontosDeVida;
}
  public String getNome(){
    return nome;
  }

  public void setNome(String nome){
    this.nome = nome;
  }

  public String getPontosDeVida(){
    return pontosDeVida;
  }

  public void setPontosDeVida(String pontosDeVida){
    this.pontosDeVida = pontosDeVida;
  }
  public void exibirPersonagens(){
     System.out.println("nome: " + nome + "n" + "pontos de vida :" + pontosDeVida);
  }
}