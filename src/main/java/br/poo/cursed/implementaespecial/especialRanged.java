package br.poo.cursed.implementaespecial;

public class especialRanged implements Especial{
    @Override
    public double especialMagico(double agilidade, double intelecto){
        double dano = agilidade*intelecto;
        return dano;
    }
    
    @Override
    public double especialUltimate(double agilidade, double intelecto){
        double dano = 5*agilidade*intelecto;
        return dano;
    }
    
}