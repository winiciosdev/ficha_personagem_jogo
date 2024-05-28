import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner l = new Scanner(System.in);

    System.out.println("Digite o nome do personagem");
    String nome = l.nextLine();
    
    System.out.println("digite a quantidade de pontos de vida que o seu personagem possui");
    String pontosDeVida = l.nextLine();
    
    System.out.println("o seu personagem é um guerreiro ou um mago?");
    String classePersonagem = l.nextLine();

    if(classePersonagem.equalsIgnoreCase("mago")){
      System.out.println("insira a quantidade de mana que seu personagem possui");
      String mana = l.nextLine();
      mago mago = new mago(nome, pontosDeVida, mana);
      mago.exibirPersonagens();     
    }else if(classePersonagem.equalsIgnoreCase("guerreiro")){
      System.out.println("insira a força que seu personage possui");
      String forca = l.nextLine();
      Guerreiro guerreiro = new Guerreiro(nome, pontosDeVida, forca);
      guerreiro.exibirPersonagens();
    }else{
      System.out.println("classe ainda não disponivel");
    }
  }

}