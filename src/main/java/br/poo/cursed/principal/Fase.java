package br.poo.cursed.principal;

import br.poo.cursed.mob.*;
import br.poo.cursed.npc.*;
import br.poo.cursed.implementaespecial.*;
import java.util.Scanner;
import br.poo.cursed.principal.Floresta;

public class Fase {
    
    private static Scanner entrada;
    
    public static void main(String[] args){
        int opt_menu = -1, continuar, lutas = -1;
        double skckeckVida = 0.0, herocheckVida = 0.0;                        
        double skfinal = 10000.0, herofinal = 10000.0;
                        
        entrada = new Scanner(System.in);
        Skeletons sk1 = new Skeletons(2.0,"Ossada Viva",4000.0,"Armadura Podre",1.0,
                    "Carniceiro",2.0,"","Espada Longa",300.0, new especialUndead(),
                    new curaMob(), new golpeUndead());            
        Zombies zo1 = new Zombies(1.0,"Corpo Ambulante",5000.0,"Armadura Podre",3.0,
                "Carniceiro",1.0,"","Espada Longa",400.0, new especialUndead(),
                new curaMob(), new golpeUndead());
        Gryphon gr1 = new Gryphon(1.0,"Grifo Prateado",7000.0,"Penas de Prata",8.0,
                "",1.0,"Zeus","Garra de Prata",800.0, new especialMitico(),
                new curaMob(), new golpeMitico());
        Minotaur mn1 = new Minotaur(1.0,"Minotauro",8000.0,"Couraça Dura",9.0,
                "",1.0,"Ares","Machado de Guerra",900.0, new especialMitico(),
                new curaMob(), new golpeMitico());
        Wyrm wm1 = new Wyrm(1.0,"Dragonete",6000.0,"Escamas novas",8.0,
                "",10.0,"","",600.0, new especialDragao(),
                new curaMob(), new golpeDragao());
        Drake dk1 = new Drake(1.0,"Dragao de Fogo",10000.0,"Escamas Antigas",18.0,
                "",30.0,"","",1000.0, new especialDragao(),
                new curaMob(), new golpeDragao());
        
        while (opt_menu != 0) {
            
            try{
                opt_menu = menu();
            }
            catch(NumberFormatException e){
                System.out.println("A entrada é um número entre 0 e 4.");
            }            

            switch (opt_menu) {
                case 1: {
                    Ranger heroi = new Ranger(1.0,"m1",8.0,16.0,8.0,12000.0,6.0,
                            "Armadura de Couro",8.0,"Arco Curto",500.0,0.0,
                            new especialRanged(), new curaNPC(), new golpeRanged());
                    System.out.println("O elfo prepara o arco para mais uma caçada.");
                    System.out.println("Você sai da cidade, com seus pertences em rumo ao ");
                    System.out.println("deconhecido, com a certeza de que não há volta. Você");
                    System.out.println("se dirige para a Floresta não em busca de glória, mas");
                    System.out.println("de sentido na vida...tavez receba algo que não procura.");
                    System.out.println("Logo a frente, você observa algo se mexendo, um esqueleto...");
                    System.out.println("Você não acredita em seus olhos, mas o momento não é de vacilar,");
                    System.out.println("você precisa combater seus pesadelos.");
                    System.out.println("Um "+sk1.getNome()+" está te atacando, o que você faz?");
                    
                    Floresta floresta = new Floresta(sk1, heroi);
                    
                    floresta.iniciar();
                    
                    opt_menu = 0;                    
                    break;
                }
                case 2: {
                    Mage heroi = new Mage(1.0,"r1",8.0,8.0,26.0,1180.0,6.0,
                            "Robe",3.0,"Cajado",500.0,0.0,
                            new especialRanged(), new curaNPC(), new golpeRanged());
                    System.out.println("O mago prepara seus tomos para mais uma aventura.");
                    System.out.println("O elfo prepara o arco para mais uma caçada.");
                    System.out.println("Você sai da cidade, com seus pertences em rumo ao ");
                    System.out.println("deconhecido, com a certeza de que não há volta. Você");
                    System.out.println("se dirige para a Floresta não em busca de glória, mas");
                    System.out.println("de sentido na vida...tavez receba algo que não procura.");
                    System.out.println("Logo a frente, você observa algo se mexendo, um esqueleto...");
                    System.out.println("Você não acredita em seus olhos, mas o momento não é de vacilar,");
                    System.out.println("você precisa combater seus pesadelos.");
                    System.out.println("Um "+sk1.getNome()+" está te atacando, o que você faz?");
                    
                    Floresta floresta = new Floresta(sk1, heroi);
                    
                    floresta.iniciar();
                    
                    opt_menu = 0;                    
                    break;
                }
                case 3: {
                    Priest heroi = new Priest(1.0,"p1",8.0,6.0,8.0,1220.0,16.0,
                            "Armadura de Placa",12.0,"Massa simples",500.0,0.0,
                            new especialMeele(), new curaNPC(), new golpeMeele());
                    System.out.println("O sacerdote fala com os deuses e segue para o desconhecido.");
                    System.out.println("O elfo prepara o arco para mais uma caçada.");
                    System.out.println("Você sai da cidade, com seus pertences em rumo ao ");
                    System.out.println("deconhecido, com a certeza de que não há volta. Você");
                    System.out.println("se dirige para a Floresta não em busca de glória, mas");
                    System.out.println("de sentido na vida...tavez receba algo que não procura.");
                    System.out.println("Logo a frente, você observa algo se mexendo, um esqueleto...");
                    System.out.println("Você não acredita em seus olhos, mas o momento não é de vacilar,");
                    System.out.println("você precisa combater seus pesadelos.");
                    System.out.println("Um "+sk1.getNome()+" está te atacando, o que você faz?");
                    
                    Floresta floresta = new Floresta(sk1, heroi);
                    
                    floresta.iniciar();
                    
                    opt_menu = 0;                    
                    break;
                }
                case 4: {
                    Warrior heroi = new Warrior(1.0,"w1",18.0,6.0,10.0,1300.0,4.0,
                            "Armadura Completa",15.0,"Espada Longa",500.0,0.0,
                            new especialMeele(), new curaNPC(), new golpeMeele());
                    System.out.println("O guerreiro vai em busca de glória e sangue.");
                    System.out.println("O elfo prepara o arco para mais uma caçada.");
                    System.out.println("Você sai da cidade, com seus pertences em rumo ao ");
                    System.out.println("deconhecido, com a certeza de que não há volta. Você");
                    System.out.println("se dirige para a Floresta não em busca de glória, mas");
                    System.out.println("de sentido na vida...tavez receba algo que não procura.");
                    System.out.println("Logo a frente, você observa algo se mexendo, um esqueleto...");
                    System.out.println("Você não acredita em seus olhos, mas o momento não é de vacilar,");
                    System.out.println("você precisa combater seus pesadelos.");
                    System.out.println("Um "+sk1.getNome()+" está te atacando, o que você faz?");
                    
                    Floresta floresta = new Floresta(sk1, heroi);
                    
                    floresta.iniciar();
                    
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
}
