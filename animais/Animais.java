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
public class Animais {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Animal a=new Animal();
       a.beber();
       a.dormir();
       a.emitirSom();
       Cachorro c= new Cachorro ("Basset", (float) 2.3);
       c.beber();
       c.dormir();
       c.comer();
       c.emitirSom();
       Gato g=new Gato("Siamês", (float) 5.0);
       g.beber();
       g.comer();
       g.dormir();
       g.emitirSom();
    }
    
}
