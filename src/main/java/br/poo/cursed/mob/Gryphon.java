package br.poo.cursed.mob;

import br.poo.cursed.npc.*;

public class Gryphon extends Inimigo implements Ataque, EspecialMitico, Curar{
    
    public Gryphon(double nivel, String nome, double vida, String tipoArmadura,
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
        double base = 0, mod = 0;
        String tp_arma = this.tipoArma;
        if(tp_arma.equals("Garra de Prata")){
            base = 5;
        }
        else{
            base = 3;
        }
        
        String div = this.tipoDivindade;
        if(div.equals("Athena")){
            mod = 3;
        }
        if(div.equals("Zeus")){
            mod = 4;
        }
        if(div.equals("Ares")){
            mod = 5;
        }
                
        double dano = nivel*base*mod;                
        return dano;
    }
    
    @Override
    public double ataqueRapido(){
        double base = 0, mod = 0;
        String tp_arma = this.tipoArma;
        if(tp_arma.equals("Garra de Prata")){
            base = 5;
        }
        else{
            base = 3;
        }
        
        String div = this.tipoDivindade;
        if(div.equals("Athena")){
            mod = 3;
        }
        if(div.equals("Zeus")){
            mod = 4;
        }
        if(div.equals("Ares")){
            mod = 5;
        }
                
        double dano = nivel*base*mod*0.75;                
        return dano;
    }
    
    @Override
    public double ataqueForte(){
        double base = 0, mod = 0;
        String tp_arma = this.tipoArma;
        if(tp_arma.equals("Garra de Prata")){
            base = 5;
        }
        else{
            base = 3;
        }
        
        String div = this.tipoDivindade;
        if(div.equals("Athena")){
            mod = 3;
        }
        if(div.equals("Zeus")){
            mod = 4;
        }
        if(div.equals("Ares")){
            mod = 5;
        }
                
        double dano = nivel*base*mod*1.5;                
        return dano;
    }
    
    @Override
    public double ataqueCarregado(){
        double base = 0, mod = 0;
        String tp_arma = this.tipoArma;
        if(tp_arma.equals("Garra de Prata")){
            base = 5;
        }
        else{
            base = 3;
        }
        
        String div = this.tipoDivindade;
        if(div.equals("Athena")){
            mod = 3;
        }
        if(div.equals("Zeus")){
            mod = 4;
        }
        if(div.equals("Ares")){
            mod = 5;
        }
                
        double dano = nivel*base*mod*2;                
        return dano;
    }
    
    @Override
    public double ataqueCounter(){
        double base = 0, mod = 0;
        String tp_arma = this.tipoArma;
        if(tp_arma.equals("Garra de Prata")){
            base = 5;
        }
        else{
            base = 3;
        }
        
        String div = this.tipoDivindade;
        if(div.equals("Athena")){
            mod = 3;
        }
        if(div.equals("Zeus")){
            mod = 4;
        }
        if(div.equals("Ares")){
            mod = 5;
        }
                
        double dano = nivel*base*mod*nivelArmadura;                
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
        this.vida += 0.3*this.vida;
    }
    
    @Override    
    public void soproVida(){
        this.vida += 0.5*this.vida;
    }
    
    public void rajadaVida(){
        this.vida += this.vida;
    }
    
    @Override
    public void tomarDano(Heroes heroi, String opcao){
        double dano = 0;
        if(heroi instanceof Ranger){
            Ranger legolas = (Ranger) heroi;
            if (opcao.equals("1")) {
                dano = legolas.ataqueSimples();
            }
            if (opcao.equals("2")) {
                dano = legolas.ataqueRapido();
            }
            if (opcao.equals("3")) {
                dano = legolas.ataqueForte();
            }
            if (opcao.equals("4")) {
                dano = legolas.ataqueCarregado();
            }
            if (opcao.equals("5")) {
                dano = legolas.ataqueCounter();
            }
        }
        if(heroi instanceof Mage){
            Mage gandalf = (Mage) heroi;
            if (opcao.equals("1")) {
                dano = gandalf.ataqueSimples();
            }
            if (opcao.equals("2")) {
                dano = gandalf.ataqueRapido();
            }
            if (opcao.equals("3")) {
                dano = gandalf.ataqueForte();
            }
            if (opcao.equals("4")) {
                dano = gandalf.ataqueCarregado();
            }
            if (opcao.equals("5")) {
                dano = gandalf.ataqueCounter();
            }
        }
        if(heroi instanceof Priest){
            Priest sunguy = (Priest) heroi;
            if (opcao.equals("1")) {
                dano = sunguy.ataqueSimples();
            }
            if (opcao.equals("2")) {
                dano = sunguy.ataqueRapido();
            }
            if (opcao.equals("3")) {
                dano = sunguy.ataqueForte();
            }
            if (opcao.equals("4")) {
                dano = sunguy.ataqueCarregado();
            }
            if (opcao.equals("5")) {
                dano = sunguy.ataqueCounter();
            }
        }
        if(heroi instanceof Warrior){
            Warrior ravel = (Warrior) heroi;
            if (opcao.equals("1")) {
                dano = ravel.ataqueSimples();
            }
            if (opcao.equals("2")) {
                dano = ravel.ataqueRapido();
            }
            if (opcao.equals("3")) {
                dano = ravel.ataqueForte();
            }
            if (opcao.equals("4")) {
                dano = ravel.ataqueCarregado();
            }
            if (opcao.equals("5")) {
                dano = ravel.ataqueCounter();
            }
        }
        if (this.vida > dano) {
            this.vida = this.vida - dano;
        } 
        if (this.vida <= dano){
            this.vida = 0;
        }
    }
}