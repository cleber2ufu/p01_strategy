/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p01_strategy.ataque;

/**
 *
 * @author a11421BSI210
 */
public class AtaqueFraco implements Ataque {

    @Override
    public void atacar() {
        System.out.println("Atacou fraco.");
    }
    
}
