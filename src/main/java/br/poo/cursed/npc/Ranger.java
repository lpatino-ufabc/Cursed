/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.poo.cursed.npc;

/**
 *
 * @author lpatinocardoso
 */
public class Ranger extends Heroes implements Ataque, Especial{
    public Ranger(double nivel, String nome, double vida, String tipoArmadura, 
            double nivelArmadura, String tipoArma) {
        super(nivel, nome, vida, tipoArmadura, nivelArmadura, tipoArma);
    }
    
    @Override
    public double getNivel(){
        return this.nivel;
    }
    
    @Override
    public String getNome(){
        return this.nome;
    }
    
    @Override
    public double getVida(){
        return this.vida;
    }   
    
    @Override
    public String getTipoArmadura(){
        return this.tipoArmadura;
    }
    
    @Override
    public double getNivelArmadura(){
        return this.nivelArmadura;
    }
    
    @Override
    public String getArma(){
        return this.tipoArma;
    }
    
    @Override
    public void ataqueSimples(){
        //
    }
    
    @Override
    public void ataqueRapido(){
        //
    }
    
    @Override
    public void ataqueForte(){
        //
    }
    
    @Override
    public void ataqueCarregado(){
        //
    }
    
    @Override
    public void ataqueCounter(){
        //
    }
    
    @Override
    public void ataqueVampirico(){
        //
    }
    
    @Override
    public void ataqueVenenoso(){
        //
    }
    
    @Override
    public void ataqueFogo(){
        //
    }
    
    @Override
    public void ataqueVoador(){
        //
    }
    
    @Override
    public void ataqueExplosivo(){
        //
    }
    
    @Override
    public void ataqueMaldicao(){
        //
    }
    
    @Override
    public void ataqueSobrenatural(){
        //
    }
}
