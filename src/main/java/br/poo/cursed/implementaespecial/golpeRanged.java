package br.poo.cursed.implementaespecial;

public class golpeRanged implements Golpe{
    
    @Override
    public double gSimples(double intelecto, double agilidade,
            String tipoArma, String tipo2){
        double base = 3, mod = 3;
        
        if (tipoArma.equals("Varinha")) {
            base = intelecto*intelecto*10;
        }
        if (tipoArma.equals("Cajado")) {
            base = intelecto*intelecto*16;
        } 
        if (tipoArma.equals("Arco Curto")) {
            base = agilidade*intelecto*9;
        }
        if (tipoArma.equals("Arco Composto")) {
            base = agilidade*intelecto*18;
        }
        else {
            base = agilidade*intelecto*30;
        }

        double dano = base;
        return dano;
    }

    @Override
    public double gRapido(double intelecto, double agilidade,
            String tipoArma, String tipo2){
        double base = 3, mod = 3;
        
        if (tipoArma.equals("Varinha")) {
            base = intelecto*intelecto*10;
        }
        if (tipoArma.equals("Cajado")) {
            base = intelecto*intelecto*16;
        } 
        if (tipoArma.equals("Arco Curto")) {
            base = agilidade*intelecto*9;
        }
        if (tipoArma.equals("Arco Composto")) {
            base = agilidade*intelecto*18;
        }
        else {
            base = agilidade*intelecto*30;
        }

        double dano = base*0.75;
        return dano;
    }

    @Override
    public double gForte(double intelecto, double agilidade,
            String tipoArma, String tipo2){
        double base = 3, mod = 3;
        
        if (tipoArma.equals("Varinha")) {
            base = intelecto*intelecto*10;
        }
        if (tipoArma.equals("Cajado")) {
            base = intelecto*intelecto*16;
        } 
        if (tipoArma.equals("Arco Curto")) {
            base = agilidade*intelecto*9;
        }
        if (tipoArma.equals("Arco Composto")) {
            base = agilidade*intelecto*18;
        }
        else {
            base = agilidade*intelecto*30;
        }

        double dano = base*1.75;
        return dano;
    }

    @Override
    public double gCarregado(double intelecto, double agilidade,
            String tipoArma, String tipo2){
        double base = 3, mod = 3;
        
        if (tipoArma.equals("Varinha")) {
            base = intelecto*intelecto*10;
        }
        if (tipoArma.equals("Cajado")) {
            base = intelecto*intelecto*16;
        } 
        if (tipoArma.equals("Arco Curto")) {
            base = agilidade*intelecto*9;
        }
        if (tipoArma.equals("Arco Composto")) {
            base = agilidade*intelecto*18;
        }
        else {
            base = agilidade*intelecto*30;
        }

        double dano = base*2.5;
        return dano;
    }

    @Override
    public double gCounter(double intelecto, double agilidade,
            String tipoArma, String tipo2){
        double base = 3, mod = 3;
        
        if (tipoArma.equals("Varinha")) {
            base = intelecto*intelecto*10;
        }
        if (tipoArma.equals("Cajado")) {
            base = intelecto*intelecto*16;
        } 
        if (tipoArma.equals("Arco Curto")) {
            base = agilidade*intelecto*9;
        }
        if (tipoArma.equals("Arco Composto")) {
            base = agilidade*intelecto*18;
        }
        else {
            base = agilidade*intelecto*30;
        }

        double dano = base*3;
        return dano;
    }
    
}
