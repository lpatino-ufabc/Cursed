package br.poo.cursed.npc;

import br.poo.cursed.implementaespecial.Cura;
import br.poo.cursed.implementaespecial.Especial;
import br.poo.cursed.implementaespecial.Golpe;
import br.poo.cursed.mob.*;

public class Warrior extends Heroes{
    
    private Especial especial;
    private Cura cura;
    private Golpe golpe;
    
    public Warrior(double nivel, String nome, double forca, double agilidade,
            double intelecto, double vida, double fe, String tipoArmadura, 
            double nivelArmadura, String tipoArma, double XP, double lvlXP, 
            Especial especial, Cura cura, Golpe golpe) {
        super(nivel, nome, forca, agilidade, intelecto, vida, fe, tipoArmadura, 
            nivelArmadura, tipoArma, XP, lvlXP);
        this.especial = especial;
        this.cura = cura;
        this.golpe = golpe;
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

    public double ataqueSimples(){
        return golpe.gSimples(forca, fe, tipoArma, tipoArmadura);
    }
    
    public double ataqueRapido(){
        return golpe.gRapido(forca, fe, tipoArma, tipoArmadura);
    }
    
    public double ataqueForte(){
        return golpe.gForte(forca, fe, tipoArma, tipoArmadura);
    }
    
    public double ataqueCarregado(){
        return golpe.gCarregado(forca, fe, tipoArma, tipoArmadura);
    }
    
    public double ataqueCounter(){
        return golpe.gCounter(forca, fe, tipoArma, tipoArmadura);
    }
    
    public double especialLeve(double agilidade, double intelecto){
        return especial.especialMagico(agilidade, intelecto);
    }
    
    public double especialPesado(double agilidade, double intelecto){
        return especial.especialUltimate(agilidade, intelecto);
    }
    
    public double revigorar(double vida){
        return cura.curativo(vida);
    }
    
    
    public double rejuvenescer(double vida){
        return cura.soproVida(vida);
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
                dano = drago.especialLeve(drago.getAlma(), drago.getVida());
            }
            if (opcao.equals("7")) {
                dano = drago.especialPesado(drago.getAlma(), drago.getVida());
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
                dano = virme.especialLeve(virme.getAlma(), virme.getVida());
            }
            if (opcao.equals("7")) {
                dano = virme.especialPesado(virme.getAlma(), virme.getVida());
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
            if (opcao.equals("6")) {
                dano = minos.especialLeve(minos.getAlma(), minos.getNivelArmadura());
            }
            if (opcao.equals("7")) {
                dano = minos.especialPesado(minos.getAlma(), minos.getNivelArmadura());
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
            if (opcao.equals("6")) {
                dano = arara.especialLeve(arara.getAlma(), arara.getNivelArmadura());
            }
            if (opcao.equals("7")) {
                dano = arara.especialPesado(arara.getAlma(), arara.getNivelArmadura());
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
                dano = necro.especialLeve(necro.getAlma(), necro.getVida());
            }
            if (opcao.equals("7")) {
                dano = necro.especialPesado(necro.getAlma(), necro.getVida());
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
                dano = osso.especialLeve(osso.getAlma(), osso.getVida());
            }
            if (opcao.equals("7")) {
                dano = osso.especialPesado(osso.getAlma(), osso.getVida());
            }
        }    
        
        if (this.vida > dano) {
            this.vida = this.vida - dano;
        } else {
            this.vida = 0;
        }
    }
}
