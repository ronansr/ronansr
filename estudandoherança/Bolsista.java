package estudandoherança;
public class Bolsista extends Aluno{
    private float bolsa;
    
    public void renovarBolsa(){
        System.out.println("Renovando bolsa de " + this.getNome());
    }

    
    @Override
    public void pagarMensalidade(){
        System.out.println("-bolsista- Mensalidade paga com desconto!");
    }
    
}
