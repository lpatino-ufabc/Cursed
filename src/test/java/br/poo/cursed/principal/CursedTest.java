package br.poo.cursed.principal;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import br.poo.cursed.mob.*;
import br.poo.cursed.npc.*;

public class CursedTest {
    
    @Test
    public void criandoHerois() {
        Ranger r1 = new Ranger(1.0,"m1",8.0,16.0,8.0,200.0,6.0,
                            "Armadura de Couro",8.0,"Arco Curto",500.0,0.0);

        Mage m1 = new Mage(1.0,"r1",8.0,8.0,26.0,180.0,6.0,
                                    "Robe",3.0,"Cajado",500.0,0.0);

        Priest p1 = new Priest(1.0,"p1",8.0,6.0,8.0,220.0,16.0,
                                    "Armadura de Placa",12.0,"Massa simples",500.0,0.0);

        Warrior w1 = new Warrior(1.0,"w1",18.0,6.0,10.0,300.0,4.0,
                                    "Armadura Completa",15.0,"Espada Longa",500.0,0.0);
        
        assertEquals(200.0, r1.getVida(), 1);
        assertEquals(180.0, m1.getVida(), 1);
        assertEquals(220.0, p1.getVida(), 1);
        assertEquals(300.0, w1.getVida(), 1);    
    }
    
    @Test
    public void criandoInimigos(){
        Skeletons sk1 = new Skeletons(1.0,"Ossada Viva",300.0,"Armadura Podre",3.0,
                    "Carniceiro",1.0,"","Espada Longa",300.0);            
        Zombies zo1 = new Zombies(1.0,"Corpo Ambulante",500.0,"Armadura Podre",3.0,
                "Carniceiro",1.0,"","Espada Longa",400.0);
        Gryphon gr1 = new Gryphon(1.0,"Grifo Prateado",700.0,"Penas de Prata",8.0,
                "",1.0,"Zeus","Garra de Prata",800.0);
        Minotaur mn1 = new Minotaur(1.0,"Minotauro",800.0,"Couraça Dura",9.0,
                "",1.0,"Ares","Machado de Guerra",900.0);
        Wyrm wm1 = new Wyrm(1.0,"Dragonete",600.0,"Escamas novas",8.0,
                "",10.0,"","",600.0);
        Drake dk1 = new Drake(1.0,"Dragao de Fogo",100.0,"Escamas Antigas",18.0,
                "",30.0,"","",1000.0);
        
        assertEquals(300.0, sk1.getVida(), 1);
        assertEquals(500.0, zo1.getVida(), 1);
        assertEquals(700.0, gr1.getVida(), 1);
        assertEquals(800.0, mn1.getVida(), 1);
        assertEquals(6000.0, wm1.getVida(), 1);
        assertEquals(3000.0, dk1.getVida(), 1);
    }
    
    @Test
    public void heroiAtacando(){
        //Teste executado em um inimigo simples escolhido
        // e um heroi escolhido como drive do teste.
        //Todos os demais inimigos possuem herança com a
        //classe abstrata Inimigo e possuem a mesma implementação
        //do método de levar dano.
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
        Drake dk1 = new Drake(1.0,"Dragao de Fogo",1000.0,"Escamas Antigas",18.0,
                "",30.0,"","",1000.0);
        Warrior w1 = new Warrior(1.0,"w1",18.0,6.0,10.0,300.0,4.0,
                                    "Armadura Completa",15.0,"Espada Longa",500.0,0.0);
        
        sk1.tomarDano(w1, "1");
        assertEquals(2712.0, sk1.getVida(), 1);
        zo1.tomarDano(w1, "1");
        assertEquals(4712.0, zo1.getVida(), 1);
        gr1.tomarDano(w1, "1");
        assertEquals(6712.0, gr1.getVida(), 1);
        mn1.tomarDano(w1, "1");
        assertEquals(7712.0, mn1.getVida(), 1);
        wm1.tomarDano(w1, "1");
        assertEquals(59712.0, wm1.getVida(), 1);
        dk1.tomarDano(w1, "1");
        assertEquals(29712.0, dk1.getVida(), 1);
        
        sk1.tomarDano(w1, "2");
        assertEquals(2496.0, sk1.getVida(), 1);
        zo1.tomarDano(w1, "2");
        assertEquals(4496.0, zo1.getVida(), 1);
        gr1.tomarDano(w1, "2");
        assertEquals(6496.0, gr1.getVida(), 1);
        mn1.tomarDano(w1, "2");
        assertEquals(7496.0, mn1.getVida(), 1);
        wm1.tomarDano(w1, "2");
        assertEquals(59496.0, wm1.getVida(), 1);
        dk1.tomarDano(w1, "2");
        assertEquals(29496.0, dk1.getVida(), 1);
        
        sk1.tomarDano(w1, "3");
        assertEquals(1992.0, sk1.getVida(), 1);
        zo1.tomarDano(w1, "3");
        assertEquals(3992.0, zo1.getVida(), 1);
        gr1.tomarDano(w1, "3");
        assertEquals(5992.0, gr1.getVida(), 1);
        mn1.tomarDano(w1, "3");
        assertEquals(6992.0, mn1.getVida(), 1);
        wm1.tomarDano(w1, "3");
        assertEquals(58992.0, wm1.getVida(), 1);
        dk1.tomarDano(w1, "3");
        assertEquals(28992.0, dk1.getVida(), 1);
        
        sk1.tomarDano(w1, "4");
        assertEquals(1272.0, sk1.getVida(), 1);
        zo1.tomarDano(w1, "4");
        assertEquals(3272.0, zo1.getVida(), 1);
        gr1.tomarDano(w1, "4");
        assertEquals(5272.0, gr1.getVida(), 1);
        mn1.tomarDano(w1, "4");
        assertEquals(6272.0, mn1.getVida(), 1);
        wm1.tomarDano(w1, "4");
        assertEquals(58272.0, wm1.getVida(), 1);
        dk1.tomarDano(w1, "4");
        assertEquals(28272.0, dk1.getVida(), 1);
        
        //Inimigos morrem corretamente, somente alguns
        //como prova. A vida de todos está decaindo
        //com os ataques e todos inimigos possuem
        //a mesma check de vida quando ela chega a zero.
        sk1.tomarDano(w1, "5");
        assertEquals(0.0, sk1.getVida(), 1);
        zo1.tomarDano(w1, "5");
        assertEquals(0.0, zo1.getVida(), 1);
        gr1.tomarDano(w1, "5");
        assertEquals(0.0, gr1.getVida(), 1);
        mn1.tomarDano(w1, "5");
        assertEquals(0.0, mn1.getVida(), 1);
        wm1.tomarDano(w1, "5");
        assertEquals(51792.0, wm1.getVida(), 1);
        dk1.tomarDano(w1, "5");
        assertEquals(21792.0, dk1.getVida(), 1);    
    }
    
    @Test
    public void inimigosAtacando(){
        //Teste executado em um heroi simples escolhido
        //Todos os demais herois possuem herança com a
        //classe abstrata Heroes e possuem a mesma implementação
        //do método de levar dano.
        Skeletons sk1 = new Skeletons(1.0,"Ossada Viva",300.0,"Armadura Podre",3.0,
                    "Carniceiro",1.0,"","Espada Longa",300.0);
        Ranger r1 = new Ranger(1.0,"m1",8.0,16.0,8.0,300.0,6.0,
                            "Armadura de Couro",8.0,"Arco Curto",500.0,0.0);

        Mage m1 = new Mage(1.0,"r1",8.0,8.0,26.0,300.0,6.0,
                                    "Robe",3.0,"Cajado",500.0,0.0);

        Priest p1 = new Priest(1.0,"p1",8.0,6.0,8.0,300.0,16.0,
                                    "Armadura de Placa",12.0,"Massa simples",500.0,0.0);

        Warrior w1 = new Warrior(1.0,"w1",18.0,6.0,10.0,300.0,4.0,
                                    "Armadura Completa",15.0,"Espada Longa",500.0,0.0);
        
        r1.tomarDano(sk1, "1");
        assertEquals(260.0, r1.getVida(), 1);
        m1.tomarDano(sk1, "1");
        assertEquals(260.0, m1.getVida(), 1);
        p1.tomarDano(sk1, "1");
        assertEquals(260.0, p1.getVida(), 1);
        w1.tomarDano(sk1, "1");
        assertEquals(260.0, w1.getVida(), 1);
        
        r1.tomarDano(sk1, "2");
        assertEquals(230.0, r1.getVida(), 1);
        m1.tomarDano(sk1, "2");
        assertEquals(230.0, m1.getVida(), 1);
        p1.tomarDano(sk1, "2");
        assertEquals(230.0, p1.getVida(), 1);
        w1.tomarDano(sk1, "2");
        assertEquals(230.0, w1.getVida(), 1);
        
        r1.tomarDano(sk1, "3");
        assertEquals(170.0, r1.getVida(), 1);
        m1.tomarDano(sk1, "3");
        assertEquals(170.0, m1.getVida(), 1);
        p1.tomarDano(sk1, "3");
        assertEquals(170.0, p1.getVida(), 1);
        w1.tomarDano(sk1, "3");
        assertEquals(170.0, w1.getVida(), 1);
        
        r1.tomarDano(sk1, "4");
        assertEquals(90.0, r1.getVida(), 1);
        m1.tomarDano(sk1, "4");
        assertEquals(90.0, m1.getVida(), 1);
        p1.tomarDano(sk1, "4");
        assertEquals(90.0, p1.getVida(), 1);
        w1.tomarDano(sk1, "4");
        assertEquals(90.0, w1.getVida(), 1);
        
        r1.tomarDano(sk1, "5");
        assertEquals(0.0, r1.getVida(), 1);
        m1.tomarDano(sk1, "5");
        assertEquals(0.0, m1.getVida(), 1);
        p1.tomarDano(sk1, "5");
        assertEquals(0.0, p1.getVida(), 1);
        w1.tomarDano(sk1, "5");
        assertEquals(0.0, w1.getVida(), 1);
    }
    
    @Test
    public void heroiCurando(){
        Mage m1 = new Mage(1.0,"r1",8.0,8.0,26.0,180.0,6.0,
                                    "Robe",3.0,"Cajado",500.0,0.0);

        Priest p1 = new Priest(1.0,"p1",8.0,6.0,8.0,220.0,16.0,
                                    "Armadura de Placa",12.0,"Massa simples",500.0,0.0);


        assertEquals(180.0, m1.getVida(), 1);
        assertEquals(220.0, p1.getVida(), 1);
        
        m1.curativo();
        p1.curativo();
        assertEquals(226.8, m1.getVida(), 1);
        assertEquals(501.6, p1.getVida(), 1);
        
        m1.rejuvenescer();
        p1.rejuvenescer();
        assertEquals(403.704, m1.getVida(), 1);
        assertEquals(2427.744, p1.getVida(), 1);
        
        m1.soproVida();
        p1.soproVida();
        assertEquals(928.5192, m1.getVida(), 1);
        assertEquals(17965.3056, p1.getVida(), 1);
        
        m1.rajadaVida();
        p1.rajadaVida();
        assertEquals(1857.0384, m1.getVida(), 1);
        assertEquals(35930.6112, p1.getVida(), 1);        
    }
    
    @Test
    public void inimigoCurando(){
        Skeletons sk1 = new Skeletons(1.0,"Ossada Viva",300.0,"Armadura Podre",3.0,
                    "Carniceiro",1.0,"","Espada Longa",300.0);            
        Zombies zo1 = new Zombies(1.0,"Corpo Ambulante",500.0,"Armadura Podre",3.0,
                "Carniceiro",1.0,"","Espada Longa",400.0);
        Gryphon gr1 = new Gryphon(1.0,"Grifo Prateado",700.0,"Penas de Prata",8.0,
                "",1.0,"Zeus","Garra de Prata",800.0);
        Minotaur mn1 = new Minotaur(1.0,"Minotauro",800.0,"Couraça Dura",9.0,
                "",1.0,"Ares","Machado de Guerra",900.0);
        Wyrm wm1 = new Wyrm(1.0,"Dragonete",600.0,"Escamas novas",8.0,
                "",10.0,"","",600.0);
        Drake dk1 = new Drake(1.0,"Dragao de Fogo",100.0,"Escamas Antigas",18.0,
                "",30.0,"","",1000.0);
        
        assertEquals(300.0, sk1.getVida(), 1);
        assertEquals(500.0, zo1.getVida(), 1);
        assertEquals(700.0, gr1.getVida(), 1);
        assertEquals(800.0, mn1.getVida(), 1);
        assertEquals(6000.0, wm1.getVida(), 1);
        assertEquals(3000.0, dk1.getVida(), 1);
        
        sk1.curativo();
        zo1.curativo();
        gr1.curativo();
        mn1.curativo();
        wm1.curativo();
        dk1.curativo();
        assertEquals(330.0, sk1.getVida(), 1);
        assertEquals(550.0, zo1.getVida(), 1);
        assertEquals(770.0, gr1.getVida(), 1);
        assertEquals(880.0, mn1.getVida(), 1);
        assertEquals(6600.0, wm1.getVida(), 1);
        assertEquals(3300.0, dk1.getVida(), 1);
        
        sk1.rajadaVida();
        zo1.rajadaVida();
        gr1.rajadaVida();
        mn1.rajadaVida();
        wm1.rajadaVida();
        dk1.rajadaVida();
        assertEquals(660.0, sk1.getVida(), 1);
        assertEquals(1100.0, zo1.getVida(), 1);
        assertEquals(1540.0, gr1.getVida(), 1);
        assertEquals(1760.0, mn1.getVida(), 1);
        assertEquals(13200.0, wm1.getVida(), 1);
        assertEquals(6600.0, dk1.getVida(), 1);
        
        sk1.soproVida();
        zo1.soproVida();
        gr1.soproVida();
        mn1.soproVida();
        wm1.soproVida();
        dk1.soproVida();
        assertEquals(990.0, sk1.getVida(), 1);
        assertEquals(1650.0, zo1.getVida(), 1);
        assertEquals(2310.0, gr1.getVida(), 1);
        assertEquals(2640.0, mn1.getVida(), 1);
        assertEquals(19140.0, wm1.getVida(), 1);
        assertEquals(9900.0, dk1.getVida(), 1);
        
        sk1.rajadaVida();
        zo1.rajadaVida();
        gr1.rajadaVida();
        mn1.rajadaVida();
        wm1.rajadaVida();
        dk1.rajadaVida();
        assertEquals(1980.0, sk1.getVida(), 1);
        assertEquals(3300.0, zo1.getVida(), 1);
        assertEquals(4620.0, gr1.getVida(), 1);
        assertEquals(5280.0, mn1.getVida(), 1);
        assertEquals(38280.0, wm1.getVida(), 1);
        assertEquals(19800.0, dk1.getVida(), 1);
    }
}
