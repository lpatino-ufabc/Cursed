/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.poo.cursed.mob;

/**
 *
 * @author lpatinocardoso
 */
public abstract class Undeads {
    protected double nivel;
    protected String nome;
    protected double vida;
    protected String tipoArma;

    public Undeads(double nivel, String nome, double vida, String tipoArma) {
        this.nivel = nivel;
        this.nome = nome;
        this.vida = vida;
        this.tipoArma = tipoArma;
    }
    public abstract double getNivel();
    
    public abstract String getNome();
    
    public abstract double getVida();   
    
    public abstract String getArma();
}
