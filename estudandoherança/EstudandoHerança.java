package estudandoherança;
public class EstudandoHerança {
    public static void main(String[] args) {
        // Programa principal
        Aluno p1 = new Aluno();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();
        p1.setNome("Pedro");
        p2.setNome("Pedro");
        p3.setNome("Joao");
        p4.setNome("Claudio");
        
        p1.setSexo("M");
        p4.setSexo("M");
         
        System.out.println(p1.toString()); 
        System.out.println(p2.toString()); 
        
        System.out.println(p1.equals(p2));
    }
}
