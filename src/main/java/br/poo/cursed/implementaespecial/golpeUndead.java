package br.poo.cursed.implementaespecial;

public class golpeUndead implements Golpe{
    
    @Override
    public double gSimples(double nivel, double nivelAlma,
            String tipoArma, String hierarquia){
        double base = 3, mod = 3;
        
        if(tipoArma.equals("Espada Longa")){
            base = base+nivel+nivelAlma;
        }
        else{
            base = 3;
        }
        
        if(hierarquia.equals("Carniceiro")){
            mod = 3;
        }
        if(hierarquia.equals("Caçador")){
            mod = 4;
        }
        if(hierarquia.equals("Elevado")){
            mod = 5;
        }
                
        double dano = nivel*base*mod;                
        return dano;
    }
    
    @Override
    public double gRapido(double nivel, double nivelAlma,
            String tipoArma, String hierarquia){
        double base = 3, mod = 3;
        
        if(tipoArma.equals("Espada Longa")){
            base = base+nivel+nivelAlma;
        }
        else{
            base = 3;
        }
        
        if(hierarquia.equals("Carniceiro")){
            mod = 3;
        }
        if(hierarquia.equals("Caçador")){
            mod = 4;
        }
        if(hierarquia.equals("Elevado")){
            mod = 5;
        }
                
        double dano = nivel*base*mod*0.75;                
        return dano;
    }
    
    @Override
    public double gForte(double nivel, double nivelAlma,
            String tipoArma, String hierarquia){
        double base = 3, mod = 3;
        
        if(tipoArma.equals("Espada Longa")){
            base = base+nivel+nivelAlma;
        }
        else{
            base = 3;
        }
        
        if(hierarquia.equals("Carniceiro")){
            mod = 3;
        }
        if(hierarquia.equals("Caçador")){
            mod = 4;
        }
        if(hierarquia.equals("Elevado")){
            mod = 5;
        }
                
        double dano = nivel*base*mod*1.5;                
        return dano;
    }
    
    @Override
    public double gCarregado(double nivel, double nivelAlma,
            String tipoArma, String hierarquia){
        double base = 3, mod = 3;
        
        if(tipoArma.equals("Espada Longa")){
            base = base+nivel+nivelAlma;
        }
        else{
            base = 3;
        }
        
        if(hierarquia.equals("Carniceiro")){
            mod = 3;
        }
        if(hierarquia.equals("Caçador")){
            mod = 4;
        }
        if(hierarquia.equals("Elevado")){
            mod = 5;
        }
                
        double dano = nivel*base*mod*2;                
        return dano;
    }
    
    @Override
    public double gCounter(double nivel, double nivelArmadura,
            String tipoArma, String hierarquia){
        
        double base = 3, mod = 3;
        
        if(tipoArma.equals("Espada Longa")){
            base = base+nivel+nivel;
        }
        else{
            base = 3;
        }
        
        if(hierarquia.equals("Carniceiro")){
            mod = 3;
        }
        if(hierarquia.equals("Caçador")){
            mod = 4;
        }
        if(hierarquia.equals("Elevado")){
            mod = 5;
        }
                
        double dano = nivel*base*mod*nivelArmadura;                
        return dano;
    }
    
}
