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
public abstract class Humans {
    protected double nivel;
    protected String nome;
    protected double vida;
    protected String tipoArmadura;
    protected double nivelArmadura;
    protected String tipoArma;

    public Humans(double nivel, String nome, double vida, String tipoArmadura,
            double nivelArmadura, String tipoArma) {
        this.nivel = nivel;
        this.nome = nome;
        this.vida = vida;
        this.tipoArmadura = tipoArmadura;
        this.nivelArmadura = nivelArmadura;
        this.tipoArma = tipoArma;
    }
    public abstract double getNivel();
    
    public abstract String getNome();
    
    public abstract double getVida();   
    
    public abstract String getTipoArmadura();
    
    public abstract double getNivelArmadura();
    
    public abstract String getArma();
}