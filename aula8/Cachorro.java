package aula8;
import java.util.Scanner;
public class Cachorro {
    String nome;
    String raca;
    String cor;
    String nascimento;
    /**
    * Este método faz a impressão dos dados do cadastro do cachorro.
    * @return 
    */
    public void ImprimirCadastro(){

        System.out.println("Nome: " + this.nome);
        System.out.println("Raça: " + this.raca);
        System.out.println("Cor: " + this.cor);
        System.out.println("Nascimento: " + this.nascimento);
    }
    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getRaca(){
        return this.raca;
    }
    public void setRaca(String raca){
        this.raca = raca;
    }
    public String getCor(){
        return cor;
    }
    public void setCor(String cor){
        this.cor= cor;
    }
    public String getNascimento(){
        return nascimento;
    }
    public void Cadastrar(String nome, String nascimento){
        Scanner ler = new Scanner(System.in);
    }
}
