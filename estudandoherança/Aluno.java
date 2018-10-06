package estudandoherança;
public class Aluno extends Pessoa{
    //Classe com herança da diferença. Classe de especialização de pessoa e pessoa e uma generalização de aluno
    private int mat;
    private String curso;
    
    public void cancelarMat(){
        System.out.println("Matricula será cancelada!");
    }
    
    public void pagarMensalidade(){
        System.out.println("Mensalidade paga!");
    }
    public int getMat() {
        return mat;
    }

    public void setMat(int mat) {
        this.mat = mat;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

}
