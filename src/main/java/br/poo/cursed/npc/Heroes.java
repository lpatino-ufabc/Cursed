package br.poo.cursed.npc;

import br.poo.cursed.mob.Inimigo;

public abstract class Heroes {
    protected double nivel;
    protected String nome;    
    protected double forca;
    protected double agilidade;
    protected double intelecto;
    protected double vida;
    protected double fe;
    protected String tipoArmadura;
    protected double nivelArmadura;
    protected String tipoArma;
    protected double XP;
    protected double lvlXP;

    public Heroes(double nivel, String nome, double forca, double agilidade,
            double intelecto, double vida, double fe, String tipoArmadura, 
            double nivelArmadura, String tipoArma, double XP, double lvlXP) {
        this.nivel = nivel;
        this.nome = nome;
        this.forca = forca;
        this.agilidade = agilidade;
        this.intelecto = intelecto;
        this.vida = vida;
        this.fe = fe;
        this.tipoArmadura = tipoArmadura;
        this.nivelArmadura = nivelArmadura;
        this.tipoArma = tipoArma;
        this.XP = nivel*XP;
        this.lvlXP = lvlXP;
    }
    public abstract double getNivel();
    
    public abstract String getNome();
    
    public abstract double getVida(); 
    
    public abstract void setVida(double vida); 
    
    public abstract String getTipoArmadura();
    
    public abstract double getNivelArmadura();
    
    public abstract String getArma();
    
    public abstract void tomarDano(Inimigo inimigo, String opcao);
    
}
