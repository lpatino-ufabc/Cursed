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
public abstract class Mythic {
    protected double nivel;
    protected String nome;
    protected double vida;
    protected String tipoArmadura;
    protected double nivelArmadura;
    protected String tipoDivindade;
    protected String tipoArma;

    public Mythic(double nivel, String nome, double vida, String tipoArmadura,
            double nivelArmadura, String tipoDivindade, String tipoArma) {
        this.nivel = nivel;
        this.nome = nome;
        this.vida = vida;
        this.tipoArmadura = tipoArmadura;
        this.nivelArmadura = nivelArmadura;
        this.tipoDivindade = tipoDivindade;        
        this.tipoArma = tipoArma;
    }
    public abstract double getNivel();
    
    public abstract String getNome();
    
    public abstract double getVida();   
    
    public abstract String getTipoArmadura();
    
    public abstract double getNivelArmadura();
    
    public abstract String getDivindade();
    
    public abstract String getArma();
}
