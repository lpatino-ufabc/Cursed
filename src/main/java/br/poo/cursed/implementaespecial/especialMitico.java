package br.poo.cursed.implementaespecial;

public class especialMitico implements Especial{
    @Override
    public double especialMagico(double alma, double nivelArmadura){
        double dano = alma+nivelArmadura;
        return dano;
    }
    
    @Override
    public double especialUltimate(double alma, double nivelArmadura){
        double dano = 5*alma+nivelArmadura;
        return dano;
    }
    
}
