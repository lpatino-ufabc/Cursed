package br.poo.cursed.implementaespecial;

public class especialMeele implements Especial{
    @Override
    public double especialMagico(double forca, double vida){
        double dano = forca+vida;
        return dano;
    }
    
    @Override
    public double especialUltimate(double forca, double vida){
        double dano = forca+2*vida;
        return dano;
    }
    
}