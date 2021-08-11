package br.poo.cursed.npc;

import br.poo.cursed.mob.Drake;
import br.poo.cursed.mob.Gryphon;
import br.poo.cursed.mob.Inimigo;
import br.poo.cursed.mob.Minotaur;
import br.poo.cursed.mob.Skeletons;
import br.poo.cursed.mob.Wyrm;
import br.poo.cursed.mob.Zombies;

public class Ranger extends Heroes implements Ataque, Especial {

    public Ranger(double nivel, String nome, double forca, double agilidade,
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
        if (tp_arma.equals("Arco Curto")) {
            base = this.agilidade*9;
        }
        if (tp_arma.equals("Arco Composto")) {
            base = this.agilidade*18;
        } else {
            base = this.agilidade*30;
        }

        double dano = nivel * base;
        return dano;
    }

    @Override
    public double ataqueRapido() {
        double base = 0, mod = 0;
        String tp_arma = this.tipoArma;
        if (tp_arma.equals("Arco Curto")) {
            base = this.agilidade*9;
        }
        if (tp_arma.equals("Arco Composto")) {
            base = this.agilidade*18;
        } else {
            base = this.agilidade*30;
        }

        double dano = nivel * base * 0.75;
        return dano;
    }

    @Override
    public double ataqueForte() {
        double base = 0, mod = 0;
        String tp_arma = this.tipoArma;
        if (tp_arma.equals("Arco Curto")) {
            base = this.agilidade*9;
        }
        if (tp_arma.equals("Arco Composto")) {
            base = this.agilidade*18;
        } else {
            base = this.agilidade*30;
        }

        double dano = nivel * base * 1.75;
        return dano;
    }

    @Override
    public double ataqueCarregado() {
        double base = 0, mod = 0;
        String tp_arma = this.tipoArma;
        if (tp_arma.equals("Arco Curto")) {
            base = this.agilidade*9;
        }
        if (tp_arma.equals("Arco Composto")) {
            base = this.agilidade*18;
        } else {
            base = this.agilidade*30;
        }

        double dano = nivel * base * 2.5;
        return dano;
    }

    @Override
    public double ataqueCounter() {
        double base = 0, mod = 0;
        String tp_arma = this.tipoArma;
        if (tp_arma.equals("Arco Curto")) {
            base = this.agilidade*9;
        }
        if (tp_arma.equals("Arco Composto")) {
            base = this.agilidade*18;
        } else {
            base = this.agilidade*30;
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
    public void tomarDano(Inimigo inimigo, String opcao) {
        double dano = 0;
        if (inimigo instanceof Drake) {
            Drake drago = (Drake) inimigo;
            if (opcao.equals("Ataque Simples")) {
                dano = drago.ataqueSimples();
            }
            if (opcao.equals("Ataque Rapido")) {
                dano = drago.ataqueRapido();
            }
            if (opcao.equals("Ataque Forte")) {
                dano = drago.ataqueForte();
            }
            if (opcao.equals("Ataque Carregado")) {
                dano = drago.ataqueCarregado();
            }
            if (opcao.equals("Ataque Counter")) {
                dano = drago.ataqueCounter();
            }
            if (opcao.equals("Ataque Fogo")) {
                dano = drago.ataqueFogo();
            }
            if (opcao.equals("Ataque Voador")) {
                dano = drago.ataqueVoador();
            }
            if (opcao.equals("Ataque Explosivo")) {
                dano = drago.ataqueExplosivo();
            }
        }
        if (inimigo instanceof Wyrm) {
            Wyrm virme = (Wyrm) inimigo;
            if (opcao.equals("Ataque Simples")) {
                dano = virme.ataqueSimples();
            }
            if (opcao.equals("Ataque Rapido")) {
                dano = virme.ataqueRapido();
            }
            if (opcao.equals("Ataque Forte")) {
                dano = virme.ataqueForte();
            }
            if (opcao.equals("Ataque Carregado")) {
                dano = virme.ataqueCarregado();
            }
            if (opcao.equals("Ataque Counter")) {
                dano = virme.ataqueCounter();
            }
            if (opcao.equals("Ataque Fogo")) {
                dano = virme.ataqueFogo();
            }
            if (opcao.equals("Ataque Voador")) {
                dano = virme.ataqueVoador();
            }
            if (opcao.equals("Ataque Explosivo")) {
                dano = virme.ataqueExplosivo();
            }
        }
        if (inimigo instanceof Minotaur) {
            Minotaur minos = (Minotaur) inimigo;
            if (opcao.equals("Ataque Simples")) {
                dano = minos.ataqueSimples();
            }
            if (opcao.equals("Ataque Rapido")) {
                dano = minos.ataqueRapido();
            }
            if (opcao.equals("Ataque Forte")) {
                dano = minos.ataqueForte();
            }
            if (opcao.equals("Ataque Carregado")) {
                dano = minos.ataqueCarregado();
            }
            if (opcao.equals("Ataque Counter")) {
                dano = minos.ataqueCounter();
            }
        }
        if (inimigo instanceof Gryphon) {
            Gryphon arara = (Gryphon) inimigo;
            if (opcao.equals("Ataque Simples")) {
                dano = arara.ataqueSimples();
            }
            if (opcao.equals("Ataque Rapido")) {
                dano = arara.ataqueRapido();
            }
            if (opcao.equals("Ataque Forte")) {
                dano = arara.ataqueForte();
            }
            if (opcao.equals("Ataque Carregado")) {
                dano = arara.ataqueCarregado();
            }
            if (opcao.equals("Ataque Counter")) {
                dano = arara.ataqueCounter();
            }
        }
        if (inimigo instanceof Zombies) {
            Zombies necro = (Zombies) inimigo;
            if (opcao.equals("Ataque Simples")) {
                dano = necro.ataqueSimples();
            }
            if (opcao.equals("Ataque Rapido")) {
                dano = necro.ataqueRapido();
            }
            if (opcao.equals("Ataque Forte")) {
                dano = necro.ataqueForte();
            }
            if (opcao.equals("Ataque Carregado")) {
                dano = necro.ataqueCarregado();
            }
            if (opcao.equals("Ataque Counter")) {
                dano = necro.ataqueCounter();
            }
            if (opcao.equals("Ataque Vampirico")) {
                dano = necro.ataqueVampirico();
            }
            if (opcao.equals("Ataque Venenoso")) {
                dano = necro.ataqueVenenoso();
            }
            if (opcao.equals("Ataque Amaldiçoado")) {
                dano = necro.ataqueMaldicao();
            }
            if (opcao.equals("Ataque Sobrenatural")) {
                dano = necro.ataqueSobrenatural();
            }
        }
        if (inimigo instanceof Skeletons) {
            Skeletons osso = (Skeletons) inimigo;
            if (opcao.equals("Ataque Simples")) {
                dano = osso.ataqueSimples();
            }
            if (opcao.equals("Ataque Rapido")) {
                dano = osso.ataqueRapido();
            }
            if (opcao.equals("Ataque Forte")) {
                dano = osso.ataqueForte();
            }
            if (opcao.equals("Ataque Carregado")) {
                dano = osso.ataqueCarregado();
            }
            if (opcao.equals("Ataque Counter")) {
                dano = osso.ataqueCounter();
            }
            if (opcao.equals("Ataque Vampirico")) {
                dano = osso.ataqueVampirico();
            }
            if (opcao.equals("Ataque Venenoso")) {
                dano = osso.ataqueVenenoso();
            }
            if (opcao.equals("Ataque Amaldiçoado")) {
                dano = osso.ataqueMaldicao();
            }
            if (opcao.equals("Ataque Sobrenatural")) {
                dano = osso.ataqueSobrenatural();
            }
        }    
        
        if (this.vida > dano) {
            this.vida -= dano;
        } else {
            this.vida = 0;
        }
    }
}
