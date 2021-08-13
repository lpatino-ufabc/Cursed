package br.poo.cursed.implementaespecial;

public class golpeMitico implements Golpe{
    
    @Override
    public double gSimples(double nivel, double nivelAlma,
            String tipoArma, String tipoDivindade){
        double base = 5, mod = 3;
        if(tipoArma.equals("Machado de Guerra")){
            base = nivel+base+nivelAlma;
        }
        else{
            base = base;
        }
        
        if(tipoDivindade.equals("Athena")){
            mod = 3;
        }
        if(tipoDivindade.equals("Zeus")){
            mod = 4;
        }
        if(tipoDivindade.equals("Ares")){
            mod = 5;
        }
                
        double dano = nivel*base*mod;                
        return dano;
    }
    
    public double gRapido(double nivel, double nivelAlma,
            String tipoArma, String tipoDivindade){
        double base = 5, mod = 3;
        if(tipoArma.equals("Machado de Guerra")){
            base = nivel+base+nivelAlma;
        }
        else{
            base = base;
        }
        
        if(tipoDivindade.equals("Athena")){
            mod = 3;
        }
        if(tipoDivindade.equals("Zeus")){
            mod = 4;
        }
        if(tipoDivindade.equals("Ares")){
            mod = 5;
        }
                
        double dano = nivel*base*mod*0.75;                
        return dano;
    }
    
    public double gForte(double nivel, double nivelAlma,
            String tipoArma, String tipoDivindade){
        double base = 5, mod = 3;
        if(tipoArma.equals("Machado de Guerra")){
            base = nivel+base+nivelAlma;
        }
        else{
            base = base;
        }
        
        if(tipoDivindade.equals("Athena")){
            mod = 3;
        }
        if(tipoDivindade.equals("Zeus")){
            mod = 4;
        }
        if(tipoDivindade.equals("Ares")){
            mod = 5;
        }
                
        double dano = nivel*base*mod*1.5;                
        return dano;
    }
    
    public double gCarregado(double nivel, double nivelAlma,
            String tipoArma, String tipoDivindade){
        double base = 5, mod = 3;
        if(tipoArma.equals("Machado de Guerra")){
            base = nivel+base+nivelAlma;
        }
        else{
            base = base;
        }
        
        if(tipoDivindade.equals("Athena")){
            mod = 3;
        }
        if(tipoDivindade.equals("Zeus")){
            mod = 4;
        }
        if(tipoDivindade.equals("Ares")){
            mod = 5;
        }
                
        double dano = nivel*base*mod*2;                
        return dano;
    }
    
    public double gCounter(double nivel, double nivelArmadura,
            String tipoArma, String tipoDivindade){
        double base = 5, mod = 3;
        if(tipoArma.equals("Machado de Guerra")){
            base = nivel+base+nivel;
        }
        else{
            base = base;
        }
        
        if(tipoDivindade.equals("Athena")){
            mod = 3;
        }
        if(tipoDivindade.equals("Zeus")){
            mod = 4;
        }
        if(tipoDivindade.equals("Ares")){
            mod = 5;
        }
                
        double dano = nivel*base*mod*nivelArmadura;                
        return dano;
    }
    
}
