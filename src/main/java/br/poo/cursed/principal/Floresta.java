package br.poo.cursed.principal;

import br.poo.cursed.implementaespecial.curaNPC;
import br.poo.cursed.implementaespecial.especialMeele;
import br.poo.cursed.implementaespecial.especialRanged;
import br.poo.cursed.implementaespecial.golpeMeele;
import br.poo.cursed.implementaespecial.golpeRanged;
import br.poo.cursed.mob.*;
import br.poo.cursed.npc.*;
import java.util.Scanner;

public class Floresta {

    private final Inimigo inimigo1;
    private final Heroes heroi;
    private static Scanner ent;

    public Floresta(Inimigo inimigo1, Heroes heroi) {
        this.inimigo1 = inimigo1;
        this.heroi = heroi;
    }

    public void iniciar() {
        int lutas = -1;
        double skckeckVida, herocheckVida;
        double danodado = inimigo1.getVida(), danotomado = heroi.getVida();
        double skfinal = inimigo1.getVida(), herofinal = heroi.getVida();

        ent = new Scanner(System.in);

        while (skfinal > 0 & herofinal > 0) {

            try {
                lutas = menuLuta();
            } catch (NumberFormatException e) {
                System.out.println("A entrada é um número entre 1 e 5.");
            }

            switch (lutas) {
                case 1: {
                    System.out.println("Você ataca o " + inimigo1.getNome());
                    inimigo1.tomarDano(heroi, "1");
                    skckeckVida = inimigo1.getVida();
                    herocheckVida = heroi.getVida();
                    danodado = danodado - inimigo1.getVida();
                    System.out.println("Total de dano dado: "+ danodado);
                    danodado = inimigo1.getVida();
                        
                    if (skckeckVida > 0.0 & herocheckVida > 0.0) {
                        System.out.println("O " + inimigo1.getNome() + " te ataca.");
                        heroi.tomarDano(inimigo1, "1");
                        danotomado = danotomado - heroi.getVida();
                        System.out.println("Total de dano tomado: "+ danotomado);
                        danotomado = heroi.getVida();
                        System.out.print("A vida do heroi é:" + heroi.getVida());
                        System.out.print("\n");
                        System.out.print("A vida do " + inimigo1.getNome() + " é: " + inimigo1.getVida());
                        System.out.print("\n");
                    }
                    if (skckeckVida <= 0.0 | herocheckVida <= 0.0) {
                        System.out.print("A vida do heroi é:" + herocheckVida);
                        System.out.print("\n");
                        System.out.print("A vida do " + inimigo1.getNome() + " é: " + skckeckVida);
                        System.out.print("\n");
                        skfinal = skckeckVida;
                        herofinal = herocheckVida;
                    }
                    break;
                }
                case 2: {
                    System.out.println("Você ataca o " + inimigo1.getNome());
                    inimigo1.tomarDano(heroi, "1");
                    skckeckVida = inimigo1.getVida();
                    herocheckVida = heroi.getVida();
                    danodado = danodado - inimigo1.getVida();
                    System.out.println("Total de dano dado: "+ danodado);
                    danodado = inimigo1.getVida();
                        
                    if (skckeckVida > 0.0 & herocheckVida > 0.0) {
                        System.out.println("O " + inimigo1.getNome() + " te ataca.");
                        heroi.tomarDano(inimigo1, "2");
                        danotomado = danotomado - heroi.getVida();
                        System.out.println("Total de dano tomado: "+ danotomado);
                        danotomado = heroi.getVida();
                        System.out.print("A vida do heroi é:" + heroi.getVida());
                        System.out.print("\n");
                        System.out.print("A vida do " + inimigo1.getNome() + " é: " + inimigo1.getVida());
                        System.out.print("\n");
                    }
                    if (skckeckVida <= 0.0 | herocheckVida <= 0.0) {
                        System.out.print("A vida do heroi é:" + herocheckVida);
                        System.out.print("\n");
                        System.out.print("A vida do " + inimigo1.getNome() + " é: " + skckeckVida);
                        System.out.print("\n");
                        skfinal = skckeckVida;
                        herofinal = herocheckVida;
                    }
                    break;
                }
                case 3: {
                    System.out.println("Você ataca o " + inimigo1.getNome());
                    inimigo1.tomarDano(heroi, "1");
                    skckeckVida = inimigo1.getVida();
                    herocheckVida = heroi.getVida();
                    danodado = danodado - inimigo1.getVida();
                    System.out.println("Total de dano dado: "+ danodado);
                    danodado = inimigo1.getVida();
                        
                    if (skckeckVida > 0.0 & herocheckVida > 0.0) {
                        System.out.println("O " + inimigo1.getNome() + " te ataca.");
                        heroi.tomarDano(inimigo1, "3");
                        danotomado = danotomado - heroi.getVida();
                        System.out.println("Total de dano tomado: "+ danotomado);
                        danotomado = heroi.getVida();
                        System.out.print("A vida do heroi é:" + heroi.getVida());
                        System.out.print("\n");
                        System.out.print("A vida do " + inimigo1.getNome() + " é: " + inimigo1.getVida());
                        System.out.print("\n");
                    }
                    if (skckeckVida <= 0.0 | herocheckVida <= 0.0) {
                        System.out.print("A vida do heroi é:" + herocheckVida);
                        System.out.print("\n");
                        System.out.print("A vida do " + inimigo1.getNome() + " é: " + skckeckVida);
                        System.out.print("\n");
                        skfinal = skckeckVida;
                        herofinal = herocheckVida;
                    }
                    break;
                }
                case 4: {
                    System.out.println("Você ataca o " + inimigo1.getNome());
                    inimigo1.tomarDano(heroi, "4");
                    skckeckVida = inimigo1.getVida();
                    herocheckVida = heroi.getVida();
                    danodado = danodado - inimigo1.getVida();
                    System.out.println("Total de dano dado: "+ danodado);
                    danodado = inimigo1.getVida();
                        
                    if (skckeckVida > 0.0 & herocheckVida > 0.0) {
                        System.out.println("O " + inimigo1.getNome() + " te ataca.");
                        heroi.tomarDano(inimigo1, "4");
                        danotomado = danotomado - heroi.getVida();
                        System.out.println("Total de dano tomado: "+ danotomado);
                        danotomado = heroi.getVida();
                        System.out.print("A vida do heroi é:" + heroi.getVida());
                        System.out.print("\n");
                        System.out.print("A vida do " + inimigo1.getNome() + " é: " + inimigo1.getVida());
                        System.out.print("\n");
                    }
                    if (skckeckVida <= 0.0 | herocheckVida <= 0.0) {
                        System.out.print("A vida do heroi é:" + herocheckVida);
                        System.out.print("\n");
                        System.out.print("A vida do " + inimigo1.getNome() + " é: " + skckeckVida);
                        System.out.print("\n");
                        skfinal = skckeckVida;
                        herofinal = herocheckVida;
                    }
                    break;
                }
                case 5: {
                    System.out.println("Você ataca o " + inimigo1.getNome());
                    inimigo1.tomarDano(heroi, "5");
                    skckeckVida = inimigo1.getVida();
                    herocheckVida = heroi.getVida();
                    danodado = danodado - inimigo1.getVida();
                    System.out.println("Total de dano dado: "+ danodado);
                    danodado = inimigo1.getVida();
                        
                    if (skckeckVida > 0.0 & herocheckVida > 0.0) {
                        System.out.println("O " + inimigo1.getNome() + " te ataca.");
                        heroi.tomarDano(inimigo1, "5");
                        danotomado = danotomado - heroi.getVida();
                        System.out.println("Total de dano tomado: "+ danotomado);
                        danotomado = heroi.getVida();
                        System.out.print("A vida do heroi é:" + heroi.getVida());
                        System.out.print("\n");
                        System.out.print("A vida do " + inimigo1.getNome() + " é: " + inimigo1.getVida());
                        System.out.print("\n");
                    }
                    if (skckeckVida <= 0.0 | herocheckVida <= 0.0) {
                        System.out.print("A vida do heroi é:" + herocheckVida);
                        System.out.print("\n");
                        System.out.print("A vida do " + inimigo1.getNome() + " é: " + skckeckVida);
                        System.out.print("\n");
                        skfinal = skckeckVida;
                        herofinal = herocheckVida;
                    }
                    break;
                }
                default: {
                    System.out.println("Opção " + lutas + " inválida.");
                    break;
                }
            }
        }

        if (herofinal <= 0.0) {
            System.out.println("Voce perdeu!");
        }
        if (herofinal > 0.0 & skfinal <= 0) {
            System.out.println("O heroi conseguiu vencer seus pesadelos porém, ");
            System.out.println("existem segredos mais sombrios pela frente.");
        }

        ent.close();
    }

    private static int fase1() {
        System.out.println("===Primeiro Nivel===");
        System.out.println("===Floresta Sobria===");
        System.out.println("1 - Siga em frente");
        System.out.println("2 - Vire a esquerda");
        System.out.println("3 - Vire a direita");
        System.out.println("4 - Volte atras");
        System.out.println("0 - Desistir");

        return Integer.parseInt(ent.nextLine());
    }

    private static int menuLuta() {
        System.out.println("1 - Ataque Simples");
        System.out.println("2 - Ataque Rapido");
        System.out.println("3 - Ataque Forte");
        System.out.println("4 - Ataque Carregado");
        System.out.println("5 - Contra ataque");

        return Integer.parseInt(ent.nextLine());
    }
}
