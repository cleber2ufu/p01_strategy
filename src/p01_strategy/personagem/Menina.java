/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p01_strategy.personagem;

import p01_strategy.ataque.AtaqueFraco;
import p01_strategy.corrida.CorridaRapida;
import p01_strategy.pulo.PuloBaixo;

/**
 *
 * @author a11421BSI210
 */
public class Menina extends Personagem{

    public Menina(){
        super();
        this.pulo = new PuloBaixo();
        this.ataque = new AtaqueFraco();
        this.corrida = new CorridaRapida();                
               
    }
    
    
}
