package aulaexcessao;
public class Calculador {
    
    public static float resultado(int a, int b){
        float x = 0;
        try{
            x = a/b;
        }catch (ArithmeticException e){
            System.out.println("Erro! Divisão por zero!");
        }
        return x;
    }
    public static void corre(){
        int [] vet = new int[2];

        for(int i = 0; i < 3; i++){
            try{
                vet[i] += i;
            }catch(Exception e){
                System.out.println(e.getMessage());
            }
        }
        
        for(int i = 0; i < 3; i++){
            try{
                System.out.println("Divisão: " + Calculador.resultado(vet[i], 0));
            }catch(Exception e){
                
            }
        }
        //ArithmeticException e Array... são especificações de excessoes, portanto,
        //precisa ser seguido do mais específico para o mais geral
        //caso ocorra algum erro
    }

}

