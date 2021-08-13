package br.poo.cursed.implementaespecial;

public class golpeDragao implements Golpe {
    
    @Override
    public double gSimples(double nivel, double nivelAlma,
            String tipo1, String tipo2){
        double dano = nivel*nivelAlma;                
        return dano;
    }
    
    public double gRapido(double nivel, double nivelAlma,
            String tipo1, String tipo2){
        double dano = nivel*nivelAlma*0.75;
        return dano;
    }
    
    public double gForte(double nivel, double nivelAlma,
            String tipo1, String tipo2){
        double dano = nivel*nivelAlma*1.5;
        return dano;
    }
    
    public double gCarregado(double nivel, double nivelAlma,
            String tipo1, String tipo2){
        double dano = nivel*nivelAlma*2.5;
        return dano;
    }
    
    public double gCounter(double nivel, double nivelArmadura,
            String tipo1, String tipo2){
        double dano = nivel*nivelArmadura*2.5;
        return dano;
    }
    
}
