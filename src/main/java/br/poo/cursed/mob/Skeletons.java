package br.poo.cursed.mob;

import br.poo.cursed.npc.*;

public class Skeletons extends Inimigo implements Ataque, Especial, Curar{
    public Skeletons(double nivel, String nome, double vida, String tipoArmadura,
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
        if(tp_arma.equals("Espada Longa")){
            base = 5;
        }
        else{
            base = 3;
        }
        
        String hie = this.hierarquia;
        if(hie.equals("Carniceiro")){
            mod = 3;
        }
        if(hie.equals("Caçador")){
            mod = 4;
        }
        if(hie.equals("Elevado")){
            mod = 5;
        }
                
        double dano = nivel*base*mod;                
        return dano;
    }
    
    @Override
    public double ataqueRapido(){
        double base = 0, mod = 0;
        String tp_arma = this.tipoArma;
        if(tp_arma.equals("Espada Longa")){
            base = 5;
        }
        else{
            base = 3;
        }
        
        String hie = this.hierarquia;
        if(hie.equals("Carniceiro")){
            mod = 3;
        }
        if(hie.equals("Caçador")){
            mod = 4;
        }
        if(hie.equals("Elevado")){
            mod = 5;
        }
                
        double dano = nivel*base*mod*075;                
        return dano;
    }
    
    @Override
    public double ataqueForte(){
        double base = 0, mod = 0;
        String tp_arma = this.tipoArma;
        if(tp_arma.equals("Espada Longa")){
            base = 5;
        }
        else{
            base = 3;
        }
        
        String hie = this.hierarquia;
        if(hie.equals("Carniceiro")){
            mod = 3;
        }
        if(hie.equals("Caçador")){
            mod = 4;
        }
        if(hie.equals("Elevado")){
            mod = 5;
        }
                
        double dano = nivel*base*mod*1.5;                
        return dano;
    }
    
    @Override
    public double ataqueCarregado(){
        double base = 0, mod = 0;
        String tp_arma = this.tipoArma;
        if(tp_arma.equals("Espada Longa")){
            base = 5;
        }
        else{
            base = 3;
        }
        
        String hie = this.hierarquia;
        if(hie.equals("Carniceiro")){
            mod = 3;
        }
        if(hie.equals("Caçador")){
            mod = 4;
        }
        if(hie.equals("Elevado")){
            mod = 5;
        }
                
        double dano = nivel*base*mod*2;                
        return dano;
    }
    
    @Override
    public double ataqueCounter(){
        double base = 0, mod = 0;
        String tp_arma = this.tipoArma;
        if(tp_arma.equals("Espada Longa")){
            base = 5;
        }
        else{
            base = 3;
        }
        
        String hie = this.hierarquia;
        if(hie.equals("Carniceiro")){
            mod = 3;
        }
        if(hie.equals("Caçador")){
            mod = 4;
        }
        if(hie.equals("Elevado")){
            mod = 5;
        }
                
        double dano = nivel*base*mod*nivelArmadura;                
        return dano;
    }
    
    @Override
    public double ataqueVampirico(){
        double base = 0, mod = 0;
        String tp_arma = this.tipoArma;
        if(tp_arma.equals("Espada Longa")){
            base = 5;
        }
        else{
            base = 3;
        }
        
        String hie = this.hierarquia;
        if(hie.equals("Carniceiro")){
            mod = 3;
        }
        if(hie.equals("Caçador")){
            mod = 4;
        }
        if(hie.equals("Elevado")){
            mod = 5;
        }
        
        this.curativo();
        double dano = nivel*base*mod*nivelArmadura;        
        return dano;
    }
    
    @Override
    public double ataqueVenenoso(){
        double base = 0, mod = 0;
        String tp_arma = this.tipoArma;
        if(tp_arma.equals("Espada Longa")){
            base = 5;
        }
        else{
            base = 3;
        }
        
        String hie = this.hierarquia;
        if(hie.equals("Carniceiro")){
            mod = 3;
        }
        if(hie.equals("Caçador")){
            mod = 4;
        }
        if(hie.equals("Elevado")){
            mod = 5;
        }
                
        double dano = nivel*base*mod*nivelArmadura*2;                
        return dano;
    }
    
    @Override
    public double ataqueFogo(){
        double dano = 0;
        return dano;
    }
    
    @Override
    public double ataqueVoador(){
        double dano = 0;
        return dano;
    }
    
    @Override
    public double ataqueExplosivo(){
        double dano = 0;
        return dano;
    }
    
    @Override
    public double ataqueMaldicao(){
        double base = 0, mod = 0;
        String tp_arma = this.tipoArma;
        if(tp_arma.equals("Espada Longa")){
            base = 5;
        }
        else{
            base = 3;
        }
        
        String hie = this.hierarquia;
        if(hie.equals("Carniceiro")){
            mod = 3;
        }
        if(hie.equals("Caçador")){
            mod = 4;
        }
        if(hie.equals("Elevado")){
            mod = 5;
        }
                
        double dano = nivel*base*mod*nivelArmadura*3;                
        return dano;
    }
    
    @Override
    public double ataqueSobrenatural(){
        double base = 0, mod = 0;
        String tp_arma = this.tipoArma;
        if(tp_arma.equals("Espada Longa")){
            base = 5;
        }
        else{
            base = 3;
        }
        
        String hie = this.hierarquia;
        if(hie.equals("Carniceiro")){
            mod = 3;
        }
        if(hie.equals("Caçador")){
            mod = 4;
        }
        if(hie.equals("Elevado")){
            mod = 5;
        }
                
        double dano = nivel*base*mod*nivelArmadura*10;                
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
    
    @Override
    public void rajadaVida(){
        this.vida += this.vida;
    }
    
    @Override
    public void tomarDano(Heroes heroi){
        if (heroi.getArma().equals("Arco")) {
            this.vida = this.vida - (60 - this.nivelArmadura);
            if (this.vida < 0) {
                this.vida = 0;
            }
        }
        if (heroi.getArma().equals("Cajado")) {
            this.vida = this.vida - (36 - this.nivelArmadura);
            if (this.vida < 0) {
                this.vida = 0;
            }
        }
        if (heroi.getArma().equals("Massa de Guerra")) {
            this.vida = this.vida - (70 - this.nivelArmadura);
            if (this.vida < 0) {
                this.vida = 0;
            }
        }
        if (heroi.getArma().equals("Machado de Guerra")) {
            this.vida = this.vida - (72 - this.nivelArmadura);
            if (this.vida < 0) {
                this.vida = 0;
            }
        }
    }
    
    @Override
    public void tomarDanoEspecial(Heroes heroi){
        if (heroi instanceof Mage) {
            Mage mago = (Mage) heroi;
            double dano = mago.ataqueCarregado();
            this.vida = this.vida - (60 - this.nivelArmadura);
            if (this.vida < 0) {
                this.vida = 0;
            }
        }
        if (heroi.getArma().equals("Cajado")) {
            this.vida = this.vida - (36 - this.nivelArmadura);
            if (this.vida < 0) {
                this.vida = 0;
            }
        }
        if (heroi.getArma().equals("Massa de Guerra")) {
            this.vida = this.vida - (70 - this.nivelArmadura);
            if (this.vida < 0) {
                this.vida = 0;
            }
        }
        if (heroi.getArma().equals("Machado de Guerra")) {
            this.vida = this.vida - (72 - this.nivelArmadura);
            if (this.vida < 0) {
                this.vida = 0;
            }
        }
    }
}