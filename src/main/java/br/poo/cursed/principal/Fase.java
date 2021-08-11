package br.poo.cursed.principal;

import br.poo.cursed.mob.*;
import br.poo.cursed.npc.*;
import java.util.Scanner;
import java.util.ArrayList;

public class Fase {
    
    private static Scanner entrada;
    
    public static void main(String[] args){
        int opt_menu = -1, continuar;
        Object herois;
        entrada = new Scanner(System.in);
        
        while (opt_menu != 0) {

            opt_menu = menu();

            switch (opt_menu) {
                case 1: {
                    Ranger heroi = new Ranger(1.0,"m1",8.0,16.0,8.0,200.0,6.0,
                            "Armadura de Couro",8.0,"Arco Curto",500.0,0.0);
                    System.out.println("O elfo prepara o arco para mais uma caçada.");
                    System.out.println("Você sai da cidade, com seus pertences em rumo ao ");
                    System.out.println("deconhecido, com a certeza de que não há volta. Você");
                    System.out.println("se dirige para a Floresta não em busca de glória, mas");
                    System.out.println("de sentido na vida...tavez receba algo que não procura.");
                    
                    //faseFloresta(heroi);
                    opt_menu = 0;                    
                    break;
                }
                case 2: {
                    Mage heroi = new Mage(1.0,"r1",8.0,8.0,26.0,180.0,6.0,
                            "Robe",3.0,"Cajado",500.0,0.0);
                    System.out.println("O mago prepara seus tomos para mais uma aventura.");
                    System.out.println("O elfo prepara o arco para mais uma caçada.");
                    System.out.println("Você sai da cidade, com seus pertences em rumo ao ");
                    System.out.println("deconhecido, com a certeza de que não há volta. Você");
                    System.out.println("se dirige para a Floresta não em busca de glória, mas");
                    System.out.println("de sentido na vida...tavez receba algo que não procura.");
                    
                    //faseFloresta(heroi);
                    opt_menu = 0;                    
                    break;
                }
                case 3: {
                    Priest heroi = new Priest(1.0,"p1",8.0,6.0,8.0,220.0,16.0,
                            "Armadura de Placa",12.0,"Massa simples",500.0,0.0);
                    System.out.println("O sacerdote fala com os deuses e segue para o desconhecido.");
                    System.out.println("O elfo prepara o arco para mais uma caçada.");
                    System.out.println("Você sai da cidade, com seus pertences em rumo ao ");
                    System.out.println("deconhecido, com a certeza de que não há volta. Você");
                    System.out.println("se dirige para a Floresta não em busca de glória, mas");
                    System.out.println("de sentido na vida...tavez receba algo que não procura.");
                    
                    //faseFloresta(heroi);
                    opt_menu = 0;                    
                    break;
                }
                case 4: {
                    Warrior heroi = new Warrior(1.0,"w1",18.0,6.0,10.0,300.0,4.0,
                            "Armadura Completa",15.0,"Espada Longa",500.0,0.0);
                    System.out.println("O guerreiro vai em busca de glória e sangue.");
                    System.out.println("O elfo prepara o arco para mais uma caçada.");
                    System.out.println("Você sai da cidade, com seus pertences em rumo ao ");
                    System.out.println("deconhecido, com a certeza de que não há volta. Você");
                    System.out.println("se dirige para a Floresta não em busca de glória, mas");
                    System.out.println("de sentido na vida...tavez receba algo que não procura.");
                    
                    //faseFloresta(heroi);
                    opt_menu = 0;                    
                    break;
                }                
                case 0: {
                    System.out.println("Até logo!");
                    System.exit(opt_menu);
                }
                default: {
                    System.out.println("Opção " + opt_menu + " inválida.");
                    break;
                }
            }
        }
        entrada.close();
    }
    
    private static int menu() {
        System.out.println("===Bem-vindo ao Cursed===");
        System.out.println("===Quem é você?===");
        System.out.println("1 - Legolas - Elfo - Ranger");
        System.out.println("2 - Gandalf - Humano - Mage");
        System.out.println("3 - Artorias - Humano - Priest");
        System.out.println("4 - Havel - Humano - Warrior");
        System.out.println("0 - Sair");

        return Integer.parseInt(entrada.nextLine());
    }
    
    private static int fase1() {
        System.out.println("===Primeiro Nivel===");
        System.out.println("===Floresta Sobria===");
        System.out.println("1 - Siga em frente");
        System.out.println("2 - Vire a esquerda");
        System.out.println("3 - Vire a direita");
        System.out.println("4 - Volte atras");
        System.out.println("0 - Desistir");

        return Integer.parseInt(entrada.nextLine());
    }
    
    private static int menuLuta() {
        System.out.println("1 - Ataque Simples");
        System.out.println("2 - Ataque Rapido");
        System.out.println("3 - Ataque Forte");
        System.out.println("4 - Ataque Carregado");
        System.out.println("5 - Contra ataque");

        return Integer.parseInt(entrada.nextLine());
    }
    
    private static void faseFloresta(Heroes heroi){
        int fase1 = -1;
        int reto = 0, esquerda = 0, direita = 0, lutas = 0;
        double skcheckVida = 0.0, zbcheckVida = 0.0, heroVida = 0.0;
        Skeletons sk1 = new Skeletons(1.0,"Ossada Viva",30,"Armadura Podre",3.0,
                    "Carniceiro",0.0,"","Espada Longa",300);            
        Zombies zo1 = new Zombies(1.0,"Corpo Ambulante",50,"Armadura Podre",3.0,
                "Carniceiro",0.0,"","Espada Longa",400);
        
        if(heroi instanceof Ranger){
            Ranger perso = new Ranger(1.0,"m1",8.0,16.0,8.0,200.0,6.0,
                            "Armadura de Couro",8.0,"Arco Curto",500.0,0.0);
        }
        if(heroi instanceof Mage){
            Mage perso = new Mage(1.0,"r1",8.0,8.0,26.0,180.0,6.0,
                            "Robe",3.0,"Cajado",500.0,0.0);
        }
        if(heroi instanceof Priest){
            Priest perso = new Priest(1.0,"p1",8.0,6.0,8.0,220.0,16.0,
                            "Armadura de Placa",12.0,"Massa simples",500.0,0.0);
        }
        else{
            Warrior perso = new Warrior(1.0,"w1",18.0,6.0,10.0,300.0,4.0,
                            "Armadura Completa",15.0,"Espada Longa",500.0,0.0);
        }           
    }
}
