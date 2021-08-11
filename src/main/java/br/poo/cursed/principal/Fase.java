package br.poo.cursed.principal;

import br.poo.cursed.mob.*;
import br.poo.cursed.npc.*;
import java.util.Scanner;
import java.util.ArrayList;

public class Fase {
    
    private static Scanner entrada;
    
    public static void main(String[] args){
        int opt_menu = -1, continuar, lutas = -1;
        double skckeckVida = 0.0, herocheckVida = 0.0;                        
        double skfinal = 10000.0, herofinal = 10000.0;
                        
        entrada = new Scanner(System.in);
        Skeletons sk1 = new Skeletons(1.0,"Ossada Viva",3000.0,"Armadura Podre",3.0,
                    "Carniceiro",1.0,"","Espada Longa",300.0);            
        Zombies zo1 = new Zombies(1.0,"Corpo Ambulante",5000.0,"Armadura Podre",3.0,
                "Carniceiro",1.0,"","Espada Longa",400.0);
        Gryphon gr1 = new Gryphon(1.0,"Grifo Prateado",7000.0,"Penas de Prata",8.0,
                "",1.0,"Zeus","Garra de Prata",800.0);
        Minotaur mn1 = new Minotaur(1.0,"Minotauro",8000.0,"Couraça Dura",9.0,
                "",1.0,"Ares","Machado de Guerra",900.0);
        Wyrm wm1 = new Wyrm(1.0,"Dragonete",6000.0,"Escamas novas",8.0,
                "",10.0,"","",600.0);
        Drake dk1 = new Drake(1.0,"Dragao de Fogo",10000.0,"Escamas Antigas",18.0,
                "",30.0,"","",1000.0);
        
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
                    System.out.println("Logo a frente, você observa algo se mexendo, um esqueleto...");
                    System.out.println("Você não acredita em seus olhos, mas o momento não é de vacilar,");
                    System.out.println("você precisa combater seus pesadelos.");
                    System.out.println("Um "+sk1.getNome()+" está te atacando, o que você faz?");
                    
                    while(lutas != 0){
                        lutas = menuLuta();
                        
                        switch(lutas){
                            case 1: {
                                System.out.println("Você ataca o "+sk1.getNome());
                                sk1.tomarDano(heroi, "1");
                                skckeckVida = sk1.getVida();
                                herocheckVida = heroi.getVida();
                                if(skckeckVida > 0 & herocheckVida > 0){
                                    heroi.tomarDano(sk1, "1");
                                    System.out.print("A vida do heroi é:" + herocheckVida);
                                    System.out.print("\n");
                                    System.out.print("A vida do "+ sk1.getNome() + " é: " + skckeckVida);
                                    System.out.print("\n");
                                }
                                else{
                                    skfinal = skckeckVida;
                                    herofinal = herocheckVida;
                                    lutas = 0;                                    
                                }
                                break;
                            }
                            case 2: {
                                System.out.println("Você ataca o "+sk1.getNome());
                                sk1.tomarDano(heroi, "2");
                                skckeckVida = sk1.getVida();
                                herocheckVida = heroi.getVida();
                                if(skckeckVida > 0 & herocheckVida > 0){
                                    heroi.tomarDano(sk1, "1");
                                    System.out.print("A vida do heroi é:" + herocheckVida);
                                    System.out.print("\n");
                                    System.out.print("A vida do "+ sk1.getNome() + " é: " + skckeckVida);
                                    System.out.print("\n");
                                }
                                else{
                                    skfinal = skckeckVida;
                                    herofinal = herocheckVida;
                                    lutas = 0;                                    
                                }
                                break;
                            }
                            case 3: {
                                System.out.println("Você ataca o "+sk1.getNome());
                                sk1.tomarDano(heroi, "3");
                                skckeckVida = sk1.getVida();
                                herocheckVida = heroi.getVida();
                                if(skckeckVida > 0 & herocheckVida > 0){
                                    heroi.tomarDano(sk1, "1");
                                    System.out.print("A vida do heroi é:" + herocheckVida);
                                    System.out.print("\n");
                                    System.out.print("A vida do "+ sk1.getNome() + " é: " + skckeckVida);
                                    System.out.print("\n");
                                }
                                else{
                                    skfinal = skckeckVida;
                                    herofinal = herocheckVida;
                                    lutas = 0;                                    
                                }
                                break;
                            }
                            case 4: {
                                System.out.println("Você ataca o "+sk1.getNome());
                                sk1.tomarDano(heroi, "4");
                                skckeckVida = sk1.getVida();
                                herocheckVida = heroi.getVida();
                                if(skckeckVida > 0 & herocheckVida > 0){
                                    heroi.tomarDano(sk1, "1");
                                    System.out.print("A vida do heroi é:" + herocheckVida);
                                    System.out.print("\n");
                                    System.out.print("A vida do "+ sk1.getNome() + " é: " + skckeckVida);
                                    System.out.print("\n");
                                }
                                else{
                                    skfinal = skckeckVida;
                                    herofinal = herocheckVida;
                                    lutas = 0;
                                }
                                
                                break;
                            }
                            case 5: {
                                System.out.println("Você ataca o "+sk1.getNome());
                                sk1.tomarDano(heroi, "4");
                                skckeckVida = sk1.getVida();
                                herocheckVida = heroi.getVida();
                                if(skckeckVida > 0 & herocheckVida > 0){
                                    heroi.tomarDano(sk1, "1");
                                    System.out.print("A vida do heroi é:" + herocheckVida);
                                    System.out.print("\n");
                                    System.out.print("A vida do "+ sk1.getNome() + " é: " + skckeckVida);
                                    System.out.print("\n");
                                }
                                else{
                                    skfinal = skckeckVida;
                                    herofinal = herocheckVida;
                                    lutas = 0;                                    
                                }
                                break;
                            }
                            default: {
                                System.out.println("Opção " + lutas + " inválida.");
                                break;
                            }
                        }
                        
                        
                        if(herofinal <= 0.0){
                            System.out.println("Voce perdeu!");                            
                        }
                        if(herofinal > 0.0 & skfinal <= 0){
                            System.out.println("O heroi conseguiu vencer seus pesadelos porém, ");                            
                            System.out.println("existem segredos mais sombrios pela frente.");                            
                        }
                        else{
                            System.out.println("A luta continua!!!");
                        }                        
                    }
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
                    System.out.println("Logo a frente, você observa algo se mexendo, um esqueleto...");
                    System.out.println("Você não acredita em seus olhos, mas o momento não é de vacilar,");
                    System.out.println("você precisa combater seus pesadelos.");
                    System.out.println("Um "+sk1.getNome()+" está te atacando, o que você faz?");
                    
                    while(lutas != 0){
                        lutas = menuLuta();
                        
                        switch(lutas){
                            case 1: {
                                System.out.println("Você ataca o "+sk1.getNome());
                                sk1.tomarDano(heroi, "1");
                                skckeckVida = sk1.getVida();
                                herocheckVida = heroi.getVida();
                                if(skckeckVida > 0 & herocheckVida > 0){
                                    heroi.tomarDano(sk1, "1");
                                    System.out.print("A vida do heroi é:" + herocheckVida);
                                    System.out.print("\n");
                                    System.out.print("A vida do "+ sk1.getNome() + " é: " + skckeckVida);
                                    System.out.print("\n");
                                }
                                else{
                                    skfinal = skckeckVida;
                                    herofinal = herocheckVida;
                                    lutas = 0;                                    
                                }
                                break;
                            }
                            case 2: {
                                System.out.println("Você ataca o "+sk1.getNome());
                                sk1.tomarDano(heroi, "2");
                                skckeckVida = sk1.getVida();
                                herocheckVida = heroi.getVida();
                                if(skckeckVida > 0 & herocheckVida > 0){
                                    heroi.tomarDano(sk1, "1");
                                    System.out.print("A vida do heroi é:" + herocheckVida);
                                    System.out.print("\n");
                                    System.out.print("A vida do "+ sk1.getNome() + " é: " + skckeckVida);
                                    System.out.print("\n");
                                }
                                else{
                                    skfinal = skckeckVida;
                                    herofinal = herocheckVida;
                                    lutas = 0;                                    
                                }
                                break;
                            }
                            case 3: {
                                System.out.println("Você ataca o "+sk1.getNome());
                                sk1.tomarDano(heroi, "3");
                                skckeckVida = sk1.getVida();
                                herocheckVida = heroi.getVida();
                                if(skckeckVida > 0 & herocheckVida > 0){
                                    heroi.tomarDano(sk1, "1");
                                    System.out.print("A vida do heroi é:" + herocheckVida);
                                    System.out.print("\n");
                                    System.out.print("A vida do "+ sk1.getNome() + " é: " + skckeckVida);
                                    System.out.print("\n");
                                }
                                else{
                                    skfinal = skckeckVida;
                                    herofinal = herocheckVida;
                                    lutas = 0;                                    
                                }
                                break;
                            }
                            case 4: {
                                System.out.println("Você ataca o "+sk1.getNome());
                                sk1.tomarDano(heroi, "4");
                                skckeckVida = sk1.getVida();
                                herocheckVida = heroi.getVida();
                                if(skckeckVida > 0 & herocheckVida > 0){
                                    heroi.tomarDano(sk1, "1");
                                    System.out.print("A vida do heroi é:" + herocheckVida);
                                    System.out.print("\n");
                                    System.out.print("A vida do "+ sk1.getNome() + " é: " + skckeckVida);
                                    System.out.print("\n");
                                }
                                else{
                                    skfinal = skckeckVida;
                                    herofinal = herocheckVida;
                                    lutas = 0;
                                }
                                
                                break;
                            }
                            case 5: {
                                System.out.println("Você ataca o "+sk1.getNome());
                                sk1.tomarDano(heroi, "4");
                                skckeckVida = sk1.getVida();
                                herocheckVida = heroi.getVida();
                                if(skckeckVida > 0 & herocheckVida > 0){
                                    heroi.tomarDano(sk1, "1");
                                    System.out.print("A vida do heroi é:" + herocheckVida);
                                    System.out.print("\n");
                                    System.out.print("A vida do "+ sk1.getNome() + " é: " + skckeckVida);
                                    System.out.print("\n");
                                }
                                else{
                                    skfinal = skckeckVida;
                                    herofinal = herocheckVida;
                                    lutas = 0;                                    
                                }
                                break;
                            }
                            default: {
                                System.out.println("Opção " + lutas + " inválida.");
                                break;
                            }
                        }
                        
                        
                        if(herofinal <= 0.0){
                            System.out.println("Voce perdeu!");                            
                        }
                        if(herofinal > 0.0 & skfinal <= 0){
                            System.out.println("O heroi conseguiu vencer seus pesadelos porém, ");                            
                            System.out.println("existem segredos mais sombrios pela frente.");                            
                        }
                        else{
                            System.out.println("A luta continua!!!");
                        }                        
                    }
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
                    System.out.println("Logo a frente, você observa algo se mexendo, um esqueleto...");
                    System.out.println("Você não acredita em seus olhos, mas o momento não é de vacilar,");
                    System.out.println("você precisa combater seus pesadelos.");
                    System.out.println("Um "+sk1.getNome()+" está te atacando, o que você faz?");
                    
                    while(lutas != 0){
                        lutas = menuLuta();
                        
                        switch(lutas){
                            case 1: {
                                System.out.println("Você ataca o "+sk1.getNome());
                                sk1.tomarDano(heroi, "1");
                                skckeckVida = sk1.getVida();
                                herocheckVida = heroi.getVida();
                                if(skckeckVida > 0 & herocheckVida > 0){
                                    heroi.tomarDano(sk1, "1");
                                    System.out.print("A vida do heroi é:" + herocheckVida);
                                    System.out.print("\n");
                                    System.out.print("A vida do "+ sk1.getNome() + " é: " + skckeckVida);
                                    System.out.print("\n");
                                }
                                else{
                                    skfinal = skckeckVida;
                                    herofinal = herocheckVida;
                                    lutas = 0;                                    
                                }
                                break;
                            }
                            case 2: {
                                System.out.println("Você ataca o "+sk1.getNome());
                                sk1.tomarDano(heroi, "2");
                                skckeckVida = sk1.getVida();
                                herocheckVida = heroi.getVida();
                                if(skckeckVida > 0 & herocheckVida > 0){
                                    heroi.tomarDano(sk1, "1");
                                    System.out.print("A vida do heroi é:" + herocheckVida);
                                    System.out.print("\n");
                                    System.out.print("A vida do "+ sk1.getNome() + " é: " + skckeckVida);
                                    System.out.print("\n");
                                }
                                else{
                                    skfinal = skckeckVida;
                                    herofinal = herocheckVida;
                                    lutas = 0;                                    
                                }
                                break;
                            }
                            case 3: {
                                System.out.println("Você ataca o "+sk1.getNome());
                                sk1.tomarDano(heroi, "3");
                                skckeckVida = sk1.getVida();
                                herocheckVida = heroi.getVida();
                                if(skckeckVida > 0 & herocheckVida > 0){
                                    heroi.tomarDano(sk1, "1");
                                    System.out.print("A vida do heroi é:" + herocheckVida);
                                    System.out.print("\n");
                                    System.out.print("A vida do "+ sk1.getNome() + " é: " + skckeckVida);
                                    System.out.print("\n");
                                }
                                else{
                                    skfinal = skckeckVida;
                                    herofinal = herocheckVida;
                                    lutas = 0;                                    
                                }
                                break;
                            }
                            case 4: {
                                System.out.println("Você ataca o "+sk1.getNome());
                                sk1.tomarDano(heroi, "4");
                                skckeckVida = sk1.getVida();
                                herocheckVida = heroi.getVida();
                                if(skckeckVida > 0 & herocheckVida > 0){
                                    heroi.tomarDano(sk1, "1");
                                    System.out.print("A vida do heroi é:" + herocheckVida);
                                    System.out.print("\n");
                                    System.out.print("A vida do "+ sk1.getNome() + " é: " + skckeckVida);
                                    System.out.print("\n");
                                }
                                else{
                                    skfinal = skckeckVida;
                                    herofinal = herocheckVida;
                                    lutas = 0;
                                }
                                
                                break;
                            }
                            case 5: {
                                System.out.println("Você ataca o "+sk1.getNome());
                                sk1.tomarDano(heroi, "4");
                                skckeckVida = sk1.getVida();
                                herocheckVida = heroi.getVida();
                                if(skckeckVida > 0 & herocheckVida > 0){
                                    heroi.tomarDano(sk1, "1");
                                    System.out.print("A vida do heroi é:" + herocheckVida);
                                    System.out.print("\n");
                                    System.out.print("A vida do "+ sk1.getNome() + " é: " + skckeckVida);
                                    System.out.print("\n");
                                }
                                else{
                                    skfinal = skckeckVida;
                                    herofinal = herocheckVida;
                                    lutas = 0;                                    
                                }
                                break;
                            }
                            default: {
                                System.out.println("Opção " + lutas + " inválida.");
                                break;
                            }
                        }
                        
                        
                        if(herofinal <= 0.0){
                            System.out.println("Voce perdeu!");                            
                        }
                        if(herofinal > 0.0 & skfinal <= 0){
                            System.out.println("O heroi conseguiu vencer seus pesadelos porém, ");                            
                            System.out.println("existem segredos mais sombrios pela frente.");                            
                        }
                        else{
                            System.out.println("A luta continua!!!");
                        }                        
                    }
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
                    System.out.println("Logo a frente, você observa algo se mexendo, um esqueleto...");
                    System.out.println("Você não acredita em seus olhos, mas o momento não é de vacilar,");
                    System.out.println("você precisa combater seus pesadelos.");
                    System.out.println("Um "+sk1.getNome()+" está te atacando, o que você faz?");
                    
                    while(lutas != 0){
                        lutas = menuLuta();
                        
                        switch(lutas){
                            case 1: {
                                System.out.println("Você ataca o "+sk1.getNome());
                                sk1.tomarDano(heroi, "1");
                                skckeckVida = sk1.getVida();
                                herocheckVida = heroi.getVida();
                                if(skckeckVida > 0 & herocheckVida > 0){
                                    heroi.tomarDano(sk1, "1");
                                    System.out.print("A vida do heroi é:" + herocheckVida);
                                    System.out.print("\n");
                                    System.out.print("A vida do "+ sk1.getNome() + " é: " + skckeckVida);
                                    System.out.print("\n");
                                }
                                else{
                                    skfinal = skckeckVida;
                                    herofinal = herocheckVida;
                                    lutas = 0;                                    
                                }
                                break;
                            }
                            case 2: {
                                System.out.println("Você ataca o "+sk1.getNome());
                                sk1.tomarDano(heroi, "2");
                                skckeckVida = sk1.getVida();
                                herocheckVida = heroi.getVida();
                                if(skckeckVida > 0 & herocheckVida > 0){
                                    heroi.tomarDano(sk1, "1");
                                    System.out.print("A vida do heroi é:" + herocheckVida);
                                    System.out.print("\n");
                                    System.out.print("A vida do "+ sk1.getNome() + " é: " + skckeckVida);
                                    System.out.print("\n");
                                }
                                else{
                                    skfinal = skckeckVida;
                                    herofinal = herocheckVida;
                                    lutas = 0;                                    
                                }
                                break;
                            }
                            case 3: {
                                System.out.println("Você ataca o "+sk1.getNome());
                                sk1.tomarDano(heroi, "3");
                                skckeckVida = sk1.getVida();
                                herocheckVida = heroi.getVida();
                                if(skckeckVida > 0 & herocheckVida > 0){
                                    heroi.tomarDano(sk1, "1");
                                    System.out.print("A vida do heroi é:" + herocheckVida);
                                    System.out.print("\n");
                                    System.out.print("A vida do "+ sk1.getNome() + " é: " + skckeckVida);
                                    System.out.print("\n");
                                }
                                else{
                                    skfinal = skckeckVida;
                                    herofinal = herocheckVida;
                                    lutas = 0;                                    
                                }
                                break;
                            }
                            case 4: {
                                System.out.println("Você ataca o "+sk1.getNome());
                                sk1.tomarDano(heroi, "4");
                                skckeckVida = sk1.getVida();
                                herocheckVida = heroi.getVida();
                                if(skckeckVida > 0 & herocheckVida > 0){
                                    heroi.tomarDano(sk1, "1");
                                    System.out.print("A vida do heroi é:" + herocheckVida);
                                    System.out.print("\n");
                                    System.out.print("A vida do "+ sk1.getNome() + " é: " + skckeckVida);
                                    System.out.print("\n");
                                }
                                else{
                                    skfinal = skckeckVida;
                                    herofinal = herocheckVida;
                                    lutas = 0;
                                }
                                
                                break;
                            }
                            case 5: {
                                System.out.println("Você ataca o "+sk1.getNome());
                                sk1.tomarDano(heroi, "4");
                                skckeckVida = sk1.getVida();
                                herocheckVida = heroi.getVida();
                                if(skckeckVida > 0 & herocheckVida > 0){
                                    heroi.tomarDano(sk1, "1");
                                    System.out.print("A vida do heroi é:" + herocheckVida);
                                    System.out.print("\n");
                                    System.out.print("A vida do "+ sk1.getNome() + " é: " + skckeckVida);
                                    System.out.print("\n");
                                }
                                else{
                                    skfinal = skckeckVida;
                                    herofinal = herocheckVida;
                                    lutas = 0;                                    
                                }
                                break;
                            }
                            default: {
                                System.out.println("Opção " + lutas + " inválida.");
                                break;
                            }
                        }
                        
                        
                        if(herofinal <= 0.0){
                            System.out.println("Voce perdeu!");                            
                        }
                        if(herofinal > 0.0 & skfinal <= 0){
                            System.out.println("O heroi conseguiu vencer seus pesadelos porém, ");                            
                            System.out.println("existem segredos mais sombrios pela frente.");                            
                        }
                        else{
                            System.out.println("A luta continua!!!");
                        }                        
                    }
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
