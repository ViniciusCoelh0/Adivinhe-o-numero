import java.util.Scanner; //Permite que o usuario escreva
import java.util.Random; //Permite que o computador escolha um numero aleatorio

public class Main{
  public static void main(String[] args) {
    Random gerador = new Random ();
    int numeroAleatorio = gerador.nextInt(100);

    Scanner entrada = new Scanner(System.in); //Entrada do usuario
    System.out.println("Adivinhe o numero que estou pensando");
    int numero = entrada.nextInt(); //Entrada do usuario

    if(numero == numeroAleatorio){
      System.out.println("Parabens! Voce acertou! O numero realmente era" + numeroAleatorio);
    }else{
      System.out.println("Que pena! Voce errou!");
      System.out.println("Eu pensei no numero " + numeroAleatorio);
    }
  }
}