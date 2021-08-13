package br.poo.cursed.principal;

import br.poo.cursed.implementaespecial.curaMob;
import br.poo.cursed.implementaespecial.curaNPC;
import br.poo.cursed.implementaespecial.especialDragao;
import br.poo.cursed.implementaespecial.especialMeele;
import br.poo.cursed.implementaespecial.especialMitico;
import br.poo.cursed.implementaespecial.especialRanged;
import br.poo.cursed.implementaespecial.especialUndead;
import br.poo.cursed.implementaespecial.golpeDragao;
import br.poo.cursed.implementaespecial.golpeMeele;
import br.poo.cursed.implementaespecial.golpeMitico;
import br.poo.cursed.implementaespecial.golpeRanged;
import br.poo.cursed.implementaespecial.golpeUndead;
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
                            "Armadura de Couro",8.0,"Arco Curto",500.0,0.0,
                            new especialRanged(), new curaNPC(), new golpeRanged());

        Mage m1 = new Mage(1.0,"r1",8.0,8.0,26.0,180.0,6.0,
                            "Robe",3.0,"Cajado",500.0,0.0,
                            new especialRanged(), new curaNPC(), new golpeRanged());

        Priest p1 = new Priest(1.0,"p1",8.0,6.0,8.0,220.0,16.0,
                            "Armadura de Placa",12.0,"Massa simples",500.0,0.0,
                            new especialMeele(), new curaNPC(), new golpeMeele());
        
        Warrior w1 = new Warrior(1.0,"w1",18.0,6.0,10.0,300.0,4.0,
                            "Armadura Completa",15.0,"Espada Longa",500.0,0.0,
                            new especialMeele(), new curaNPC(), new golpeMeele());
        
        assertEquals(200.0, r1.getVida(), 1);
        assertEquals(180.0, m1.getVida(), 1);
        assertEquals(220.0, p1.getVida(), 1);
        assertEquals(300.0, w1.getVida(), 1);    
    }
    
    @Test
    public void criandoInimigos(){
        Skeletons sk1 = new Skeletons(1.0,"Ossada Viva",300.0,"Armadura Podre",3.0,
                    "Carniceiro",1.0,"","Espada Longa",300.0, new especialUndead(),
                    new curaMob(), new golpeUndead());            
        Zombies zo1 = new Zombies(1.0,"Corpo Ambulante",500.0,"Armadura Podre",3.0,
                "Carniceiro",1.0,"","Espada Longa",400.0, new especialUndead(),
                new curaMob(), new golpeUndead());
        Gryphon gr1 = new Gryphon(1.0,"Grifo Prateado",700.0,"Penas de Prata",8.0,
                "",1.0,"Zeus","Garra de Prata",800.0, new especialMitico(),
                new curaMob(), new golpeMitico());
        Minotaur mn1 = new Minotaur(1.0,"Minotauro",800.0,"Couraça Dura",9.0,
                "",1.0,"Ares","Machado de Guerra",900.0, new especialMitico(),
                new curaMob(), new golpeMitico());
        Wyrm wm1 = new Wyrm(1.0,"Dragonete",600.0,"Escamas novas",8.0,
                "",10.0,"","",600.0, new especialDragao(),
                new curaMob(), new golpeDragao());
        Drake dk1 = new Drake(1.0,"Dragao de Fogo",1000.0,"Escamas Antigas",18.0,
                "",30.0,"","",1000.0, new especialDragao(),
                new curaMob(), new golpeDragao());
        
        assertEquals(300.0, sk1.getVida(), 1);
        assertEquals(500.0, zo1.getVida(), 1);
        assertEquals(700.0, gr1.getVida(), 1);
        assertEquals(800.0, mn1.getVida(), 1);
        assertEquals(6000.0, wm1.getVida(), 1);
        assertEquals(30000.0, dk1.getVida(), 1);
    }
    
    @Test
    public void heroiAtacando(){
        //Teste executado em um inimigo simples escolhido
        // e um heroi escolhido como drive do teste.
        //Todos os demais inimigos possuem herança com a
        //classe abstrata Inimigo e possuem a mesma implementação
        //do método de levar dano.
        Skeletons sk1 = new Skeletons(4.0,"Ossada Viva",3000.0,"Armadura Podre",3.0,
                    "Carniceiro",2.0,"","Espada Longa",300.0, new especialUndead(),
                    new curaMob(), new golpeUndead());          
        Zombies zo1 = new Zombies(4.0,"Corpo Ambulante",3000.0,"Armadura Podre",3.0,
                "Carniceiro",2.0,"","Espada Longa",400.0, new especialUndead(),
                new curaMob(), new golpeUndead()); 
        Gryphon gr1 = new Gryphon(4.0,"Grifo Prateado",4000.0,"Penas de Prata",8.0,
                "",2.0,"Zeus","Garra de Prata",800.0, new especialMitico(),
                new curaMob(), new golpeMitico());
        Minotaur mn1 = new Minotaur(4.0,"Minotauro",4000.0,"Couraça Dura",9.0,
                "",2.0,"Ares","Machado de Guerra",900.0, new especialMitico(),
                new curaMob(), new golpeMitico());
        Wyrm wm1 = new Wyrm(2.0,"Dragonete",6000.0,"Escamas novas",8.0,
                "",10.0,"","",600.0, new especialDragao(),
                new curaMob(), new golpeDragao());
        Drake dk1 = new Drake(1.0,"Dragao de Fogo",10000.0,"Escamas Antigas",18.0,
                "",30.0,"","",1000.0, new especialDragao(),
                new curaMob(), new golpeDragao());
        Warrior w1 = new Warrior(1.0,"w1",18.0,6.0,10.0,300.0,4.0,
                            "Armadura Completa",15.0,"Espada Longa",500.0,0.0,
                            new especialMeele(), new curaNPC(), new golpeMeele());
        
        sk1.tomarDano(w1, "1");
        assertEquals(22560.0, sk1.getVida(), 1);
        zo1.tomarDano(w1, "1");
        assertEquals(22560.0, zo1.getVida(), 1);
        gr1.tomarDano(w1, "1");
        assertEquals(30560.0, gr1.getVida(), 1);
        mn1.tomarDano(w1, "1");
        assertEquals(30560.0, mn1.getVida(), 1);
        wm1.tomarDano(w1, "1");
        assertEquals(118560.0, wm1.getVida(), 1);
        dk1.tomarDano(w1, "1");
        assertEquals(298560.0, dk1.getVida(), 1);
        
        sk1.tomarDano(w1, "2");
        assertEquals(21480.0, sk1.getVida(), 1);
        zo1.tomarDano(w1, "2");
        assertEquals(21480.0, zo1.getVida(), 1);
        gr1.tomarDano(w1, "2");
        assertEquals(29480.0, gr1.getVida(), 1);
        mn1.tomarDano(w1, "2");
        assertEquals(29480.0, mn1.getVida(), 1);
        wm1.tomarDano(w1, "2");
        assertEquals(117480.0, wm1.getVida(), 1);
        dk1.tomarDano(w1, "2");
        assertEquals(297480.0, dk1.getVida(), 1);
        
        sk1.tomarDano(w1, "3");
        assertEquals(18960.0, sk1.getVida(), 1);
        zo1.tomarDano(w1, "3");
        assertEquals(18960.0, zo1.getVida(), 1);
        gr1.tomarDano(w1, "3");
        assertEquals(26960.0, gr1.getVida(), 1);
        mn1.tomarDano(w1, "3");
        assertEquals(26960.0, mn1.getVida(), 1);
        wm1.tomarDano(w1, "3");
        assertEquals(114960.0, wm1.getVida(), 1);
        dk1.tomarDano(w1, "3");
        assertEquals(294960.0, dk1.getVida(), 1);
        
        sk1.tomarDano(w1, "4");
        assertEquals(15360.0, sk1.getVida(), 1);
        zo1.tomarDano(w1, "4");
        assertEquals(15360.0, zo1.getVida(), 1);
        gr1.tomarDano(w1, "4");
        assertEquals(23360.0, gr1.getVida(), 1);
        mn1.tomarDano(w1, "4");
        assertEquals(23360.0, mn1.getVida(), 1);
        wm1.tomarDano(w1, "4");
        assertEquals(111360.0, wm1.getVida(), 1);
        dk1.tomarDano(w1, "4");
        assertEquals(291360.0, dk1.getVida(), 1);
        
        //Inimigos morrem corretamente, somente alguns
        //como prova. A vida de todos está decaindo
        //com os ataques e todos inimigos possuem
        //a mesma check de vida quando ela chega a zero.
        sk1.tomarDano(w1, "5");
        sk1.tomarDano(w1, "5");
        sk1.tomarDano(w1, "5");
        sk1.tomarDano(w1, "5");
        sk1.tomarDano(w1, "5");
        assertEquals(0.0, sk1.getVida(), 1);
        zo1.tomarDano(w1, "5");
        zo1.tomarDano(w1, "5");
        zo1.tomarDano(w1, "5");
        zo1.tomarDano(w1, "5");
        zo1.tomarDano(w1, "5");
        assertEquals(0.0, zo1.getVida(), 1);
        gr1.tomarDano(w1, "5");
        gr1.tomarDano(w1, "5");
        gr1.tomarDano(w1, "5");
        gr1.tomarDano(w1, "5");
        gr1.tomarDano(w1, "5");
        gr1.tomarDano(w1, "5");
        assertEquals(0.0, gr1.getVida(), 1);
        mn1.tomarDano(w1, "5");
        mn1.tomarDano(w1, "5");
        mn1.tomarDano(w1, "5");
        mn1.tomarDano(w1, "5");
        mn1.tomarDano(w1, "5");
        mn1.tomarDano(w1, "5");
        assertEquals(0.0, mn1.getVida(), 1);
        //alguns são bosses
        wm1.tomarDano(w1, "5");
        wm1.tomarDano(w1, "5");
        wm1.tomarDano(w1, "5");
        wm1.tomarDano(w1, "5");
        wm1.tomarDano(w1, "5");
        wm1.tomarDano(w1, "5");
        wm1.tomarDano(w1, "5");
        wm1.tomarDano(w1, "5");
        wm1.tomarDano(w1, "5");
        wm1.tomarDano(w1, "5");
        wm1.tomarDano(w1, "5");
        wm1.tomarDano(w1, "5");
        wm1.tomarDano(w1, "5");
        wm1.tomarDano(w1, "5");
        wm1.tomarDano(w1, "5");
        wm1.tomarDano(w1, "5");
        wm1.tomarDano(w1, "5");
        wm1.tomarDano(w1, "5");
        assertEquals(33600.0, wm1.getVida(), 1);
        dk1.tomarDano(w1, "5");
        dk1.tomarDano(w1, "5");
        dk1.tomarDano(w1, "5");
        dk1.tomarDano(w1, "5");
        dk1.tomarDano(w1, "5");
        dk1.tomarDano(w1, "5");
        dk1.tomarDano(w1, "5");
        dk1.tomarDano(w1, "5");
        dk1.tomarDano(w1, "5");
        dk1.tomarDano(w1, "5");
        dk1.tomarDano(w1, "5");
        dk1.tomarDano(w1, "5");
        dk1.tomarDano(w1, "5");
        dk1.tomarDano(w1, "5");
        dk1.tomarDano(w1, "5");
        dk1.tomarDano(w1, "5");
        dk1.tomarDano(w1, "5");
        dk1.tomarDano(w1, "5");
        dk1.tomarDano(w1, "5");
        dk1.tomarDano(w1, "5");
        dk1.tomarDano(w1, "5");
        dk1.tomarDano(w1, "5");
        dk1.tomarDano(w1, "5");
        dk1.tomarDano(w1, "5");
        dk1.tomarDano(w1, "5");
        assertEquals(183360.0, dk1.getVida(), 1);    
    }
    
    @Test
    public void inimigosAtacando(){
        //Teste executado em um heroi simples escolhido
        //Todos os demais herois possuem herança com a
        //classe abstrata Heroes e possuem a mesma implementação
        //do método de levar dano.
        Skeletons sk1 = new Skeletons(2.0,"Ossada Viva",250.0,"Armadura Podre",1.0,
                    "Carniceiro",1.0,"","Espada Longa",300.0, new especialUndead(),
                    new curaMob(), new golpeUndead());         
        Ranger r1 = new Ranger(1.0,"m1",8.0,16.0,8.0,1200.0,6.0,
                            "Armadura de Couro",8.0,"Arco Curto",500.0,0.0,
                            new especialRanged(), new curaNPC(), new golpeRanged());

        Mage m1 = new Mage(1.0,"r1",8.0,8.0,26.0,1200.0,6.0,
                            "Robe",3.0,"Cajado",500.0,0.0,
                            new especialRanged(), new curaNPC(), new golpeRanged());

        Priest p1 = new Priest(1.0,"p1",8.0,6.0,8.0,1200.0,16.0,
                            "Armadura de Placa",12.0,"Massa simples",500.0,0.0,
                            new especialMeele(), new curaNPC(), new golpeMeele());

        Warrior w1 = new Warrior(1.0,"w1",18.0,6.0,10.0,1200.0,4.0,
                            "Armadura Completa",15.0,"Espada Longa",500.0,0.0,
                            new especialMeele(), new curaNPC(), new golpeMeele());
        
        r1.tomarDano(sk1, "1");
        assertEquals(1164.0, r1.getVida(), 1);
        m1.tomarDano(sk1, "1");
        assertEquals(1164.0, m1.getVida(), 1);
        p1.tomarDano(sk1, "1");
        assertEquals(1164.0, p1.getVida(), 1);
        w1.tomarDano(sk1, "1");
        assertEquals(1164.0, w1.getVida(), 1);
        
        r1.tomarDano(sk1, "2");
        assertEquals(1137.0, r1.getVida(), 1);
        m1.tomarDano(sk1, "2");
        assertEquals(1137.0, m1.getVida(), 1);
        p1.tomarDano(sk1, "2");
        assertEquals(1137.0, p1.getVida(), 1);
        w1.tomarDano(sk1, "2");
        assertEquals(1137.0, w1.getVida(), 1);
        
        r1.tomarDano(sk1, "3");
        assertEquals(1083.0, r1.getVida(), 1);
        m1.tomarDano(sk1, "3");
        assertEquals(1083.0, m1.getVida(), 1);
        p1.tomarDano(sk1, "3");
        assertEquals(1083.0, p1.getVida(), 1);
        w1.tomarDano(sk1, "3");
        assertEquals(1083.0, w1.getVida(), 1);
        
        r1.tomarDano(sk1, "4");
        assertEquals(1011.0, r1.getVida(), 1);
        m1.tomarDano(sk1, "4");
        assertEquals(1011.0, m1.getVida(), 1);
        p1.tomarDano(sk1, "4");
        assertEquals(1011.0, p1.getVida(), 1);
        w1.tomarDano(sk1, "4");
        assertEquals(1011.0, w1.getVida(), 1);
        
        r1.tomarDano(sk1, "5");
        assertEquals(927.0, r1.getVida(), 1);
        m1.tomarDano(sk1, "5");
        assertEquals(927.0, m1.getVida(), 1);
        p1.tomarDano(sk1, "5");
        assertEquals(927.0, p1.getVida(), 1);
        w1.tomarDano(sk1, "5");
        assertEquals(927.0, w1.getVida(), 1);
        
        r1.tomarDano(sk1, "6");
        assertEquals(426.0, r1.getVida(), 1);
        m1.tomarDano(sk1, "6");
        assertEquals(426.0, m1.getVida(), 1);
        p1.tomarDano(sk1, "6");
        assertEquals(426.0, p1.getVida(), 1);
        w1.tomarDano(sk1, "6");
        assertEquals(426.0, w1.getVida(), 1);
        
        //Morrendo para o especial Ultimate.
        r1.tomarDano(sk1, "7");
        assertEquals(0.0, r1.getVida(), 1);
        m1.tomarDano(sk1, "7");
        assertEquals(0.0, m1.getVida(), 1);
        p1.tomarDano(sk1, "7");
        assertEquals(0.0, p1.getVida(), 1);
        w1.tomarDano(sk1, "7");
        assertEquals(0.0, w1.getVida(), 1);
    }
    
    @Test
    public void heroiCurando(){
        Ranger r1 = new Ranger(1.0,"m1",8.0,16.0,8.0,1200.0,6.0,
                            "Armadura de Couro",8.0,"Arco Curto",500.0,0.0,
                            new especialRanged(), new curaNPC(), new golpeRanged());

        Mage m1 = new Mage(1.0,"r1",8.0,8.0,26.0,1200.0,6.0,
                            "Robe",3.0,"Cajado",500.0,0.0,
                            new especialRanged(), new curaNPC(), new golpeRanged());

        Priest p1 = new Priest(1.0,"p1",8.0,6.0,8.0,1200.0,16.0,
                            "Armadura de Placa",12.0,"Massa simples",500.0,0.0,
                            new especialMeele(), new curaNPC(), new golpeMeele());

        Warrior w1 = new Warrior(1.0,"w1",18.0,6.0,10.0,1200.0,4.0,
                            "Armadura Completa",15.0,"Espada Longa",500.0,0.0,
                            new especialMeele(), new curaNPC(), new golpeMeele());


        assertEquals(1200.0, r1.getVida(), 1);
        assertEquals(1200.0, m1.getVida(), 1);
        assertEquals(1200.0, p1.getVida(), 1);
        assertEquals(1200.0, w1.getVida(), 1);
        
        r1.setVida(r1.rejuvenescer(r1.getVida()));
        m1.setVida(m1.rejuvenescer(m1.getVida()));
        p1.setVida(p1.rejuvenescer(p1.getVida()));
        w1.setVida(w1.rejuvenescer(w1.getVida()));
        assertEquals(1800.0, r1.getVida(), 1);
        assertEquals(1800.0, m1.getVida(), 1);
        assertEquals(1800.0, p1.getVida(), 1);
        assertEquals(1800.0, w1.getVida(), 1);
        
        r1.setVida(r1.revigorar(r1.getVida()));
        m1.setVida(m1.revigorar(m1.getVida()));
        p1.setVida(p1.revigorar(p1.getVida()));
        w1.setVida(w1.revigorar(w1.getVida())); 
        assertEquals(2340.0, r1.getVida(), 1);
        assertEquals(2340.0, m1.getVida(), 1);
        assertEquals(2340.0, p1.getVida(), 1);
        assertEquals(2340.0, w1.getVida(), 1);
        
    }
    
    @Test
    public void inimigoCurando(){
        Skeletons sk1 = new Skeletons(1.0,"Ossada Viva",300.0,"Armadura Podre",3.0,
                    "Carniceiro",1.0,"","Espada Longa",300.0, new especialUndead(),
                    new curaMob(), new golpeUndead());            
        Zombies zo1 = new Zombies(1.0,"Corpo Ambulante",500.0,"Armadura Podre",3.0,
                "Carniceiro",1.0,"","Espada Longa",400.0, new especialUndead(),
                new curaMob(), new golpeUndead());       
        Gryphon gr1 = new Gryphon(1.0,"Grifo Prateado",700.0,"Penas de Prata",8.0,
                "",1.0,"Zeus","Garra de Prata",800.0, new especialMitico(),
                new curaMob(), new golpeMitico());       
        Minotaur mn1 = new Minotaur(1.0,"Minotauro",800.0,"Couraça Dura",9.0,
                "",1.0,"Ares","Machado de Guerra",900.0, new especialMitico(),
                new curaMob(), new golpeMitico());       
        Wyrm wm1 = new Wyrm(1.0,"Dragonete",600.0,"Escamas novas",8.0,
                "",10.0,"","",600.0, new especialDragao(),
                new curaMob(), new golpeDragao());       
        Drake dk1 = new Drake(1.0,"Dragao de Fogo",1000.0,"Escamas Antigas",18.0,
                "",30.0,"","",1000.0, new especialDragao(),
                new curaMob(), new golpeDragao());       
        
        
        assertEquals(300.0, sk1.getVida(), 1);
        assertEquals(500.0, zo1.getVida(), 1);
        assertEquals(700.0, gr1.getVida(), 1);
        assertEquals(800.0, mn1.getVida(), 1);
        assertEquals(6000.0, wm1.getVida(), 1);
        assertEquals(30000.0, dk1.getVida(), 1);
        
        sk1.setVida(sk1.rejuvenescer(sk1.getVida()));
        zo1.setVida(zo1.rejuvenescer(zo1.getVida()));
        gr1.setVida(gr1.rejuvenescer(gr1.getVida()));
        mn1.setVida(mn1.rejuvenescer(mn1.getVida()));
        wm1.setVida(wm1.rejuvenescer(wm1.getVida()));
        dk1.setVida(dk1.rejuvenescer(dk1.getVida()));
        assertEquals(450.0, sk1.getVida(), 1);
        assertEquals(750.0, zo1.getVida(), 1);
        assertEquals(1050.0, gr1.getVida(), 1);
        assertEquals(1200.0, mn1.getVida(), 1);
        assertEquals(9000.0, wm1.getVida(), 1);
        assertEquals(45000.0, dk1.getVida(), 1);
        
        sk1.setVida(sk1.revigorar(sk1.getVida()));
        zo1.setVida(zo1.revigorar(zo1.getVida()));
        gr1.setVida(gr1.revigorar(gr1.getVida()));
        mn1.setVida(mn1.revigorar(mn1.getVida()));
        wm1.setVida(wm1.revigorar(wm1.getVida()));
        dk1.setVida(dk1.revigorar(dk1.getVida()));
        assertEquals(495.0, sk1.getVida(), 1);
        assertEquals(825.0, zo1.getVida(), 1);
        assertEquals(1155.0, gr1.getVida(), 1);
        assertEquals(1320.0, mn1.getVida(), 1);
        assertEquals(9900.0, wm1.getVida(), 1);
        assertEquals(49500.0, dk1.getVida(), 1);
    }
}
