/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p01_strategy.personagem;

import p01_strategy.ataque.AtaqueForte;
import p01_strategy.corrida.CorridaDevagar;
import p01_strategy.pulo.PuloAlto;

/**
 *
 * @author a11421BSI210
 */
public class Monstro extends Personagem{

    public Monstro() {
        super();
        this.pulo = new PuloAlto();
        this.ataque = new AtaqueForte();
        this.corrida = new CorridaDevagar();
    }
    
    
    
}
