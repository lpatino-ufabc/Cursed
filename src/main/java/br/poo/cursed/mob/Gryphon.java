package br.poo.cursed.mob;

import br.poo.cursed.npc.Heroes;

public class Gryphon extends Inimigo implements Ataque, Especial, Curar{
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
    public void ataqueSimples(Heroes heroi){
        ;
    }
    
    @Override
    public void ataqueRapido(Heroes heroi){
        //
    }
    
    @Override
    public void ataqueForte(Heroes heroi){
        //
    }
    
    @Override
    public void ataqueCarregado(Heroes heroi){
        //
    }
    
    @Override
    public void ataqueCounter(Heroes heroi){
        //
    }
    
    @Override
    public void ataqueVampirico(Heroes heroi){
        //
    }
    
    @Override
    public void ataqueVenenoso(Heroes heroi){
        //
    }
    
    @Override
    public void ataqueFogo(Heroes heroi){
        //
    }
    
    @Override
    public void ataqueVoador(Heroes heroi){
        //
    }
    
    @Override
    public void ataqueExplosivo(Heroes heroi){
        //
    }
    
    @Override
    public void ataqueMaldicao(Heroes heroi){
        //
    }
    
    @Override
    public void ataqueSobrenatural(Heroes heroi){
        //
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
     //   
    }
}