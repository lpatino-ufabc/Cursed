package br.poo.cursed.mob;

import br.poo.cursed.npc.Heroes;

public abstract class Inimigo {
    protected double nivel;
    protected String nome;
    protected double vida;
    protected String tipoArmadura;
    protected double nivelArmadura;
    protected String hierarquia;
    protected double nivelAlma;
    protected String tipoDivindade;
    protected String tipoArma;
    protected double XP;
    
    public Inimigo(double nivel, String nome, double vida, String tipoArmadura,
            double nivelArmadura, String hierarquia, double nivelAlma, 
            String tipoDivindade, String tipoArma, double XP) {
        this.nivel = nivel;
        this.nome = nome;        
        this.tipoArmadura = tipoArmadura;        
        this.hierarquia = hierarquia;
        this.nivelAlma = nivelAlma;
        this.tipoDivindade = tipoDivindade;
        this.tipoArma = tipoArma;
        this.nivelArmadura = nivelArmadura*nivel*nivelAlma;
        this.vida = vida*nivel*nivelAlma;
        this.XP = XP*nivel;
    }
    
    public abstract double getNivel();
    
    public abstract String getNome();
    
    public abstract double getVida();   
    
    public abstract void setVida(double vida);   
    
    public abstract String getArma();
    
    public abstract String getTipoArmadura();
    
    public abstract double getNivelArmadura();
    
    public abstract String getDivindade();
    
    public abstract String getHierarquia();
    
    public abstract double getAlma();
    
    public abstract double getXP();
    
    public abstract void tomarDano(Heroes heroi);
    
    public abstract void tomarDanoEspecial(Heroes heroi);

}
