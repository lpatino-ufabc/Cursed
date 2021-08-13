package br.poo.cursed.implementaespecial;

public class golpeMeele implements Golpe{
    
    @Override
    public double gSimples(double forca, double fe,
            String tipoArma, String tipo2){
        double base = 3, mod = 3;
        
        
        if (tipoArma.equals("Espada pequena")) {
            base = forca*fe*4;
        }
        if (tipoArma.equals("Espada Longa")) {
            base = forca*fe*9;
        } 
        if (tipoArma.equals("Machadinha")) {
            base = forca*fe*5;
        }
        if (tipoArma.equals("Machado de Guerra")) {
            base = forca*fe*10;
        }
        if (tipoArma.equals("Espada bihander")) {
            base = forca*fe*15;
        }
        if (tipoArma.equals("Maça simples")) {
            base = forca*fe*8;
        }
        if (tipoArma.equals("Martelo de Guerra")) {
            base = forca*fe*14;
        }
        else {
            base = forca*fe*20;
        }

        double dano = base;
        return dano;
    }

    @Override
    public double gRapido(double forca, double fe,
            String tipoArma, String tipo2){
        double base = 3, mod = 3;
        
        
        if (tipoArma.equals("Espada pequena")) {
            base = forca*fe*4;
        }
        if (tipoArma.equals("Espada Longa")) {
            base = forca*fe*9;
        } 
        if (tipoArma.equals("Machadinha")) {
            base = forca*fe*5;
        }
        if (tipoArma.equals("Machado de Guerra")) {
            base = forca*fe*10;
        }
        if (tipoArma.equals("Espada bihander")) {
            base = forca*fe*15;
        }
        if (tipoArma.equals("Maça simples")) {
            base = forca*fe*8;
        }
        if (tipoArma.equals("Martelo de Guerra")) {
            base = forca*fe*14;
        }
        else {
            base = forca*fe*20;
        }

        double dano = base*0.75;
        return dano;
    }

    @Override
    public double gForte(double forca, double fe,
            String tipoArma, String tipo2){
        double base = 3, mod = 3;
        
        
        if (tipoArma.equals("Espada pequena")) {
            base = forca*fe*4;
        }
        if (tipoArma.equals("Espada Longa")) {
            base = forca*fe*9;
        } 
        if (tipoArma.equals("Machadinha")) {
            base = forca*fe*5;
        }
        if (tipoArma.equals("Machado de Guerra")) {
            base = forca*fe*10;
        }
        if (tipoArma.equals("Espada bihander")) {
            base = forca*fe*15;
        }
        if (tipoArma.equals("Maça simples")) {
            base = forca*fe*8;
        }
        if (tipoArma.equals("Martelo de Guerra")) {
            base = forca*fe*14;
        }
        else {
            base = forca*fe*20;
        }

        double dano = base*1.75;
        return dano;
    }

    @Override
    public double gCarregado(double forca, double fe,
            String tipoArma, String tipo2){
        double base = 3, mod = 3;
        
        
        if (tipoArma.equals("Espada pequena")) {
            base = forca*fe*4;
        }
        if (tipoArma.equals("Espada Longa")) {
            base = forca*fe*9;
        } 
        if (tipoArma.equals("Machadinha")) {
            base = forca*fe*5;
        }
        if (tipoArma.equals("Machado de Guerra")) {
            base = forca*fe*10;
        }
        if (tipoArma.equals("Espada bihander")) {
            base = forca*fe*15;
        }
        if (tipoArma.equals("Maça simples")) {
            base = forca*fe*8;
        }
        if (tipoArma.equals("Martelo de Guerra")) {
            base = forca*fe*14;
        }
        else {
            base = forca*fe*20;
        }

        double dano = base*2.5;
        return dano;
    }

    @Override
    public double gCounter(double forca, double fe,
            String tipoArma, String tipo2){
        double base = 3, mod = 3;
        
        
        if (tipoArma.equals("Espada pequena")) {
            base = forca*fe*4;
        }
        if (tipoArma.equals("Espada Longa")) {
            base = forca*fe*9;
        } 
        if (tipoArma.equals("Machadinha")) {
            base = forca*fe*5;
        }
        if (tipoArma.equals("Machado de Guerra")) {
            base = forca*fe*10;
        }
        if (tipoArma.equals("Espada bihander")) {
            base = forca*fe*15;
        }
        if (tipoArma.equals("Maça simples")) {
            base = forca*fe*8;
        }
        if (tipoArma.equals("Martelo de Guerra")) {
            base = forca*fe*14;
        }
        else {
            base = forca*fe*20;
        }

        double dano = base*3;
        return dano;
    }
    
}
