package animais;
public class Animal {
    private int idade ;
    private String raca;
    private String nome;

    public Animal(int idade, String raca, String nome) {
        this.idade = idade;
        this.raca = raca;
        this.nome = nome;
    }
    public Animal(){
        
    }
    public void comer(){
        System.out.println("ele está comendo");
        
    }
    
    public void beber(){
        System.out.println("ele está bebendo");
        
    }
    
    public void dormir(){
        System.out.println("ele está bebendo");
        
    }
    public void emitirSom(){
        System.out.println("ele está fazendo barulho");
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
}
