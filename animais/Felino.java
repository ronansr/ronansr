/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animais;

/**
 *
 * @author dudu
 */
public class Felino extends Animal {

   private String raca;
private float peso;

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public Felino(String raca, float peso) {
        this.raca = raca;
        this.peso = peso;
    }

    
    public void emitirSom(){
        System.out.println("o gato mia ");
    }
}
