/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p01_strategy;

import p01_strategy.personagem.Menina;
import p01_strategy.personagem.Menino;
import p01_strategy.personagem.Monstro;
import p01_strategy.personagem.Personagem;

/**
 *
 * @author a11421BSI210
 */
public class P01_Strategy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Personagem ana = new Menina();
        ana.pular();
        
        Personagem jao = new Menino();
        jao.pular();
        
        Personagem axe = new Monstro();
        axe.pular();
    }
    
}
