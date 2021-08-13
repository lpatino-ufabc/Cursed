package br.poo.cursed.implementaespecial;

public class especialUndead implements Especial{
    @Override
    public double especialMagico(double alma, double vida){
        double dano = alma+vida;
        return dano;
    }
    
    @Override
    public double especialUltimate(double alma, double vida){
        double dano = 5*alma+vida;
        return dano;
    }
    
}