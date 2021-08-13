package br.poo.cursed.implementaespecial;

public class curaNPC implements Cura{
    
    @Override
    public double curativo(double vida){
        vida = 1.3*vida;
        return vida;
    }
    
    @Override    
    public double soproVida(double vida){
        vida = 1.5*vida;
        return vida;
    }
    
}
