package br.poo.cursed.mob;

import br.poo.cursed.npc.*;

public class Wyrm extends Inimigo implements Ataque, Especial, Curar{
    public Wyrm(double nivel, String nome, double vida, String tipoArmadura,
            double nivelArmadura, String hierarquia, double nivelAlma, 
            String tipoDivindade, String tipoArma, double XP) {
        super(nivel, nome, vida, tipoArmadura, nivelArmadura, hierarquia,
              nivelAlma, tipoDivindade, tipoArma, XP);
    }
    
    @Override
    public double getNivel(){
        return this.nivel;
    }
    
    @Override
    public String getHierarquia(){
        return this.hierarquia;
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
    public void setVida(double vida){
        this.vida = vida;
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
    public double getAlma(){
        return this.nivelAlma;
    }
    
    @Override
    public String getDivindade(){
        return this.tipoDivindade;
    }
    
    @Override
    public String getArma(){
        return this.tipoArma;
    }
    
    @Override
    public double getXP(){
        return this.XP;
    }
    
    @Override
    public double ataqueSimples(){
        double dano = nivel*nivelAlma;                
        return dano;
    }
    
    @Override
    public double ataqueRapido(){
        double dano = nivel*nivelAlma*0.55;
        return dano;
    }
    
    @Override
    public double ataqueForte(){
        double dano = nivel*nivelAlma*1.15;
        return dano;
    }
    
    @Override
    public double ataqueCarregado(){
        double dano = nivel*nivelAlma*1.55;
        return dano;
    }
    
    @Override
    public double ataqueCounter(){
        double dano = nivel*nivelArmadura*1.55;
        return dano;
    }
    
    @Override
    public double ataqueVampirico(){
        double dano = 0;
        return dano;
    }
    
    @Override
    public double ataqueVenenoso(){
        double dano = 0;
        return dano;
    }
    
    @Override
    public double ataqueFogo(){
        double dano = nivel*nivelAlma*7;
        return dano;
    }
    
    @Override
    public double ataqueVoador(){
        double dano = nivel*nivelArmadura*3;
        return dano;
    }
    
    @Override
    public double ataqueExplosivo(){
        double dano = nivel*nivelAlma*8;
        return dano;
    }
    
    @Override
    public double ataqueMaldicao(){
        double dano = 0;
        return dano;
    }
    
    @Override
    public double ataqueSobrenatural(){
        double dano = 0;
        return dano;
    }
    
    @Override
    public void curativo(){
        this.vida += 0.1*this.vida;
    }
    
    @Override
    public void rejuvenescer(){
        this.vida += 0.25*this.vida;
    }
    
    @Override    
    public void soproVida(){
        this.vida += 0.45*this.vida;
    }
    
    public void rajadaVida(){
        this.vida += this.vida;
    }
    
    @Override
    public void tomarDano(Heroes heroi, String opcao){
        double dano = 0;
        if(heroi instanceof Ranger){
            Ranger legolas = (Ranger) heroi;
            if (opcao.equals("Ataque Simples")) {
                dano = legolas.ataqueSimples();
            }
            if (opcao.equals("Ataque Rapido")) {
                dano = legolas.ataqueRapido();
            }
            if (opcao.equals("Ataque Forte")) {
                dano = legolas.ataqueForte();
            }
            if (opcao.equals("Ataque Carregado")) {
                dano = legolas.ataqueCarregado();
            }
            if (opcao.equals("Ataque Counter")) {
                dano = legolas.ataqueCounter();
            }
        }
        if(heroi instanceof Mage){
            Mage gandalf = (Mage) heroi;
            if (opcao.equals("Ataque Simples")) {
                dano = gandalf.ataqueSimples();
            }
            if (opcao.equals("Ataque Rapido")) {
                dano = gandalf.ataqueRapido();
            }
            if (opcao.equals("Ataque Forte")) {
                dano = gandalf.ataqueForte();
            }
            if (opcao.equals("Ataque Carregado")) {
                dano = gandalf.ataqueCarregado();
            }
            if (opcao.equals("Ataque Counter")) {
                dano = gandalf.ataqueCounter();
            }
        }
        if(heroi instanceof Priest){
            Priest sunguy = (Priest) heroi;
            if (opcao.equals("Ataque Simples")) {
                dano = sunguy.ataqueSimples();
            }
            if (opcao.equals("Ataque Rapido")) {
                dano = sunguy.ataqueRapido();
            }
            if (opcao.equals("Ataque Forte")) {
                dano = sunguy.ataqueForte();
            }
            if (opcao.equals("Ataque Carregado")) {
                dano = sunguy.ataqueCarregado();
            }
            if (opcao.equals("Ataque Counter")) {
                dano = sunguy.ataqueCounter();
            }
        }
        if(heroi instanceof Warrior){
            Warrior ravel = (Warrior) heroi;
            if (opcao.equals("Ataque Simples")) {
                dano = ravel.ataqueSimples();
            }
            if (opcao.equals("Ataque Rapido")) {
                dano = ravel.ataqueRapido();
            }
            if (opcao.equals("Ataque Forte")) {
                dano = ravel.ataqueForte();
            }
            if (opcao.equals("Ataque Carregado")) {
                dano = ravel.ataqueCarregado();
            }
            if (opcao.equals("Ataque Counter")) {
                dano = ravel.ataqueCounter();
            }
        }
    }   
}
