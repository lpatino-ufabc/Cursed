package br.poo.cursed.mob;

import br.poo.cursed.implementaespecial.Cura;
import br.poo.cursed.implementaespecial.Especial;
import br.poo.cursed.implementaespecial.Golpe;
import br.poo.cursed.npc.*;

public class Minotaur extends Inimigo{
    
    private Especial especial;
    private Cura cura;
    private Golpe golpe;
    
    public Minotaur(double nivel, String nome, double vida, String tipoArmadura,
            double nivelArmadura, String hierarquia, double nivelAlma, 
            String tipoDivindade, String tipoArma, double XP, Especial especial,
            Cura cura, Golpe golpe) {
        super(nivel, nome, vida, tipoArmadura, nivelArmadura, hierarquia,
              nivelAlma, tipoDivindade, tipoArma, XP);
        this.especial = especial;
        this.cura = cura;
        this.golpe = golpe;
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
    
    public double ataqueSimples(){
        return golpe.gSimples(nivel, nivelAlma, tipoArma, tipoDivindade);
    }
    
    public double ataqueRapido(){
        return golpe.gRapido(nivel, nivelAlma, tipoArma, tipoDivindade);
    }
    
    public double ataqueForte(){
        return golpe.gForte(nivel, nivelAlma, tipoArma, tipoDivindade);
    }
    
    public double ataqueCarregado(){
        return golpe.gCarregado(nivel, nivelAlma, tipoArma, tipoDivindade);
    }
    
    public double ataqueCounter(){
        return golpe.gCounter(nivel, nivelArmadura, tipoArma, tipoDivindade);
    }
    
    public double especialLeve(double alma, double armadura){
        return especial.especialMagico(alma, armadura);
    }
    
    public double especialPesado(double alma, double armadura){
        return especial.especialUltimate(alma, armadura);
    }
    
    public double revigorar(double vida){
        return cura.curativo(vida);
    }
    
    
    public double rejuvenescer(double vida){
        return cura.soproVida(vida);
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
        else{
            this.vida = 0;
        }
    }
}