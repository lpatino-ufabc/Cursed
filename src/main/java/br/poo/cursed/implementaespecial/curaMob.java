package br.poo.cursed.implementaespecial;

public class curaMob implements Cura{
    
    @Override
    public double curativo(double vida){
        vida = vida + 0.1*vida;
        return vida;
    }
    
    @Override    
    public double soproVida(double vida){
        vida = vida + 0.5*vida;
        return vida;
    }
    
}
