package br.poo.cursed.npc;

import br.poo.cursed.mob.*;

public class Mage extends Heroes implements Ataque, Especial, Curar{
    
    public Mage(double nivel, String nome, double forca, double agilidade,
            double intelecto, double vida, double fe, String tipoArmadura, 
            double nivelArmadura, String tipoArma, double XP, double lvlXP) {
        super(nivel, nome, forca, agilidade, intelecto, vida, fe, tipoArmadura, 
            nivelArmadura, tipoArma, XP, lvlXP);
    }
    
    @Override
    public double getNivel() {
        return this.nivel;
    }

    @Override
    public String getNome() {
        return this.nome;
    }

    @Override
    public double getVida() {
        return this.vida;
    }

    @Override
    public void setVida(double vida) {
        this.vida = vida;
    }

    @Override
    public String getTipoArmadura() {
        return this.tipoArmadura;
    }

    @Override
    public double getNivelArmadura() {
        return this.nivelArmadura;
    }

    @Override
    public String getArma() {
        return this.tipoArma;
    }

    @Override
    public double ataqueSimples() {
        double base = 0, mod = 0;
        String tp_arma = this.tipoArma;
        if (tp_arma.equals("Varinha")) {
            base = this.intelecto*10;
        }
        if (tp_arma.equals("Cajado")) {
            base = this.intelecto*16;
        } else {
            base = this.intelecto*30;
        }

        double dano = nivel * base;
        return dano;
    }

    @Override
    public double ataqueRapido() {
        double base = 0, mod = 0;
        String tp_arma = this.tipoArma;
        if (tp_arma.equals("Varinha")) {
            base = this.intelecto*10;
        }
        if (tp_arma.equals("Cajado")) {
            base = this.intelecto*16;
        } else {
            base = this.intelecto*30;
        }

        double dano = nivel * base * 0.75;
        return dano;
    }

    @Override
    public double ataqueForte() {
        double base = 0, mod = 0;
        String tp_arma = this.tipoArma;
        if (tp_arma.equals("Varinha")) {
            base = this.intelecto*10;
        }
        if (tp_arma.equals("Cajado")) {
            base = this.intelecto*16;
        } else {
            base = this.intelecto*30;
        }

        double dano = nivel * base * 1.75;
        return dano;
    }

    @Override
    public double ataqueCarregado() {
        double base = 0, mod = 0;
        String tp_arma = this.tipoArma;
        if (tp_arma.equals("Varinha")) {
            base = this.intelecto*10;
        }
        if (tp_arma.equals("Cajado")) {
            base = this.intelecto*16;
        } else {
            base = this.intelecto*30;
        }

        double dano = nivel * base * 2.5;
        return dano;
    }

    @Override
    public double ataqueCounter() {
        double base = 0, mod = 0;
        String tp_arma = this.tipoArma;
        if (tp_arma.equals("Varinha")) {
            base = this.intelecto*10;
        }
        if (tp_arma.equals("Cajado")) {
            base = this.intelecto*16;
        } else {
            base = this.intelecto*30;
        }

        double dano = nivel * base * nivelArmadura * 1.5;
        return dano;
    }

    @Override
    public double ataqueVampirico() {
        double dano = 0;
        return dano;
    }

    @Override
    public double ataqueVenenoso() {
        double dano = 0;
        return dano;
    }

    @Override
    public double ataqueFogo() {
        double dano = 0;
        return dano;
    }

    @Override
    public double ataqueVoador() {
        double dano = 0;
        return dano;
    }

    @Override
    public double ataqueExplosivo() {
        double dano = 0;
        return dano;
    }

    @Override
    public double ataqueMaldicao() {
        double dano = 0;
        return dano;
    }

    @Override
    public double ataqueSobrenatural() {
        double dano = 0;
        return dano;
    }
    
    @Override
    public void curativo(){
        this.vida = this.vida + 0.01*this.vida*this.intelecto;
    }
    
    @Override
    public void rejuvenescer(){
        this.vida = this.vida + 0.03*this.vida*this.intelecto;
    }
    
    @Override    
    public void soproVida(){
        this.vida = this.vida + 0.05*this.vida*this.intelecto;
    }
    
    @Override
    public void rajadaVida(){
        this.vida = this.vida + this.vida;
    }

    @Override
    public void tomarDano(Inimigo inimigo, String opcao) {
        double dano = 0;
        if (inimigo instanceof Drake) {
            Drake drago = (Drake) inimigo;
            if (opcao.equals("1")) {
                dano = drago.ataqueSimples();
            }
            if (opcao.equals("2")) {
                dano = drago.ataqueRapido();
            }
            if (opcao.equals("3")) {
                dano = drago.ataqueForte();
            }
            if (opcao.equals("4")) {
                dano = drago.ataqueCarregado();
            }
            if (opcao.equals("5")) {
                dano = drago.ataqueCounter();
            }
            if (opcao.equals("6")) {
                dano = drago.ataqueFogo();
            }
            if (opcao.equals("7")) {
                dano = drago.ataqueVoador();
            }
            if (opcao.equals("8")) {
                dano = drago.ataqueExplosivo();
            }
        }
        if (inimigo instanceof Wyrm) {
            Wyrm virme = (Wyrm) inimigo;
            if (opcao.equals("1")) {
                dano = virme.ataqueSimples();
            }
            if (opcao.equals("2")) {
                dano = virme.ataqueRapido();
            }
            if (opcao.equals("3")) {
                dano = virme.ataqueForte();
            }
            if (opcao.equals("4")) {
                dano = virme.ataqueCarregado();
            }
            if (opcao.equals("5")) {
                dano = virme.ataqueCounter();
            }
            if (opcao.equals("6")) {
                dano = virme.ataqueFogo();
            }
            if (opcao.equals("7")) {
                dano = virme.ataqueVoador();
            }
            if (opcao.equals("8")) {
                dano = virme.ataqueExplosivo();
            }
        }
        if (inimigo instanceof Minotaur) {
            Minotaur minos = (Minotaur) inimigo;
            if (opcao.equals("1")) {
                dano = minos.ataqueSimples();
            }
            if (opcao.equals("2")) {
                dano = minos.ataqueRapido();
            }
            if (opcao.equals("3")) {
                dano = minos.ataqueForte();
            }
            if (opcao.equals("4")) {
                dano = minos.ataqueCarregado();
            }
            if (opcao.equals("5")) {
                dano = minos.ataqueCounter();
            }
        }
        if (inimigo instanceof Gryphon) {
            Gryphon arara = (Gryphon) inimigo;
            if (opcao.equals("1")) {
                dano = arara.ataqueSimples();
            }
            if (opcao.equals("2")) {
                dano = arara.ataqueRapido();
            }
            if (opcao.equals("3")) {
                dano = arara.ataqueForte();
            }
            if (opcao.equals("4")) {
                dano = arara.ataqueCarregado();
            }
            if (opcao.equals("5")) {
                dano = arara.ataqueCounter();
            }
        }
        if (inimigo instanceof Zombies) {
            Zombies necro = (Zombies) inimigo;
            if (opcao.equals("1")) {
                dano = necro.ataqueSimples();
            }
            if (opcao.equals("2")) {
                dano = necro.ataqueRapido();
            }
            if (opcao.equals("3")) {
                dano = necro.ataqueForte();
            }
            if (opcao.equals("4")) {
                dano = necro.ataqueCarregado();
            }
            if (opcao.equals("5")) {
                dano = necro.ataqueCounter();
            }
            if (opcao.equals("6")) {
                dano = necro.ataqueVampirico();
            }
            if (opcao.equals("7")) {
                dano = necro.ataqueVenenoso();
            }
            if (opcao.equals("8")) {
                dano = necro.ataqueMaldicao();
            }
            if (opcao.equals("9")) {
                dano = necro.ataqueSobrenatural();
            }
        }
        if (inimigo instanceof Skeletons) {
            Skeletons osso = (Skeletons) inimigo;
            if (opcao.equals("1")) {
                dano = osso.ataqueSimples();
            }
            if (opcao.equals("2")) {
                dano = osso.ataqueRapido();
            }
            if (opcao.equals("3")) {
                dano = osso.ataqueForte();
            }
            if (opcao.equals("4")) {
                dano = osso.ataqueCarregado();
            }
            if (opcao.equals("5")) {
                dano = osso.ataqueCounter();
            }
            if (opcao.equals("6")) {
                dano = osso.ataqueVampirico();
            }
            if (opcao.equals("7")) {
                dano = osso.ataqueVenenoso();
            }
            if (opcao.equals("8")) {
                dano = osso.ataqueMaldicao();
            }
            if (opcao.equals("9")) {
                dano = osso.ataqueSobrenatural();
            }
        }    
        
        if (this.vida > dano) {
            this.vida = this.vida - dano;
        } else {
            this.vida = 0;
        }
    }
}
