/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p01_strategy.personagem;

import p01_strategy.ataque.AtaqueMedio;
import p01_strategy.corrida.CorridaMedia;
import p01_strategy.pulo.PuloMedio;

/**
 *
 * @author a11421BSI210
 */
public class Menino extends Personagem {

    public Menino() {
        super();
        this.pulo = new PuloMedio();
        this.ataque = new AtaqueMedio();
        this.corrida = new CorridaMedia();
    }
    
    
    
}
