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
public abstract class Dragons {
    protected double nivel;
    protected String hierarquia;
    protected String nome;
    protected double vida;
    protected String tipoArmadura;
    protected double nivelArmadura;
    protected double nivelAlma;

    public Dragons(double nivel, String hierarquia, String nome, double vida,
            String tipoArmadura, double nivelArmadura, double nivelAlma) {
        this.nivel = nivel;
        this.hierarquia = hierarquia;
        this.nome = nome;
        this.vida = vida;
        this.tipoArmadura = tipoArmadura;
        this.nivelArmadura = nivelArmadura;
        this.nivelAlma = nivelAlma;
    }
    public abstract double getNivel();
    
    public abstract String getHierarquia();
    
    public abstract String getNome();
    
    public abstract double getVida();   
    
    public abstract String getTipoArmadura();
    
    public abstract double getNivelArmadura();
    
    public abstract double getAlma();
}
