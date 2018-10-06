package estudandoherança;
public class Técnico extends Aluno {
    private int regProfissional;

    public int getRegProfissional() {
        return regProfissional;
    }

    public void setRegProfissional(int regProfissional) {
        this.regProfissional = regProfissional;
    }
    
    public void praticar(){
        System.out.println("Estou praticando!");
    }
    
}
