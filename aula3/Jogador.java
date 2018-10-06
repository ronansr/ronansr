package aula3;
import java.util.Scanner;

public class Jogador {
    String nome;
    int palpite;
    int jogosGanhos = 0;
    int jogosPerdidos = 0;
    
    void getJogador(){
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o nome: ");
        nome = ler.next();
        getPalpite();
    }
    void getPalpite(){
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o palpite: ");
        palpite = ler.nextInt();
    }
    void ganhei(){
        jogosGanhos++;
    }
    void perdi(){
        jogosPerdidos--;
    }
    int vePalpite(){
        return palpite;
    }
    
}
