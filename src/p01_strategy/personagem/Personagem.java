/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p01_strategy.personagem;

import p01_strategy.ataque.Ataque;
import p01_strategy.corrida.Corrida;
import p01_strategy.pulo.Pulo;

/**
 *
 * @author a11421BSI210
 */
public abstract class Personagem {

    Pulo pulo;
    
    Ataque ataque;
    
    Corrida corrida;
    
    String nome;
    
    public void pular(){
        this.pulo.pular();
    }
    
    public void atacar(){
        this.ataque.atacar();
    }
    
    public void correr(){
        this.corrida.correr();
    }
    
    public void setPulo(Pulo pulo){
        this.pulo = pulo;
    }
    
    public void setAtaque(Ataque ataque){
        this.ataque = ataque;
    }
    
    public void setCorrida(Corrida corrida){
        this.corrida = corrida;
    }
    
    
}
