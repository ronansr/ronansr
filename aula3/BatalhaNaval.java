package aula3;
import java.util.Scanner;
public class BatalhaNaval {
    String nome;
    int tam;
    int vetor[] = new int[50];
    int tamNavio;
    
    Jogador iniciar(){
        Jogador x = new Jogador();
        x.getJogador();
        getBarco();
        return x;
    }
    void getTab(){
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o tamanho do Tab: ");
        tam = ler.nextInt();
        
    }
    void getBarco(){
        getTab();
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o tamanho do Tab: ");
        tam = ler.nextInt();
        System.out.println("Digite o nome do Navio: ");
        nome = ler.next();
        System.out.println("Digite o tamanho do Navio: ");
        tamNavio = ler.nextInt();
    }
    int criarBarco(int vetor[],int tamNavio, int tam){
        int pos;
        pos = geraAleatorio();
        while(pos + tam > tamNavio)
            pos = geraAleatorio();
        
        for(int i = 0; i < tam; i++){
            if(i >= pos && i <= pos+tamNavio)
                vetor[i] = 1;
            else
                vetor[i] = 0;
        }
        return pos;
    }
    int geraAleatorio(){
        return (int)(Math.random()*10);
    }
    void verifica(Jogador x, int vetor[], int tam, int tamNavio, int pos){
        int afund = 0;
        for(int i = 0; i < tamNavio; i++){
            if(vetor[x.palpite] == 1){
                System.out.println("Acertou!");
                afund++;
            }
            else 
                System.out.println("Errou!");
        if(afund == tamNavio){
            
            break;
        }
            
        x.getPalpite();
        }
    }
    void imprimeTab(){
        for(int i = 0; i < tam; i++)
            System.out.print(vetor[i]);
    }
    void jogar(){
        Jogador x;
        int pos = criarBarco(vetor,tamNavio,tam);
        x = iniciar();
        imprimeTab();

        
        
    }
}
