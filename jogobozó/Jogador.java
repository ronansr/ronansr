package jogobozó;
import java.util.Random;
//for(Dado dado:dado) para cada instancia do array-- modo ietrado do for
public class Jogador {
    String nome;
    int idade;
    int jogosGanhos = 0;
    String escolhaJogo;
    
    public void Jogador(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }
    public void ganhei(){
        jogosGanhos++;
    }
    
    public void geraEscolhaJogo(){
        
    }
    public void statusJogador(){
        System.out.println("Nome" + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Jogos Ganhos: "+ this.jogosGanhos);
    }
}
